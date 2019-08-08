package vista;

public class VistaCargaReporte extends javax.swing.JFrame {

    
    public VistaCargaReporte() {
        initComponents();
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
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(btnReportar);
        btnReportar.setBounds(150, 240, 76, 25);

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(243, 240, 80, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diseño sin título.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-570, 0, 910, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReportar;
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
