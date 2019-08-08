package vista;

import controlador.Controlador;
import java.util.Date;
import javax.swing.JFrame;
import modelo.Foro;
import modelo.Rol;
import modelo.Usuario;

public class VistaPreguntas extends javax.swing.JFrame {
    private Controlador c;
    private JFrame vistaAnterior;
    private Usuario usuarioActual;
    
    public VistaPreguntas(Controlador c, JFrame p, Usuario unUsuario) {
        initComponents();
        this.c = c;
        this.vistaAnterior = p;
        this.setVisible(true);
        this.usuarioActual = unUsuario;
        this.lstForos.setListData(this.c.verListadoDeForos().toArray());
        this.lstRoles.setListData(this.c.verListadoDeRoles().toArray());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstForos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstRoles = new javax.swing.JList();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-presentación-de-voz-96.png"))); // NOI18N

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstForos);

        jScrollPane2.setViewportView(lstRoles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButton1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String titulo = "Preguntas No Estupidas";
        String descripcion = "Foro para las preguntas No estupidas";
        //this.c.añadirForo(titulo, descripcion);
        Date fechita = new Date(); 
        
        
        this.c.añadirUsuario("LS123", "Usuario1", "A", fechita, "usuario@ymail.com", "1234", (Rol)this.lstRoles.getSelectedValue());        
        
        //this.lstForos.setListData(this.c.verListadoDeForos().toArray());
        //this.c.añadirUsuario("LS00775","lina", "shengi",fechita , "linabb@ymail.com", "123");
        //Usuario loginUsuario = this.c.iniciarSesion("LS00775", "123");
        //System.out.println(loginUsuario);
        String pregunta = "¿Llueve en la Esquina?";
        descripcion = "Me estaria interesando mucho saber si llueve en la esquina";
        
        //System.out.println((Foro)this.lstForos.getSelectedValue());
        //this.c.añadirPregunta(pregunta, descripcion, (Foro) this.lstForos.getSelectedValue(), this.usuarioActual);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstForos;
    private javax.swing.JList lstRoles;
    // End of variables declaration//GEN-END:variables
}
