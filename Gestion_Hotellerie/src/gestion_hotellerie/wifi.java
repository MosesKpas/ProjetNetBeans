
package gestion_hotellerie;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

        
//@author moise

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class wifi extends javax.swing.JFrame {
    private String rech;
     private String url="jdbc:mysql://127.0.0.1:3306/hotellerie",user="root",pass="";
  private Statement st;
  private String requetteVerifier;
  private String requetteAide;
  private Connection con; 
  void ouverture(){
      try {
          Class.forName("com.mysql.jdbc.Driver");
          this.con=(Connection)DriverManager.getConnection(url,user,pass);
          System.out.println("c'est bon");
      } catch (Exception e) {JOptionPane.showMessageDialog(null,""+e.getMessage());
      }
  }
  void fermeture(){
      try {
          this.con.close();
          this.st.close();
          System.out.println("ferme");
      } catch (Exception e) {JOptionPane.showMessageDialog(null,""+e.getMessage());
      }
} 

    public wifi() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(rootPaneCheckingEnabled);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nom = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        non = new javax.swing.JTextField();
        num = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        nom.setBackground(new java.awt.Color(204, 204, 204));
        nom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("WIFI GRATUIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        nom.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("JUSTE UNE VERIFICATIOIN");
        nom.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 140, -1, -1));

        non.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.add(non, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 175, 178, 34));

        try {
            num.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## #### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nom.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 227, 178, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_24px.png"))); // NOI18N
        nom.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 175, -1, 27));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone.png"))); // NOI18N
        nom.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 227, -1, 41));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        nom.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 286, 94, 51));

        txt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nom.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 230, 30));

        txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 157, 230, 30));

        txt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 277, 230, 30));

        txt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 187, 230, 30));

        txt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 217, 230, 30));

        txt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 247, 230, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        nom.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 
        data(non.getText(),num.getText());
        save(non.getText(),num.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wifi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel nom;
    private javax.swing.JTextField non;
    private javax.swing.JFormattedTextField num;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    // End of variables declaration//GEN-END:variables

    public void data(String Nom,String Num){
    try {
        ouverture();
        this.st=(Statement)this.con.createStatement();
        String sql="Select * from ajoutclient where nom='"+Nom+"' and num='"+Num+"'";
        
        ResultSet rs=st.executeQuery(sql);
        if(rs.next()){
            txt.setText("Verifier");
            txt1.setText("Ok, Client existe!");
            txt2.setText("Vous allez recevoir ");
            txt3.setText("la");
            txt4.setText("Configuration wifi");
            txt5.setText("Bon sejours chez nous!");  
           }
        else{
            JOptionPane.showMessageDialog(null,"Oups \nClient introuvable!!");
            txt.setText("");
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            non.setText("");
            num.setText("");
            
        }
        
        fermeture();
    } catch (SQLException e) {JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
}
    public void save(String NOM,String NUM){
        try {
            ouverture();
            this.st=(Statement)this.con.createStatement();
        this.requetteAide="insert into wifi value('"+NOM+"','"+NUM+"')";
        this.st.executeUpdate(requetteAide);
        JOptionPane.showMessageDialog(null,"Enregistrer");
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erreur"+e);
        }
    }
}
