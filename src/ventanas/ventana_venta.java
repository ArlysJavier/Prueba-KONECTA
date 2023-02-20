package ventanas;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ventana_venta extends javax.swing.JFrame {

    public ventana_venta() {
        initComponents();

        setSize(400, 360);
        setResizable(false);
        setTitle("Acesso al Sistema");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon Wallpaper = new ImageIcon("src/imagenes/A.jpg");
        Icon icono = new ImageIcon(Wallpaper.getImage().getScaledInstance(jLabel_fondo.getWidth(),
                jLabel_fondo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_fondo.setIcon(icono);
        this.repaint();
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
        txt_nombre = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        txt_venta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENTANA (VENTAS)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txt_nombre.setEditable(false);
        txt_nombre.setBackground(new java.awt.Color(244, 240, 240));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, -1));

        txt_stock.setEditable(false);
        txt_stock.setBackground(new java.awt.Color(243, 242, 242));
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));
        getContentPane().add(txt_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 110, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("N° Referencia Producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad a Vender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 100, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Vender");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 100, 40));

        jLabel8.setText("___________________________________________________________________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jdFecha.setDateFormatString("y/MM/d HH:mm:ss");
        getContentPane().add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Fecha de la venta :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 20));
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from productos where Referencia = ?");

            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                txt_nombre.setText(rs.getString("Nombre"));
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

        int stock_bd, a_vender, resul_venta;
        String ID, venta;

        a_vender = Integer.parseInt(txt_venta.getText().trim());

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from productos where Referencia = ?");

            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nombre.setText(rs.getString("Nombre"));
                txt_stock.setText(rs.getString("Stock"));
                ID = rs.getString("ID");

                stock_bd = Integer.parseInt(txt_stock.getText().trim());

                if (stock_bd < a_vender) {
                    JOptionPane.showMessageDialog(null, "no se puede vender, esa cantidad supera al stock Actual");
                } else {
                    resul_venta = stock_bd - a_vender;
                    JOptionPane.showMessageDialog(null, "Venta realizada ...!!");

                    venta = Integer.toString(resul_venta);
                    //txt_nombre.setText("");
                    txt_stock.setText(venta);

                    cn.close();
                }

                try {
                    int validacion = 0;
                    Connection cn2 = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root", "");
                    PreparedStatement pst2 = cn2.prepareStatement("update productos set Stock = ? where ID = " + ID);

                    pst2.setInt(1, Integer.parseInt(txt_stock.getText().trim()));

                    pst2.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Se actualizo estado de inventario en la Bade de datos");

                    validacion++;
                    cn2.close();

                    if (validacion != 0) {

                        try {
                            Connection cn3 = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root", "");
                            PreparedStatement pst3 = cn3.prepareStatement("insert into Registros values (?,?,?,?,?)");

                            pst3.setInt(1, 0);
                            pst3.setString(2, txt_nombre.getText().trim());
                            pst3.setString(3, txt_buscar.getText().trim());
                            pst3.setString(4, txt_venta.getText().trim());
                            pst3.setString(5, ((JTextField) jdFecha.getDateEditor().getUiComponent()).getText());

                            pst3.executeUpdate();
                            txt_venta.setText("");
                            txt_buscar.setText("");

                            cn3.close();

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, "error" + e);
                        }
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error" + e);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado, Verifique # de Referencia");
            }

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
            java.util.logging.Logger.getLogger(ventana_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_fondo;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_stock;
    private javax.swing.JTextField txt_venta;
    // End of variables declaration//GEN-END:variables
}