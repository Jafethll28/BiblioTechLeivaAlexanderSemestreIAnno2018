/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserImterface;

import Students.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author Jafeth Leiva
 */
public class Register2 extends javax.swing.JFrame {

    /**
     * Creates new form Register2
     */
    public Register2() {
        initComponents();
    }

    protected boolean checkID (String iD, String career){
        if(iD.length() >= 5 && iD.charAt(0) == career.charAt(0)){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_register_bookCode = new javax.swing.JTextField();
        txt_register_bookName = new javax.swing.JTextField();
        txt_register_bookEditorial = new javax.swing.JTextField();
        txt_register_bookAutor = new javax.swing.JTextField();
        txt_register_bookType = new javax.swing.JTextField();
        txt_register_bookQuantity = new javax.swing.JTextField();
        btn_register_bookRegister = new javax.swing.JButton();
        btn_register_bookBack = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txt_register_audioCode = new javax.swing.JTextField();
        txt_register_audioName = new javax.swing.JTextField();
        txt_register_audioQuantity = new javax.swing.JTextField();
        txt_register_audioType = new javax.swing.JTextField();
        btn_register_audioRegister = new javax.swing.JButton();
        btn_register_audioBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_register_studenID = new javax.swing.JTextField();
        txt_register_studentName = new javax.swing.JTextField();
        txt_register_carrer = new javax.swing.JTextField();
        btn_register_register = new javax.swing.JButton();
        btn_register_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setName("tab"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Code:");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel6.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel7.setText("Quantity:");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel9.setText("Autor:");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel10.setText("Type:");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel11.setText("Editorial:");

        txt_register_bookCode.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_bookCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_bookCodeActionPerformed(evt);
            }
        });

        txt_register_bookName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_bookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_bookNameActionPerformed(evt);
            }
        });

        txt_register_bookEditorial.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_bookEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_bookEditorialActionPerformed(evt);
            }
        });

        txt_register_bookAutor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_bookAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_bookAutorActionPerformed(evt);
            }
        });

        txt_register_bookType.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_bookType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_bookTypeActionPerformed(evt);
            }
        });

        txt_register_bookQuantity.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_bookQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_bookQuantityActionPerformed(evt);
            }
        });

        btn_register_bookRegister.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btn_register_bookRegister.setText("Register");
        btn_register_bookRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_bookRegisterActionPerformed(evt);
            }
        });

        btn_register_bookBack.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_register_bookBack.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_register_bookCode, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_register_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_register_bookEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_register_bookAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_register_bookType, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(79, 79, 79)
                        .addComponent(btn_register_bookRegister))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_register_bookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_register_bookBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_register_bookCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_register_bookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_register_bookEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register_bookRegister)
                    .addComponent(jLabel9)
                    .addComponent(txt_register_bookAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_register_bookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_register_bookQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_register_bookBack)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Books", jPanel1);

        txt_register_audioCode.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_audioCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_audioCodeActionPerformed(evt);
            }
        });

        txt_register_audioName.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_audioName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_audioNameActionPerformed(evt);
            }
        });

        txt_register_audioQuantity.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_audioQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_audioQuantityActionPerformed(evt);
            }
        });

        txt_register_audioType.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_register_audioType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_register_audioTypeActionPerformed(evt);
            }
        });

        btn_register_audioRegister.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btn_register_audioRegister.setText("Register");

        btn_register_audioBack.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_register_audioBack.setText("Back");

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel8.setText("Code:");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel12.setText("Item Name:");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel13.setText("Type:");

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel14.setText("Quantity:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_register_audioBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btn_register_audioRegister))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_register_audioType, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_register_audioCode, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_register_audioName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_register_audioQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(jLabel14)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_register_audioCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_register_audioName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addComponent(txt_register_audioQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_register_audioType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(29, 29, 29)
                .addComponent(btn_register_audioRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btn_register_audioBack)
                .addContainerGap())
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(jLabel14)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Audovisuals", jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Materials", jPanel5);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Register Student");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("Student ID:");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setText("Carreer:");

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("Student Name:");

        txt_register_studenID.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N

        txt_register_studentName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N

        btn_register_register.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        btn_register_register.setText("Register");
        btn_register_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_register_registerActionPerformed(evt);
            }
        });

        btn_register_back.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btn_register_back.setText("Back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(btn_register_back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_register_carrer, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txt_register_studentName)
                            .addComponent(txt_register_studenID))
                        .addGap(47, 47, 47)
                        .addComponent(btn_register_register)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_register_studenID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_register_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_register_register))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_register_carrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btn_register_back)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Students", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_register_bookCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_bookCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_bookCodeActionPerformed

    private void txt_register_bookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_bookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_bookNameActionPerformed

    private void txt_register_bookEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_bookEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_bookEditorialActionPerformed

    private void txt_register_bookAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_bookAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_bookAutorActionPerformed

    private void txt_register_bookTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_bookTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_bookTypeActionPerformed

    private void txt_register_bookQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_bookQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_bookQuantityActionPerformed

    private void btn_register_bookRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_bookRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_register_bookRegisterActionPerformed

    private void txt_register_audioCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_audioCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_audioCodeActionPerformed

    private void txt_register_audioNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_audioNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_audioNameActionPerformed

    private void txt_register_audioQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_audioQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_audioQuantityActionPerformed

    private void txt_register_audioTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_register_audioTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_register_audioTypeActionPerformed

    private void btn_register_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_register_registerActionPerformed
        // TODO add your handling code here:
        String sID = txt_register_studenID.getText();
        String sName = txt_register_studentName.getText();
        String sCareer = txt_register_carrer.getText();
        if (checkID(sID, sCareer) == true){
            Student student = new Student(sID, sName, sCareer);
            if(student.validateId(sID)==false){
                student.addStudent();
                JOptionPane.showMessageDialog(this, "Esta no mamando");
            }
            else{
                JOptionPane.showMessageDialog(this, "Ya está");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Esta mamando");
        }
    }//GEN-LAST:event_btn_register_registerActionPerformed

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
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register_audioBack;
    private javax.swing.JButton btn_register_audioRegister;
    private javax.swing.JButton btn_register_back;
    private javax.swing.JButton btn_register_bookBack;
    private javax.swing.JButton btn_register_bookRegister;
    private javax.swing.JButton btn_register_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField txt_register_audioCode;
    private javax.swing.JTextField txt_register_audioName;
    private javax.swing.JTextField txt_register_audioQuantity;
    private javax.swing.JTextField txt_register_audioType;
    private javax.swing.JTextField txt_register_bookAutor;
    private javax.swing.JTextField txt_register_bookCode;
    private javax.swing.JTextField txt_register_bookEditorial;
    private javax.swing.JTextField txt_register_bookName;
    private javax.swing.JTextField txt_register_bookQuantity;
    private javax.swing.JTextField txt_register_bookType;
    private javax.swing.JTextField txt_register_carrer;
    private javax.swing.JTextField txt_register_studenID;
    private javax.swing.JTextField txt_register_studentName;
    // End of variables declaration//GEN-END:variables
}