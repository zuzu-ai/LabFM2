/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriofm2;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sucely Alvarez
 */
public class Mantenimiento_Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenimiento_Clientes
     */
    public Mantenimiento_Clientes() {
        initComponents();
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
        txtNombre_C = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDPI_C = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono_C = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccion_C = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo_C = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes");
        setVisible(true);

        jLabel1.setText("Nombre");

        jLabel2.setText("DPI");

        jLabel3.setText("Teléfono");

        jLabel4.setText("Dirección");

        jLabel5.setText("Correo");

        txtCorreo_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo_CActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreo_C, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion_C, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono_C, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDPI_C, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre_C, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDPI_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_status, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreo_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo_CActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
         try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, "0");
            pst.setString(2, txtNombre_C.getText().trim());
            pst.setString(3, txtDPI_C.getText().trim());
            pst.setString(4, txtTelefono_C.getText().trim());
            pst.setString(5, txtDireccion_C.getText().trim());
            pst.setString(6, txtCorreo_C.getText().trim());
            pst.setString(7, "0");
            pst.setString(8, "0");
            pst.setString(9, "0");
            
            pst.executeUpdate();
            
            txtNombre_C.setText("");
            txtDPI_C.setText("");
            txtTelefono_C.setText("");
            txtDireccion_C.setText("");
            txtCorreo_C.setText("");
            label_status.setText("Registro exitoso.");
        }catch (Exception e){
            
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try {
            String ID = txtbuscado.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("update clientes set Nombre_C = ?, Dpi_C = ?, Tel_C = ?, Direccion_C = ?, Correo_C = ? where Tarjeta_C =" + ID);
            
            pst.setString(1, txtNombre_C.getText().trim());
            pst.setString(2, txtDPI_C.getText().trim());
            pst.setString(3, txtTelefono_C.getText().trim());
            pst.setString(4, txtDireccion_C.getText().trim());
            pst.setString(5, txtCorreo_C.getText().trim());
            
            pst.executeUpdate();
            
            label_status.setText("Modificación exitosa.");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
         try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select * from clientes where Tarjeta_C = ?");
            pst.setString(1, txtbuscado.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtNombre_C.setText(rs.getString("Nombre_C"));
                txtDPI_C.setText(rs.getString("Dpi_C"));
                txtTelefono_C.setText(rs.getString("Tel_C"));
                txtDireccion_C.setText(rs.getString("Direccion_C"));
                txtCorreo_C.setText(rs.getString("Correo_C"));
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no registrado.");
            }
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/labfm", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("delete from clientes where Tarjeta_C = ?");
            
            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();
            
            txtNombre_C.setText("");
            txtDPI_C.setText("");
            txtTelefono_C.setText("");
            txtDireccion_C.setText("");
            txtCorreo_C.setText("");
            
            label_status.setText("Cliente eliminado.");
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txtCorreo_C;
    private javax.swing.JTextField txtDPI_C;
    private javax.swing.JTextField txtDireccion_C;
    private javax.swing.JTextField txtNombre_C;
    private javax.swing.JTextField txtTelefono_C;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
