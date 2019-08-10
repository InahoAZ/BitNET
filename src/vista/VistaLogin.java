package vista;

import controlador.Controlador;
import java.util.Arrays;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class VistaLogin extends javax.swing.JFrame {
    private Controlador c;
    
    public VistaLogin(Controlador c) {
        initComponents();
        this.c = c;
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 325));
        setMinimumSize(new java.awt.Dimension(400, 325));
        setPreferredSize(new java.awt.Dimension(400, 325));
        setSize(new java.awt.Dimension(400, 325));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Letter_B_red_35046.png"))); // NOI18N
        jLabel1.setText("itNet");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(99, 12, 166, 64);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicar Sesion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 80, 120, 22);

        txtLegajo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtLegajo.setText("ingrese su legajo");
        txtLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLegajoFocusGained(evt);
            }
        });
        txtLegajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLegajoMouseClicked(evt);
            }
        });
        txtLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLegajoActionPerformed(evt);
            }
        });
        getContentPane().add(txtLegajo);
        txtLegajo.setBounds(90, 130, 230, 24);

        txtPassword.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        txtPassword.setText("Contraseña");
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(90, 180, 230, 24);

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(170, 230, 60, 42);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpapers_tecnologia_computacion_by_madboxpc-1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 390, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLegajoActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //System.out.println("Antes del controlador");
        Usuario usuarioActual = this.c.iniciarSesion(this.txtLegajo.getText(), Arrays.toString(this.txtPassword.getPassword()));
        if(usuarioActual != null){
            this.dispose();
            VistaPrincipal vPrincipal = new VistaPrincipal(this.c, this, usuarioActual);
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
        }
            
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtLegajoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLegajoFocusGained
        
    }//GEN-LAST:event_txtLegajoFocusGained

    private void txtLegajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLegajoMouseClicked
        this.txtLegajo.setText("");
    }//GEN-LAST:event_txtLegajoMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        this.txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
