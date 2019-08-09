package vista;

import controlador.Controlador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Rol;
import modelo.Usuario;

public class VistaUsuarios extends javax.swing.JFrame {
    
    private Controlador c;
    private JFrame vistaAnterior;
    private Usuario usuarioActual;

    public VistaUsuarios(Controlador c, JFrame vistaAnterior, Usuario usuarioActual) {
        initComponents();
        this.c = c;
        this.vistaAnterior = vistaAnterior;
        this.usuarioActual = usuarioActual;
        this.cbRol.setModel((new DefaultComboBoxModel(c.verListadoDeRoles().toArray())));
        this.listaUsuarios.setListData(this.c.verListadoDeUsuarios().toArray());
        this.lblNombre.setText(usuarioActual.getNombre() + usuarioActual.getApellido());
        this.lblRol.setText(usuarioActual.getRol().toString());
        this.setVisible(true);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        cbRol = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        txtFNac = new javax.swing.JFormattedTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart_back_left_arrow_6022.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Legajo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Email");

        listaUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaUsuariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaUsuarios);

        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de Usuario");

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel7.setText("Gestion de Usuarios");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/communitysupport_users_people_6236.png"))); // NOI18N

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_person_people_6100.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblNombre.setText("Aca va el nombre");

        lblRol.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblRol.setText("rol aca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblRol)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRol)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtFNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        txtPassword.setText("jPasswordField1");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel10.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPassword)
                        .addComponent(txtEmail)
                        .addComponent(txtNombre)
                        .addComponent(txtApellido)
                        .addComponent(txtLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(txtFNac)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(btnVolver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(btnAñadir, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar(){
        this.txtApellido.setText("");
        this.txtEmail.setText("");
        this.txtFNac.setText("");
        this.txtLegajo.setText("");
        this.txtNombre.setText("");
        this.txtPassword.setText("");
        this.listaUsuarios.setListData(this.c.verListadoDeUsuarios().toArray());
    
    }
    public void bloquearTxt(){
        this.txtApellido.setEditable(false);
        this.txtEmail.setEditable(false);
        this.txtFNac.setEditable(false);
        this.txtLegajo.setEditable(false);
        this.txtNombre.setEditable(false);
        this.txtPassword.setEditable(false);
        this.cbRol.setEditable(false);
    }
    
    public void desbloquearTxt(){
        this.txtApellido.setEditable(true);
        this.txtEmail.setEditable(true);
        this.txtFNac.setEditable(true);
        this.txtLegajo.setEditable(true);
        this.txtNombre.setEditable(true);
        this.txtPassword.setEditable(true);
        this.cbRol.setEditable(true);
    }
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String apellido = this.txtApellido.getText();
        String nombre = this.txtNombre.getText();
        String legajo = this.txtLegajo.getText();
        String correo = this.txtEmail.getText();
        String password = Arrays.toString(this.txtPassword.getPassword());
        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(this.txtFNac.getText());
        } catch (ParseException ex) {
            System.out.println("Ingrese una Fecha Valida (Formato dd/mm/yyyy)");
        }
        if(apellido.isEmpty() && nombre.isEmpty() && legajo.isEmpty() && correo.isEmpty() && this.txtFNac.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos correspondientes");
        } else {            
            this.c.añadirUsuario(legajo, nombre, apellido, fecha, correo, password, (Rol)this.cbRol.getSelectedItem());
            this.limpiar();
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        this.txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        this.txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.c.eliminarUsuario((Usuario) this.listaUsuarios.getSelectedValue());
        this.limpiar();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void listaUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUsuariosValueChanged
        this.txtApellido.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getApellido());
        this.txtEmail.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getCorreo());
        this.txtFNac.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getFechaNac().toString());
        this.txtLegajo.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getLegajo());
        this.txtNombre.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getNombre());
        this.txtPassword.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getPassword());
        this.bloquearTxt();
        
    }//GEN-LAST:event_listaUsuariosValueChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.desbloquearTxt();        
        String apellido = this.txtApellido.getText();
        String nombre = this.txtNombre.getText();
        String legajo = this.txtLegajo.getText();
        String correo = this.txtEmail.getText();
        String password = Arrays.toString(this.txtPassword.getPassword());
        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(this.txtFNac.getText());
        } catch (ParseException ex) {
            System.out.println("Ingrese una Fecha Valida (Formato dd/mm/yyyy)");
        }
        if(apellido.isEmpty() && nombre.isEmpty() && legajo.isEmpty() && correo.isEmpty() && this.txtFNac.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos correspondientes");
        } else {
            Usuario unUsuario = new Usuario();
            
            unUsuario.setApellido(this.txtApellido.getSelectedText());
            ((Usuario)this.listaUsuarios.getSelectedValue()).setNombre(this.txtNombre.getSelectedText());
            ((Usuario)this.listaUsuarios.getSelectedValue()).setCorreo(this.txtEmail.getSelectedText());
            ((Usuario)this.listaUsuarios.getSelectedValue()).setLegajo(this.txtLegajo.getSelectedText());
            ((Usuario)this.listaUsuarios.getSelectedValue()).setPassword(this.txtPassword.getSelectedText());
            if(((Usuario)this.listaUsuarios.getSelectedValue()).equals(c)){
                this.c.modificarUsuario(((Usuario)this.listaUsuarios.getSelectedValue()));
                this.limpiar();
            }
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JList listaUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFNac;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
