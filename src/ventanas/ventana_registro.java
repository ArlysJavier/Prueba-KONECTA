package ventanas;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ventana_registro extends javax.swing.JFrame {

    public ventana_registro() {
        initComponents();

        setSize(610, 380);
        setResizable(false);
        setTitle("Acesso al Sistema");
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon Wallpaper = new ImageIcon("src/imagenes/back.jpg");
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

        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_referencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_peso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("REGISTRO DB PRODUCTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setText("Referencia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        getContentPane().add(txt_referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Precio :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("Peso:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        getContentPane().add(txt_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setText("Categoria:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));
        getContentPane().add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, -1));

        jdFecha.setDateFormatString("y/MM/d HH:mm:ss");
        getContentPane().add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 290, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setText("Stock:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 100, -1));

        jButton1.setText("Registrar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 290, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setText("Seleccionar Fecha de registro:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setText("© Desarrollado por Arlys Javier Asprilla A");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int validacion = 0;
        String Nm, Rf, Pr, Ps, Ct, St;

        Nm = txt_nombre.getText().trim();
        Rf = txt_referencia.getText().trim();
        Pr = txt_precio.getText().trim();
        Ps = txt_peso.getText().trim();
        Ct = txt_categoria.getText().trim();
        St = txt_stock.getText().trim();

        if (Nm.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (Rf.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (Pr.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (Ps.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (Ct.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        if (St.equals("")) {
            txt_nombre.setBackground(Color.red);
            validacion++;
        }
        

        if (validacion == 0) {

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_productos", "root", "");
                PreparedStatement pst = cn.prepareStatement("insert into productos values (?,?,?,?,?,?,?,?)");

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

                JOptionPane.showMessageDialog(null, "Registro Exitoso...!!!");
                this.dispose();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error" + e);
            }
        } else {
            
            JOptionPane.showMessageDialog(null,"debes llenar todos los campos Incuyendo la fecha de Creacion del producto, es obligatorio para el registro");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
