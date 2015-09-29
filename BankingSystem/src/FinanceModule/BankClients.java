/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinanceModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Kimaiga
 */
public class BankClients extends javax.swing.JFrame {
    // database variables declaration
        Connection conn= null;
        
        String url = "jdbc:mysql://localhost/"; //database URL
        String dbName = "banking_system"; //database system
        String driver ="com.mysql.jdbc.Driver"; //driver specified
        String userName = "root"; //DB username
        String password = ""; //password
        Statement st;
        ResultSet rs;

    /**
     * Creates new form BankClients
     */
    public BankClients() {
         super("BankClients");
        try {          
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            } catch (Exception x) 
        {
            
        }
        initComponents();
        setLocationRelativeTo(null);
        

this.setResizable(false); //disable resizing of the window
               
    //launch a connection to our database    
         try{
	       Class.forName(driver);

             conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url+dbName,userName,password);

              st = (com.mysql.jdbc.Statement) conn.createStatement();
	      }
	            catch(Exception exp)
                    {
	      JOptionPane.showMessageDialog(null, "Cannot connect to the database,check network settings.","ERROR",JOptionPane.ERROR_MESSAGE);
	            }
        LoadAccount();//This function will populate our combo box
        updateJTable(); //This fucntion will populate our JTable
    }
    
    //Code that updates our JTable
 private void updateJTable(){
             try{
             String sql ="Select `id_no`,`surname`,`middle_name`, `first_name`, `account_type` FROM `clients` ";
           st=conn.prepareStatement(sql);
           rs=st.executeQuery(sql);
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
             
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtsurname = new javax.swing.JTextField();
        txtmiddlename = new javax.swing.JTextField();
        txtfirst = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtsearch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        cbotype = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        back = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER A NEW CLIENT");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("REGISTER A NEW CLIENT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ID Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Surname");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Middle Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Account Type");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("search");

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cbotype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-SELECT AN ACCOUNT TYPE-" }));

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Acc Balance");

        jTextField1.setText("jTextField1");

        back.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        back.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Accounts");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        back.add(jMenuItem2);

        jMenuBar1.add(back);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(txtsurname)
                            .addComponent(txtmiddlename)
                            .addComponent(txtfirst)
                            .addComponent(cbotype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtsurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtmiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbotype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(update)
                    .addComponent(jButton4))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//declaration of variables
        String userInput=txtid.getText();
        String userInput2=txtsurname.getText();
        String userInput3=txtmiddlename.getText();
        String userInput4=txtfirst.getText();
        String userInput5=cbotype.getSelectedItem().toString();
        
        if (userInput.length() >0 ) {
  try {
            String sql="INSERT INTO clients VALUES('"+txtid.getText()+"',"+"'"+txtsurname.getText()+"',"+"'"+txtmiddlename.getText()+"','"+txtfirst.getText()+"','"+cbotype.getSelectedItem().toString()+"',0)";
//executing our SQL QUERY
	              st.execute(sql);
	                JOptionPane.showMessageDialog(null,"Details successfully saved.","Information",JOptionPane.INFORMATION_MESSAGE );

                       
//catch any errors may occur
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
         
//more condition checking and error handling fucntions
        } else if(txtid.equals("")|| txtsurname.equals("")||txtmiddlename.equals("")||txtfirst.equals("")||cbotype.equals(0)){
            JOptionPane.showMessageDialog(null, "Fields empty. Enter your details ","Error",JOptionPane.ERROR_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "EMPTY INPUT FIELDS","Error",JOptionPane.ERROR_MESSAGE);
        }
    } 
 //Here I will call a method that loads items from the database to the combo box and populates it
private void LoadAccount(){

        try {
            
            System.out.println("Loading saved account names");
            String sql1;
            sql1 = "SELECT account_name FROM accounts WHERE isDeleted = 0 Order by account_name";
            rs = st.executeQuery(sql1);

            cbotype.removeAllItems();	
            cbotype.addItem("");
            //Empties the combobox
            while (rs.next()) {													//Loops through each resultset until no other record is found.
                cbotype.addItem(rs.getString("account_name"));	
               // System.out.println(sql1);//addItem() adds an item to the combobox. rs.getString('field') gets the value of the record from the given field
            }
        } catch (SQLException x) {
            //Catch any problem that you may get with your SQL statement
            System.out.println("SQL Error while loading account_name: " + x.getMessage());
        }
   
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
new ModuleDashboard().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
new Accounts().setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        
                        //code that resets input fields
                        txtid.setText("");
                       txtsurname.setText("");
                       txtmiddlename.setText("");
                       txtfirst.setText("");
                       cbotype.setSelectedIndex(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String sql = "Select `id_no`,`surname`,`middle_name`, `first_name`, `account_type` FROM `clients` ";
        try{
            
            rs = (ResultSet) st.executeQuery(sql);
            st = (com.mysql.jdbc.Statement) conn.prepareStatement(sql);                            //Refreshes our JTable
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));                                
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);           

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String del_id=txtid.getText();

        if (!txtid.getText().equals("")) {
            int a=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to update? "+del_id, "UPDATE", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.OK_OPTION) {
                String sql = "Update clients set surname ='"+txtsurname.getText()+"', middle_name ='"+txtmiddlename.getText()+"' , first_name ='"+txtfirst.getText()+"', account_type ='"+cbotype.getSelectedItem().toString()+"' where id_no='"+txtid.getText()+"'";


        try{
            
           st =     (com.mysql.jdbc.Statement) conn.prepareStatement(sql);
            st.executeUpdate(sql);
            
                                            
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, exp,"Error",JOptionPane.ERROR_MESSAGE);           

        }
                
            } else {
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select item(s) to update? ","Error",JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String del_id=txtid.getText();
        if (!txtid.getText().equals("")) {
            int a=JOptionPane.showConfirmDialog(rootPane, "Delete ID Number "+del_id, "DELETE", JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.OK_OPTION) {
                String sql = "delete  from clients where account_type = '"+del_id+"'";
        try{
            
             st = (com.mysql.jdbc.Statement) conn.prepareStatement(sql);
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deletion successful.");
                                            
        } catch(Exception exp){
            JOptionPane.showMessageDialog(null, "Items selected are not deleted,try again! ","Error",JOptionPane.ERROR_MESSAGE);           

        }
                
            } else {
            }
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Select item(s) to delete");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            //Changed look and feel to import from the default to the UI Manager import
                      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

                    } catch (Exception e) {
                      System.err.println("Look and feel not set.");
                    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankClients().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu back;
    private javax.swing.JComboBox cbotype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtfirst;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmiddlename;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsurname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
