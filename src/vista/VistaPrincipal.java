package vista;
 
import controlador.Controlador;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import modelo.Foro;
import modelo.Pregunta;
import modelo.Usuario;

public class VistaPrincipal extends javax.swing.JFrame {
    Controlador c;
    JFrame vistaAnterior;
    Usuario usuarioActual;
    
    public VistaPrincipal(Controlador c, JFrame vistaAnterior, Usuario usuarioActual) {
        initComponents();
        
        this.c=c;
        this.vistaAnterior = vistaAnterior;
        this.usuarioActual = usuarioActual;
        this.ListaForos.setListData(this.c.verListadoDeForos().toArray());
        this.ListaUsuarios.setListData(this.c.verListadoDeUsuarios().toArray());
        this.lblNombre.setText(usuarioActual.getNombre() + " " + usuarioActual.getApellido());
        this.lblRol.setText(usuarioActual.getRol().toString());
        
        this.btnActualizar.setVisible(true);
        this.btnAgregarForo.setVisible(true);
        this.btnAñadirPregunta.setVisible(true);
        this.btnBuscar.setVisible(true);
        this.btnEliminarForo.setVisible(true);
        this.btnUsuarios.setVisible(true);
        //Todo lo que tenga que ver con Roles     
        this.btnReportes.setVisible(false);
        switch(this.usuarioActual.getRol().getNombre()){
            case "Administrador":
                System.out.println(this.usuarioActual.getRol().getNombre());
                this.btnActualizar.setVisible(true);
                this.btnAgregarForo.setVisible(true);
                this.btnAñadirPregunta.setVisible(true);
                this.btnBuscar.setVisible(true);
                this.btnEliminarForo.setVisible(true);
                this.btnUsuarios.setVisible(true);
                this.btnReportes.setVisible(true);
                break;
            case "Registrador":
                System.out.println(this.usuarioActual.getRol().getNombre());
                this.btnActualizar.setVisible(true);
                this.btnAgregarForo.setVisible(false);
                this.btnAñadirPregunta.setVisible(false);
                this.btnBuscar.setVisible(true);
                this.btnEliminarForo.setVisible(false);
                this.btnUsuarios.setVisible(true);
                break;
            case "Estudiante":
                System.out.println(this.usuarioActual.getRol().getNombre());
                this.btnActualizar.setVisible(true);
                this.btnAgregarForo.setVisible(false);
                this.btnAñadirPregunta.setVisible(true);
                this.btnBuscar.setVisible(true);
                this.btnEliminarForo.setVisible(false);
                this.btnUsuarios.setVisible(false);
                break;
            case "Profesor":
                System.out.println(this.usuarioActual.getRol().getNombre());                                
                this.btnActualizar.setVisible(true);
                this.btnAgregarForo.setVisible(true);
                this.btnAñadirPregunta.setVisible(true);
                this.btnBuscar.setVisible(true);
                this.btnEliminarForo.setVisible(false);
                this.btnUsuarios.setVisible(false);
                break;
        } 
        
        //Fin Roles
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaForos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarForo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaUsuarios = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListaPreguntas = new javax.swing.JList();
        btnAñadirPregunta = new javax.swing.JToggleButton();
        btnActualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEliminarForo = new javax.swing.JButton();
        btnEditarForo = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 575));
        getContentPane().setLayout(null);

        ListaForos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaForosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaForos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(36, 145, 191, 319);

        jLabel1.setFont(new java.awt.Font("Dotum", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Letter_B_red_35046 (1).png"))); // NOI18N
        jLabel1.setText("itNet");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 5, 127, 48);
        getContentPane().add(txtBuscar);
        txtBuscar.setBounds(157, 28, 260, 19);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-google-web-search-30.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(423, 13, 45, 40);

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-grupo-de-usuarios-hombre-hombre-40.png"))); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios);
        btnUsuarios.setBounds(635, 472, 60, 50);

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_person_people_6100.png"))); // NOI18N
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblNombre.setText("Aca va el nombre");

        lblRol.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblRol.setText("rol aca");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salida-40.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(529, 0, 198, 52);

        btnAgregarForo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-más-2-matemáticas-40.png"))); // NOI18N
        btnAgregarForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarForoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarForo);
        btnAgregarForo.setBounds(180, 470, 50, 50);

        jLabel3.setFont(new java.awt.Font("Levenim MT", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-pregunta-48.png"))); // NOI18N
        jLabel3.setText("Preguntas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 90, 170, 48);

        ListaUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaUsuariosValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(ListaUsuarios);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(504, 147, 191, 319);

        jLabel6.setFont(new java.awt.Font("Levenim MT", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-carpeta-de-usuario-48.png"))); // NOI18N
        jLabel6.setText("Usuarios");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(504, 93, 170, 48);

        ListaPreguntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaPreguntasMouseClicked(evt);
            }
        });
        ListaPreguntas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaPreguntasValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(ListaPreguntas);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(267, 145, 191, 319);

        btnAñadirPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-ayuda-40.png"))); // NOI18N
        btnAñadirPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPreguntaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadirPregunta);
        btnAñadirPregunta.setBounds(400, 470, 50, 50);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-actualizar-30.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(473, 13, 51, 40);

        jLabel7.setFont(new java.awt.Font("Levenim MT", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-ver-detalles-48.png"))); // NOI18N
        jLabel7.setText("Foros");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(36, 91, 170, 48);

        btnEliminarForo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-basura-40.png"))); // NOI18N
        btnEliminarForo.setToolTipText("");
        btnEliminarForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarForoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarForo);
        btnEliminarForo.setBounds(110, 470, 50, 50);

        btnEditarForo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-editar-fila-40.png"))); // NOI18N
        btnEditarForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarForoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarForo);
        btnEditarForo.setBounds(40, 470, 50, 50);

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-evidencia-40.png"))); // NOI18N
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportes);
        btnReportes.setBounds(650, 60, 74, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo login.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-670, -110, 1630, 930);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
       VistaUsuarios vUsuarios = new VistaUsuarios(this.c, this,this.usuarioActual);
       this.dispose();
        
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnAgregarForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarForoActionPerformed
        VistaAgregarForo VAF = new VistaAgregarForo(this.c,this,this.usuarioActual);
        this.dispose();
    }//GEN-LAST:event_btnAgregarForoActionPerformed

    private void btnAñadirPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirPreguntaActionPerformed
        if(!this.ListaForos.isSelectionEmpty()){
            Foro unForo=(Foro) this.ListaForos.getSelectedValue();
            VistaAgregarPreguntas vap= new VistaAgregarPreguntas(this.c,this,this.usuarioActual,unForo);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Por Favor Seleccione un Foro");
        }
    }//GEN-LAST:event_btnAñadirPreguntaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!this.txtBuscar.getText().isEmpty()){
            String unaBusqueda = this.txtBuscar.getText();
            List<Pregunta>preg=this.c.buscarPregunta(unaBusqueda); //no hice na todavia
            if(preg!=null){
                this.ListaPreguntas.setListData(preg.toArray());
            }
            List<Usuario> usr =this.c.buscarUsuario(unaBusqueda);
            if(usr!=null){
                this.ListaUsuarios.setListData(usr.toArray());
            }
        } else {
            JOptionPane.showMessageDialog(null,"No hay nada que buscar");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ListaForosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaForosValueChanged
        if(!this.ListaForos.isSelectionEmpty()){
            Foro unForo = (Foro) this.ListaForos.getSelectedValue();
            this.ListaPreguntas.setListData(this.c.verListadoDePreguntas(unForo).toArray());
        }
    }//GEN-LAST:event_ListaForosValueChanged

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        VistaLogin vl = new VistaLogin(this.c);
        this.usuarioActual = null;
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void ListaPreguntasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaPreguntasMouseClicked
    }//GEN-LAST:event_ListaPreguntasMouseClicked

    private void ListaPreguntasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaPreguntasValueChanged
        if(!this.ListaPreguntas.isSelectionEmpty()){
            int retorno = JOptionPane.showConfirmDialog(null,"Desea ver detalles de esta pregunta?");
            if(retorno==JOptionPane.YES_OPTION){
                Pregunta unaPregunta = (Pregunta) this.ListaPreguntas.getSelectedValue();
                VistaPreguntas vp = new VistaPreguntas(this.c,this,this.usuarioActual,unaPregunta);
                this.dispose();
            }else{
                this.ListaPreguntas.clearSelection();
            }
        }
    }//GEN-LAST:event_ListaPreguntasValueChanged

    private void btnEliminarForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarForoActionPerformed
        if(!this.ListaForos.isSelectionEmpty()){
            Foro unForo = (Foro) this.ListaForos.getSelectedValue();
            this.c.eliminarForo(unForo);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione un Foro");
        }
        
    }//GEN-LAST:event_btnEliminarForoActionPerformed

    private void btnEditarForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarForoActionPerformed
        if(!this.ListaForos.isSelectionEmpty()){
            Foro unForo = (Foro) this.ListaForos.getSelectedValue();
            VistaAgregarForo vaf = new VistaAgregarForo(this.c,this,this.usuarioActual,unForo);
         }else{
            JOptionPane.showMessageDialog(null,"Seleccione un Foro");
        }
    }//GEN-LAST:event_btnEditarForoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(this.ListaForos.isSelectionEmpty()&&this.ListaUsuarios.isSelectionEmpty()){
            this.ListaForos.setListData(this.c.verListadoDeForos().toArray());
            this.ListaUsuarios.setListData(this.c.verListadoDeUsuarios().toArray());

        }else{
            if(!this.ListaUsuarios.isSelectionEmpty()){
                this.ListaUsuarios.setSelectedIndex(-1);
            }
            if(!this.ListaForos.isSelectionEmpty()){
                this.ListaForos.setSelectedIndex(-1);
            }
            this.ListaForos.setListData(this.c.verListadoDeForos().toArray());
            this.ListaUsuarios.setListData(this.c.verListadoDeUsuarios().toArray());
        }
        this.ListaPreguntas.setListData(this.c.returnVacio().toArray());//no anda la wea

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        VistaReportes VR = new VistaReportes(this.c,this,this.usuarioActual);
        this.dispose();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        VistaVerPerfil vvp = new VistaVerPerfil(this.c,this,this.usuarioActual);
        this.dispose();
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void ListaUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaUsuariosValueChanged
        if(!this.ListaUsuarios.isSelectionEmpty()){
            Usuario unUsuario = (Usuario) this.ListaUsuarios.getSelectedValue();
            VistaVerPerfil vvp = new VistaVerPerfil(this.c,this,unUsuario);
            this.dispose();
        }
    }//GEN-LAST:event_ListaUsuariosValueChanged
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaForos;
    private javax.swing.JList ListaPreguntas;
    private javax.swing.JList ListaUsuarios;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarForo;
    private javax.swing.JToggleButton btnAñadirPregunta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarForo;
    private javax.swing.JButton btnEliminarForo;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
