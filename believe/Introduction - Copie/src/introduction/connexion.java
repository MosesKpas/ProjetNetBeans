/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction ;

/**
 *
 * @author Devernay Mbala
 */
import javax.swing.*;
import java.awt.*;
import java.lang.*;
public class connexion extends javax.swing.JFrame {

    /**
     * Creates new form connexion
     */
    String prenom;
    public connexion() {
        initComponents();
        prenom = "";
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("CONSEILS SANTE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 20, 330, 80);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        jLabel3.setText("\"Votre santé passe avant tout.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 150, 350, 40);

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("C'est notre priorité.\"");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 200, 190, 24);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Connectez-vous");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(23, 11, 340, 33);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/utilisateur.png"))); // NOI18N
        jLabel6.setText("Nom d'utilisateur");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(33, 50, 146, 20);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTextField1.setToolTipText("Entrer votre nom d'utilisateur");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(33, 76, 330, 27);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/clé1.png"))); // NOI18N
        jLabel7.setText("Mot de passe");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 110, 121, 20);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTextField2.setToolTipText("Entrer votre mot de passe");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(33, 135, 330, 27);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Connexion");
        jButton1.setToolTipText("Connexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(33, 173, 330, 34);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Créer un compte");
        jButton2.setToolTipText("Nouveau compte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(33, 249, 330, 34);

        jLabel8.setText("---------------------------------------ou----------------------------------------");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(33, 217, 330, 14);

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 14)); // NOI18N
        jButton3.setText("Mot de passe oublié?");
        jButton3.setToolTipText("Mot de passe oublié");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(121, 294, 154, 27);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(164, 106, 199, 0);

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(150, 104, 210, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(480, 40, 390, 390);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/connexion_img.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 460);

        setSize(new java.awt.Dimension(895, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String nom = jTextField1.getText();
       String mdp = jTextField2.getText();
       
       String mdpbd = connect.connexion(nom, mdp);
       
       
       
       
       
       if(nom.isEmpty() || mdp.isEmpty())
       {
           jLabel10.setText("Veuillez remplir tous les champs");
       }
       else
       {
           if(mdpbd == "OK"){
               
               
                acceuil ac = new acceuil(connect.getPrenom());
                ac.setVisible(true); 
                this.hide();
           }
           else {
               JOptionPane.showMessageDialog(null, "Informations incorrectes");
                    
           }       
                   
          
       }
        
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new_compte com = new new_compte();
        com.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        recuperer_compte rec = new recuperer_compte();
        rec.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new connexion().setVisible(true);
            }
        });
    }

    Connecter connect = new Connecter();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
