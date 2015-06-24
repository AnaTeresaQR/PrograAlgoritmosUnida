package BUSQUEDAS.Interfaz;

import BUSQUEDAS.busquedas.AvlTreeTest;
import BUSQUEDAS.busquedas.BinaryVectorSearch;
import TreeException.TreeException;
import java.io.FileNotFoundException;

/**
 * Clase que se encarga del menu y la interacción correspondiente con el usuario
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramírez
 */
public class Menu {

    private AvlTreeTest tree;
    private BinaryVectorSearch vector;

    public Menu() {
        tree = new AvlTreeTest();
        vector = new BinaryVectorSearch();
    }

    /**
     * Método que se encarga de mostrar el menu al usuario y su interacción
     *
     * @throws TreeException.TreeException
     */
    public void mostrar() throws TreeException {
        boolean bandera = true;
        do {
            try {
                int opcion = JOP.solicitarInt("Digite la opcion deseada\nPara encontrar la cédula\n"
                        + "1. Buscar en el AVLTree\n"
                        + "2. Buscar en un Vector\n"
                        + "3. Salir\n");
                int cedula;
                switch (opcion) {
                    case 1:
                        cedula = JOP.solicitarInt("Ingrese el número de cédula a buscar");
                        JOP.mostrar(tree.searchTime(cedula));
                        break;
                    case 2:
                        cedula = JOP.solicitarInt("Ingrese el número de cédula a buscar");
                        JOP.mostrar(vector.searchTime(cedula));
                        break;
                    case 3:
                        JOP.mostrar("Hasta Pronto");
                        bandera = false;
                        break;
                    default:
                        JOP.mostrar("Opción incorrecta");
                }
            } catch (NumberFormatException e) {
                JOP.mostrar("Datos ingresados incorrectos");
            } catch (FileNotFoundException e) {
                JOP.mostrar(e.getMessage());
            }
        } while (bandera);
    }
} // fin clase
