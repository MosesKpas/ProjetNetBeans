package ma_caisseremix;
/*Les imports*/
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 * Ma Caisse
 * @author G5 PROGS
 * Kapend  Moise
 * Ntumba  Sephora
 * Nyota Falonne
 * Kamuanya Tabitha
 */
public class AjoutClient extends javax.swing.JFrame {
    
  private String url="jdbc:mysql://127.0.0.1:3306/finalcaisse",user="root",pass="";
  private Statement st;
  private String requetteVerifier;
  private String requetteAide;
  private String requetteEnregisBilan;
  private String requetteInserer;
  private String requettedelete;
  private Connection con;
  private String devise;
  private String rech;
  
  /*    METHODE D'OUVERTURE ET FERMETURE DE LA CONNECTION*/
  
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

  /*     CODE GENERE LORS DE LA CREATION DU DESIGN*/  
  
    public AjoutClient() {
        /*  code généré*/
        initComponents();
        /* creation de notre objet updateTimer de la classe Timer*/
         Timer updateTimer;
         /* declaration et initialisation de notre variable play en int*/
        int play=100;
        /*  initialisation de notre variable updatetimer qui va contenir une methode d'evenement*/
        updateTimer=new Timer(play,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date cur= new Date();   
                String FormatTimer="hh:mm:ss";
                String FormatTimer2="dd/MM/yyyy";
                DateFormat as=new SimpleDateFormat(FormatTimer);
                DateFormat ase=new SimpleDateFormat(FormatTimer2);
                String a=as.format(cur);
                String b=ase.format(cur);
                /*   affichage de l'heure et de la date*/
               date.setText(b);
                DateDate.setText(b);
                
            }
        });
        /*    lancement de la methode qui fait tourner l'heure*/
        updateTimer.start();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    /* Methode de recherche*/
    
    public void search(String str){
        DefaultTableModel model =new DefaultTableModel();
        model=(DefaultTableModel) tab.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tab.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        cherche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        post = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        motdepasse = new javax.swing.JTextField();
        BoutonSave = new javax.swing.JButton();
        BoutonPrint = new javax.swing.JButton();
        BoutonData = new javax.swing.JButton();
        boutonDelete = new javax.swing.JButton();
        BoutonRetour = new javax.swing.JButton();
        BoutonFermer = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        dates = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DateDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("ENREGISTREMENT DANS MA CAISSE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        tab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "POSTNOM", "PRENOM", "NUMERO", "ADRESSE"
            }
        ));
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(4).setPreferredWidth(250);
        }

        cherche.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chercheKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECHERCHE");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(102, 153, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("MOT DE PASSE:");

        post.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postActionPerformed(evt);
            }
        });

        nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        adresse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("PRENOM:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("POSTNOM:");

        pre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("NUMERO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("NOM:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("ADRESSE:");

        num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        motdepasse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adresse)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motdepasse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(post, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BoutonSave.setBackground(new java.awt.Color(0, 51, 153));
        BoutonSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoutonSave.setForeground(new java.awt.Color(255, 255, 255));
        BoutonSave.setText("SAVE");
        BoutonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonSaveActionPerformed(evt);
            }
        });

        BoutonPrint.setBackground(new java.awt.Color(0, 51, 153));
        BoutonPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoutonPrint.setForeground(new java.awt.Color(255, 255, 255));
        BoutonPrint.setText("PRINT");
        BoutonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonPrintActionPerformed(evt);
            }
        });

        BoutonData.setBackground(new java.awt.Color(0, 51, 153));
        BoutonData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoutonData.setForeground(new java.awt.Color(255, 255, 255));
        BoutonData.setText("DATA");
        BoutonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonDataActionPerformed(evt);
            }
        });

        boutonDelete.setBackground(new java.awt.Color(0, 51, 153));
        boutonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boutonDelete.setForeground(new java.awt.Color(255, 255, 255));
        boutonDelete.setText("DELETE");
        boutonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonDeleteActionPerformed(evt);
            }
        });

        BoutonRetour.setBackground(new java.awt.Color(153, 0, 0));
        BoutonRetour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoutonRetour.setForeground(new java.awt.Color(255, 255, 255));
        BoutonRetour.setText("RETOUR");
        BoutonRetour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BoutonRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRetourActionPerformed(evt);
            }
        });

        BoutonFermer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ma_caisseremix/Images/exit.png"))); // NOI18N
        BoutonFermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoutonFermerMouseClicked(evt);
            }
        });

        date.setForeground(new java.awt.Color(102, 102, 102));

        dates.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Fermer");

        DateDate.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dates, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BoutonFermer))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(cherche, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(BoutonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonData, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(BoutonPrint)
                .addGap(18, 18, 18)
                .addComponent(boutonDelete)
                .addGap(599, 599, 599)
                .addComponent(BoutonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(DateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(dates, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BoutonFermer)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(DateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoutonSave)
                    .addComponent(BoutonData))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoutonRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoutonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boutonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*pas utile*/
    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed

    }//GEN-LAST:event_nomActionPerformed
/*pa util*/
    private void preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preActionPerformed
    }//GEN-LAST:event_preActionPerformed
    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed
    }//GEN-LAST:event_postActionPerformed
