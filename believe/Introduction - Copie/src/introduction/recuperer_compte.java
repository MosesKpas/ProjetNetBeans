/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

import javax.swing.JOptionPane;

/**
 *
 * @author Devernay Mbala
 */
public class recuperer_compte extends javax.swing.JFrame {

    /**
     * Creates new form recuperer_compte
     */
    public recuperer_compte() {
        initComponents();
        
        user ="";
        prenom = "";
        commune = "";
        
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
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel3.setBounds(60, 150, 310, 40);

        jLabel6.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("C'est notre priorité.\"");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 200, 190, 30);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Récuperer votre compte");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(23, 11, 340, 33);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("Entrez ces informations pour récuperer votre compte");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(33, 50, 397, 36);

        jLabel8.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/utilisateur.png"))); // NOI18N
        jLabel8.setText("Nom d'utilisateur");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(23, 109, 170, 21);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTextField1.setToolTipText("Entrer votre nom d'utilisateur");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(33, 135, 330, 27);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTextField2.setToolTipText("Entrer votre prénom");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(33, 196, 330, 27);

        jLabel10.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/aproPetit.png"))); // NOI18N
        jLabel10.setText("Prénom :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(23, 168, 115, 22);

        jComboBox1.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ndjili", "Kasa-Vubu", "Lingwala", "Maluku", "Kinkole", "Gombe", "Ngaba", "Ngiri-Ngiri", "Limete", "Masina", "Kimbanseke", "Nsele", "Matete", "Lemba", "Kinshasa", "Barumbu", "Kintambo", "Bandal", "Bumbu", "Selembao", "Makala", "Mont Ngafula", "Ngaliema", "Kalamu" }));
        jComboBox1.setToolTipText("Sélectionner votre commune habitée");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(210, 240, 240, 28);

        jLabel18.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/commune.png"))); // NOI18N
        jLabel18.setText("Commune habitée :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(23, 229, 195, 39);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/OK.jpeg"))); // NOI18N
        jButton1.setText("Ok");
        jButton1.setToolTipText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(23, 359, 166, 43);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/retour.png"))); // NOI18N
        jButton2.setText("Retour");
        jButton2.setToolTipText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(283, 359, 166, 43);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 80, 210, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 80, 180, 0);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 10, 460, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/connexion_img.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 905, 458);

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("CONSEILS SANTE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 20, 330, 80);

        setSize(new java.awt.Dimension(920, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setUser(jTextField1.getText());
        setPrenom(jTextField2.getText()) ;
        setCommune(jComboBox1.getSelectedItem().toString()) ;
        
        String user_prenCom = connect.mot_passe_oublie(user, prenom, commune);
        
      
            System.out.println(getUser()+ "= nom_utilisateur1");
            System.out.println(getPrenom() + "= prenom1");
            System.out.println( getCommune()+ "= commune1");

        if(user.isEmpty() || prenom.isEmpty())
       {
           jLabel11.setText("Veuillez remplir tous les champs");
       }
       else
       {
           if(user_prenCom.equals("OK")){
                change_mdp ch= new change_mdp( getUser(),getPrenom() , getCommune());
                ch.setVisible(true);
                this.hide();
           }
           else {
               JOptionPane.showMessageDialog(null, "Incorrect");
                    
           }       
                   
          
       }
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        connexion con = new connexion();
        con.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(recuperer_compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recuperer_compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recuperer_compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recuperer_compte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recuperer_compte().setVisible(true);
            }
        });
    }
    
    public static String getUser(){
        return user;
    }
    
    public static void setUser(String user1){
        user = user1;
    }
    
    public static String getPrenom(){
        return prenom;
    }
    public static void setPrenom(String prenom1){
        prenom = prenom1;
    }
    
    public static String getCommune(){
        return commune;
    }
    
    public static void setCommune(String commune1){
        commune = commune1;
    }

    
    private static String user;
    private static String prenom ;
    private  static String commune ;
    Connecter connect = new Connecter();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
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
