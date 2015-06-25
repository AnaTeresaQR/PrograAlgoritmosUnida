package MEDICIONES.AlgoritmosOrdenamiento;

import MEDICIONES.TimeTester.TimeTester;
import MEDICIONES.file.FileCenter;
import Objetos.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 * Clase que se encarga de ordenar el archivo con el algoritmo RadixSort
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramírez
 */
public class RadixSort implements TimeTester {

    private FileCenter file; // recibe el archivo que va a ordenar

    public RadixSort() {
        file = FileCenter.getInstance();
    }

    /**
     * Método que se encarga de hacer una ordenación con personas de tipo
     * radixSort
     *
     * @param a vector de personas a ordenar
     */
    public void radixSort(Persona[] a) {

        int max = maximosDigitos(a);

        for (int i = 0; i < max; i++) {

            int radix;

            for (int j = 0; j < a.length; j++) {

                radix = this.getDigitAt(a[j].getCedula(), i);
                q[radix].offer(a[j]);
            }

            int b = 0;
            for (int k = 0; k < q.length; k++) {

                while (q[k].peek() != null) {
                    a[b++] = (Persona) q[k].poll();

                }

            }

        }

    }

    public int maximosDigitos(Persona[] a) {
        int max = 0;

        int digitos;

        for (int i = 0; i < a.length; i++) {

            digitos = cantidadDigitos(a[i].getCedula());

            if (digitos > max) {
                max = digitos;
            }
        }

        return max;

    }

    private int cantidadDigitos(int i) {
        // Se asume que todos son positivos
        if (i < 10) {
            return 1;
        }

        return 1 + cantidadDigitos(i / 10);
    }

    private int getDigitAt(int numero, int radix) {
        return (int) (numero / Math.pow(10, radix - 1)) % 10;
    }

    /**
     * Método que se encarga de obtener el tiempo que duró en ejecutar la
     * búsqueda con radixSort por cédula de una persona en el vector
     *
     * @return el tiempo de duración
     */
    @Override
    public long getMillisOperation() {
        file.clearVector();
        long inicio = System.currentTimeMillis();
        Persona[] personas = file.getVector();
        this.radixSort(personas);
        long fin = System.currentTimeMillis();

        return fin - inicio;
    }

    /**
     * Método que se encarga de darle formato al tiempo de duración del vector
     *
     * @return el formato en una hilera de lo que duró en ordenar
     */
    @Override
    public String getFormatTime() {

        long time = getMillisOperation();
        return (new SimpleDateFormat("mm:ss:SSS")).format(new Date(time));
    }

    public static void main(String[] args) {

        RadixSort s = new RadixSort();
        System.out.println(s.getMillisOperation());
        System.out.println(s.getFormatTime());
    }

    // Define the queues.
    private static LinkedList[] q = {
        new LinkedList(), // 0
        new LinkedList(), // 1
        new LinkedList(), // 2
        new LinkedList(), // 3
        new LinkedList(), // 4
        new LinkedList(), // 5
        new LinkedList(), // 6
        new LinkedList(), // 7
        new LinkedList(), // 8
        new LinkedList() // 9
    };

}