/*Methode du bouton Save*/
    private void BoutonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonSaveActionPerformed
        // creation de la date
        String motif="ENREGISTREMENT";
        int NumeroTel=Integer.parseInt(num.getText());
        /*enregistrement dans la table client*/
        Entrer(nom.getText(),post.getText(),pre.getText(),NumeroTel,adresse.getText(),motdepasse.getText(),date.getText());
        /*Affichage du cleint dans le tableau juste a droite*/
        String sv[]={nom.getText(),post.getText(),pre.getText(),num.getText(),adresse.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        /* creation du co^pte dollar*/
        EntrerDollar(nom.getText(),post.getText(),pre.getText(), date.getText(),0 , motif, 0);
        /*creation du comte franc*/
        EntrerFranc(nom.getText(),post.getText(),pre.getText(),date.getText(), 0, motif, 0); 
    }//GEN-LAST:event_BoutonSaveActionPerformed

    /*Methode du bouton fermer*/
    private void BoutonFermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoutonFermerMouseClicked
        
        int option=JOptionPane.showConfirmDialog(null, "Voulez-vous fermer le programme?","Quitter",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(option == JOptionPane.OK_OPTION){
        
            JOptionPane.showMessageDialog(null,"Gestion de Ma Caisse","Ma caisse",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            new AjoutClient().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_BoutonFermerMouseClicked
/*methode du bouton retour*/
    private void BoutonRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRetourActionPerformed
        this.dispose();
        new Choix().setVisible(true);
    }//GEN-LAST:event_BoutonRetourActionPerformed
/*methode du bouton delete*/
    private void boutonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonDeleteActionPerformed
          effacer(nom.getText(),post.getText());
       
    }//GEN-LAST:event_boutonDeleteActionPerformed
/*rappel de la methode de recherche*/
    private void chercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chercheKeyReleased
         String ch= cherche.getText();
        search(ch);
    }//GEN-LAST:event_chercheKeyReleased
/*methode du bouton print*/
    private void BoutonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonPrintActionPerformed
        MessageFormat header = new MessageFormat("Liste des clients");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{
            tab.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("erreur d'impression",e.getMessage());
            
        }
    }//GEN-LAST:event_BoutonPrintActionPerformed
/*methode data*/
    private void BoutonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonDataActionPerformed
         data();
    }//GEN-LAST:event_BoutonDataActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonData;
    private javax.swing.JLabel BoutonFermer;
    private javax.swing.JButton BoutonPrint;
    private javax.swing.JButton BoutonRetour;
    private javax.swing.JButton BoutonSave;
    private javax.swing.JLabel DateDate;
    private javax.swing.JTextField adresse;
    private javax.swing.JButton boutonDelete;
    private javax.swing.JTextField cherche;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dates;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField motdepasse;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField num;
    private javax.swing.JTextField post;
    private javax.swing.JTextField pre;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables

    /*  creation de la    Methode d'enregistrement du client   */
