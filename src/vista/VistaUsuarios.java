package vista;

import controlador.Controlador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
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
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
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
        txtFNac = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblUsr = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFNac1 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart_back_left_arrow_6022.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Legajo");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/addusergroup_1251.png"))); // NOI18N

        txtFNac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Password");

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));

        lblUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/securityguard_person_man_avatar_segurida_2844 (1).png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblNombre.setText("Aca va el nombre");

        lblRol.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblRol.setText("rol aca");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salida-40.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblRol))
                .addGap(18, 18, 18)
                .addComponent(lblUsr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtFNac1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel13.setText("Password");

        txtPassword1.setText("**********");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel6))
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtEmail)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(txtFNac))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAñadir)
                                .addGap(37, 37, 37)
                                .addComponent(btnEliminar)
                                .addGap(33, 33, 33)
                                .addComponent(btnModificar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApellido, txtEmail, txtFNac, txtLegajo, txtNombre, txtPassword});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(52, 52, 52)
                        .addComponent(btnVolver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(btnEliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnModificar)))
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtFNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAñadir)
                                .addContainerGap())))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtApellido, txtEmail, txtFNac, txtLegajo, txtNombre, txtPassword});

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
        this.vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRolActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        Date fecha = null;
             try {
                fecha = new SimpleDateFormat("dd/MM/yyyy").parse(this.txtFNac.getText());
                Date fecha2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1920");
                if(fecha.compareTo(fecha2)<0){
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha de nacimiento valida");
                }
            } catch (ParseException ex) {
                System.out.println("Ingrese una Fecha Valida (Formato dd/mm/yyyy)");
            }
        String apellido = this.txtApellido.getText().toUpperCase().toUpperCase();
        String nombre = this.txtNombre.getText();            
        nombre = nombre.substring(0,1).toUpperCase()+nombre.substring(1);
        String legajo = this.txtLegajo.getText();
        String correo = this.txtEmail.getText();
        String password = this.txtPassword.getText();
        if(this.txtLegajo.isEditable()){                        
            if(apellido.isEmpty() && nombre.isEmpty() && legajo.isEmpty() && correo.isEmpty() && this.txtFNac.getText().isEmpty()){                
                JOptionPane.showMessageDialog(null, "Debe rellenar los campos correspondientes");
            }else{                
                this.c.añadirUsuario(legajo, nombre, apellido, fecha, correo, password, (Rol)this.cbRol.getSelectedItem());
                this.limpiar();        
            }
        }else {            
            this.txtLegajo.setEditable(true);                
        }
        
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!this.listaUsuarios.isSelectionEmpty()){
            System.out.println("usr "+this.listaUsuarios.getSelectedValue());
            this.c.eliminarUsuario((Usuario) this.listaUsuarios.getSelectedValue());
            this.limpiar();
            this.btnAñadir.setEnabled(true);
            this.txtLegajo.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione un Usuario");
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void listaUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUsuariosValueChanged
        if(!this.listaUsuarios.isSelectionEmpty()){
            this.txtApellido.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getApellido());
            this.txtEmail.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getCorreo());
            this.txtFNac.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getFechaNacLinda());
            this.txtLegajo.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getLegajo());
            this.txtNombre.setText(((Usuario)this.listaUsuarios.getSelectedValue()).getNombre());
            this.txtPassword.setText((((Usuario)this.listaUsuarios.getSelectedValue()).getPassword()));
            System.out.println(this.txtPassword.getText());
            this.cbRol.setSelectedItem(((Usuario)this.listaUsuarios.getSelectedValue()).getRol());
            this.btnEliminar.setEnabled(true);
            this.btnModificar.setEnabled(true);
            this.txtLegajo.setEnabled(false);
            this.btnAñadir.setEnabled(false);
        }
        
    }//GEN-LAST:event_listaUsuariosValueChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if(this.txtApellido.getText().isEmpty()&& this.txtNombre.getText().isEmpty() && this.txtLegajo.getText().isEmpty() && this.txtEmail.getText().isEmpty() && this.txtFNac.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos");
        }else{
            
            Usuario unUsuario = (Usuario)this.listaUsuarios.getSelectedValue();
            unUsuario.setApellido(this.txtApellido.getText().toUpperCase());
            unUsuario.setNombre(this.txtNombre.getText().substring(0,1).toUpperCase()+this.txtNombre.getText().substring(1));
            unUsuario.setCorreo(this.txtEmail.getText());
            unUsuario.setLegajo(this.txtLegajo.getText());
            unUsuario.setPassword(this.txtPassword.getText());
            System.out.println(Arrays.toString(this.txtPassword.getText().toCharArray()));
            unUsuario.setRol((Rol)this.cbRol.getSelectedItem());
            Date fecha = null;
             try {
                fecha = new SimpleDateFormat("dd/MM/yyyy").parse(this.txtFNac.getText());
                Date fecha2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1920");
                if(fecha.compareTo(fecha2)<0){
                    JOptionPane.showMessageDialog(null,"Ingrese una fecha de nacimiento valida");
                }else{
                    unUsuario.setFechaNac(fecha);
                    this.c.modificarUsuario(unUsuario);
                    this.limpiar();
                    this.btnAñadir.setEnabled(true);
                    this.txtLegajo.setEnabled(true);
                }
            } catch (ParseException ex) {
                System.out.println("Ingrese una Fecha Valida (Formato dd/mm/yyyy)");
            }
                
        }       

    }//GEN-LAST:event_btnModificarActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        VistaLogin vl = new VistaLogin(this.c);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox cbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JList listaUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFNac;
    private javax.swing.JFormattedTextField txtFNac1;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    // End of variables declaration//GEN-END:variables
}
