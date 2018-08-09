
package debermatricula;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Interfaz extends javax.swing.JFrame {
    
    String [][] materias;
    DefaultTableModel tblModelMaterias;

    String [][] estudiantes;
    DefaultTableModel tblModelEstudiantes;
   
     String [][] profesores;
    DefaultTableModel tblModelProfesores;
    
    String items [][];
    DefaultTableModel tblModelItems;

  
      ArrayList <Profesor> listaProfesores = new ArrayList <Profesor>();
      ArrayList <Datos> listaItems = new ArrayList <Datos> ();
      
     List<Materias> listaMaterias = new ArrayList<Materias>();
    DefaultComboBoxModel listaMateriasModel =  new DefaultComboBoxModel(listaMaterias.toArray());
    
       List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEstudiantesModel =  new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    
    
    public Interfaz() {
        initComponents();
        
     
        
        
        String titulosColumnasMaterias[] = new String [] { " "};
        
        tblModelMaterias = new DefaultTableModel(materias, titulosColumnasMaterias);
        tblMaterias.setModel(tblModelMaterias);
        
        
         String titulosColumnasProfesores[] = new String [] {
            "Nombre", "Apellido", "Facultad", "Materia"
        };
        
        tblModelProfesores = new DefaultTableModel(estudiantes, titulosColumnasProfesores);
        tblProfesor.setModel( tblModelProfesores);
        
        
        
         String titulosColumnasEstudiantes[] = new String [] {
            "Nombre", "Apellido"
        };
        
        tblModelEstudiantes = new DefaultTableModel(estudiantes, titulosColumnasEstudiantes);
        tblEstudiante.setModel(tblModelEstudiantes);
            
 String titulosColumnasItems[] = new String [] {
            "Estudiante" , "Materia"
        };
        
        tblModelItems = new DefaultTableModel(items, titulosColumnasItems);
        tblMatriculas.setModel(tblModelItems);
        
       
        cmbListaEstudiantes.setModel(listaEstudiantesModel); 
        cmbListaMaterias.setModel(listaMateriasModel);
        cmbMateriasElegidas.setModel(listaMateriasModel);
        
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblMatricula = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblIngresoMaterias = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        btnMateria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNombreProfesor = new javax.swing.JLabel();
        lblApellidoProfesor = new javax.swing.JLabel();
        lblFacultad = new javax.swing.JLabel();
        cmbMateriasElegidas = new javax.swing.JComboBox<>();
        lblMaterias = new javax.swing.JLabel();
        txtApellidoProfesor = new javax.swing.JTextField();
        txtFacultad = new javax.swing.JTextField();
        txtNombreProfesor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProfesor = new javax.swing.JTable();
        btnProfesor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoEstudiante = new javax.swing.JTextField();
        btnEstudiante = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        txtNombreEstudiante = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbListaEstudiantes = new javax.swing.JComboBox<>();
        cmbListaMaterias = new javax.swing.JComboBox<>();
        btnMatricular = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMatriculas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIngresoMaterias.setText("Ingrese materia");

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        btnMateria.setText("Registrar materia");
        btnMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnMateria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblIngresoMaterias)
                                .addGap(18, 18, 18)
                                .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresoMaterias)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        tblMatricula.addTab("Materia ", jPanel1);

        lblNombreProfesor.setText("Nombre");

        lblApellidoProfesor.setText("Apellido");

        lblFacultad.setText("Facultad");

        lblMaterias.setText("Materia");

        tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblProfesor);

        btnProfesor.setText("Registrar profesor");
        btnProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFacultad)
                            .addComponent(lblApellidoProfesor)
                            .addComponent(lblNombreProfesor)
                            .addComponent(lblMaterias))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMateriasElegidas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFacultad, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addComponent(txtApellidoProfesor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreProfesor, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnProfesor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProfesor)
                    .addComponent(txtNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoProfesor)
                    .addComponent(txtApellidoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultad)
                    .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMateriasElegidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfesor)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tblMatricula.addTab("Profesor", jPanel2);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        btnEstudiante.setText("Registrar");
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });

        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblEstudiante);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtApellidoEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnEstudiante)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        tblMatricula.addTab("Estudiante", jPanel3);

        jLabel4.setText("Estudiante");

        jLabel5.setText("Materias");

        cmbListaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaEstudiantesActionPerformed(evt);
            }
        });

        btnMatricular.setText("Matricularse");
        btnMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularActionPerformed(evt);
            }
        });

        tblMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblMatriculas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnMatricular))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnMatricular)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        tblMatricula.addTab("Matricula", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(tblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriaActionPerformed
    
        boolean materia = true;
       if (!txtMateria.getText().equals("")){
        materia  =true;
        Materias materias = new Materias (txtMateria.getText());
        listaMaterias.add(materias);
 
        for (int i = 0; i < listaMaterias.size()-1; i++) {
            if (listaMaterias.get(i).equals(listaMaterias.get(listaMaterias.size()-1))){
                materia = false;
                listaMaterias.remove(listaMaterias.size()-1);            
                break;
            }
        }
        txtMateria.setText("");
        
        if ( materia == true){
            tblModelMaterias.addRow( new String[]{materias.getMaterias()});
            listaMateriasModel.addElement(materias);  
            
        }else{
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
         JOptionPane.showMessageDialog(rootPane, "Esta materia ya fue registrada", "OJO!", iconoAdvertencia);
            
        }}else{
           int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
         JOptionPane.showMessageDialog(rootPane, "Debe llenar la materia", "OJO!", iconoAdvertencia);
            
        }
        
    }//GEN-LAST:event_btnMateriaActionPerformed
    
    private void btnProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesorActionPerformed
        String nombre = txtNombreProfesor.getText();
        String apellido = txtApellidoProfesor.getText();
        String facultad = txtFacultad.getText();
        String materia = ""+cmbMateriasElegidas.getSelectedItem();
        boolean verificarProfesor=true;
  
        Profesor profesor=new Profesor(nombre,apellido,facultad, materia);
        listaProfesores.add(profesor);
        
           for (int i = 0; i < listaProfesores.size()-1; i++) {
            if (listaProfesores.get(i).getMateriaElegida().equals(listaProfesores.get(listaProfesores.size()-1).getMateriaElegida())){
               verificarProfesor= false;
                listaProfesores.remove(listaProfesores.size()-1);
                break;
            }
           } if (verificarProfesor== true){
            tblModelProfesores.addRow(new String[]{nombre,apellido,facultad,materia});          
        }else{   
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
         JOptionPane.showMessageDialog(rootPane, "Esta materia ya tiene un profesor asignado", "OJO!", iconoAdvertencia);
        }
        
           
        txtNombreProfesor.setText("");
        txtApellidoProfesor.setText("");
        txtFacultad.setText("");     
    }//GEN-LAST:event_btnProfesorActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed

        String nombre = txtNombreEstudiante.getText();
        String apellido = txtApellidoEstudiante.getText();
    
       
        Estudiante estudiante = new Estudiante (nombre,apellido);
        tblModelEstudiantes.addRow(new String []{nombre,apellido});
        listaEstudiantesModel.addElement(estudiante); 
       
        txtNombreEstudiante.setText("");
        txtApellidoEstudiante.setText("");
       
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void btnMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularActionPerformed
        String materia = ""+cmbListaMaterias.getSelectedItem();
        String estudiante = ""+cmbListaEstudiantes.getSelectedItem();
        boolean verificacionMaterias = true;
        boolean verificacionEstudiante = true;
    
        for (int i = 0; i < listaProfesores.size(); i++) {           
        if (listaProfesores.get(i).getMateriaElegida().equals( materia)){
           verificacionMaterias= false;
            break;
        }
        } if (verificacionMaterias  == true){    
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
         JOptionPane.showMessageDialog(rootPane, "Materia sin profesor", "OJO!", iconoAdvertencia);   
        }if (verificacionMaterias  == false){
        
            
        Datos nuevoItem = new Datos (estudiante, materia);
        listaItems.add(nuevoItem);
       
        for (int j = 0; j < listaItems.size()-1; j++) { 
            if (listaItems.get(j).equals(listaItems.get(listaItems.size()-1))){
                verificacionEstudiante= false;
               listaItems.remove(listaItems.size()-1);
                break;
            }   
        }if (verificacionEstudiante == true){
            tblModelItems.addRow(new String [] {estudiante,materia});
        }else{
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
         JOptionPane.showMessageDialog(rootPane, "Esta materia ya fue registrada", "OJO!", iconoAdvertencia);
        }
        }
    }//GEN-LAST:event_btnMatricularActionPerformed

    private void cmbListaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbListaEstudiantesActionPerformed
       

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnMateria;
    private javax.swing.JButton btnMatricular;
    private javax.swing.JButton btnProfesor;
    private javax.swing.JComboBox<String> cmbListaEstudiantes;
    private javax.swing.JComboBox<String> cmbListaMaterias;
    private javax.swing.JComboBox<String> cmbMateriasElegidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblApellidoProfesor;
    private javax.swing.JLabel lblFacultad;
    private javax.swing.JLabel lblIngresoMaterias;
    private javax.swing.JLabel lblMaterias;
    private javax.swing.JLabel lblNombreProfesor;
    private javax.swing.JTable tblEstudiante;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTabbedPane tblMatricula;
    private javax.swing.JTable tblMatriculas;
    private javax.swing.JTable tblProfesor;
    private javax.swing.JTextField txtApellidoEstudiante;
    private javax.swing.JTextField txtApellidoProfesor;
    private javax.swing.JTextField txtFacultad;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNombreProfesor;
    // End of variables declaration//GEN-END:variables
}
