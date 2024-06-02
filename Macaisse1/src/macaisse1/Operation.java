package macaisse1;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Operation extends javax.swing.JFrame {
    //facture
    Double Depot=0.0;
    Double Retrait=0.0;
    Double bHeight=0.0;
    ArrayList<String> No= new ArrayList<>();
    ArrayList<String> Post= new ArrayList<>();
    ArrayList<String> Pre= new ArrayList<>();
    ArrayList<String> Date1= new ArrayList<>();
    ArrayList<String> Mont= new ArrayList<>();
// Base de donnee
  private String url="jdbc:mysql://127.0.0.1:3306/Base",user="root",pass="";
  private Statement st;
  private String requetteVerifier;
  private String requetteAide;
  private String requetteEnregisBilan;
  private String requetteInserer;
  private Connection con;
  private String devise; 
  private String rech;
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
    public Operation() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(rootPaneCheckingEnabled);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        choixOperation = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        sav1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sav2 = new javax.swing.JTextField();
        sav3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sav4 = new javax.swing.JPasswordField();
        BoutonRecherche = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        boxMontantActuelFC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxMontantActuelDollar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BoutonEffectuer = new javax.swing.JButton();
        choixDevise = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        f = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cachecache = new javax.swing.JLabel();
        BoutonRetourMenu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sav8 = new javax.swing.JLabel();
        sav6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        montantInserer = new javax.swing.JTextField();
        pourc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(475, 438));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        choixOperation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Depot", "Retrait" }));
        jPanel1.add(choixOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 54, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coordonnees client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(sav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 104, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Post-nom");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prenom");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 36, -1, -1));

        sav2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sav2ActionPerformed(evt);
            }
        });
        jPanel2.add(sav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 73, 102, 31));
        jPanel2.add(sav3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 121, 105, 32));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Code");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 164, -1, -1));
        jPanel2.add(sav4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 164, 105, -1));

        BoutonRecherche.setText("Recherche");
        BoutonRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRechercheActionPerformed(evt);
            }
        });
        jPanel2.add(BoutonRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 106, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Montant Actuel"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxMontantActuelFC.setEditable(false);
        boxMontantActuelFC.setText("0");
        jPanel3.add(boxMontantActuelFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 78, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("FC");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 30, -1, -1));

        boxMontantActuelDollar.setEditable(false);
        boxMontantActuelDollar.setText("0");
        jPanel3.add(boxMontantActuelDollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, 78, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("$");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 74, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 106, -1, -1));

        BoutonEffectuer.setText("Effectuer");
        BoutonEffectuer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoutonEffectuerMouseClicked(evt);
            }
        });
        BoutonEffectuer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonEffectuerActionPerformed(evt);
            }
        });
        jPanel1.add(BoutonEffectuer, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 348, -1, -1));

        choixDevise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FC", "$" }));
        jPanel1.add(choixDevise, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 80, 58, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });

        f.setBackground(new java.awt.Color(255, 255, 255));
        f.setText("Fermer");
        f.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fMouseDragged(evt);
            }
        });
        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel4.setText("MA CAISSE");

        cachecache.setForeground(new java.awt.Color(255, 255, 255));
        cachecache.setText("jLabel12");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cachecache)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cachecache)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 475, -1));

        BoutonRetourMenu.setText("Retour");
        BoutonRetourMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoutonRetourMenuMouseClicked(evt);
            }
        });
        jPanel1.add(BoutonRetourMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Operation");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 57, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Devise");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 83, -1, -1));

        sav8.setText("1234");
        jPanel1.add(sav8, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 54, 204, 20));

        sav6.setEditable(false);
        sav6.setText("0");
        sav6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sav6ActionPerformed(evt);
            }
        });
        jPanel1.add(sav6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 76, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Total");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 294, 69, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("inserer le montant");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));
        jPanel1.add(montantInserer, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 239, 73, 37));
        jPanel1.add(pourc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 50, 32));

        jLabel12.setText("Pourcentage");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel13.setText("Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonEffectuerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoutonEffectuerMouseClicked
      String op=(String) choixOperation.getSelectedItem();
  //------------------------ DEPOT DEPOT DEPOT  --------------------------------------------------------------------------
if(op=="Depot"){
String dev=(String) choixDevise.getSelectedItem();
if(dev.equals("FC")){
 // recuperation du montant actuel dollar
    int h=Integer.parseInt(boxMontantActuelFC.getText());
    // recuperation montant inserer
    int fg=Integer.parseInt(montantInserer.getText());
    // addition 
    int jk=h+fg;
    float montantretenu=Float.parseFloat(pourc.getText());
    float acouper=jk*montantretenu;
     if((jk>0) && (fg>0)){
    // affichage du montant total
    sav6.setText(""+jk);
    RFranc();
    // recuperation du montant total
    int g= Integer.parseInt(sav6.getText());
    JOptionPane.showConfirmDialog(null, " nouveau montant : "+g+" poursuivre ?");
     final SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");
        final String datestr=sdf.format(new Date ());
        String motif="Depot";
         DepotFranc(sav1.getText(),sav2.getText(),sav3.getText(), datestr,fg,motif, g);
    EnregistrementBilan(sav8.getText(),g);
     JOptionPane.showMessageDialog(null," Operation effectuee");
      No.add(sav1.getText());
      Post.add(sav2.getText());
      Pre.add(sav3.getText());
      Date1.add(datestr);
      Mont.add(""+g);
       int ghl=Integer.parseInt(cachecache.getText());
    g=g+ghl;
       EnregistrementBilan2(datestr, g);
       JOptionPane.showConfirmDialog(null," Imprimer ?");
      int choix=Integer.parseInt(JOptionPane.showInputDialog(" imprimer ?"));
       if(choix==1){
      Impri();
      } else{}
     }
      else{JOptionPane.showMessageDialog(null," Solde insuffisant");
      montantInserer.setText("");
      cachecache.setText("");
      }
}
if(dev.equals("$")){
    // recuperation du montant actuel dollar
    int h=Integer.parseInt(boxMontantActuelDollar.getText());
    // recuperation montant inserer
    int fg=Integer.parseInt(montantInserer.getText());
    // addition 
    int jk=h+fg;
     if((jk>0) && (fg>0)){
    // affichage du montant total
    sav6.setText(""+jk);
    // recuperation du montant total
    int g= Integer.parseInt(sav6.getText());
    RDollar();
    JOptionPane.showConfirmDialog(null, " nouveau montant : "+g+" poursuivre ?");
     final SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");
        final String datestr=sdf.format(new Date ());
        String motif="Depot";
    DepotDollar(sav1.getText(),sav2.getText(),sav3.getText(), datestr,fg,motif, g);
    EnregistrementBilan(sav8.getText(),g);
      JOptionPane.showMessageDialog(null," Operation effectuee");
      No.add(sav1.getText());
      Post.add(sav2.getText());
      Pre.add(sav3.getText());
      Date1.add(datestr);
      Mont.add(""+g);
       int ghl=Integer.parseInt(cachecache.getText());
    g=g+ghl;
       EnregistrementBilan(datestr, g);
      int choix=Integer.parseInt(JOptionPane.showInputDialog(" imprimer ?"));
       if(choix==1){
      Impri();
      } else{}
     }
      else{JOptionPane.showMessageDialog(null," Solde insuffisant");
      montantInserer.setText("");
      cachecache.setText("");
      }
   }
}
//------------------------------------------------- RETRAIT RETRAIT RETRAIT  --------------------------------------------------------------------------
if(op=="Retrait"){
String dev=(String) choixDevise.getSelectedItem();
if(dev.equals("FC")){
  // recuperation du montant actuel dollar
    int h=Integer.parseInt(boxMontantActuelFC.getText());
// recuperation montant inserer
    int fg=Integer.parseInt(montantInserer.getText());
   
   int jk=h-fg;
    
      if((jk>0) && (fg>0)){
       // affichage du montant total
    sav6.setText(""+jk);
    
    int g= Integer.parseInt(sav6.getText());
    JOptionPane.showConfirmDialog(null, " nouveau montant : "+g+" poursuivre ?");final SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");
        final String datestr=sdf.format(new Date ());
        String motif="Retrait";
        RFranc();
    RetraitFranc(sav1.getText(),sav2.getText(),sav3.getText(), datestr,fg,motif, g);
    EnregistrementBilan(sav8.getText(),g);
       JOptionPane.showMessageDialog(null," Operation effectuee");
       No.add(sav1.getText());
      Post.add(sav2.getText());
      Pre.add(sav3.getText());
      Date1.add(datestr);
      Mont.add(""+g);
       int ghl=Integer.parseInt(cachecache.getText());
    g=ghl-fg;
       EnregistrementBilan2(datestr, g);
        int choix=Integer.parseInt(JOptionPane.showInputDialog(" imprimer ?"));
       if(choix==1){
      Impri();
      } else{}
      }
      else{JOptionPane.showMessageDialog(null," Solde insuffisant");
      montantInserer.setText("");
      cachecache.setText("");
      }
    
}
if(dev.equals("$")){
     // recuperation du montant actuel dollar
    int h=Integer.parseInt(boxMontantActuelDollar.getText());
// recuperation montant inserer
    int fg=Integer.parseInt(montantInserer.getText());
    // soustraction
      int jk=h-fg;
      if((jk>0) && (fg>0)){
       // affichage du montant total
    sav6.setText(""+jk);
    int g= Integer.parseInt(sav6.getText());
    JOptionPane.showConfirmDialog(null, " nouveau montant : "+g+" poursuivre ?");
    final SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy  hh:mm:ss");
        final String datestr=sdf.format(new Date ());
        String motif="Retrait";
    RetraitDollar(sav1.getText(),sav2.getText(),sav3.getText(), datestr,fg,motif, g);
    RDollar();
    int ghl=Integer.parseInt(cachecache.getText());
    g=ghl-fg;
    EnregistrementBilan(sav8.getText(),g);
       JOptionPane.showMessageDialog(null," Operation effectuee"); montantInserer.setText("");
      No.add(sav1.getText());
      Post.add(sav2.getText());
      Pre.add(sav3.getText());
      Date1.add(datestr);
      Mont.add(""+g);
          EnregistrementBilan(datestr, g);
       int choix=Integer.parseInt(JOptionPane.showInputDialog(" imprimer ?"));
       if(choix==1){
      Impri();
      } else{}
      }
      else{JOptionPane.showMessageDialog(null," Solde insuffisant");    
      }  
}
} sav6.setText("");
montantInserer.setText("");
cachecache.setText("");
    }//GEN-LAST:event_BoutonEffectuerMouseClicked

    private void fMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_fMouseDragged

    private void fMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMouseEntered
       
    }//GEN-LAST:event_fMouseEntered

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
      f.setBackground(Color.red);   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseDragged

    private void fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMouseClicked
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_fMouseClicked

    private void BoutonRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRechercheActionPerformed
        Rechh(sav1.getText(),sav2.getText(), sav3.getText(),sav4.getText());
       // Rech(sav1.getText(), sav2.getText(), sav3.getText(),sav4.getText());
       // RechercheDollar(sav1.getText(), sav2.getText(), sav3.getText(), sav4.getText());
    }//GEN-LAST:event_BoutonRechercheActionPerformed

    private void BoutonRetourMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoutonRetourMenuMouseClicked
