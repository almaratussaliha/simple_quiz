/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MENU;

import LOGIN.LoginForm;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Menu extends javax.swing.JFrame {
   
    private static Connection c;
    private PreparedStatement ps;
    private Statement s;
  
    private ResultSet rs;
    private String sql="";
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null); //form muncul ditengah layar
        new Koneksi.koneksi();
    }
    /*
    private void koneksi () {
        String url = "jdbc:mysql://localhost/db_tubes";
        String user="root";
        String pass="";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
         
            JOptionPane.showMessageDialog(this, "Driver  ditemukan");
            try {
            c=(Connection) DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
          Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, e);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Driver tidak ditemukan");
        }
        
        
    }
  
    */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        materi = new javax.swing.JMenu();
        jnoun = new javax.swing.JMenuItem();
        jpronoun = new javax.swing.JMenuItem();
        jverb = new javax.swing.JMenuItem();
        jadjective = new javax.swing.JMenuItem();
        jadverb = new javax.swing.JMenuItem();
        quiz = new javax.swing.JMenu();
        jquiz1 = new javax.swing.JMenuItem();
        jquiz2 = new javax.swing.JMenuItem();
        jquiz3 = new javax.swing.JMenuItem();
        jquiz4 = new javax.swing.JMenuItem();
        jquiz5 = new javax.swing.JMenuItem();
        profile = new javax.swing.JMenu();
        keluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\helloeng.jpg")); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, 110));

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jMenuBar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        jMenuBar2.setForeground(new java.awt.Color(255, 153, 204));
        jMenuBar2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setForeground(new java.awt.Color(153, 51, 255));
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jMenuBar2.add(home);

        materi.setBackground(new java.awt.Color(255, 255, 255));
        materi.setForeground(new java.awt.Color(153, 51, 255));
        materi.setText("Materi");
        materi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        materi.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        jnoun.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jnoun.setText("Noun");
        jnoun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnounActionPerformed(evt);
            }
        });
        materi.add(jnoun);

        jpronoun.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jpronoun.setText("Pronoun");
        jpronoun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpronounActionPerformed(evt);
            }
        });
        materi.add(jpronoun);

        jverb.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jverb.setText("Verb");
        jverb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jverbActionPerformed(evt);
            }
        });
        materi.add(jverb);

        jadjective.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jadjective.setText("Adjective");
        jadjective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadjectiveActionPerformed(evt);
            }
        });
        materi.add(jadjective);

        jadverb.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jadverb.setText("Adverb");
        jadverb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadverbActionPerformed(evt);
            }
        });
        materi.add(jadverb);

        jMenuBar2.add(materi);

        quiz.setBackground(new java.awt.Color(255, 255, 255));
        quiz.setForeground(new java.awt.Color(153, 51, 255));
        quiz.setText("Quiz");
        quiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quiz.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        jquiz1.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jquiz1.setText("Quiz1");
        jquiz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquiz1ActionPerformed(evt);
            }
        });
        quiz.add(jquiz1);

        jquiz2.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jquiz2.setText("Quiz2");
        jquiz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquiz2ActionPerformed(evt);
            }
        });
        quiz.add(jquiz2);

        jquiz3.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jquiz3.setText("Quiz3");
        jquiz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquiz3ActionPerformed(evt);
            }
        });
        quiz.add(jquiz3);

        jquiz4.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jquiz4.setText("Quiz4");
        jquiz4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquiz4ActionPerformed(evt);
            }
        });
        quiz.add(jquiz4);

        jquiz5.setFont(new java.awt.Font("Shonar Bangla", 0, 18)); // NOI18N
        jquiz5.setText("Quiz5");
        jquiz5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquiz5ActionPerformed(evt);
            }
        });
        quiz.add(jquiz5);

        jMenuBar2.add(quiz);

        profile.setForeground(new java.awt.Color(153, 51, 255));
        profile.setText("Profile");
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        jMenuBar2.add(profile);

        keluar.setForeground(new java.awt.Color(153, 51, 255));
        keluar.setText("Exit");
        keluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        keluar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jMenuBar2.add(keluar);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnounActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnounActionPerformed
        // TODO add your handling code here:
          
         dispose(); //menu login hilang
         new noun().setVisible(true);//kemenu noun
     
         
       
    }//GEN-LAST:event_jnounActionPerformed

    private void jpronounActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpronounActionPerformed
        // TODO add your handling code here:
        dispose();
        new pronoun().setVisible(true); //ke form pronoun
        
    }//GEN-LAST:event_jpronounActionPerformed

    private void jverbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jverbActionPerformed
        // TODO add your handling code here:
          dispose();
        new verb().setVisible(true); //ke form verb
        
    }//GEN-LAST:event_jverbActionPerformed

    private void jadjectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadjectiveActionPerformed
        // TODO add your handling code here:
          dispose();
        new adjective().setVisible(true); //ke form adj
       
    }//GEN-LAST:event_jadjectiveActionPerformed

    private void jadverbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadverbActionPerformed
        // TODO add your handling code here:
            dispose();
            new adverb().setVisible(true); //ke form adj
    }//GEN-LAST:event_jadverbActionPerformed

    private void jquiz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquiz1ActionPerformed
        // TODO add your handling code here:
        dispose ();
        new quiz1().setVisible(true);
        
     
    }//GEN-LAST:event_jquiz1ActionPerformed

    private void jquiz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquiz2ActionPerformed
        // TODO add your handling code here:
        dispose ();
        new quiz2().setVisible(true);
       
    }//GEN-LAST:event_jquiz2ActionPerformed

    private void jquiz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquiz3ActionPerformed
        // TODO add your handling code here:
        dispose ();
        new quiz3().setVisible(true);
        
    }//GEN-LAST:event_jquiz3ActionPerformed

    private void jquiz4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquiz4ActionPerformed
        // TODO add your handling code here:
        dispose ();
        new quiz4().setVisible(true);
        
    }//GEN-LAST:event_jquiz4ActionPerformed

    private void jquiz5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquiz5ActionPerformed
        // TODO add your handling code here:
        dispose();
        new quiz5().setVisible(true);
    }//GEN-LAST:event_jquiz5ActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
       
    }//GEN-LAST:event_profileActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_keluarMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        // TODO add your handling code here:
        dispose();
         new profileus().setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jadjective;
    private javax.swing.JMenuItem jadverb;
    private javax.swing.JMenuItem jnoun;
    private javax.swing.JMenuItem jpronoun;
    private javax.swing.JMenuItem jquiz1;
    private javax.swing.JMenuItem jquiz2;
    private javax.swing.JMenuItem jquiz3;
    private javax.swing.JMenuItem jquiz4;
    private javax.swing.JMenuItem jquiz5;
    private javax.swing.JMenuItem jverb;
    private javax.swing.JMenu keluar;
    private javax.swing.JMenu materi;
    private javax.swing.JMenu profile;
    private javax.swing.JMenu quiz;
    // End of variables declaration//GEN-END:variables

    
}
