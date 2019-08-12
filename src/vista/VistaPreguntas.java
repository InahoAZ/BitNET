package vista;

import controlador.Controlador;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Pregunta;
import modelo.Respuesta;
import modelo.Usuario;
import modelo.Voto;

public class VistaPreguntas extends javax.swing.JFrame {
    Controlador c;
    private JFrame vistaAnterior;
    private Usuario usuarioActual;
    private Pregunta unaPregunta;
    public VistaPreguntas(Controlador c,JFrame vistaAnterior,Usuario usuarioActual,Pregunta unaPregunta) {
        initComponents();
        this.setVisible(true);
        this.c=c;
        this.vistaAnterior=vistaAnterior;
        this.usuarioActual=usuarioActual;
        this.unaPregunta=unaPregunta;
        this.lblNombre.setText(usuarioActual.getNombre() + usuarioActual.getApellido());
        this.lblRol.setText(usuarioActual.getRol().toString());
        this.lblTituloPregunta.setText(this.unaPregunta.getPregunta());
        this.txtDescripcionPregunta.setText(this.unaPregunta.getDescripcion());
        this.listaRespuesta.setListData(this.c.verRespuestas(unaPregunta).toArray());
        
        
        
        //FALTA QUE SE DIFERENCIE EN SI UN USUARIO DEJO PUNTUADO UNA PREGUNTA DE MANERA POSITIVA O NEGATIVA PARA SABER QUE BOTON DEBE PERSISTIR APRETADO.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtCargarRespuesta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblTituloPregunta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionPregunta = new javax.swing.JTextArea();
        btnReportarPregunta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaRespuesta = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnReportarRespuesta = new javax.swing.JButton();
        btnAgregarRespuesta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnMeGusta = new javax.swing.JToggleButton();
        btnNoMeGusta = new javax.swing.JToggleButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business_man_user_support_supportfortheuser_aquestion_theclient_2330_1.png"))); // NOI18N

        txtCargarRespuesta.setText("Agregar Respuesta");
        txtCargarRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCargarRespuestaFocusGained(evt);
            }
        });
        txtCargarRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCargarRespuestaMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/msn_user_23243.png"))); // NOI18N

        lblTituloPregunta.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblTituloPregunta.setText("El titulo de la pregunta va aca?");

        txtDescripcionPregunta.setColumns(20);
        txtDescripcionPregunta.setRows(5);
        txtDescripcionPregunta.setText("La descripcion de la preguntita va aca\n");
        jScrollPane1.setViewportView(txtDescripcionPregunta);

        btnReportarPregunta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-bandera-2-24.png"))); // NOI18N
        btnReportarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportarPreguntaActionPerformed(evt);
            }
        });

        listaRespuesta.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaRespuestaValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaRespuesta);

        txtRespuesta.setEditable(false);
        txtRespuesta.setColumns(20);
        txtRespuesta.setRows(5);
        jScrollPane4.setViewportView(txtRespuesta);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart_back_left_arrow_6022.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione una Respuesta para puntuarla");

        btnReportarRespuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-bandera-2-24.png"))); // NOI18N
        btnReportarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportarRespuestaActionPerformed(evt);
            }
        });

        btnAgregarRespuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus_15650.png"))); // NOI18N
        btnAgregarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRespuestaActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-basura-24.png"))); // NOI18N

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_person_people_6100.png"))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblNombre.setText("Aca va el nombre");

        lblRol.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblRol.setText("rol aca");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salida-40.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
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
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMeGusta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-me-gusta-24.png"))); // NOI18N
        btnMeGusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeGustaActionPerformed(evt);
            }
        });

        btnNoMeGusta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no me gusta.png"))); // NOI18N
        btnNoMeGusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoMeGustaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCargarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnReportarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMeGusta)
                            .addComponent(btnNoMeGusta)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTituloPregunta)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnReportarPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel4))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloPregunta)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(6, 6, 6)
                                .addComponent(btnReportarPregunta))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMeGusta)
                        .addGap(4, 4, 4)
                        .addComponent(btnNoMeGusta))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportarRespuesta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnVolver)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCargarRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.vistaAnterior.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnReportarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportarPreguntaActionPerformed
        VistaCargaReporte VCR = new VistaCargaReporte(this.c,this,this.usuarioActual,this.unaPregunta);
        this.dispose();
    }//GEN-LAST:event_btnReportarPreguntaActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        VistaLogin vl = new VistaLogin(this.c);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void listaRespuestaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaRespuestaValueChanged
        if(!this.listaRespuesta.isSelectionEmpty()){
            Respuesta unaRespuesta= (Respuesta) this.listaRespuesta.getSelectedValue();
            this.txtRespuesta.setText(unaRespuesta.getRespuesta());
            //this.btnMeGusta.setText(unaRespuesta.getPuntaje());
            
            Voto unVoto = this.usuarioActual.buscarVotoRespuesta(unaRespuesta);        
            if(unVoto == null){
                this.btnMeGusta.setSelected(false);
                this.btnNoMeGusta.setSelected(false);
            }else{
                if(unVoto.isPositivo()){
                    this.btnMeGusta.setSelected(true);
                    this.btnNoMeGusta.setSelected(false);
                }else{
                    this.btnNoMeGusta.setSelected(true);
                    this.btnMeGusta.setSelected(false);
                }
            }
        }
    }//GEN-LAST:event_listaRespuestaValueChanged

    private void btnAgregarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRespuestaActionPerformed
        if(!this.txtCargarRespuesta.getText().isEmpty()){
            System.out.println("pregunta enviada: "+this.unaPregunta+" usuario envia2: "+this.usuarioActual);
            this.c.añadirRespuesta(this.txtCargarRespuesta.getText(), this.unaPregunta, this.usuarioActual);
            this.txtRespuesta.setText("");
            this.listaRespuesta.setListData(this.c.verRespuestas(this.unaPregunta).toArray());
        }else{
            JOptionPane.showMessageDialog(null,"Por Favor ingrese una Respuesta");
        }
    }//GEN-LAST:event_btnAgregarRespuestaActionPerformed

    private void txtCargarRespuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCargarRespuestaMouseClicked
        this.txtCargarRespuesta.setText("");
    }//GEN-LAST:event_txtCargarRespuestaMouseClicked

    private void btnMeGustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeGustaActionPerformed
        // TODO add your handling code here:        
        if(!this.listaRespuesta.isSelectionEmpty()){
                Respuesta unaRespuesta= (Respuesta) this.listaRespuesta.getSelectedValue();
                if(this.btnNoMeGusta.isSelected()){
                    this.btnNoMeGusta.setSelected(false);
                    this.c.puntuarRespuesta(unaRespuesta, this.usuarioActual, false);
                }                
                this.c.puntuarRespuesta(unaRespuesta, this.usuarioActual, true);
        }   
    }//GEN-LAST:event_btnMeGustaActionPerformed
    
    private void btnReportarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportarRespuestaActionPerformed
        if(!this.listaRespuesta.isSelectionEmpty()){
            Respuesta unaRespuesta = (Respuesta) this.listaRespuesta.getSelectedValue();
            VistaCargaReporte VCR = new VistaCargaReporte(this.c,this,this.usuarioActual,unaRespuesta);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Seleccione una Respuesta por favor");
        }
        
    }//GEN-LAST:event_btnReportarRespuestaActionPerformed

    private void btnNoMeGustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoMeGustaActionPerformed
        // TODO add your handling code here:
        if(!this.listaRespuesta.isSelectionEmpty()){
                Respuesta unaRespuesta= (Respuesta) this.listaRespuesta.getSelectedValue();
                if(this.btnMeGusta.isSelected()){
                    this.btnMeGusta.setSelected(false);
                    this.c.puntuarRespuesta(unaRespuesta, this.usuarioActual, true);
                }                
                this.c.puntuarRespuesta(unaRespuesta, this.usuarioActual, false);
        }
    }//GEN-LAST:event_btnNoMeGustaActionPerformed


    private void txtCargarRespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCargarRespuestaFocusGained
        this.txtCargarRespuesta.setText("");
    }//GEN-LAST:event_txtCargarRespuestaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRespuesta;
    private javax.swing.JToggleButton btnMeGusta;
    private javax.swing.JToggleButton btnNoMeGusta;
    private javax.swing.JButton btnReportarPregunta;
    private javax.swing.JButton btnReportarRespuesta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblTituloPregunta;
    private javax.swing.JList listaRespuesta;
    private javax.swing.JTextField txtCargarRespuesta;
    private javax.swing.JTextArea txtDescripcionPregunta;
    private javax.swing.JTextArea txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
