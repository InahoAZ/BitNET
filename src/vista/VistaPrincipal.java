package vista;
 
import controlador.Controlador;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
        switch(this.usuarioActual.getRol().getNombre()){
            case "Administrador":
                System.out.println(this.usuarioActual.getRol().getNombre());
                this.btnActualizar.setVisible(true);
                this.btnAgregarForo.setVisible(true);
                this.btnAñadirPregunta.setVisible(true);
                this.btnBuscar.setVisible(true);
                this.btnEliminarForo.setVisible(true);
                this.btnUsuarios.setVisible(true);
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
        jLabel4 = new javax.swing.JLabel();
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

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaForos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaForosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaForos);

        jLabel1.setFont(new java.awt.Font("Dotum", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Letter_B_red_35046 (1).png"))); // NOI18N
        jLabel1.setText("itNet");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-google-web-search-30.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_person_people_6100.png"))); // NOI18N

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
                .addComponent(jLabel4)
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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnAgregarForo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-más-2-matemáticas-25 (1).png"))); // NOI18N
        btnAgregarForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarForoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Levenim MT", 1, 20)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-pregunta-48.png"))); // NOI18N
        jLabel3.setText("Preguntas");

        jScrollPane4.setViewportView(ListaUsuarios);

        jLabel6.setFont(new java.awt.Font("Levenim MT", 1, 20)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-carpeta-de-usuario-48.png"))); // NOI18N
        jLabel6.setText("Usuarios");

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

        btnAñadirPregunta.setText("Añadir Pregunta");
        btnAñadirPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirPreguntaActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-actualizar-30.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Levenim MT", 1, 20)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-ver-detalles-48.png"))); // NOI18N
        jLabel7.setText("Foros");

        btnEliminarForo.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminarForo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarForo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAñadirPregunta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane4, jScrollPane5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregarForo, btnAñadirPregunta, btnUsuarios});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUsuarios))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAñadirPregunta))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnEliminarForo))))
                    .addComponent(btnAgregarForo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane4, jScrollPane5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregarForo, btnAñadirPregunta, btnUsuarios});

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
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
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
                this.ListaPreguntas.setSelectedIndex(-1);
            }
            
        }
    }//GEN-LAST:event_ListaPreguntasValueChanged
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaForos;
    private javax.swing.JList ListaPreguntas;
    private javax.swing.JList ListaUsuarios;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarForo;
    private javax.swing.JToggleButton btnAñadirPregunta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarForo;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
