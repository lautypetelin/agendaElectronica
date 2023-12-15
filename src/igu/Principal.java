// 100% lógica de Swing.

package igu;

public class Principal extends javax.swing.JFrame {

    //Variables globales
    String dnis[] = new String[10];
    String nombres[] = new String[10];
    String apellidos[] = new String[10];
    String direcciones[] = new String[10];
    String telefonos[] = new String[10];
    String fechasNac[] = new String[10];
    
    //Constructores
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jlDni = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlApellido = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jlDireccion = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jlTelefono = new javax.swing.JLabel();
        jtfTelefono = new javax.swing.JTextField();
        jlFNac = new javax.swing.JLabel();
        jtfFNac = new javax.swing.JTextField();
        jbAnterior = new javax.swing.JButton();
        jbGrabar = new javax.swing.JButton();
        jbSiguiente = new javax.swing.JButton();
        jlIndice = new javax.swing.JLabel();
        jtfIndice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agenda Electrónica");

        jlDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlDni.setText("DNI:");

        jtfDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jlNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlNombre.setText("Nombre:");

        jtfNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jlApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlApellido.setText("Apellido:");

        jtfApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jlDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlDireccion.setText("Dirección:");

        jtfDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jlTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlTelefono.setText("Teléfono:");

        jtfTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jlFNac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlFNac.setText("Fecha de N:");

        jtfFNac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDni)
                    .addComponent(jlNombre)
                    .addComponent(jlApellido))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFNac)
                    .addComponent(jlTelefono)
                    .addComponent(jlDireccion))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfFNac, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlDireccion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDni)
                            .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jlTelefono)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlApellido)
                            .addComponent(jlFNac)
                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfFNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );

        jbAnterior.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAnterior.setText("<<");
        jbAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnteriorActionPerformed(evt);
            }
        });

        jbGrabar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbGrabar.setText("Grabar");
        jbGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGrabarActionPerformed(evt);
            }
        });

        jbSiguiente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSiguiente.setText(">>");
        jbSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSiguienteActionPerformed(evt);
            }
        });

        jlIndice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jlIndice.setText("Índice:");

        jtfIndice.setEditable(false);
        jtfIndice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtfIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfIndice.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlIndice)
                    .addComponent(jbAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGrabar)
                    .addComponent(jbAnterior)
                    .addComponent(jbSiguiente))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIndice)
                    .addComponent(jtfIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSiguienteActionPerformed
        
        int indice = Integer.parseInt(jtfIndice.getText());
        
        if(indice < 9){
            indice++;
            jtfIndice.setText(String.valueOf(indice));
            
            jtfDni.setText(dnis[indice]);
            jtfNombre.setText(nombres[indice]);
            jtfApellido.setText(apellidos[indice]);
            jtfDireccion.setText(direcciones[indice]);
            jtfTelefono.setText(telefonos[indice]);
            jtfFNac.setText(fechasNac[indice]);
        }
    }//GEN-LAST:event_jbSiguienteActionPerformed

    private void jbAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnteriorActionPerformed
        
        int indice = Integer.parseInt(jtfIndice.getText());
        
        if(indice > 0){
            indice--;
            jtfIndice.setText(String.valueOf(indice));
            
            jtfDni.setText(dnis[indice]);
            jtfNombre.setText(nombres[indice]);
            jtfApellido.setText(apellidos[indice]);
            jtfDireccion.setText(direcciones[indice]);
            jtfTelefono.setText(telefonos[indice]);
            jtfFNac.setText(fechasNac[indice]);
        }     
    }//GEN-LAST:event_jbAnteriorActionPerformed

    private void jbGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGrabarActionPerformed
        
        int indice = Integer.parseInt(jtfIndice.getText());
        
        dnis[indice] = jtfDni.getText();
        nombres[indice] = jtfNombre.getText();
        apellidos[indice] = jtfApellido.getText();
        direcciones[indice] = jtfDireccion.getText();
        telefonos[indice] = jtfTelefono.getText();
        fechasNac[indice] = jtfFNac.getText();
    }//GEN-LAST:event_jbGrabarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAnterior;
    private javax.swing.JButton jbGrabar;
    private javax.swing.JButton jbSiguiente;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlFNac;
    private javax.swing.JLabel jlIndice;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfFNac;
    private javax.swing.JTextField jtfIndice;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

}