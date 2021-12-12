
package PruebaCortaII;


import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 * Interfaz Grafica
 * @author Yoselyn Morle y Tony Cunsolo
 */

public class Interfaz extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();

    /**
     *
     */
    public Interfaz() {
        initComponents();
        this.inicializar(false);


    }

    private void inicializar(boolean enable) {
        
        this.Eliminar.setEnabled(enable);
        this.NuevoArbol.setEnabled(enable);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        botonInsertar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        txtdato = new javax.swing.JTextField();
        NuevoArbol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de Pruebas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(10, 10, 600, 320);

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 21, 616, 327));

        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        jPanel2.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 290, -1));

        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 290, -1));

        txtdato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatoActionPerformed(evt);
            }
        });
        jPanel2.add(txtdato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 260, 30));

        NuevoArbol.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        NuevoArbol.setText("Nuevo Arbol");
        NuevoArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoArbolActionPerformed(evt);
            }
        });
        jPanel2.add(NuevoArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 260, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setText("Integrantes: Tony Cunsolo / Yoselyn Morle");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        try {
            int dato = Integer.parseInt(txtdato.getText());

            if (this.simulador.Eliminar(dato)) {
                txtdato.setText("");
                JOptionPane.showMessageDialog(null, "El dato fue eliminado correctamente", " ...", 1);
                this.inicializar(true);

                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el dato", "Intenta de nuevo...", 0);

        }
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try {
            int dato = Integer.parseInt(txtdato.getText());

            if (this.simulador.Insertar(dato)) {
                txtdato.setText("");
                JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                this.inicializar(true);

                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void NuevoArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoArbolActionPerformed
        this.simulador.NuevoSimulador();
        txtdato.setText("");
        JOptionPane.showMessageDialog(null, "Se ha Iniciado un nuevo Arbol", " ...", 1);
        this.inicializar(true);

        complementos();
    }//GEN-LAST:event_NuevoArbolActionPerformed

    /**
     *
     */
    public void complementos(){
        this.repintarArbol();
    }
    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton NuevoArbol;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtdato;
    // End of variables declaration//GEN-END:variables
}
