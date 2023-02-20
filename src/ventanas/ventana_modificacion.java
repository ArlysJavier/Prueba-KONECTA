package ventanas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.time.*;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ventana_modificacion extends javax.swing.JFrame {

    public ventana_modificacion() {
        initComponents();

        setResizable(false);
        setTitle("Edicion de productos");
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_referencia = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();
        txt_peso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("EDITAR PRODUCTO BD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 160, -1));

        jLabel2.setText("Ingrece la referencia del producto a Modificar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, -1));
        getContentPane().add(txt_referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 150, -1));
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 80, -1));
        getContentPane().add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 80, -1));

        jdFecha.setDateFormatString("y/MM/d HH:mm:ss");
        getContentPane().add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 280, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 100, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 40));

        jLabel3.setText("__________________________________________________________________________________________________________");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 530, -1));

        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setText("Categoria");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setText("Referencia");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jLabel8.setText("Stock");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        jLabel9.setText("Fecha de Modificacion");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 380));
        getContentPane().add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 100, -1));

        jLabel10.setText("Peso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel11.setText("$");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 10, -1));

        jLabel12.setText("und");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        jLabel13.setText("gr");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        txt_ID.setEnabled(false);
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 40, -1));

        jLabel14.setText("ID:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 20, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from productos where Referencia = ?");

            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_ID.setText(rs.getString("ID"));
                txt_nombre.setText(rs.getString("Nombre"));
                txt_referencia.setText(rs.getString("Referencia"));
                txt_precio.setText(rs.getString("Precio"));
                txt_peso.setText(rs.getString("Peso"));
                txt_categoria.setText(rs.getString("Categoria"));
                txt_stock.setText(rs.getString("Stock"));
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado, Verifique # de Referencia");
            }
            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String ID = txt_ID.getText().trim();
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root", "");
            PreparedStatement pst = cn.prepareStatement(" update productos set ID = ?, Nombre = ?, Referencia = ?, Precio = ?,"
                    + " Peso = ?, Categoria = ?, Stock = ?, Fecha = ? where ID = " + ID);

            pst.setInt(1, 0);
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_referencia.getText().trim());
            pst.setInt(4, Integer.parseInt(txt_precio.getText().trim()));
            pst.setInt(5, Integer.parseInt(txt_peso.getText().trim()));
            pst.setString(6, txt_categoria.getText().trim());
            pst.setInt(7, Integer.parseInt(txt_stock.getText().trim()));
            pst.setString(8, ((JTextField) jdFecha.getDateEditor().getUiComponent()).getText());

            pst.executeUpdate();
            
            Limpiar();
            JOptionPane.showMessageDialog(null, "Modificacion Exitosa...!!!");
            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error" + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana_modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_modificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_modificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_fondo;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_referencia;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_nombre.setText("");
        txt_categoria.setText("");
        txt_referencia.setText("");
        txt_precio.setText("");
        txt_peso.setText("");
        txt_stock.setText("");
    }
}
