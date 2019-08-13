package vista;

import controlador.Controlador;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import modelo.Rol;
import modelo.Usuario;

public class VistaVerPerfil extends javax.swing.JFrame {
    Controlador c;
    JFrame vistaAnterior;
    Usuario usuarioActual;
    public VistaVerPerfil(Controlador c,JFrame vistaAnterior,Usuario usuarioActual) {
        initComponents();
        this.setVisible(true);
        this.c=c;
        this.vistaAnterior=vistaAnterior;
        this.usuarioActual=usuarioActual;
        if(this.usuarioActual.getRol().toString().compareTo("Administrador")==0 || this.usuarioActual.getRol().toString().compareTo("Registrador")==0){
            this.combito.setEnabled(false);
            this.listita.setEnabled(false);
            this.lblReputacion.setText("...");
        }else{
            this.lblReputacion.setText(Float.toString(this.usuarioActual.getReputacion()));
        }
        this.lblNombre.setText(this.usuarioActual.getNombre());
        this.lblApellido.setText(this.usuarioActual.getApellido());
        this.lblLegajo.setText(this.usuarioActual.getLegajo());
        this.lblEmail.setText(this.usuarioActual.getCorreo());
        Period edad;
        DateTimeFormatter frm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNac = LocalDate.parse(this.usuarioActual.getFechaNacLinda(), frm);
        edad = Period.between(fechaNac, hoy);
        this.lblEdad.setText(Integer.toString(edad.getYears()));
        this.lblRol.setText(this.usuarioActual.getRol().toString());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLegajo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblReputacion = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listita = new javax.swing.JList();
        combito = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuario_25560 (1).png"))); // NOI18N

        jLabel3.setText("Apellido:");

        jLabel4.setText("Legajo:");

        lblLegajo.setText("905768");

        jLabel6.setText("e-mail:");

        lblEmail.setText("ejemplo@example.com");

        jLabel8.setText("Edad:");

        lblEdad.setText("20");

        jLabel10.setText("Reputacion:");

        lblReputacion.setText("numerito nu mas xD");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart_back_left_arrow_6022.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel9.setText("Nombre:");

        lblNombre.setText("Nombrecito");

        lblApellido.setText("APELLIDECITO");

        jLabel5.setText("Rol:");

        lblRol.setText("cosito");

        jScrollPane1.setViewportView(listita);

        combito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preguntas", "Respuestas", "Reportes Realizados" }));
        combito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combitoItemStateChanged(evt);
            }
        });
        combito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combitoMouseClicked(evt);
            }
        });
        combito.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                combitoPropertyChange(evt);
            }
        });
        combito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combitoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReputacion)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblLegajo))
                            .addComponent(lblRol)
                            .addComponent(lblEdad)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combito, 0, 159, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(combito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(lblNombre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lblLegajo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(lblEmail))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(lblEdad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblRol))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(lblReputacion))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void combitoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_combitoPropertyChange
    }//GEN-LAST:event_combitoPropertyChange

    private void combitoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combitoKeyPressed
        
    }//GEN-LAST:event_combitoKeyPressed

    private void combitoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combitoMouseClicked
        
    }//GEN-LAST:event_combitoMouseClicked

    private void combitoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combitoItemStateChanged
        System.out.println("entre lina");
        if(this.combito.getSelectedIndex()==0){
            this.listita.setListData(this.usuarioActual.getPreguntas().toArray());
        }
        if(this.combito.getSelectedIndex()==1){
            this.listita.setListData(this.usuarioActual.getRespuestas().toArray());
        }
        if(this.combito.getSelectedIndex()==2){
            this.listita.setListData(this.usuarioActual.getReportes().toArray());
        }
    }//GEN-LAST:event_combitoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> combito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReputacion;
    private javax.swing.JLabel lblRol;
    private javax.swing.JList listita;
    // End of variables declaration//GEN-END:variables
}