dispose();
        new ABC().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonRetourMenuMouseClicked

    private void sav2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sav2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sav2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      RecherchePourcentage();
    }//GEN-LAST:event_formWindowOpened

    private void BoutonEffectuerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonEffectuerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonEffectuerActionPerformed

    private void sav6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sav6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sav6ActionPerformed

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
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Operation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonEffectuer;
    private javax.swing.JButton BoutonRecherche;
    private javax.swing.JButton BoutonRetourMenu;
    private javax.swing.JTextField boxMontantActuelDollar;
    private javax.swing.JTextField boxMontantActuelFC;
    private javax.swing.JLabel cachecache;
    private javax.swing.JComboBox<String> choixDevise;
    private javax.swing.JComboBox<String> choixOperation;
    private javax.swing.JLabel f;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField montantInserer;
    private javax.swing.JLabel pourc;
    private javax.swing.JTextField sav1;
    private javax.swing.JTextField sav2;
    private javax.swing.JTextField sav3;
    private javax.swing.JPasswordField sav4;
    private javax.swing.JTextField sav6;
    private javax.swing.JLabel sav8;
    // End of variables declaration//GEN-END:variables
// verifiation des coordonnees
  public void Rechh(String Nom, String Postnom, String Prenom, String Code){
    try {
        ouverture();
        this.st=(Statement)this.con.createStatement();
        this.requetteVerifier="select * from client where Nom='"+Nom+"' and Postnom ='"+Postnom+"'  and Prenom ='"+Prenom+"'  and Code ='"+Code+"'";
        ResultSet rs= this.st.executeQuery(requetteVerifier);
        if(rs.next()){
            RechercheDollar(Nom, Postnom, Prenom);
            RechercheFranc(Nom, Postnom, Prenom);
        
        }
        fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,""+e.getMessage());
    }
}

