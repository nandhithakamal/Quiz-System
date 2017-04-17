/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.system.views;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import quiz.system.util.DBConnection;
import quiz.system.views.OpenPage;

/**
 *
 * @author Nandhu
 */
public class CreatorFrame extends javax.swing.JFrame {

    /**
     * Creates new form CreatorFrame
     */
    
    String newQuiz, username; 
    Connection conn;
    int stat, status;
    public CreatorFrame() {
        initComponents();
    }
    
    public void setUser(String user) {
    
        username = user;
        System.out.println("I am " + username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quizzesTArea = new javax.swing.JTextArea();
        createQuizButton = new javax.swing.JButton();
        quizNameTBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fetchButton = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Your quizzes");

        quizzesTArea.setEditable(false);
        quizzesTArea.setBackground(new java.awt.Color(240, 240, 240));
        quizzesTArea.setColumns(20);
        quizzesTArea.setRows(5);
        jScrollPane1.setViewportView(quizzesTArea);

        createQuizButton.setText("Create New Quiz");
        createQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createQuizButtonActionPerformed(evt);
            }
        });

        quizNameTBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizNameTBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("New Quiz Name: ");

        fetchButton.setText("Fetch my Quizzes");
        fetchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fetchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(createQuizButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quizNameTBox))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(fetchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(quizNameTBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createQuizButton)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quizNameTBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizNameTBoxActionPerformed
        // TODO add your handling code here:
       // quizNameTBox.setText("Hello!, " + username);
        /*try{
            conn  = DBConnection.getInstance().connectUsers();
            Statement st = conn.createStatement();
            String query = "select * from " + user + "_admin";
            ResultSet rs = st.executeQuery(query);
            String result = "Hole in the Wall";
            System.out.print("I am trying...");
            while(rs.next()){
                String test = rs.getString("testname");
                result = result.concat(test + "\n");
                System.out.println("I can't figure it out...");
                
            }
            System.out.println(result);
            
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(CreatorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_quizNameTBoxActionPerformed

    private void createQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createQuizButtonActionPerformed
        // TODO add your handling code here:
       newQuiz = quizNameTBox.getText();
       try{
            conn = DBConnection.getInstance().connectUsers();
            Statement st = conn.createStatement();
            String query = "insert into " + username + "_admin  values('" +  newQuiz + "');"; 
            String sql = "create table " + newQuiz + "_" + username + "(no int , question text, opt1 text, opt2 text, opt3 text, opt4 text, rightOpt int);"; 
            stat = st.executeUpdate(query);
            status = st.executeUpdate(sql);
            conn.close();
            
            
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(CreatorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       if(stat != 0 && status == 0){
           System.out.println("Created" + newQuiz);
           JOptionPane.showMessageDialog(new JFrame(), "Test " + newQuiz + "added. Click OK to add questions." ,"Successful", JOptionPane.INFORMATION_MESSAGE);
           CreatingQuizzes cq = new CreatingQuizzes();
           cq.setCreds(username, newQuiz);
           cq.setVisible(true);
           this.dispose();
       }
       else{
           JOptionPane.showMessageDialog(new JFrame(), "Unable to add test " + newQuiz ,"Unknown Error", JOptionPane.ERROR_MESSAGE);
       }
        
       
    }//GEN-LAST:event_createQuizButtonActionPerformed

    private void fetchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            conn  = DBConnection.getInstance().connectUsers();
            Statement st = conn.createStatement();
            String query = "select * from " + username + "_admin";
            ResultSet rs = st.executeQuery(query);
            String result = "";
            //System.out.print("I am trying...");
            while(rs.next()){
                String test = rs.getString("testname");
                result = result.concat(test + "\n");
                //System.out.println("I can't figure it out...");
                
            }
            if(result.compareTo("") == 0)
                quizzesTArea.setText("You haven't created any tests yet Create a new Quiz now.");
            else
                quizzesTArea.setText(result);
            
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(CreatorFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fetchButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createQuizButton;
    private javax.swing.JButton fetchButton;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quizNameTBox;
    private javax.swing.JTextArea quizzesTArea;
    // End of variables declaration//GEN-END:variables
}