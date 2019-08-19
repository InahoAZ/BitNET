package vista;

import controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Pregunta;
import modelo.Reporte;
import modelo.Respuesta;
import modelo.Usuario;

public class VistaReportes extends javax.swing.JFrame {

    Controlador c;
    JFrame vistaAnterior;
    Usuario usuarioActual;
    public VistaReportes(Controlador c,JFrame vistaAnterior,Usuario usuarioActual) {
        initComponents();
        this.setVisible(true);
        this.vistaAnterior=vistaAnterior;
        this.usuarioActual=usuarioActual;
        this.lblNombre.setText(usuarioActual.getNombre() + usuarioActual.getApellido());
        this.lblRol.setText(usuarioActual.getRol().toString());
        this.c=c;
        this.actualizarListas();
    }
    public void actualizarListas(){
        /*List<Pregunta> preguntas = new ArrayList<>();
        for (int i = 0; i < this.c.verReportesPreguntas().size(); i++) {
            preguntas.add(this.c.verReportesPreguntas().get(i).getPregunta());
        }
        List<Respuesta> respuestas = new ArrayList<>();
        for (int i = 0; i < this.c.verReportesRespuestas().size(); i++) {
            respuestas.add(this.c.verReportesRespuestas().get(i).getRespuesta());
        }*/
        this.listaReportesPreguntas.setListData(this.c.verReportesPreguntas().toArray());
        this.listaReportesRespuestas.setListData(this.c.verReportesRespuestas().toArray());
    }

    private void limpiar(){
        //usuario reportado
            this.lblNombre1.setText("...");
            this.lblApellido.setText("...");
            this.lblRol1.setText("...");
            this.lblLegajo.setText("...");
            this.lblReputacion.setText("...");
            //usuario que reporto
            this.lblNombre2.setText("...");
            this.lblLegajo2.setText("...");
            this.lblRol2.setText("...");
            //causa del lio
            this.lblCausa.setText("");
            this.artReportado.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaReportesPreguntas = new javax.swing.JList();
        btnVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLegajo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRol1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblReputacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaReportesRespuestas = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblLegajo2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblRol2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblCausa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        artReportado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jLabel1.setText("Gestion de Reportes");

        listaReportesPreguntas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaReportesPreguntasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaReportesPreguntas);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart_back_left_arrow_6022.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_person_people_6100.png"))); // NOI18N
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblNombre.setText("Aca va el nombre");