public void Entrer(String nom,String post,String pre,int NumeroTel,String adresse,String motdepasse, String date){
    try {
        ouverture();
      /*   SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
         String datestr=sdf.format(new Date ());
        
       
        
        DateDate.setText(datestr);*/
        
    this.st=(Statement)this.con.createStatement();
this.requetteInserer="insert into ajoutclient value('"+nom+"','"+post+"','"+pre+"','"+NumeroTel+"','"+adresse+"','"+motdepasse+"','"+date+"')";
    this.st.executeUpdate(requetteInserer);
        JOptionPane.showMessageDialog(null," Enregistrer");
        fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur \n "+e.getMessage());
    }
}
    
    /*  creation de la    Methode de creation de compte Dollar*/
    
public void EntrerDollar(String nom,String post,String pre, String date, int Montant, String Motif,int MontantTotal){
    try {
        ouverture();
    this.st=(Statement)this.con.createStatement();
this.requetteInserer="insert into dollar value('"+nom+"','"+post+"','"+pre+"','"+date+"','"+Montant+"','"+Motif+"','"+MontantTotal+"')";
    this.st.executeUpdate(requetteInserer);
        JOptionPane.showMessageDialog(null,"Ouverture du compte en Dollar!");
        fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur \n "+e.getMessage());
    }
}


    /*   creation de la   Methode de creation de compte  franc*/

public void EntrerFranc(String nom,String post,String pre, String date, int Montant, String Motif,int MontantTotal){
    try {
        ouverture();
    this.st=(Statement)this.con.createStatement();
this.requetteInserer="insert into franc value('"+nom+"','"+post+"','"+pre+"','"+date+"','"+Montant+"','"+Motif+"','"+MontantTotal+"')";
    this.st.executeUpdate(requetteInserer);
        JOptionPane.showMessageDialog(null,"Ouverture du compte en Franc");
        fermeture();
    } catch (Exception e) {JOptionPane.showMessageDialog(null,"erreur \n "+e.getMessage());
    }
}


/* creation de la  Methode d'affichage des client*/


public void data(){
      // importer les donnees de la base de donnees:
        try{
            ouverture();
            Statement st = (Statement) con.createStatement();
            String sql = "select * from ajoutclient";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                String NOM = rs.getString("NOM");
                String POSTNOM = rs.getString("POSTNOM");
                String PRENOM = rs.getString("PRENOM");
                String NUMERO = rs.getString("NUMERO");
                String ADRESSE = rs.getString("ADRESSE");                
                String tdData[] = {NOM,POSTNOM,PRENOM,NUMERO,ADRESSE};
                DefaultTableModel tbModel = (DefaultTableModel)tab.getModel();
                //ajout des donnees
                tbModel.addRow(tdData);
            }
            fermeture();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
}

/*  creation de la    Methode pour effacer le client*/

public void effacer(String NOM,String Post){
    try{
        ouverture();//ouverture de la base de donnees
        this.st =(Statement) this.con.createStatement();
        //pour la ligne qui suit, on lance une requette pour pouvoir supprimer 
        this.requettedelete="delete from ajoutclient where NOM='"+NOM+"' and Postnom='"+Post+"'";
        String jo="delete from dollar where NOM='"+NOM+"' and Postnom='"+Post+"'";
        String moi="delete from franc where NOM='"+NOM+"' and Postnom='"+Post+"'";
        //la ligne suivante permet d'executer la requette de suppression
        this.st.executeUpdate(this.requettedelete);
        this.st.executeUpdate(jo);
        this.st.executeUpdate(moi);
        
        //fermeture de la base de donnees
        fermeture();
        //Ensuite on affiche un message pour dire que l'operation s'est bien passee
        JOptionPane.showMessageDialog(null,"Supprimer avec succes");
        //la gestion des erreures, c'est a dire, l'exception
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
}

}
