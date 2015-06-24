package INTERFAZ;

import MEDICIONES.AlgoritmosOrdenamiento.MergeSort;
import MEDICIONES.AlgoritmosOrdenamiento.QuickSort;
import MEDICIONES.AlgoritmosOrdenamiento.ShellSort;
import MEDICIONES.Estructuras.AvlTreeTest;
import MEDICIONES.Estructuras.ListaEnlazadaTest;
import java.awt.Color;

/**
 * Clase encarga de mostrar las duraciones de los distintos ordenamientos
 *
 * @author Juan Miguel Arias Mejias
 * @author Ana Teresa Quesada Ramírez
 */
public class VentanaMediciones extends javax.swing.JFrame {

    /**
     * Creates new form VentanaMediciones
     */
    public VentanaMediciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tiemposArea = new javax.swing.JTextArea();
        inicioB = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        reloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("Mediciones de tiempo y ordenamiento");

        tiemposArea.setEditable(false);
        tiemposArea.setColumns(20);
        tiemposArea.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        tiemposArea.setRows(5);
        tiemposArea.setToolTipText("Aquí se muestran los tiempos de ejecución. MM:SS:mm");
        jScrollPane1.setViewportView(tiemposArea);

        inicioB.setText("Iniciar Test");
        inicioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        reloj.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maria Valerio\\Desktop\\TERCER EXAMEN PROGRA\\TrabInv_B35473_B25842\\Programados_B35473_B25842\\aplicaciónRelojAndroid_B35473_B25842\\reloj\\app\\src\\main\\res\\drawable\\antique_clock.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reloj)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(307, 307, 307)
                            .addComponent(inicioB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(regresar))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBActionPerformed
        // TODO add your handling code here:

        String tree = new AvlTreeTest().getFormatTime();
        String insertion = new ListaEnlazadaTest().getFormatTime();
        String mergeSort = new MergeSort().getFormatTime();
        String quickSort = new QuickSort().getFormatTime();
        String shellSort = new ShellSort().getFormatTime();
        // RADIX SORT HERE!

        StringBuilder sb = new StringBuilder();
        sb.append("\n\n---- Tiempos de ejecución ----\n\n");
        sb.append("--- Árbol AVL ---\n");
        sb.append(tree).append("\n");
        sb.append("--- Ordenamiento por Insercion ---\n");
        sb.append(insertion).append("\n");
        sb.append("\n\n--- Algoritmos de ordenamiento ---\n\n");
        sb.append("-- MergeSort --\n");
        sb.append(mergeSort).append("\n");
        sb.append("-- QuickSort --\n");
        sb.append(quickSort).append("\n");
        sb.append("-- ShellSort --\n");
        sb.append(shellSort).append("\n");
        
        this.tiemposArea.setText(sb.toString());
    }//GEN-LAST:event_inicioBActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VentanaAcciones ventanaAcciones = new VentanaAcciones();
        ventanaAcciones.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMediciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMediciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMediciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMediciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMediciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicioB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel reloj;
    private javax.swing.JTextArea tiemposArea;
    // End of variables declaration//GEN-END:variables
}