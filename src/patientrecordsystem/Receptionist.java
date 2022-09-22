/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientrecordsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author benja
 */
public class Receptionist extends javax.swing.JFrame {

    Connection connn = null;
    PreparedStatement p = null;
    ResultSet r = null;

    public Receptionist() {
        initComponents();
        showTable1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButtonpUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonpAdd = new javax.swing.JButton();
        jTextFieldpfname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablepatient = new javax.swing.JTable();
        jTextFieldplname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablepatient1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldsearchId = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jComboBoxpgender = new javax.swing.JComboBox<>();
        jTextFieldpsurname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pNew = new javax.swing.JButton();
        jTextFieldpage = new javax.swing.JTextField();
        jTextFieldpid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1logout = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 917, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jButtonpUpdate.setText("Update");
        jButtonpUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient Id:");

        jButtonpAdd.setText("Add");
        jButtonpAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpAddActionPerformed(evt);
            }
        });

        jTextFieldpfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldpfnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldpfnameKeyReleased(evt);
            }
        });

        jLabel8.setText("Search Patient Id:");

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTablepatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablepatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablepatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablepatient);

        jTextFieldplname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldplnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldplnameKeyReleased(evt);
            }
        });

        jLabel2.setText("First Name:");

        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTablepatient1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablepatient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablepatientMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablepatient1);

        jLabel4.setText("Surname:");

        jLabel5.setText("Age:");

        jLabel6.setText("Gender:");

        jTextFieldsearchId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldsearchIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldsearchIdKeyReleased(evt);
            }
        });

        jTextFieldemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldemailKeyReleased(evt);
            }
        });

        jComboBoxpgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Inter-Sex" }));
        jComboBoxpgender.setSelectedIndex(-1);

        jTextFieldpsurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldpsurnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldpsurnameKeyReleased(evt);
            }
        });

        jLabel7.setText("Email Address:");

        pNew.setText("Reset");
        pNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNewActionPerformed(evt);
            }
        });

        jTextFieldpage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldpageKeyPressed(evt);
            }
        });

        jTextFieldpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldpidActionPerformed(evt);
            }
        });
        jTextFieldpid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldpidKeyPressed(evt);
            }
        });

        jLabel3.setText("Last Name:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("                     RECEPTIONIST DASHBOARD");

        jButton1logout.setText("Log out");
        jButton1logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1logoutActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "inpatient", "outpatient" }));
        jComboBox1.setSelectedIndex(-1);

        jLabel10.setText("Category");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonpAdd)
                                .addGap(43, 43, 43)
                                .addComponent(jButtonpUpdate)
                                .addGap(48, 48, 48)
                                .addComponent(pNew)
                                .addGap(33, 33, 33)
                                .addComponent(jButton1logout))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(406, 406, 406)
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37)
                                .addComponent(jTextFieldsearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldpage, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldpfname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(jTextFieldplname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldpsurname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldpid)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxpgender, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldsearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldpfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldplname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldpsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxpgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonpAdd)
                    .addComponent(jButtonpUpdate)
                    .addComponent(pNew)
                    .addComponent(jButton1logout))
                .addGap(25, 25, 25))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonpAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpAddActionPerformed
        // TODO add your handling code here:

        if (jTextFieldpid.getText().isEmpty() || jTextFieldpfname.getText().isEmpty() || jTextFieldplname.getText().isEmpty() || jTextFieldpsurname.getText().isEmpty() || jTextFieldpage.getText().isEmpty() || jTextFieldemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Patient Id, Firstname,lastname , surname,age or email address fields cannot be empty!!");
       } else if (jComboBoxpgender.getSelectedItem() == null) {
             JOptionPane.showMessageDialog(null, "You must choose a gender!!");

        } else if (jTextFieldpfname.getText().length() > 20
                || jTextFieldplname.getText().length() > 20 || jTextFieldpsurname.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "All name fields should not exceed 20 characters!!");

        } else if (jTextFieldpid.getText().length() > 5) {
            JOptionPane.showMessageDialog(null, "Patient id should not exceed 5 digits!!");
            
         } else if (jComboBox1.getSelectedItem() == null) {
             JOptionPane.showMessageDialog(null, "You must choose a category!!");

        } else if (jTextFieldpage.getText().length() > 3) {
            JOptionPane.showMessageDialog(null, "Patient age should not exceed 3 digits!!");

        } else {
            try {
                String sql1 = "INSERT INTO patientdetails(patientId, patientFirstName, patientLastName, patientSurname, patientAge, patientGender, patientEmail,patientCategory) VALUES (?,?,?,?,?,?,?,?)";
                connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prs", "root", "");
                p = connn.prepareStatement(sql1);
                p.setString(1, jTextFieldpid.getText());
                p.setString(2, jTextFieldpfname.getText());
                p.setString(3, jTextFieldplname.getText());
                p.setString(4, jTextFieldpsurname.getText());
                p.setString(5, jTextFieldpage.getText());
                p.setString(6, String.valueOf(jComboBoxpgender.getSelectedItem()));
                p.setString(7, jTextFieldemail.getText());
                p.setString(8, String.valueOf(jComboBox1.getSelectedItem()));
                p.executeUpdate();
                JOptionPane.showMessageDialog(null, "Patient added successfully!");

            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }

            showTable1();
    }//GEN-LAST:event_jButtonpAddActionPerformed

    private void jButtonpUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpUpdateActionPerformed
         if (jTextFieldpid.getText().isEmpty() || jTextFieldpfname.getText().isEmpty() || jTextFieldplname.getText().isEmpty() || jTextFieldpsurname.getText().isEmpty() || jTextFieldpage.getText().isEmpty() || jTextFieldemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Patient Id, Firstname,lastname , surname,age or email address fields cannot be empty!!");
        } else if (jComboBoxpgender.getSelectedItem() == null) {
             JOptionPane.showMessageDialog(null, "You must choose a gender!!");
             
        } else if (jComboBox1.getSelectedItem() == null) {
             JOptionPane.showMessageDialog(null, "You must choose a category!!");

             
        } else if (jTextFieldpfname.getText().length() > 20
                || jTextFieldplname.getText().length() > 20 || jTextFieldpsurname.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "All name fields should not exceed 20 characters!!");

        } else if (jTextFieldpid.getText().length() > 5) {
            JOptionPane.showMessageDialog(null, "Patient id should not exceed 5 digits!!");

        } else if (jTextFieldpage.getText().length() > 3) {
            JOptionPane.showMessageDialog(null, "Patient age should not exceed 3 digits!!");

        } else {
        try {
            String sql1 = "UPDATE patientdetails SET patientFirstName=?,patientLastName=?,patientSurname=?,patientAge=?,patientGender=?,patientEmail=?,patientCategory=? WHERE patientId=?";
            connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prs", "root", "");
            p = connn.prepareStatement(sql1);
            p.setString(8, jTextFieldpid.getText());
            p.setString(1, jTextFieldpfname.getText());
            p.setString(2, jTextFieldplname.getText());
            p.setString(3, jTextFieldpsurname.getText());
            p.setString(4, jTextFieldpage.getText());
            p.setString(5, String.valueOf(jComboBoxpgender.getSelectedItem()));
            p.setString(6, jTextFieldemail.getText());
            p.setString(7, String.valueOf(jComboBox1.getSelectedItem()));
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient updated successfully!");

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        showTable1();


    }//GEN-LAST:event_jButtonpUpdateActionPerformed

    private void pNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNewActionPerformed

        jTextFieldpid.setText("");
        jTextFieldpfname.setText("");
        jTextFieldplname.setText("");
        jTextFieldpsurname.setText("");
        jTextFieldpage.setText("");
        jComboBoxpgender.setSelectedIndex(-1);
         jComboBox1.setSelectedIndex(-1);
        jTextFieldemail.setText("");


    }//GEN-LAST:event_pNewActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTablepatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablepatientMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTablepatient.getModel();
        int selectedRowIndex = jTablepatient.getSelectedRow();
        jTextFieldpid.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextFieldpfname.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextFieldplname.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jTextFieldpsurname.setText(model.getValueAt(selectedRowIndex, 3).toString());
        jTextFieldpage.setText(model.getValueAt(selectedRowIndex, 4).toString());

        jTextFieldemail.setText(model.getValueAt(selectedRowIndex, 6).toString());

        String combo = model.getValueAt(selectedRowIndex, 5).toString();
        for (int i = 0; i < jComboBoxpgender.getItemCount(); i++) {
            if (jComboBoxpgender.getItemAt(i).equalsIgnoreCase(combo)) {
                jComboBoxpgender.setSelectedIndex(i);
            }
        }
        
        String combo1 = model.getValueAt(selectedRowIndex, 7).toString();
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if (jComboBox1.getItemAt(i).equalsIgnoreCase(combo1)) {
                jComboBox1.setSelectedIndex(i);
            }
        }


    }//GEN-LAST:event_jTablepatientMouseClicked

    private void jTextFieldpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldpidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldpidActionPerformed

    private void jTextFieldsearchIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldsearchIdKeyReleased

        try {
            String sql1 = "SELECT * FROM patientdetails WHERE patientId=?";
            connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prs", "root", "");
            p = connn.prepareStatement(sql1);
            p.setString(1, String.valueOf(jTextFieldsearchId.getText()));
            r = p.executeQuery();
            jTablepatient.setModel(DbUtils.resultSetToTableModel(r));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_jTextFieldsearchIdKeyReleased

    private void jTextFieldpidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpidKeyPressed
        // TODO add your handling code here:
         char m3 = evt.getKeyChar();
               if (Character.isLetter(m3)) {
            //can't enter a textfield if entered character is not a number
           jTextFieldpid.setEditable(false);
             //error message
            JOptionPane.showMessageDialog(null, "Please enter digits only!!");
              } else {
            jTextFieldpid.setEditable(true);

               }
    }//GEN-LAST:event_jTextFieldpidKeyPressed

    private void jTextFieldpfnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpfnameKeyPressed
        // TODO add your handling code here:
         char d1 = evt.getKeyChar();
       if (Character.isLetter(d1) || Character.isISOControl(d1)) {
            //accept only letter
           jTextFieldpfname.setEditable(true);

        } else {
            // deny character
           jTextFieldpfname.setEditable(false);
            //error message
            JOptionPane.showMessageDialog(null, "Please enter letters only!!");
        }
    }//GEN-LAST:event_jTextFieldpfnameKeyPressed

    private void jTextFieldplnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldplnameKeyPressed
        // TODO add your handling code here:
         char d2 = evt.getKeyChar();
       if (Character.isLetter(d2) || Character.isISOControl(d2)) {
            //accept only letter
           jTextFieldplname.setEditable(true);

        } else {
            // deny character
           jTextFieldplname.setEditable(false);
            //error message
            JOptionPane.showMessageDialog(null, "Please enter letters only!!");
        }
        
        
    }//GEN-LAST:event_jTextFieldplnameKeyPressed

    private void jTextFieldpsurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpsurnameKeyPressed
        // TODO add your handling code here:
         char d3 = evt.getKeyChar();
       if (Character.isLetter(d3) || Character.isISOControl(d3)) {
            //accept only letter
          jTextFieldpsurname.setEditable(true);

        } else {
            // deny character
           jTextFieldpsurname.setEditable(false);
            //error message
            JOptionPane.showMessageDialog(null, "Please enter letters only!!");
        }
        
        
    }//GEN-LAST:event_jTextFieldpsurnameKeyPressed

    private void jTextFieldpageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpageKeyPressed
        // TODO add your handling code here:
         char m4 = evt.getKeyChar();
               if (Character.isLetter(m4)) {
            //can't enter a textfield if entered character is not a number
          jTextFieldpage.setEditable(false);
             //error message
            JOptionPane.showMessageDialog(null, "Please enter digits only!!");
              } else {
           jTextFieldpage.setEditable(true);

               }
        
    }//GEN-LAST:event_jTextFieldpageKeyPressed

    private void jTextFieldpfnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpfnameKeyReleased
        // TODO add your handling code here:
         int position10 = jTextFieldpfname.getCaretPosition();
        jTextFieldpfname.setText(jTextFieldpfname.getText().toUpperCase());
        jTextFieldpfname.setCaretPosition(position10);
    }//GEN-LAST:event_jTextFieldpfnameKeyReleased

    private void jTextFieldplnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldplnameKeyReleased
        // TODO add your handling code here:
        int position11 = jTextFieldplname.getCaretPosition();
        jTextFieldplname.setText(jTextFieldplname.getText().toUpperCase());
        jTextFieldplname.setCaretPosition(position11);
    }//GEN-LAST:event_jTextFieldplnameKeyReleased

    private void jTextFieldpsurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldpsurnameKeyReleased
        // TODO add your handling code here:
        int position12 = jTextFieldpsurname.getCaretPosition();
        jTextFieldpsurname.setText(jTextFieldpsurname.getText().toUpperCase());
        jTextFieldpsurname.setCaretPosition(position12);
    }//GEN-LAST:event_jTextFieldpsurnameKeyReleased

    private void jTextFieldemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldemailKeyReleased
        // TODO add your handling code here:
           int position13 = jTextFieldemail.getCaretPosition();
        jTextFieldemail.setText(jTextFieldemail.getText().toLowerCase() );
        jTextFieldemail.setCaretPosition(position13);
    }//GEN-LAST:event_jTextFieldemailKeyReleased

    private void jTextFieldsearchIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldsearchIdKeyPressed
        // TODO add your handling code here:
         char m13 = evt.getKeyChar();
               if (Character.isLetter(m13)) {
            //can't enter a textfield if entered character is not a number
           jTextFieldsearchId.setEditable(false);
             //error message
            JOptionPane.showMessageDialog(null, "Please enter digits only!!");
              } else {
            jTextFieldsearchId.setEditable(true);

               }
    }//GEN-LAST:event_jTextFieldsearchIdKeyPressed

    private void jButton1logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1logoutActionPerformed
        // TODO add your handling code here:
         int p6 = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?","Log out",JOptionPane.YES_NO_OPTION);
        if(p6 == 0){
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
        }
    }//GEN-LAST:event_jButton1logoutActionPerformed

    public void showTable1() {
        try {
            connn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prs", "root", "");
            String sql1 = "SELECT patientId, patientFirstName, patientLastName, patientSurname, patientAge, patientGender, patientEmail,patientCategory FROM patientdetails ";
            p = connn.prepareStatement(sql1);
            r = p.executeQuery();
            jTablepatient.setModel(DbUtils.resultSetToTableModel(r));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    /**
     * @param args the command line arguments
     */
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

        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1logout;
    private javax.swing.JButton jButtonpAdd;
    private javax.swing.JButton jButtonpUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxpgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablepatient;
    private javax.swing.JTable jTablepatient1;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldpage;
    private javax.swing.JTextField jTextFieldpfname;
    private javax.swing.JTextField jTextFieldpid;
    private javax.swing.JTextField jTextFieldplname;
    private javax.swing.JTextField jTextFieldpsurname;
    private javax.swing.JTextField jTextFieldsearchId;
    private javax.swing.JButton pNew;
    // End of variables declaration//GEN-END:variables
}