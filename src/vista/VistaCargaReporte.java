package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Pregunta;
import modelo.Respuesta;
import modelo.Usuario;

public class VistaCargaReporte extends javax.swing.JFrame {

    Controlador c;
    JFrame vistaAnterior;
    Usuario usuarioActual;
    Respuesta unaRespuesta=null;
    Pregunta unaPregunta=null;
    
    public VistaCargaReporte(Controlador c, JFrame vistaAnterior, Usuario usuarioActual,Object reportado) {
        initComponents();
        this.c=c;
        this.vistaAnterior = vistaAnterior;
        this.usuarioActual = usuarioActual;
        if(reportado.getClass().equals(this.unaRespuesta.getClass())){
            this.unaRespuesta=(Respuesta) reportado;
        }
         if(reportado.getClass().equals(this.unaPregunta.getClass())){
            this.unaPregunta=(Pregunta) reportado;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        opt5 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOtro = new javax.swing.JTextField();
        btnReportar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(330, 280));
        setMinimumSize(new java.awt.Dimension(330, 280));
        setPreferredSize(new java.awt.Dimension(330, 280));
        getContentPane().setLayout(null);

        opt1.setBackground(new java.awt.Color(0, 0, 0));
        opt1.setText("Contiene Contenido Violento");
        getContentPane().add(opt1);
        opt1.setBounds(63, 62, 160, 23);

        opt2.setBackground(new java.awt.Color(0, 0, 0));
        opt2.setText("Es Inapropiado");
        getContentPane().add(opt2);
        opt2.setBounds(63, 88, 96, 23);

        opt3.setBackground(new java.awt.Color(0, 0, 0));
        opt3.setText("Es Spam");
        getContentPane().add(opt3);
        opt3.setBounds(63, 114, 67, 23);

        opt4.setBackground(new java.awt.Color(0, 0, 0));
        opt4.setText("Acoso o Bullyng");
        getContentPane().add(opt4);
        opt4.setBounds(63, 140, 104, 23);

        opt5.setBackground(new java.awt.Color(0, 0, 0));
        opt5.setText("Lenguaje o simbolos que incitan al odio");
        getContentPane().add(opt5);
        opt5.setBounds(63, 166, 212, 23);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jLabel1.setText("Reportar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 130, 37);

        jLabel2.setText("Otro:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(63, 209, 24, 15);
        getContentPane().add(txtOtro);
        txtOtro.setBounds(99, 207, 167, 19);

        btnReportar.setText("Reportar");
        btnReportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportar);
        btnReportar.setBounds(240, 250, 76, 25);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart_back_left_arrow_6022.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(0, 250, 66, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diseño sin título.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-580, 0, 910, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnReportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportarActionPerformed
        if(this.opt1.isSelected()||this.opt2.isSelected()||this.opt3.isSelected()||this.opt4.isSelected()||this.opt4.isSelected()||this.opt5.isSelected()||(!this.txtOtro.getText().isEmpty())){
            String causa="";
            if(this.opt1.isSelected()){
                causa = this.opt1.getText();
                this.txtOtro.setEditable(false);
            }
            if(this.opt2.isSelected()){
                causa = this.opt2.getText();
                this.txtOtro.setEditable(false);
            }
            if(this.opt3.isSelected()){
                causa = this.opt3.getText();
                this.txtOtro.setEditable(false);
            }
            if(this.opt4.isSelected()){
                causa =  this.opt4.getText();
                this.txtOtro.setEditable(false);
            }
            if(this.opt5.isSelected()){
                causa=this.opt5.getText();
                this.txtOtro.setEditable(false);
            }
            if(causa.isEmpty()){
                causa=this.txtOtro.getText();
            }
            if(this.unaPregunta==null){
                if(this.unaRespuesta==null){
                    JOptionPane.showMessageDialog(null,"No se que cosa cargaron ahi en object XD");
                }else{
                    this.c.reportarRespuesta(causa, unaRespuesta, usuarioActual);
                }
            }else{
                this.c.reportarPregunta(causa, unaPregunta, usuarioActual);
            }
        }
        JOptionPane.showMessageDialog(null,"Se Generó su reporte");
        this.vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReportar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JRadioButton opt5;
    private javax.swing.JTextField txtOtro;
    // End of variables declaration//GEN-END:variables
}
