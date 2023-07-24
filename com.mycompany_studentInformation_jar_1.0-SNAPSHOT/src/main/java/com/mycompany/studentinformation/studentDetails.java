
package com.mycompany.studentinformation;

import java.sql.*;
import java.util.*;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class studentDetails extends javax.swing.JFrame {

    
    public studentDetails() {
        initComponents();
        showTable1();
    }
    public void showTable1()
    {
         try 
        {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");  
  
            //step2 create  the connection object  
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
           Statement st1=con.createStatement();
           ResultSet rs1=st1.executeQuery("select * from student000");
           while(rs1.next())
           {
            //new
              
            String na=rs1.getString("Name");
            int pr=rs1.getInt("PRN");
            String gr=rs1.getString("Grade");
            String fi=rs1.getString("Field");
            
            
            Object[] obj1={na,pr,gr,fi};
            DefaultTableModel model= (DefaultTableModel) jTable3.getModel();
            model.addRow(obj1);
           }

        }
              
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void cleartableDetails()
    {
        DefaultTableModel md= (DefaultTableModel) jTable3.getModel();
        md.setRowCount(0);
    }
    
    public void cleardata()
    {
        Name.setText(" ");
        PRN.setText(" ");
        Grade.setSelectedIndex(0);
        Field.setSelectedIndex(0);
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        PRN = new javax.swing.JTextField();
        Grade = new javax.swing.JComboBox<>();
        Field = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 120));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 120, 120));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Management System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 450, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 120));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student_Name : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student_PRN :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student_Grade :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 200, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Engineering_field : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 200, 30));

        Name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 250, 30));

        PRN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRNActionPerformed(evt);
            }
        });
        jPanel1.add(PRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 250, 30));

        Grade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F" }));
        jPanel1.add(Grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 250, 30));

        Field.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IT", "ENTC", "CIVIL", "CHEM", "MECH" }));
        jPanel1.add(Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 250, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 110, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 110, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("REMOVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 120, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "PRN", "Grade", "Field"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 550, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        setSize(new java.awt.Dimension(740, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void PRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PRNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String n, g, f;
        int p;
        n=Name.getText();
        p=Integer.parseInt(PRN.getText());
        g=Grade.getSelectedItem().toString();
        f=Field.getSelectedItem().toString();
      
        
       try 
        {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");  
  
             //step2 create  the connection object  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
            String qu1="insert into student000(Name,PRN,Grade,Field) values(?,?,?,?)";
            PreparedStatement pstmt1=con.prepareStatement(qu1); 
            pstmt1.setString(1,n);
            pstmt1.setInt(2,p);
            pstmt1.setString(3,g); 
            pstmt1.setString(4,f);
           
            pstmt1.executeUpdate();
            JOptionPane.showMessageDialog(null,"data successfully added");
            cleartableDetails();
            showTable1();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    
    
               // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {                                     
       //important
        int rowNo=jTable3.getSelectedRow();
        TableModel model=jTable3.getModel();
        Name.setText(model.getValueAt(rowNo,0).toString());
        PRN.setText(model.getValueAt(rowNo,1).toString());
        Grade.setSelectedItem(model.getValueAt(rowNo,2).toString());
        Field.setSelectedItem(model.getValueAt(rowNo,3).toString());
       
    } 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String n1, g1, f1;
        int p1;
        n1=Name.getText();
        p1=Integer.parseInt(PRN.getText());
        g1=Grade.getSelectedItem().toString();
        f1=Field.getSelectedItem().toString();
      
        
         try 
        {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");  
  
            //step2 create  the connection object  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
            String qu2="update student000 set Name=?,Grade=?,Field=? where PRN=?";
            PreparedStatement pstmt2=con.prepareStatement(qu2);  
  
            pstmt2.setString(1,n1);
            pstmt2.setInt(2,p1);
            pstmt2.setString(3,g1); 
            pstmt2.setString(4,f1);
            int rowCount= pstmt2.executeUpdate();
            if(rowCount>0)
            {
                JOptionPane.showMessageDialog(null,"data successfully updated");
                cleartableDetails();
                showTable1();
            }
            else{
                      JOptionPane.showMessageDialog(null,"data not updated");
                }
  
        } 
        catch(Exception k)
        {
            JOptionPane.showMessageDialog(null,k);
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int ID;
        ID=Integer.parseInt(PRN.getText());    
         try 
        {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");  
  
            //step2 create  the connection object  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");  
            String qu="delete from student000 where PRN=?";
            PreparedStatement pstmt=con.prepareStatement(qu);  

            pstmt.setInt(1,ID);
            int rowCount= pstmt.executeUpdate();
            if(rowCount>0)
            {
                JOptionPane.showMessageDialog(null,"data successfully deleted");
                cleartableDetails();
                showTable1();
            }
            else{
                  JOptionPane.showMessageDialog(null,"data not deleted");
                }
  
        }
        catch(Exception k)
        {
            JOptionPane.showMessageDialog(null,k);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cleardata();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Field;
    private javax.swing.JComboBox<String> Grade;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField PRN;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

}