// Methode de la recherhe en franc
    public void RechercheFranc(String Nom, String Postnom,String Prenom){
    try {
        ouverture();
        this.st=(Statement)this.con.createStatement();
        this.rech="select MontantTotal from franc where Nom='"+Nom+"' and Postnom='"+Postnom+"' and Prenom='"+Prenom+"' ";
        ResultSet rs=st.executeQuery(rech);
        while(rs.next())   
        {int mm=rs.getInt("MontantTotal");
        boxMontantActuelFC.setText(""+mm);
            System.out.println("c'est bon");
        }
        fermeture();
    } catch (SQLException e) {JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
}
    // Metode ded la recherce en dollar
public void RechercheDollar(String Nom, String Postnom,String Prenom){
    try {
        ouverture();
        this.st=(Statement)this.con.createStatement();
        this.rech="select MontantTotal from dollar where Nom='"+Nom+"' and Postnom='"+Postnom+"' and prenom='"+Prenom+"' ";
        ResultSet rs=st.executeQuery(rech);
        while(rs.next())   
        {int mm=rs.getInt("MontantTotal");
        boxMontantActuelDollar.setText(""+mm);
        }
        fermeture();
      //   String hgl="select Montant from Bilan where 1";
  //  ResultSet ret=st.executeQuery(hgl);
 //   while(ret.next()){int ghf=ret.getInt("Montant");}
        
    } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
}
// depot dollar
public void DepotDollar(String Nom,String Postnom,String Prenom, String Date, int Montant, String Motif,int MontantTotal){
    try {ouverture();
    this.st=(Statement)this.con.createStatement();
    this.requetteInserer="insert into dollar value('"+Nom+"','"+Postnom+"','"+Prenom+"','"+Date+"','"+Montant+"','"+Motif+"','"+MontantTotal+"')";
    this.st.executeUpdate(requetteInserer);
        System.out.println("c'est bon");
        fermeture();
    } catch (SQLException e) {JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
}
public void DepotFranc(String Nom,String Postnom,String Prenom, String Date, int Montant, String Motif,int MontantTotal){
    try {
        ouverture();
    this.st=(Statement)this.con.createStatement();
    this.requetteInserer="insert into franc value('"+Nom+"','"+Postnom+"','"+Prenom+"','"+Date+"','"+Montant+"','"+Motif+"','"+MontantTotal+"')";
    this.st.executeUpdate(requetteInserer);
        System.out.println("c'est bon");
        fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
}
public void RetraitDollar(String Nom,String Postnom,String Prenom, String Date, int Montant, String Motif,int MontantTotal){
    try {ouverture();
    this.st=(Statement)this.con.createStatement();
    this.requetteInserer="insert into dollar value('"+Nom+"','"+Postnom+"','"+Prenom+"','"+Date+"','"+Montant+"','"+Motif+"','"+MontantTotal+"')";
    this.st.executeUpdate(requetteInserer);
        System.out.println("c'est ok");
        fermeture();
        
    } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
}
public void RetraitFranc(String Nom,String Postnom,String Prenom, String Date, int Montant, String Motif,int MontantTotal){
    try {
        ouverture();
    this.st=(Statement)this.con.createStatement();
    this.requetteInserer="insert into franc value('"+Nom+"','"+Postnom+"','"+Prenom+"','"+Date+"','"+Montant+"','"+Motif+"','"+MontantTotal+"')";
    this.st.executeUpdate(requetteInserer);
        System.out.println("c'est ok");
        fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
    
}

public void EnregistrementBilan(String Date,int Montant){
    try {ouverture();
    this.st=(Statement)this.con.createStatement();
   
    this.requetteEnregisBilan="insert into Bilan value('"+Date+"','"+Montant+"')";
    this.st.executeUpdate(requetteEnregisBilan);
        System.out.println("c'est ok");
         fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,""+e.getMessage());
    }
}
public void EnregistrementBilan2(String Date,int Montant2){
    try {ouverture();
    this.st=(Statement)this.con.createStatement();
    this.requetteEnregisBilan="insert into Bilan2 value('"+Date+"','"+Montant2+"')";
    this.st.executeUpdate(requetteEnregisBilan);
        System.out.println("c'est ok");
         fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,""+e.getMessage());
    }
}
// facture
public PageFormat getPageFormat(PrinterJob pj){

    PageFormat pf=pj.defaultPage();
    Paper paper= pf.getPaper();
    
    double bodyHeight= bHeight;
    double headerHeight = 5.0;
    double footerHeight = 5.0;
    double width= cm_to_pp(8);
    double height= cm_to_pp(headerHeight+bodyHeight+footerHeight);
    paper.setSize(width,height);
    pf.setPaper(paper);
return pf;
}
protected static double cm_to_pp(double cm){
return toPPI(cm*0.393600787);
}
protected static double toPPI(double inch){
return inch * 72d;
}
public class BillPrintale implements Printable{
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException{
    int result=NO_SUCH_PAGE;
    if(pageIndex==0){
    Graphics2D  g2d= (Graphics2D) graphics;
    double width= pageFormat.getImageableHeight();
    g2d.translate((int)pageFormat.getImageableX(),(int) pageFormat.getImageableX());
        try {
            int y=20;
            int yshift=10;
            int headerRectHeight=15;
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            //g2d.drawImage(icon.getmage(),50,20,90,30, rootPane); y+=yshift+30;
            g2d.drawString("----------------------------",12,y); y+=yshift;
            g2d.drawString("             G5             ",12,y); y+=yshift;
            g2d.drawString("  "+No+" ",10,y); y+=yshift;
            g2d.drawString("  "+Post+" ",10,y); y+=yshift;
            g2d.drawString("  "+Pre+" ",10,y); y+=yshift; 
            g2d.drawString("  "+Mont+" ",10,y); y+=yshift;
        } catch (Exception e) { e.printStackTrace();
        }
    result=PAGE_EXISTS;
    }
    return result;
    }
}
public void Impri(){
bHeight= Double.valueOf(No.size());
JOptionPane.showMessageDialog(rootPane,bHeight);
PrinterJob pj=PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintale(),getPageFormat(pj));
    try {
        pj.print();
    } catch (Exception e) { e.printStackTrace();
    }
}     

 public void RDollar(){
    try {
        ouverture();
        this.st=(Statement)this.con.createStatement();
        this.requetteVerifier="select Montant from Bilan where 1";
        ResultSet rs= this.st.executeQuery(requetteVerifier);
        while(rs.next()){
         int ag=rs.getInt("Montant");
        cachecache.setText(""+ag);
        }
        fermeture();
    } catch (Exception e){JOptionPane.showMessageDialog(null,""+e.getMessage());
    }
}
 public void RFranc(){
    try {
        ouverture();
        this.st=(Statement)this.con.createStatement();
        this.requetteVerifier="select Montant2 from bilan2 where 1";
        ResultSet rs= this.st.executeQuery(requetteVerifier);
        while(rs.next()){
         int ag=rs.getInt("Montant2");
        cachecache.setText(""+ag);
        }
        fermeture();
    } catch (Exception e){JOptionPane.showMessageDialog(null,""+e.getMessage());
    }
}
   public void RecherchePourcentage(){
    try {
        ouverture();
        this.st=(Statement)this.con.createStatement();
        String hrech="select Pourcent from logg where 1 ";
        ResultSet rs=st.executeQuery(hrech);
        while(rs.next())   
        {float oppp=rs.getFloat("Pourcent");
        pourc.setText(""+oppp);
            System.out.println("c'est bon");
        }
        fermeture();
    } catch (SQLException e){JOptionPane.showMessageDialog(null,"erreur "+e.getMessage());
    }
}
}