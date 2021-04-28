/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.estudiantes.Vistas;

import javax.swing.JOptionPane;
import tp7.estudiantes.Clases.Materia;

/**
 *
 * @author luciano.echevarne
 */
public class FormularioDeMaterias extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form FormularioDeMaterias
     */
    public FormularioDeMaterias() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fcodigo = new javax.swing.JTextField();
        Fnombre = new javax.swing.JTextField();
        Fanio = new javax.swing.JTextField();
        Bagregar = new javax.swing.JButton();
        Blimpiar1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Formulario de Materias");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Año:");

        Fnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnombreActionPerformed(evt);
            }
        });

        Bagregar.setText("Agregar");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        Blimpiar1.setText("Limpiar");
        Blimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Blimpiar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bagregar))
                            .addComponent(Fcodigo)
                            .addComponent(Fnombre)
                            .addComponent(Fanio, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Fcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Fnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(Fanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Blimpiar1)
                    .addComponent(Bagregar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnombreActionPerformed

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
    String nombre=Fnombre.getText();
    int codigo=0;
    int anio=0;
    int err=0;
    try{
    codigo=Integer.parseInt(Fcodigo.getText());
    }
    catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(this,"Volver a cargar, en campo codigo ingresar solo numeros");
    err=1;
    }
    try{
    anio=Integer.parseInt(Fanio.getText());
    }
    catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(this,"Volver a cargar, en campo año ingresar solo numeros");
    err=1;
    }
    Fcodigo.setText("");  
    Fnombre.setText("");
    Fanio.setText("");
    Materia m1=new Materia(codigo,nombre,anio);
    Inscripcion i=new Inscripcion();
    i.agregarMateria(m1);
    System.out.println(Inscripcion.materias.size());
        // TODO add your handling code here:
    }//GEN-LAST:event_BagregarActionPerformed

    private void Blimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blimpiar1ActionPerformed
Fcodigo.setText("");  
Fnombre.setText("");
Fanio.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_Blimpiar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Blimpiar1;
    private javax.swing.JTextField Fanio;
    private javax.swing.JTextField Fcodigo;
    private javax.swing.JTextField Fnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
