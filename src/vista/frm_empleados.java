/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import java.awt.Color;
import modelo.Empleado;
/**
 *
 * @author Sapón Pérez
 */
public class frm_empleados extends javax.swing.JFrame {

    /**
     * Creates new form frm_empleados
     */
    Empleado empleado;
    public frm_empleados() {
        initComponents();
        empleado = new Empleado();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cod = new javax.swing.JLabel();
        lbl_nom = new javax.swing.JLabel();
        lbl_ape = new javax.swing.JLabel();
        lbl_dir = new javax.swing.JLabel();
        lbl_tel = new javax.swing.JLabel();
        lbl_fn = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_ape = new javax.swing.JTextField();
        txt_dir = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_fn = new javax.swing.JTextField();
        lbl_puesto = new javax.swing.JLabel();
        txt_puesto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_cod.setText("Codigo");

        lbl_nom.setText("Nombres");

        lbl_ape.setText("Apellidos");

        lbl_dir.setText("Direccion");

        lbl_tel.setText("Telefono");

        lbl_fn.setText("Fecha nacimiento");

        txt_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codActionPerformed(evt);
            }
        });
        txt_cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codKeyReleased(evt);
            }
        });

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });
        txt_nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nomKeyReleased(evt);
            }
        });

        txt_ape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apeKeyReleased(evt);
            }
        });

        lbl_puesto.setText("Puesto");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cod)
                            .addComponent(lbl_nom)
                            .addComponent(lbl_ape)
                            .addComponent(lbl_dir)
                            .addComponent(lbl_tel)
                            .addComponent(lbl_fn)
                            .addComponent(lbl_puesto))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cod, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txt_nom)
                            .addComponent(txt_ape)
                            .addComponent(txt_dir)
                            .addComponent(txt_tel)
                            .addComponent(txt_fn)
                            .addComponent(txt_puesto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton1)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cod)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nom)
                    .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ape)
                    .addComponent(txt_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dir)
                    .addComponent(txt_dir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tel)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fn)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_puesto)
                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codActionPerformed

    private void txt_codKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codKeyReleased
        // TODO add your handling code here:
        if(this.txt_cod.getText().matches("[E]{1}[0-9]{4}")){
        lbl_cod.setText("Codigo");
        lbl_cod.setForeground(Color.black);
            
        }else{
            lbl_cod.setText("Error");
             lbl_cod.setForeground(Color.red);
        
        }
    }//GEN-LAST:event_txt_codKeyReleased

    private void txt_nomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomKeyReleased
        // TODO add your handling code here:
        if(txt_nom.getText().matches("[A-Z]{1}[a-z]{1,12}([ ]{1}[A-Z]{1}[a-z]{1,12})*")){
            //cumple
            lbl_nom.setText("Nombres");
            lbl_nom.setForeground(Color.black);
        }else{
            //no cumple
            lbl_nom.setText("Error...");
            lbl_nom.setForeground(Color.red);
        }
       
    }//GEN-LAST:event_txt_nomKeyReleased

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void txt_apeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apeKeyReleased
        // TODO add your handling code here:
        if(txt_ape.getText().matches("[A-Z]{1}[a-z]{1,12}([ ]{1}[A-Z]{1}[a-z]{1,12})?")){
            //cumple
            lbl_ape.setText("Apellidos");
            lbl_ape.setForeground(Color.black);
        }else{
            //no cumple
            lbl_ape.setText("Error...");
            lbl_ape.setForeground(Color.red);
        }
        
        
        
    }//GEN-LAST:event_txt_apeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        empleado = new Empleado(txt_cod.getText(),txt_puesto.getText(),txt_nom.getText(),txt_ape.getText(),txt_dir.getText(),txt_tel.getText(),txt_fn.getText());
        empleado.agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**dsa
     * @param args asdfthe command line arguments
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
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_ape;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_dir;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_nom;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_tel;
    private javax.swing.JTextField txt_ape;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}