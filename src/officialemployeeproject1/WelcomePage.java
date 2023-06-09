/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package officialemployeeproject1;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Imoghome Blessings
 */
public class WelcomePage extends javax.swing.JFrame {

    /**
     * Creates new form WelcomePage
     */
    public WelcomePage() {
        initComponents();
        
        UserLogin ul = new UserLogin();
        WelcomePage wp = new WelcomePage();
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0; i <= 100; i++){

                    try {
                        Thread.sleep(100);
                        LoadingBar.setValue(i);
                        
                        if (i == 10) {
                            LoadingLabel.setText("Turning on Modules...");
                        }
                        if (i == 30) {
                            LoadingLabel.setText("Loading Modules...");
                        }
                        if (i == 50) {
                            LoadingLabel.setText("Connecting to Database...");
                        }
                        if (i == 70) {
                            LoadingLabel.setText("Connection Successful...");
                        }
                        if (i == 80) {
                            LoadingLabel.setText("Launching Application...");
                        }  
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    wp.setVisible(false); 
                }
            }
        });
        
        t.start();
        this.dispose();
        ul.setVisible(true);
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
        LoadingBar = new javax.swing.JProgressBar();
        LoadingLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome Page");

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingBar.setStringPainted(true);
        jPanel1.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 790, 20));

        LoadingLabel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        LoadingLabel.setText("Loading....");
        jPanel1.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 320, 30));

        Title.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Title.setText("Employee Management System");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 480, 90));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tower3.jpg"))); // NOI18N
        jPanel1.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