        lblRol.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblRol.setText("rol aca");

        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salida-40.png"))); // NOI18N
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
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
                .addComponent(lblCerrarSesion))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCerrarSesion)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102))));

        jLabel9.setText("Nombre:");

        lblNombre1.setText("...");

        jLabel3.setText("Apellido:");

        lblApellido.setText("...");

        jLabel5.setText("Legajo:");

        lblLegajo.setText("...");

        jLabel6.setText("Rol:");

        lblRol1.setText("...");

        jLabel10.setText("Reputacion:");

        lblReputacion.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblReputacion))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(49, 49, 49)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblLegajo)
                                .addComponent(lblRol1)
                                .addComponent(lblApellido))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombre1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5))
                    .addContainerGap(48, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLegajo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblRol1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblReputacion))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel5)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );

        jLabel4.setText("Datos Usuario Reportado");

        jLabel7.setText("Preguntas Reportadas");

        jLabel11.setText("Causa:");

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tickhd_106069 (1).png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnRechazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crosshd_106070 (1).png"))); // NOI18N
        btnRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarActionPerformed(evt);
            }
        });

        jLabel16.setText("Respuestas Reportadas");

        listaReportesRespuestas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaReportesRespuestasValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaReportesRespuestas);

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102))));

        jLabel23.setText("Nombre:");

        lblNombre2.setText("...");

        jLabel25.setText("Legajo:");

        lblLegajo2.setText("...");

        jLabel27.setText("Rol:");

        lblRol2.setText("...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(32, 32, 32)
                        .addComponent(lblLegajo2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(49, 49, 49)
                        .addComponent(lblRol2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel23)
                    .addGap(26, 26, 26)
                    .addComponent(lblNombre2)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lblLegajo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblRol2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(lblNombre2))
                    .addContainerGap(73, Short.MAX_VALUE)))
        );

        jLabel24.setText("Usuario que Reporto");

        lblCausa.setText("...");

        artReportado.setColumns(20);
        artReportado.setRows(5);
        jScrollPane2.setViewportView(artReportado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblCausa)
                                        .addGap(142, 142, 142)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(510, 510, 510)
                        .addComponent(btnConfirmar)
                        .addGap(34, 34, 34)
                        .addComponent(btnRechazar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(lblCausa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver)
                    .addComponent(btnConfirmar)
                    .addComponent(btnRechazar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        VistaLogin vl = new VistaLogin(this.c);
        this.usuarioActual=null;
        this.dispose();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        VistaVerPerfil VVP = new VistaVerPerfil(this.c,this,this.usuarioActual);
        this.dispose();
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(this.listaReportesPreguntas.isSelectionEmpty()&&this.listaReportesRespuestas.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Seleccione un Reporte");
        }else{
            if(!this.listaReportesPreguntas.isSelectionEmpty()){
                Reporte unReporte = (Reporte) this.listaReportesPreguntas.getSelectedValue();
                this.c.eliminarPregunta(unReporte.getPregunta());
            }else{
                Reporte unReporte = (Reporte) this.listaReportesRespuestas.getSelectedValue();
                this.c.eliminarRespuesta(unReporte.getRespuesta());
            }
            this.actualizarListas();
            this.limpiar();
            
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void listaReportesPreguntasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaReportesPreguntasValueChanged
        if(!this.listaReportesPreguntas.isSelectionEmpty()){
            if(!this.listaReportesRespuestas.isSelectionEmpty()){
                this.listaReportesRespuestas.setListData(this.c.returnVacio().toArray());
            }
            Reporte unReporte = (Reporte) this.listaReportesPreguntas.getSelectedValue();
            //usuario reportado
            this.lblNombre1.setText(unReporte.getPregunta().getUsuario().getNombre());
            this.lblApellido.setText(unReporte.getPregunta().getUsuario().getApellido());
            this.lblRol1.setText(unReporte.getPregunta().getUsuario().getRol().toString());
            this.lblLegajo.setText(unReporte.getPregunta().getUsuario().getLegajo());
            this.lblReputacion.setText(Float.toString(unReporte.getPregunta().getUsuario().getReputacion()));
            //usuario que reporto
            this.lblNombre2.setText(unReporte.getUsuario().getNombre());
            this.lblLegajo2.setText(unReporte.getUsuario().getLegajo());
            this.lblRol2.setText(unReporte.getUsuario().getRol().getNombre());
            //causa del lio
            this.lblCausa.setText(unReporte.getCausa());
            this.artReportado.setText(unReporte.getPregunta().toString());

        }
    }//GEN-LAST:event_listaReportesPreguntasValueChanged

    private void listaReportesRespuestasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaReportesRespuestasValueChanged
        if(!this.listaReportesRespuestas.isSelectionEmpty()){
            if(!this.listaReportesPreguntas.isSelectionEmpty()){
                this.listaReportesPreguntas.setListData(this.c.returnVacio().toArray());
            }
            Reporte unReporte = (Reporte) this.listaReportesRespuestas.getSelectedValue();
            //usuario reportado
            this.lblNombre1.setText(unReporte.getRespuesta().getUsuario().getNombre());
            this.lblApellido.setText(unReporte.getRespuesta().getUsuario().getApellido());
            this.lblRol1.setText(unReporte.getRespuesta().getUsuario().getRol().getNombre());
            this.lblLegajo.setText(unReporte.getRespuesta().getUsuario().getLegajo());
            this.lblReputacion.setText(Float.toString(unReporte.getRespuesta().getUsuario().getReputacion()));
            //usuario que reporto
            this.lblNombre2.setText(unReporte.getUsuario().getNombre());
            this.lblLegajo2.setText(unReporte.getUsuario().getLegajo());
            this.lblRol2.setText(unReporte.getUsuario().getRol().getNombre());
            //causa del lio
            this.lblCausa.setText(unReporte.getCausa());
            this.artReportado.setText(unReporte.getRespuesta().toString());
        }
    }//GEN-LAST:event_listaReportesRespuestasValueChanged

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
        if(this.listaReportesPreguntas.isSelectionEmpty()&&this.listaReportesRespuestas.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Seleccione un Reporte");
        }else{
            if(!this.listaReportesPreguntas.isSelectionEmpty()){
                Reporte unReporte = (Reporte) this.listaReportesPreguntas.getSelectedValue();
                this.c.rechazarReporte(unReporte);
            }else{
                Reporte unReporte = (Reporte) this.listaReportesRespuestas.getSelectedValue();
                this.c.rechazarReporte(unReporte);
            }
        }
        this.actualizarListas();
        this.limpiar();
    }//GEN-LAST:event_btnRechazarActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea artReportado;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCausa;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblLegajo2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblReputacion;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblRol1;
    private javax.swing.JLabel lblRol2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList listaReportesPreguntas;
    private javax.swing.JList listaReportesRespuestas;
    // End of variables declaration//GEN-END:variables
}
