/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Amjad
 */
public class RF3 extends javax.swing.JFrame {
public String s11;
    public String s22;
   public String s33;
   public String s44;
   public String s55;
   public String s66;
    public String s77;
   public String s88;
   public String s99;
   public String s1010;
   public String s1111;
    /**
     * Creates new form RF3
     */
    public RF3() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
    
    public RF3(String s11,String s22,String s33,String s44,String s55,String s66,String s77,String s88,String s99,String s1010,String s1111){
      initComponents();
       this.setLocationRelativeTo(null);
        this.s11=s11;
         this.s22=s22;
         this.s33=s33;
         this.s44=s44;
         this.s55=s55;
         
          this.s66=s66;
         this.s77=s77;
         this.s88=s88;
         this.s99=s99;
         this.s1010=s1010;
         this.s1111=s1111; 
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 248, 251));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel1.setText("Registration Form");

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Fill the registration Form to continue");

        jLabel2.setBackground(new java.awt.Color(236, 248, 251));
        jLabel2.setText("Blood Type ");

        jLabel4.setBackground(new java.awt.Color(236, 248, 251));
        jLabel4.setText("Have you ever donated blood ?");

        jLabel7.setBackground(new java.awt.Color(236, 248, 251));
        jLabel7.setText("when was the last time ?");

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amjad\\OneDrive\\Documents\\data base proj file\\photo\\bb5.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amjad\\OneDrive\\Documents\\data base proj file\\photo\\he.gif")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amjad\\OneDrive\\Documents\\data base proj file\\photo\\linestip3.gif")); // NOI18N

        jComboBox2.setBackground(new java.awt.Color(236, 248, 251));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jRadioButton3.setBackground(new java.awt.Color(236, 248, 251));
        jRadioButton3.setText("YES");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(236, 248, 251));
        jRadioButton4.setText("NO");

        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amjad\\OneDrive\\Documents\\data base proj file\\photo\\POINT RED LINE.png")); // NOI18N

        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Amjad\\OneDrive\\Documents\\data base proj file\\photo\\POINT RED LINE.png")); // NOI18N

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(85, 85, 85)
                        .addComponent(jRadioButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ps="" ;
        
        if (jRadioButton3.isSelected()){
            ps="T";
        }
        else if (jRadioButton4.isSelected()){
        ps="F";
        }
       
        
        try{
    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());//
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456");//this.jDateChooser1.getDate()
        conn.setAutoCommit(false);
        Statement st=conn.createStatement();
      //    String s2="insert into person(ssn,Fname,Lname,sex,phonenumber,Birthday,address) values('"+this.jTextField8.getText()+"','"+this.jTextField2.getText()+"','"+this.jTextField1.getText()+"','"+ps+"','"+this.jTextField5.getText()+"','"+this.jDateChooser1.getDate()+"','"+this.jTextField6.getText()+"','"+this.jComboBox1.getSelectedItem().toString()+"')";

       // String s="insert into donor (ssn,donorid,email,passwordd,blood_type,jobb,social_status,IS_FRESH_DONOR) values('"+this.jTextField8.getText()+"','"+"20"+"','"+this.jTextField3.getText()+"','"+this.jPasswordField1.getText()+"','"+this.jComboBox2.getSelectedItem().toString()+"','"+this.jTextField7.getText()+"','"+this.jComboBox3.getSelectedItem().toString()+"','"+this.jComboBox1.getSelectedItem().toString()+"')";
       // String s="insert into Employee values('"+SSN+"','"+FirstName+"','"+LastName+"','"+Gmail+"','"+selectgender+"','"+selectjop+"','"+selecttime+"','"+address+"','"+Phone+"','"+BD+"','"+Password+"','"+salary+"','"+randomNumber+"')";
     // '"+       +"'
         String s2="insert into person(ssn,Fname,Lname,sex,address,phonenumber,Birthday) values('"+s11+"','"+s22+"','"+s33+"','"+s66+"','"+s99+"','"+s77+"','"+"07-mar-02"+"')";
         String s="insert into donor(ssn,donorid,email,passwordd,blood_type,jobb,is_fresh_donor,last_data_donation,social_status) values('"+s11+"','"+"31"+"','"+s44+"','"+s55+"','"+this.jComboBox2.getSelectedItem().toString()+"','"+s1010+"','"+ps+"','"+"07-mar-02"+"','"+s1111+"')";

       // String s="insert into donor  values('"+this.jTextField8.getText()+"','"+20+"','"+this.jTextField3.getText()+"','"+this.jPasswordField1.getText()+"','"+this.jComboBox2.getSelectedItem().toString()+"','"+this.jTextField7.getText()+"','"+this.jComboBox3.getSelectedItem().toString()+"','"+this.jComboBox1.getSelectedItem().toString()+"')";

     st.executeUpdate(s2);
     st.executeUpdate(s);
        conn.commit();
        conn.close();
       // JOptionPane.showMessageDialog(null, "  Employee Add  ");
        JOptionPane.showMessageDialog(null,"done");
      this.s11="";
       this.s22="";
        this.s33="";
         this.s44="";
          this.s55="";
           this.s66="";
            this.s77="";
             this.s88="";
              this.s99="";
               this.s1010="";
                this.s1111="";
      
        
     
       
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
        }
        
     
        
        
        
        
         try{
    
             DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());//
             Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456");
        conn.setAutoCommit(false);
             Statement st=conn.createStatement();
         // String s2="insert into person(ssn,Fname,Lname,sex,phonenumber,Birthday,address) values('"+this.jTextField8.getText()+"','"+this.jTextField2.getText()+"','"+this.jTextField1.getText()+"','"+ps+"','"+this.jTextField5.getText()+"','"+this.jDateChooser1.getDate()+"','"+this.jTextField6.getText()+"','"+this.jComboBox1.getSelectedItem().toString()+"')";

     //  String s="insert into donor (ssn ,donorid,email,passwordd,blood_type,jobb,social_status,IS_FRESH_DONOR) values('"+this.jTextField8.getText()+"','"+20+"','"+this.jTextField3.getText()+"','"+this.jPasswordField1.getText()+"','"+this.jComboBox2.getSelectedItem().toString()+"','"+this.jTextField7.getText()+"','"+this.jComboBox3.getSelectedItem().toString()+"','"+this.jComboBox1.getSelectedItem().toString()+"')";

        // String s="insert into Employee values('"+SSN+"','"+FirstName+"','"+LastName+"','"+Gmail+"','"+selectgender+"','"+selectjop+"','"+selecttime+"','"+address+"','"+Phone+"','"+BD+"','"+Password+"','"+salary+"','"+randomNumber+"')";
     // '"+       +"'
        // String s2="insert into person(ssn,Fname,Lname,sex,phonenumber,Birthday,address) values('"+this.jTextField8.getText()+"','"+this.jTextField2.getText()+"','"+this.jTextField1.getText()+"','"+ps+"','"+this.jTextField5.getText()+"','"+this.jDateChooser1.getDate()+"','"+this.jTextField6.getText()+"','"+this.jComboBox1.getSelectedItem().toString()+"')";

    // st.executeUpdate(s2);
    //  st.executeUpdate(s);
        conn.commit();
        conn.close();
        //JOptionPane.showMessageDialog(null, "  Employee Add  ");
     
       
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       RF2 n=new RF2();
        n.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RF3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RF3().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}