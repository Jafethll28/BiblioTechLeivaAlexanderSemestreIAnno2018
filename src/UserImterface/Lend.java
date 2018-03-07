/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserImterface;

import Materials.AudioVisual;
import Materials.Book;
import Materials.Materials2;
import Students.Student;
import java.awt.Component;
import java.awt.PopupMenu;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Monserrath
 */
public class Lend extends javax.swing.JFrame {

    /**
     * Creates new form Lend
     */
    public Lend() {
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

        javax.swing.ButtonGroup btnRgroup_lend_choosing = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentCode = new javax.swing.JTextField();
        pnl_lend_choosing = new javax.swing.JPanel();
        radio_btn_lend_audioVisuales = new javax.swing.JRadioButton();
        radio_btn_lend_books = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btn_lend_lend = new javax.swing.JButton();
        btn_lend_return = new javax.swing.JButton();
        nameOfLoan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Student ID:");

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel2.setText("Lend an Item");

        studentCode.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N

        pnl_lend_choosing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRgroup_lend_choosing.add(radio_btn_lend_audioVisuales);
        radio_btn_lend_audioVisuales.setText("Audio Visual");
        radio_btn_lend_audioVisuales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_btn_lend_audioVisualesActionPerformed(evt);
            }
        });

        btnRgroup_lend_choosing.add(radio_btn_lend_books);
        radio_btn_lend_books.setText("Books");

        javax.swing.GroupLayout pnl_lend_choosingLayout = new javax.swing.GroupLayout(pnl_lend_choosing);
        pnl_lend_choosing.setLayout(pnl_lend_choosingLayout);
        pnl_lend_choosingLayout.setHorizontalGroup(
            pnl_lend_choosingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_lend_choosingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio_btn_lend_audioVisuales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(radio_btn_lend_books)
                .addGap(25, 25, 25))
        );
        pnl_lend_choosingLayout.setVerticalGroup(
            pnl_lend_choosingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_lend_choosingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_lend_choosingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_btn_lend_audioVisuales)
                    .addComponent(radio_btn_lend_books))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Search:");

        btn_lend_lend.setText("Lend");
        btn_lend_lend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lend_lendActionPerformed(evt);
            }
        });

        btn_lend_return.setText("Return");
        btn_lend_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lend_returnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_lend_choosing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_lend_lend, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(64, 64, 64)
                                .addComponent(nameOfLoan))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_lend_return)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnl_lend_choosing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameOfLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btn_lend_lend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btn_lend_return)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_btn_lend_audioVisualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_btn_lend_audioVisualesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_btn_lend_audioVisualesActionPerformed

    private void btn_lend_lendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lend_lendActionPerformed
        // TODO add your handling code here:
        String code = studentCode.getText();
        String name = nameOfLoan.getText();
        Student student = new Student("","","");
        Materials2 audioVisual = new Materials2("","",0,"");
        if(student.validateId(code)==false){
            JOptionPane.showMessageDialog(this, "The Student ID is wrong");
        }
        else{
            if(radio_btn_lend_audioVisuales.isEnabled()){
               if(audioVisual.validateName(name)==true){
                   audioVisual.subtractQuantity(name);
                   audioVisual.addMaterialsOnLoan(code, name);
               }
               else{
                   JOptionPane.showMessageDialog(this, "The material name is wrong");
               }
            }
            else if(radio_btn_lend_books.isEnabled()){
                if(audioVisual.validateName(name)==true){
                   audioVisual.subtractQuantity(name);
                   audioVisual.addMaterialsOnLoan(code, name);
                }
                else{
                    JOptionPane.showMessageDialog(this, "The material name is wrong");
               }
            }
        }
    }//GEN-LAST:event_btn_lend_lendActionPerformed

    private void btn_lend_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lend_returnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_lend_returnActionPerformed

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
            java.util.logging.Logger.getLogger(Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lend_lend;
    private javax.swing.JButton btn_lend_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameOfLoan;
    private javax.swing.JPanel pnl_lend_choosing;
    private javax.swing.JRadioButton radio_btn_lend_audioVisuales;
    private javax.swing.JRadioButton radio_btn_lend_books;
    private javax.swing.JTextField studentCode;
    // End of variables declaration//GEN-END:variables
}
