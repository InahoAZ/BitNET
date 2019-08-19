package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Foro;
import modelo.Usuario;


public class VistaAgregarForo extends javax.swing.JFrame {
    Controlador c;
    JFrame vistaAnterior;
    Usuario usuarioActual;
    Foro unForo;
    public VistaAgregarForo(Controlador c,JFrame vistaAnterior,Usuario usuarioActual) {
        initComponents();
        this.setVisible(true);
        this.c=c;
        this.vistaAnterior=vistaAnterior;
        this.usuarioActual=usuarioActual;
    }
    public VistaAgregarForo(Controlador c,JFrame vistaAnterior,Usuario usuarioActual,Foro unForo) {
        initComponents();
        this.setVisible(true);
        this.c=c;
        this.vistaAnterior=vistaAnterior;
        this.usuarioActual=usuarioActual;
        this.txtTitulo.setText(unForo.getTitulo());
        this.txtDescripcion.setText(unForo.getDescripcion());
        this.unForo=unForo;
        this.lblTitulo.setText("Editar Foro");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnAgregarForo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new_folder_white_13776.png"))); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTituloFocusGained(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcionFocusGained(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart_back_left_arrow_6022.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgregarForo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-más-2-matemáticas-40.png"))); // NOI18N
        btnAgregarForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarForoActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo");

        jLabel3.setText("Descripcion");

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitulo.setText("Añadir Foro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarForo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTitulo)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarForo))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar(){
        this.txtTitulo.setText("");
        this.txtDescripcion.setText("");
    }
    private void txtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusGained
        
    }//GEN-LAST:event_txtTituloFocusGained

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.vistaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescripcionFocusGained
        
    }//GEN-LAST:event_txtDescripcionFocusGained

    private void btnAgregarForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarForoActionPerformed
       if(this.txtTitulo.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Complete el Titulo");
       }else{
            if(this.txtDescripcion.getText().isEmpty()){
                if(this.unForo==null){
                    this.c.añadirForo(this.txtTitulo.getText(),"...");
                }else{
                    this.unForo.setDescripcion("...");
                    this.c.modificarForo(this.unForo);
                    this.unForo=null;
                }
            }else{
                if(this.unForo==null){
                    this.c.añadirForo(this.txtTitulo.getText(),this.txtDescripcion.getText());
                }else{
                    this.c.modificarForo(this.unForo);
                    this.unForo=null;
                }
            }
            int respuesta = JOptionPane.showConfirmDialog(null,"Desea registrar un nuevo foro?");
            if(respuesta == JOptionPane.YES_OPTION){
                this.limpiar();
                this.lblTitulo.setText("Añadir Foro");
            }else{
                if(respuesta == JOptionPane.NO_OPTION){
                    this.vistaAnterior.setVisible(true);
                    this.dispose();
                }
            }          
       }
    }//GEN-LAST:event_btnAgregarForoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarForo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
