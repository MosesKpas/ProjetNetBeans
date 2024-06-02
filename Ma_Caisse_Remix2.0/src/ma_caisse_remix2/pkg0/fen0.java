/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma_caisse_remix2.pkg0;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

// concernant la facture
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
import java.util.ArrayList;

        
public class fen0 extends javax.swing.JFrame {
 private Connection con;
 private Statement st;
 private ResultSet rs;  
 boolean as=false;
 private  String url="jdbc:mysql://localhost/caissr";
 
 // methode d'ouverture de connexion
 void ouverture(){
     try {
           Class.forName("com.mysql.jdbc.Driver");
        // Class.forName("com.mysql.jdbc.Driver");
         con=(Connection)DriverManager.getConnection(url,"root","");
         st=(Statement)con.createStatement();
         
                 } catch (Exception e) {
                     JOptionPane.showMessageDialog(null,e.getMessage());
     }
 }
 // methode de fermeture de connexion
 void fermeture(){
     try {
         con.close();
         st.close();
     } catch (Exception e) {
     }
 }
 // concernant la facture
 String billNo="";
 Double totalAmount=0.0;
 Double cash=0.0;
 Double balance=0.0;
 Double bHeight=0.0;
 
    ArrayList<String> itemName=new ArrayList<>();
    ArrayList<String> quantity=new ArrayList<>();
    ArrayList<String> itemprice=new ArrayList<>();
    ArrayList<String> subtotal=new ArrayList<>();
    String motif="";
    String compte="";
    double nouveauMontant=0.0;
    double montantInserer=0.0;
    double frais=0.0;    
    
   
    public fen0() {
        initComponents();
     affichePourcentage();
        Timer updateTimer;
        int play=100;
        updateTimer=new Timer(play,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                java.util.Date cur= new java.util.Date();   
                String FormatTimer="hh:mm:ss";
                String FormatTimer2="dd/MM/yyyy";
                DateFormat as=new SimpleDateFormat(FormatTimer);
                DateFormat ase=new SimpleDateFormat(FormatTimer2);
                String a=as.format(cur);
                String b=ase.format(cur);
                heure.setText(a);
                date.setText(b);
            }
        });
        updateTimer.start();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        modeOperation = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        principal = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        boutonConnect = new javax.swing.JButton();
        userr = new javax.swing.JTextField();
        codee = new javax.swing.JPasswordField();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        ajoutClient = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        postA = new javax.swing.JTextField();
        nomA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        preA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        numA = new javax.swing.JFormattedTextField();
        jPanel15 = new javax.swing.JPanel();
        quatA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bis = new javax.swing.JRadioButton();
        comA = new javax.swing.JTextField();
        avA = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        nump = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        codeA = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        bsave = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cherche = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        cacheDollar = new javax.swing.JLabel();
        cacheFranc = new javax.swing.JLabel();
        cacheBilanDollar = new javax.swing.JLabel();
        cacheBilanFranc = new javax.swing.JLabel();
        operation = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        nom1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        mdp = new javax.swing.JPasswordField();
        jLabel24 = new javax.swing.JLabel();
        boutonVerifierOperation = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        pre1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        post1 = new javax.swing.JTextField();
        valide = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        franc = new javax.swing.JTextField();
        dollar = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        choixRetrait = new javax.swing.JRadioButton();
        choixDepot = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        choixFranc = new javax.swing.JRadioButton();
        choixDollar = new javax.swing.JRadioButton();
        total = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        boutonValiderOperation = new javax.swing.JButton();
        insert = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        bilanDoll = new javax.swing.JLabel();
        bilanFran = new javax.swing.JLabel();
        pourcDol = new javax.swing.JLabel();
        pourcFra = new javax.swing.JLabel();
        pourcenttDol = new javax.swing.JLabel();
        pourcenttFran = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        bilan = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        nom3 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        mdp2 = new javax.swing.JPasswordField();
        jLabel37 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        pre2 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        post2 = new javax.swing.JTextField();
        valide1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        montantdollar = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        montantfranc = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        fraisf = new javax.swing.JTextField();
        fraisd = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        BoutonPrintù = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        ajoutUser = new javax.swing.JPanel();
        nomUtilisateur = new javax.swing.JTextField();
        communeUtilisateur = new javax.swing.JTextField();
        codeUtilisateur = new javax.swing.JPasswordField();
        pourD = new javax.swing.JTextField();
        pourF = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pourcentageDepot = new javax.swing.JRadioButton();
        pourcentageRetrait = new javax.swing.JRadioButton();
        jLabel53 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MA CAISSE REMIX 2.0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER");

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        heure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        heure.setForeground(new java.awt.Color(255, 255, 255));

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        modeOperation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        modeOperation.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modeOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heure, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modeOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButton11.setText("Deconnextion");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jButton11)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton11)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 643, 1083, -1));

        principal.setBackground(new java.awt.Color(255, 0, 204));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        boutonConnect.setText("Connect");
        boutonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonConnectActionPerformed(evt);
            }
        });

        userr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userr.setBorder(null);

        codee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        codee.setBorder(null);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ma");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nouveau compte");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Caisse");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Remix");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(0, 255, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("   ICI");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codee, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userr, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(boutonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(userr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(codee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(boutonConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.addTab("tab1", jPanel4);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        postA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        postA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postAActionPerformed(evt);
            }
        });

        nomA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomAActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("PRENOM    :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("POSTNOM :");

        preA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preAActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("NUMERO   :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("NOM            :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("+243");

        try {
            numA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        numA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adresse", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        quatA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Q  /");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("N°");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("C  /");

        bis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bis.setText("BIS");

        comA.setEditable(false);
        comA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comA.setText("LIMETE");

        avA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Av/");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(comA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(quatA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(avA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(nump, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bis)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(comA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(quatA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(avA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(bis)
                    .addComponent(nump, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel18.setBackground(new java.awt.Color(102, 153, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel18.setText("CODE          :");

        codeA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nomA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(codeA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nomA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(postA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(preA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(numA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(codeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        tab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "POSTNOM", "PRENOM", "TEL", "COMMUNE", "QUARTIER", "AVENUE", "NUMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("PRINT");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 204, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        bsave.setBackground(new java.awt.Color(0, 255, 102));
        bsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bsave.setText("+USER");
        bsave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Roblox Font", 1, 36)); // NOI18N
        jLabel19.setText("AJOUT CLIENT");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("RECHERCHE:");

        cherche.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chercheActionPerformed(evt);
            }
        });
        cherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chercheKeyReleased(evt);
            }
        });

        jButton10.setText("Retour");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton10)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addComponent(cacheFranc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cacheBilanFranc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel20)
                                            .addGap(4, 4, 4)
                                            .addComponent(cherche, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(cacheDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cacheBilanDollar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cacheBilanDollar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(cacheDollar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(cherche, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cacheFranc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cacheBilanFranc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jButton10)
                .addContainerGap())
        );

        javax.swing.GroupLayout ajoutClientLayout = new javax.swing.GroupLayout(ajoutClient);
        ajoutClient.setLayout(ajoutClientLayout);
        ajoutClientLayout.setHorizontalGroup(
            ajoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ajoutClientLayout.setVerticalGroup(
            ajoutClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.addTab("tab2", ajoutClient);

        jPanel10.setBackground(new java.awt.Color(153, 255, 153));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Roblox Font", 1, 36)); // NOI18N
        jLabel21.setText("OPerations");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        nom1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nom1.setBorder(null);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        mdp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mdp.setBorder(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Verification");

        boutonVerifierOperation.setBackground(new java.awt.Color(102, 255, 102));
        boutonVerifierOperation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boutonVerifierOperation.setText("VERIFIER");
        boutonVerifierOperation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonVerifierOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonVerifierOperationActionPerformed(evt);
            }
        });

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("PRENOM   :");

        pre1.setEditable(false);
        pre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("POSTNOM:");

        post1.setEditable(false);
        post1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pre1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(post1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(post1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(pre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator5)
                                .addGroup(jPanel19Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(boutonVerifierOperation))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(44, 44, 44)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22)
                    .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23)
                    .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonVerifierOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        valide.setBackground(new java.awt.Color(255, 255, 255));

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        franc.setEditable(false);
        franc.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        dollar.setEditable(false);
        dollar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("FC");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("$");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(franc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(45, 45, 45)
                .addComponent(dollar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(franc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dollar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faire Un", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        choixRetrait.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choixRetrait.setText("RETRAIT");
        choixRetrait.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choixRetrait.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choixRetraitMouseClicked(evt);
            }
        });

        choixDepot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choixDepot.setText("DEPOT");
        choixDepot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choixDepot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choixDepotMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choixDepot)
                .addGap(18, 18, 18)
                .addComponent(choixRetrait)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choixDepot)
                    .addComponent(choixRetrait))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Devise", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        choixFranc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choixFranc.setText("FRANC");
        choixFranc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choixFranc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choixFrancMouseClicked(evt);
            }
        });

        choixDollar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choixDollar.setText("DOLLAR");
        choixDollar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        choixDollar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choixDollarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choixFranc)
                .addGap(18, 18, 18)
                .addComponent(choixDollar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choixFranc)
                    .addComponent(choixDollar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Montant");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("TOTAL");

        boutonValiderOperation.setBackground(new java.awt.Color(0, 255, 102));
        boutonValiderOperation.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        boutonValiderOperation.setText("VALIDER");
        boutonValiderOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonValiderOperationActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout valideLayout = new javax.swing.GroupLayout(valide);
        valide.setLayout(valideLayout);
        valideLayout.setHorizontalGroup(
            valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valideLayout.createSequentialGroup()
                .addGroup(valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(valideLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(valideLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addGroup(valideLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel30))
                                    .addComponent(insert)))
                            .addGroup(valideLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel29))
                            .addGroup(valideLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(boutonValiderOperation))))
                    .addGroup(valideLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        valideLayout.setVerticalGroup(
            valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valideLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(valideLayout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(valideLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boutonValiderOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jButton9.setText("Retour");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel51.setText("pourcent Actuel Dol");

        jLabel52.setText("pourcent Actuel franc");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(344, 344, 344)
                .addComponent(jButton9)
                .addGap(39, 39, 39))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pourcDol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pourcFra, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bilanDoll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bilanFran, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGap(115, 115, 115)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pourcenttDol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pourcenttFran, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(pourcDol, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pourcFra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(bilanDoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bilanFran, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton9)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(pourcenttDol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pourcenttFran, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout operationLayout = new javax.swing.GroupLayout(operation);
        operation.setLayout(operationLayout);
        operationLayout.setHorizontalGroup(
            operationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        operationLayout.setVerticalGroup(
            operationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.addTab("tab3", operation);

        jPanel11.setBackground(new java.awt.Color(0, 204, 204));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Roblox Font", 1, 36)); // NOI18N
        jLabel31.setText("BILAN");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel31)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        nom3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nom3.setBorder(null);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        mdp2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mdp2.setBorder(null);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setText("Verification");

        jButton8.setBackground(new java.awt.Color(51, 204, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("VERIFIER");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("PRENOM   :");

        pre2.setEditable(false);
        pre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("POSTNOM:");

        post2.setEditable(false);
        post2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pre2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(post2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(post2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(pre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator9)
                                .addGroup(jPanel26Layout.createSequentialGroup()
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mdp2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(nom3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton8))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(44, 44, 44)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35)
                    .addComponent(nom3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36)
                    .addComponent(mdp2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOM", "PRENOM", "MOTIF", "SOLDE", "TOTAL", "DATE"
            }
        ));
        jScrollPane2.setViewportView(tab2);

        jPanel28.setBackground(new java.awt.Color(153, 204, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disponible", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        montantdollar.setEditable(false);
        montantdollar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel28.add(montantdollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, 70, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel40.setText("$");
        jPanel28.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 33, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel41.setText("FC");
        jPanel28.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 77, -1, -1));

        montantfranc.setEditable(false);
        montantfranc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel28.add(montantfranc, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 73, 70, -1));

        jPanel29.setBackground(new java.awt.Color(102, 153, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FRAIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fraisf.setEditable(false);
        fraisf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel29.add(fraisf, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 76, 93, -1));

        fraisd.setEditable(false);
        fraisd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel29.add(fraisd, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, 93, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel42.setText("$");
        jPanel29.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 33, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel43.setText("Fc");
        jPanel29.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 73, 35, 29));

        BoutonPrintù.setBackground(new java.awt.Color(51, 0, 153));
        BoutonPrintù.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoutonPrintù.setForeground(new java.awt.Color(255, 255, 255));
        BoutonPrintù.setText("PRINT");
        BoutonPrintù.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BoutonPrintù.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonPrintùActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout valide1Layout = new javax.swing.GroupLayout(valide1);
        valide1.setLayout(valide1Layout);
        valide1Layout.setHorizontalGroup(
            valide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, valide1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(valide1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(BoutonPrintù)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        valide1Layout.setVerticalGroup(
            valide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, valide1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(valide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(valide1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(valide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(valide1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BoutonPrintù, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );

        jButton1.setText("Retoir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(valide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valide1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bilanLayout = new javax.swing.GroupLayout(bilan);
        bilan.setLayout(bilanLayout);
        bilanLayout.setHorizontalGroup(
            bilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bilanLayout.setVerticalGroup(
            bilanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.addTab("tab4", bilan);

        jPanel31.setBackground(new java.awt.Color(0, 204, 204));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel46.setText("Ajout client");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel47.setText("Operation");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel48.setText("Bilan");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(323, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.addTab("tab4", menu);

        ajoutUser.setBackground(new java.awt.Color(153, 153, 153));

        jLabel32.setText("Nom d'utilisateur");

        jLabel33.setText("Code");

        jLabel34.setText("Commune");

        jLabel44.setText("%");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("$");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("FC");

        jButton2.setText("Sauvegarder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pourcentageDepot.setText("Depot");
        pourcentageDepot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pourcentageDepotActionPerformed(evt);
            }
        });

        pourcentageRetrait.setText("Retrait");
        pourcentageRetrait.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pourcentageRetraitActionPerformed(evt);
            }
        });

        jLabel53.setText("Pourcentage lors du ");

        javax.swing.GroupLayout ajoutUserLayout = new javax.swing.GroupLayout(ajoutUser);
        ajoutUser.setLayout(ajoutUserLayout);
        ajoutUserLayout.setHorizontalGroup(
            ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutUserLayout.createSequentialGroup()
                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajoutUserLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ajoutUserLayout.createSequentialGroup()
                                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(communeUtilisateur)
                                    .addComponent(nomUtilisateur, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(codeUtilisateur))
                                .addGap(118, 118, 118)
                                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pourcentageRetrait)
                                    .addComponent(pourcentageDepot)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ajoutUserLayout.createSequentialGroup()
                                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pourD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pourF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ajoutUserLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jButton2)))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        ajoutUserLayout.setVerticalGroup(
            ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutUserLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ajoutUserLayout.createSequentialGroup()
                        .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(ajoutUserLayout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pourcentageDepot)
                        .addGap(18, 18, 18)))
                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pourcentageRetrait))
                .addGap(38, 38, 38)
                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communeUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajoutUserLayout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(ajoutUserLayout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ajoutUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pourD, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(pourF)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(106, 106, 106))
        );

        principal.addTab("tab6", ajoutUser);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel50.setText("TON ONCLE");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        principal.addTab("tab7", jPanel6);

        jPanel1.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1080, 590));

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
dispose();       
    }//GEN-LAST:event_jLabel3MouseClicked

    private void boutonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonConnectActionPerformed
        try {
            Connexion(userr.getText(),codee.getText());
        userr.setText("");
        codee.setText("");
        } catch (Exception e) { JOptionPane.showMessageDialog(null,e.getMessage());
        }
 
    }//GEN-LAST:event_boutonConnectActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
principal.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void postAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postAActionPerformed

    }//GEN-LAST:event_postAActionPerformed

    private void nomAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomAActionPerformed

    }//GEN-LAST:event_nomAActionPerformed

    private void preAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preAActionPerformed

    }//GEN-LAST:event_preAActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
       
    }//GEN-LAST:event_tabMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      
    }//GEN-LAST:event_updateActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        try {
            String numpA=nump.getText();
     
        if(bis.isSelected()){
            numpA=numpA+" bis";
            enregistrementClient(nomA.getText(),postA.getText(), preA.getText(), numA.getText(), comA.getText(), quatA.getText(), avA.getText(), numpA, codeA.getText());
        
         String sv[] = {nomA.getText(),postA.getText(), preA.getText(), numA.getText(), comA.getText(), quatA.getText(), avA.getText(), numpA, codeA.getText()};
            DefaultTableModel model = (DefaultTableModel) tab.getModel();
            model.addRow(sv);
        
        }
        else{
            enregistrementClient(nomA.getText(),postA.getText(), preA.getText(), numA.getText(), comA.getText(), quatA.getText(), avA.getText(), numpA, codeA.getText());
        
        String sv[] = {nomA.getText(),postA.getText(), preA.getText(), numA.getText(), comA.getText(), quatA.getText(), avA.getText(), numpA, codeA.getText()};
            DefaultTableModel model = (DefaultTableModel) tab.getModel();
            model.addRow(sv);
        
        }
        compteDollar(nomA.getText(),postA.getText(), preA.getText(), "enregistrement", 0, 0, date.getText()+" "+heure.getText());
        compteFranc(nomA.getText(),postA.getText(), preA.getText(), "enregistrement", 0, 0,  date.getText()+" "+heure.getText());
        
        } catch (Exception e) { JOptionPane.showMessageDialog(null, ""+e.getMessage());
        }
        nomA.setText("");
        postA.setText("");
        preA.setText("");
        numA.setText("");
        comA.setText("");
        quatA.setText("");
        avA.setText("");
        nump.setText("");
        codeA.setText("");
        bis.setSelected(false);
    }//GEN-LAST:event_bsaveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void chercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chercheActionPerformed
        
    }//GEN-LAST:event_chercheActionPerformed

    private void chercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chercheKeyReleased
      
    }//GEN-LAST:event_chercheKeyReleased

    private void boutonVerifierOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonVerifierOperationActionPerformed
        try {
            verifCompte(nom1.getText(), mdp.getText());
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
        
    }//GEN-LAST:event_boutonVerifierOperationActionPerformed

    private void boutonValiderOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderOperationActionPerformed
        try {
   int mode=Integer.parseInt(modeOperation.getText());
   // prendre le pourcentage lors du depot
   if(mode==1){
       // depot
if(choixDepot.isSelected()){
   
    // dollar
    if(choixDollar.isSelected()){
          motif="depot";  // motif
          compte="Dollar";
         // recuperation du montant inserer
    montantInserer=Double.parseDouble(insert.getText());
    // voir si le montant inserer est superieur ou egal a 0
    if(montantInserer>0){
        
   
    // recuperation du montant actuel du compte
    double montantActuel=Double.parseDouble(dollar.getText());
    // somme
     nouveauMontant=montantInserer+montantActuel;
    //calcul pourcentage
    // pourcDol
    double pourc=Double.parseDouble(pourcDol.getText()); 
    double monPourcentage=  (nouveauMontant*(pourc/100)) ;
    nouveauMontant=nouveauMontant-monPourcentage;
    // si le nouveau montant est possible
    if(nouveauMontant>=1){
      depotDollar(nom1.getText(),post1.getText(), pre1.getText(), motif, montantInserer, nouveauMontant, date.getText()+" "+heure.getText());
     double pou=Double.parseDouble(pourcenttDol.getText()); 
     frais=monPourcentage;
      monPourcentage=monPourcentage+pou;
        prendrePourcDollar(monPourcentage, date.getText()+" "+heure.getText());
    // bilan
    // recuperaion du bilan actuel
    double montantBilanActuel=Double.parseDouble(bilanDoll.getText());
    // calcul du nouveau bilan
    double nouveauBilan=montantBilanActuel+nouveauMontant;
    // jeter tout ca dans la table bilanDollar
        AjoutBilanDollar(nouveauBilan, date.getText());
     // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
    }else{
        JOptionPane.showMessageDialog(null, "impossible de deposer "+nouveauMontant);
    }
    }
    // si c'est inferieur ou egal a 0
    else{
        JOptionPane.showMessageDialog(null, "Montant inserer est inferieur ou egal a 0");
    }
     }
    else if(choixFranc.isSelected()){
         motif="depot";// motif
         compte="Franc";
         // recuperation du montant inserer
     montantInserer=Double.parseDouble(insert.getText());
      // voir si le montant inserer est superieur ou egal a 0
    if(montantInserer>0){
        
    
    //recuperation du montant actuel du compte
    double montantActuel=Double.parseDouble(franc.getText());
    // somme
     nouveauMontant=montantInserer+montantActuel;
    // afichage du total
    total.setText(""+nouveauMontant);
    // jeter tout ca dans la table franc
    //calcul pourcentage
    // pourcDol
    double pourc=Double.parseDouble(pourcFra.getText()); 
    double monPourcentage=  (nouveauMontant*(pourc/100)) ;
    frais=monPourcentage;
    nouveauMontant=nouveauMontant-monPourcentage;
    // si le nouveau montant est possible
    if(nouveauMontant>=1){
    depotFranc(nom1.getText(),post1.getText(), pre1.getText(), motif, montantInserer, nouveauMontant, date.getText()+" "+heure.getText());
     double pou=Double.parseDouble(pourcenttFran.getText()); 
      monPourcentage=monPourcentage+pou;
        prendrePourcFranc(monPourcentage, date.getText()+" "+heure.getText());
   
    // bilan
    double montantBilanActuel=Double.parseDouble(bilanFran.getText());
    double nouveauBilan=montantBilanActuel+nouveauMontant;
        AjoutBilanFranc(nouveauBilan, date.getText());
        
         // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
 }
    }
    // si c'est inferieur ou egal a 0
    else{
        JOptionPane.showMessageDialog(null, "Montant inserer est inferieur ou egal a 0");
    }
    }
    else{
        JOptionPane.showMessageDialog(null, "Ton ONCLE !!!!!!!!!!");
    }
}
else if(choixRetrait.isSelected() ){
   // choix du compte dollar
      if(choixDollar.isSelected()){ 
          // recuperation du montant inserer
           montantInserer=Double.parseDouble(insert.getText());
          // recuperatino du montant actuel dans le compte
          double montantActuel=Double.parseDouble(dollar.getText());
          // calcul 
       nouveauMontant=montantActuel-montantInserer;
          // voir si c'est possiblr
          if(nouveauMontant>=0){
             motif="retrait";
             compte="Dollar";
              depotDollar(nom1.getText(),post1.getText(), pre1.getText(), motif, montantInserer, nouveauMontant, date.getText()+" "+heure.getText());
              double bilanActuel=Double.parseDouble(bilanDoll.getText());
              double nouveauBilan=bilanActuel-montantInserer;
              AjoutBilanDollar(nouveauBilan, date.getText()+" "+heure.getText());
          // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
          }
          
          
      } // choix du compte franc
      if(choixFranc.isSelected()){ 
          // recuperation du montant inserer
           montantInserer=Double.parseDouble(insert.getText());
          // recuperatino du montant actuel dans le compte
          double montantActuel=Double.parseDouble(franc.getText());
          // calcul 
           nouveauMontant=montantActuel-montantInserer;
          // voir si c'est possible
          if(nouveauMontant>=0){
              // bilan
             motif="retrait";
             compte="Franc";
              depotFranc(nom1.getText(),post1.getText(), pre1.getText(), motif, montantInserer, nouveauMontant, date.getText()+" "+heure.getText());
            double bilanActuel=Double.parseDouble(bilanFran.getText());
              double nouveauBilan=bilanActuel-montantInserer;
              AjoutBilanFranc(nouveauBilan, date.getText()+" "+heure.getText());
             // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
          }
          // choix du compte dollar
          
      }
      
    
    
}
else{
    JOptionPane.showMessageDialog(null, " Tu sais pas choisir ?? TO ONCLE \n depot ou retrait");
}
   }
   //---------------------------------------------------------------------------------------------------
   //---------------------------------------------------------------------------------------------------
   //---------------------------------------------------------------------------------------------------
   // prendre le pourcentage lors du retrait
   else if(mode==0){
       // choix du depot
 if(choixDepot.isSelected()){
    // choix du compte dollar
    if(choixDollar.isSelected()){
        // recuperation du montant inserer
         montantInserer=Double.parseDouble(insert.getText());
        // recuperation du montant actuel du compte
        double montantActuel= Double.parseDouble(dollar.getText());
        // addition
         nouveauMontant=montantActuel+montantInserer;
        // jeter dans la table dollar
        motif="depot";
        compte="Dollar";
        depotDollar(nom1.getText(),post1.getText(), pre1.getText(), motif, montantInserer, nouveauMontant, date.getText()+" "+heure.getText());
        // recuperation du bilan actuel
        double bilanActuel=Double.parseDouble(bilanDoll.getText());
        // calcul
        double nouveauBilan=montantInserer+bilanActuel;
        // jeter dans la table bilanDollar
        AjoutBilanDollar(nouveauBilan, date.getText()+" "+heure.getText());
         // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
    }
    // choix franc
    else if(choixFranc.isSelected()){
        // recuperation du montant inserer
         montantInserer=Double.parseDouble(insert.getText());
        // recuperation du montant actuel du compte
        double montantActuel= Double.parseDouble(franc.getText());
        // addition
         nouveauMontant=montantActuel+montantInserer;
        // jeter dans la table dollar
        motif="depot";
        compte="Franc";
        depotFranc(nom1.getText(),post1.getText(), pre1.getText(), motif, montantInserer, nouveauMontant, date.getText()+" "+heure.getText());
        // recuperation du bilan actuel
        double bilanActuel=Double.parseDouble(bilanFran.getText());
        // calcul
        double nouveauBilan=montantInserer+bilanActuel;
        // jeter dans la table bilanDollar
        AjoutBilanFranc(nouveauBilan, date.getText()+" "+heure.getText());
         // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
    }
    else{
        JOptionPane.showMessageDialog(null, "Veuillez selectionner une devise");
    }
 }
// POURCENTAGE AU RETRAIT
// choix retrait
 else if(choixRetrait.isSelected()){
  // choix dollar
  if(choixDollar.isSelected()){
      // recuperation du montant inserer
       montantInserer=Double.parseDouble(insert.getText());
      // recuperation du montant du compte
      double montantActuel=Double.parseDouble(dollar.getText());
      // soustraction
      double montant=montantActuel-montantInserer;
      // verification si c'est superieur a 0
      if(montant>=0){
          // on calcul maintenant le pourcentage
          // recuperation du pourcentage predefini par le gerant
          double pourcentage=Double.parseDouble(pourcDol.getText());
          // calcul du pourcentage
        double  pourcent=(montantInserer)*(pourcentage/100);
        frais=pourcent;
        // calcul du reste dans le compte
       double reste=montant-pourcent;
       // verifier si le reste est superieur ou egal a 0
       if(reste>=0){
           // depot dollar
           motif="retrait";
           compte="Dollar";
           nouveauMontant=montantInserer;
            depotDollar(nom1.getText(),post1.getText(), pre1.getText(), motif, nouveauMontant, reste, date.getText()+" "+heure.getText());
           // depot pourcentage
           prendrePourcDollar(pourcent, date.getText()+" "+heure.getText());
            // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
       }else{
           JOptionPane.showMessageDialog(null,"Solde "+reste+" \n Votre solde ne peut pas etre inferieur a 0");
       }
          
      }else{
          JOptionPane.showMessageDialog(null," operation impossible, verifiez votre solde");
      }
  }
  // choix franc
  else if(choixFranc.isSelected()){
       // recuperation du montant inserer
       montantInserer=Double.parseDouble(insert.getText());
      // recuperation du montant du compte
      double montantActuel=Double.parseDouble(franc.getText());
      // soustraction
      double montant=montantActuel-montantInserer;
      // verification si c'est superieur a 0
      if(montant>=0){
          // on calcul maintenant le pourcentage
          // recuperation du pourcentage predefini par le gerant
          double pourcentage=Double.parseDouble(pourcFra.getText());
          // calcul du pourcentage
        double  pourcent=(montantInserer)*(pourcentage/100);
        frais=pourcent;
        // calcul du reste dans le compte
       double reste=montant-pourcent;
       // verifier si le reste est superieur ou egal a 0
       if(reste>=0){
           // depot dollar
           motif="retrait";
           compte="Franc";
           nouveauMontant=montantInserer;
            depotFranc(nom1.getText(),post1.getText(), pre1.getText(), motif, nouveauMontant, reste, date.getText()+" "+heure.getText());
           // depot pourcentage
           prendrePourcFranc(pourcent, date.getText()+" "+heure.getText());
            // ----------------------------------------------------
     //-----------------------------------------------------
     // facture
     bHeight= Double.valueOf(itemName.size());
JOptionPane.showMessageDialog(rootPane, bHeight);
PrinterJob pj = PrinterJob.getPrinterJob();
pj.setPrintable(new BillPrintable(), getPageFormat(pj));
        try {
            pj.print();
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // fin facture ------------------------------
        //-----------------------------------------------------
       }else{
           JOptionPane.showMessageDialog(null,"Solde "+reste+" \n Votre solde ne peut pas etre inferieur a 0");
       }
          
      }else{
          JOptionPane.showMessageDialog(null," operation impossible, verifiez votre solde");
      }
  }
}
 // si ya aucun choix 
 else{
     JOptionPane.showMessageDialog(null, "Veuillez choisir une operation\nDepot ou Retrait");
 }

   }
// reinitialiser les champs
nom1.setText("");
mdp.setText("");
post1.setText("");
pre1.setText("");
franc.setText("");
dollar.setText("");
insert.setText("");
bilanDoll.setText("");
bilanFran.setText("");
total.setText("");
pourcenttDol.setText("");
pourcenttFran.setText("");
        } catch (Exception e) { e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_boutonValiderOperationActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        aficherBilanClient(nom3.getText(), mdp2.getText());
    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void BoutonPrintùActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonPrintùActionPerformed
//



    }//GEN-LAST:event_BoutonPrintùActionPerformed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
principal.setSelectedIndex(1);       
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
principal.setSelectedIndex(2);      
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
principal.setSelectedIndex(3);       
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
principal.setSelectedIndex(4);       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
principal.setSelectedIndex(4);        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
principal.setSelectedIndex(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
principal.setSelectedIndex(4);        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void choixDepotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choixDepotMouseClicked
choixRetrait.setSelected(false);
    }//GEN-LAST:event_choixDepotMouseClicked

    private void choixRetraitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choixRetraitMouseClicked
choixDepot.setSelected(false);
    }//GEN-LAST:event_choixRetraitMouseClicked

    private void choixFrancMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choixFrancMouseClicked
choixDollar.setSelected(false);
    }//GEN-LAST:event_choixFrancMouseClicked

    private void choixDollarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choixDollarMouseClicked
choixFranc.setSelected(false);
    }//GEN-LAST:event_choixDollarMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
if(evt.getClickCount()==6){
    as=true;
    principal.setSelectedIndex(6);
}
    }//GEN-LAST:event_jLabel6MouseClicked

    private void pourcentageDepotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pourcentageDepotActionPerformed
pourcentageRetrait.setSelected(false);
    }//GEN-LAST:event_pourcentageDepotActionPerformed

    private void pourcentageRetraitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pourcentageRetraitActionPerformed
pourcentageDepot.setSelected(false);
    }//GEN-LAST:event_pourcentageRetraitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String nom=nomUtilisateur.getText();
            String code=codeUtilisateur.getText();
            String commune=communeUtilisateur.getText();
            double pourcDollar=Double.parseDouble(pourD.getText());
            double pourcFranc=Double.parseDouble(pourF.getText());
            // si c'est lors du depot la valeur est 1
            if(pourcentageDepot.isSelected()){
                enregistrerUtilisateur(nom, code, commune, pourcDollar, pourcFranc, 1,date.getText());
                principal.setSelectedIndex(0);
            }
            // si c'est lors du retrait la valeur est 0
            else if(pourcentageRetrait.isSelected()){
                enregistrerUtilisateur(nom, code, commune, pourcDollar, pourcFranc, 0,date.getText());
                principal.setSelectedIndex(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Veuillez choisir le pourcentage lors du depot ou du retrait");
            }
            
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
principal.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        try {
            afficheBilan();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        try {
            fraisf.setText("");
            fraisd.setText("");
            montantdollar.setText("");
            montantfranc.setText("");
            afficheBilan();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jPanel11MouseExited

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
            java.util.logging.Logger.getLogger(fen0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fen0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fen0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fen0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fen0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonPrintù;
    private javax.swing.JPanel ajoutClient;
    private javax.swing.JPanel ajoutUser;
    private javax.swing.JTextField avA;
    private javax.swing.JPanel bilan;
    private javax.swing.JLabel bilanDoll;
    private javax.swing.JLabel bilanFran;
    private javax.swing.JRadioButton bis;
    private javax.swing.JButton boutonConnect;
    private javax.swing.JButton boutonValiderOperation;
    private javax.swing.JButton boutonVerifierOperation;
    private javax.swing.JButton bsave;
    private javax.swing.JLabel cacheBilanDollar;
    private javax.swing.JLabel cacheBilanFranc;
    private javax.swing.JLabel cacheDollar;
    private javax.swing.JLabel cacheFranc;
    private javax.swing.JTextField cherche;
    private javax.swing.JRadioButton choixDepot;
    private javax.swing.JRadioButton choixDollar;
    private javax.swing.JRadioButton choixFranc;
    private javax.swing.JRadioButton choixRetrait;
    private javax.swing.JTextField codeA;
    private javax.swing.JPasswordField codeUtilisateur;
    private javax.swing.JPasswordField codee;
    private javax.swing.JTextField comA;
    private javax.swing.JTextField communeUtilisateur;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dollar;
    private javax.swing.JTextField fraisd;
    private javax.swing.JTextField fraisf;
    private javax.swing.JTextField franc;
    private javax.swing.JLabel heure;
    private javax.swing.JTextField insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPasswordField mdp;
    private javax.swing.JPasswordField mdp2;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel modeOperation;
    private javax.swing.JTextField montantdollar;
    private javax.swing.JTextField montantfranc;
    private javax.swing.JTextField nom1;
    private javax.swing.JTextField nom3;
    private javax.swing.JTextField nomA;
    private javax.swing.JTextField nomUtilisateur;
    private javax.swing.JFormattedTextField numA;
    private javax.swing.JTextField nump;
    private javax.swing.JPanel operation;
    private javax.swing.JTextField post1;
    private javax.swing.JTextField post2;
    private javax.swing.JTextField postA;
    private javax.swing.JTextField pourD;
    private javax.swing.JTextField pourF;
    private javax.swing.JLabel pourcDol;
    private javax.swing.JLabel pourcFra;
    private javax.swing.JRadioButton pourcentageDepot;
    private javax.swing.JRadioButton pourcentageRetrait;
    private javax.swing.JLabel pourcenttDol;
    private javax.swing.JLabel pourcenttFran;
    private javax.swing.JTextField pre1;
    private javax.swing.JTextField pre2;
    private javax.swing.JTextField preA;
    private javax.swing.JTabbedPane principal;
    private javax.swing.JTextField quatA;
    private javax.swing.JTable tab;
    private javax.swing.JTable tab2;
    private javax.swing.JTextField total;
    private javax.swing.JButton update;
    private javax.swing.JTextField userr;
    private javax.swing.JPanel valide;
    private javax.swing.JPanel valide1;
    // End of variables declaration//GEN-END:variables
    // methode de connexion utilisateur
    public void Connexion(String nom, String code){
        try {
            ouverture();
            String req="select * from user where nom= '"+nom+"' and code= '"+code+"'  ";
            rs=st.executeQuery(req);
            while(rs.next()){
                String req1="select * from user where nom= '"+nom+"' and code= '"+code+"'  ";
                rs=st.executeQuery(req1);
                while(rs.next()){
                    int mode=rs.getInt("mode");
                    System.out.println(""+mode);
                    modeOperation.setText(""+mode);
                }
                principal.setSelectedIndex(4);
            }
            
            fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // methode d'enregistrement client
    public void enregistrementClient(String nom,String post,String pre,String num,String commune,String quartier,String avenue,String numero,String code){
        try {
            ouverture();
            String dat=date.getText()+heure.getText();
            String req="insert into client values ('"+nom+"','"+post+"','"+pre+"','"+num+"','"+commune+"','"+quartier+"','"+avenue+"','"+numero+"','"+code+"','"+dat+"')";
            st.executeUpdate(req);
            fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    // actualisation du compte dollar
    public void compteDollar(String nom, String post, String pre,String motif,double montant, double total,String date){
        try { ouverture();
        String req="insert into dollar values('"+nom+"','"+post+"','"+pre+"','"+motif+"','"+montant+"','"+total+"','"+date+"' )  ";
        st.executeUpdate(req);
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    // actualisation du compte franc
    public void compteFranc(String nom, String post, String pre,String motif,double montant, double total,String date){
        try { ouverture();
        String req="insert into franc values('"+nom+"','"+post+"','"+pre+"','"+motif+"','"+montant+"','"+total+"','"+date+"' )  ";
        st.executeUpdate(req);
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    // suppression
    public void supprimerClient(String nom, String postnom){
        try {
            ouverture();
            // suppression dans la table client
            String req="delete from client where nom='"+nom+"' and postnom='"+postnom+"'  ";
            st.executeUpdate(req);
            // suppression dans la table dollar
            String req1="delete from dollar where nom='"+nom+"' and postnom='"+postnom+"'  ";
            st.executeUpdate(req1);
            //suppression dans la table franc
            String req2="delete from franc where nom='"+nom+"' and postnom='"+postnom+"'  ";
            st.executeUpdate(req2);
            // recuperation de son argent dans le compte dollar
            String req3="select montant from dollar where nom='"+nom+"' and postnom='"+postnom+"' ";
            rs=st.executeQuery(req3);
            if(rs.next()){
                double dol=rs.getDouble("montant");
                cacheDollar.setText(""+dol);
            }
            
            // recuperation de son argent dans le compte franc
             String req4="select montant from franc where nom='"+nom+"' and postnom='"+postnom+"' ";
            rs=st.executeQuery(req3);
            if(rs.next()){
                double dol=rs.getDouble("montant");
                cacheFranc.setText(""+dol);
            }
             String req5="select montant from bilanDollar where 1";
            rs=st.executeQuery(req3);
            if(rs.next()){
                double dol=rs.getDouble("montant");
                cacheBilanDollar.setText(""+dol);
            }
             String req6="select montant from bilanfranc where 1";
            rs=st.executeQuery(req3);
            if(rs.next()){
                double dol=rs.getDouble("montant");
                cacheBilanFranc.setText(""+dol);
            }
            // calcul
            double calDol=Double.parseDouble(cacheBilanDollar.getText())-Double.parseDouble(cacheDollar.getText());
            double calFra=Double.parseDouble(cacheBilanFranc.getText())-Double.parseDouble(cacheFranc.getText());
            String dat=date.getText()+" "+heure.getText();
            String  req7="insert into bilanDollar values('"+calDol+"','"+dat+"'  ) ";
            String  req8="insert into bilanDollar values('"+calDol+"','"+dat+"'  ) ";
            st.executeUpdate(req7);
            st.executeUpdate(req8);
            fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage() );
        }
    }
    // verification client pour compte dollar et franc
    public void verifCompte(String nom, String code){
        try {
            ouverture();
            String req="select  * from client where nom='"+nom+"' and code='"+code+"'   ";
            rs=st.executeQuery(req);
            if(rs.next()){
               String prenom=rs.getString("prenom");
               String postn=rs.getString("postnom");
               post1.setText(postn);
               pre1.setText(prenom);
        String req0="select * from dollar where nom='"+nom+"' and postnom='"+postn+"'   ";
        rs=st.executeQuery(req0);
        while(rs.next()){
            double mont=rs.getDouble("total");
         dollar.setText(""+mont);
        }
         String req1="select * from franc where nom='"+nom+"' and postnom='"+postn+"'   ";
        rs=st.executeQuery(req1);
        while(rs.next()){ 
            double mont=rs.getDouble("total");
            franc.setText(""+mont);

        }
            }
            
           
            fermeture();
        } catch (Exception e) { e.printStackTrace();
        JOptionPane.showMessageDialog(null,e.getMessage() );
        }
    }
    // depot dollar
    public void depotDollar(String nom, String post, String pre,String motif,double montant, double total,String date){
         try { ouverture();
        String req="insert into dollar values('"+nom+"','"+post+"','"+pre+"','"+motif+"','"+montant+"','"+total+"','"+date+"' )  ";
        st.executeUpdate(req);
         String req1="select montant from bilanDollar where 1";
        rs=st.executeQuery(req1);
        while(rs.next()){
            double bilann=rs.getDouble("montant");
            bilanDoll.setText(""+bilann);
        }
        
         // prendre pourcentage Doll
        String req2="select montant from pourcentagedollar where 1";
        rs=st.executeQuery(req2);
        while(rs.next()){
            double valeur=rs.getDouble("montant");
            pourcenttDol.setText(""+valeur);
        }
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    // depot franc
    public void depotFranc(String nom, String post, String pre,String motif,double montant, double total,String date){
         try { ouverture();
        String req="insert into franc values('"+nom+"','"+post+"','"+pre+"','"+motif+"','"+montant+"','"+total+"','"+date+"' )  ";
        st.executeUpdate(req);
        String req1="select montant from bilanFranc where 1";
        rs=st.executeQuery(req1);
        while(rs.next()){
            double bilann=rs.getDouble("montant");
            bilanFran.setText(""+bilann);
        }
        
        // prendre pourcentage Doll
        String req2="select montant from pourcentagefranc where 1";
        rs=st.executeQuery(req2);
        while(rs.next()){
            double valeur=rs.getDouble("montant");
            pourcenttFran.setText(""+valeur);
        }
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    // ajout bilan dollar
    public void AjoutBilanDollar(double montant,String date){
        try {ouverture();
        String req="insert into bilandollar values ('"+montant+"','"+date+"')  ";
        st.executeUpdate(req);
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
     // ajout bilan frand
    public void AjoutBilanFranc(double montant,String date){
        try {ouverture();
        String req="insert into bilanfranc values ('"+montant+"','"+date+"')  ";
        st.executeUpdate(req);
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
  // affichage du pourcentage
    public void affichePourcentage(){
        try { ouverture();
            String req="select * from user where 1";
        rs=st.executeQuery(req);
        while(rs.next()){
            double pourcD=rs.getDouble("fraisDollar");
            double pourcF=rs.getDouble("fraisFranc");
            pourcDol.setText(""+pourcD);
            pourcFra.setText(""+pourcF);
        }
        
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // enregistrer le pourcentage dollar
    public void prendrePourcDollar(double montant, String date){
        try { ouverture();
            String req="insert into pourcentagedollar values('"+montant+"','"+date+"') ";
        st.executeUpdate(req);
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // enregistrer le pourcentage frand
    public void prendrePourcFranc(double montant, String date){
        try { ouverture();
            String req="insert into pourcentagefranc values('"+montant+"','"+date+"') ";
        st.executeUpdate(req);
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // enregistrement untilisteur dans la table user
    public void enregistrerUtilisateur(String nom,String code,String commune,double fraisDollar,Double fraisFranc,int mode,String date){
        try { ouverture();
            String req="insert into user values('"+nom+"','"+code+"','"+commune+"','"+fraisDollar+"','"+fraisFranc+"','"+mode+"','"+date+"') ";
            st.executeUpdate(req);
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // affichage bilan
    public void afficheBilan(){
        try { ouverture();
            String req="select * from pourcentageFranc where 1";
            rs=st.executeQuery(req);
            while(rs.next()){
                double montant=rs.getDouble("montant");
                fraisf.setText(""+montant);
            }
             String req1="select * from pourcentagedollar where 1";
            rs=st.executeQuery(req1);
            while(rs.next()){
                double montant=rs.getDouble("montant");
                fraisd.setText(""+montant);
            }
             String req2="select * from bilandollar where 1";
            rs=st.executeQuery(req2);
            while(rs.next()){
                double montant=rs.getDouble("montant");
                montantdollar.setText(""+montant);
            }
             String req3="select * from bilanfranc where 1";
            rs=st.executeQuery(req3);
            while(rs.next()){
                double montant=rs.getDouble("montant");
                montantfranc.setText(""+montant);
            }
        
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // afficher bilan du client
    public void aficherBilanClient(String nom,String code){
        try { ouverture();
            String req="select * from client where nom= '"+nom+"' and code= '"+code+"' ";
            rs=st.executeQuery(req);
            System.out.println("okk");
            while(rs.next()){
                String post=rs.getString("postnom");
                String preno=rs.getString("prenom");
                post2.setText(""+post);
                pre2.setText(""+preno);
                String req1="select * from dollar where nom= '"+nom+"' and postnom= '"+post+"'";
                rs=st.executeQuery(req1);
                System.out.println("okkkk");
                while(rs.next()){
                    String no=rs.getString("nom");
                    String pos=rs.getString("postnom");
                    String pre=rs.getString("prenom");
                    String mo=rs.getString("motif");
                    String mon=rs.getString("montant");
                    mon=mon+" $";
                    String tot=rs.getString("total");
                    tot=tot+" $";
                    String da=rs.getString("date");
                    
                     String sv[] = {no+" "+pos, pre, mo, mon,tot,da};
            DefaultTableModel model = (DefaultTableModel) tab2.getModel();
            model.addRow(sv);
                }
                
                //------------------------------------------------
                
                 String req2="select * from franc where nom= '"+nom+"' and postnom= '"+post+"' and prenom='"+preno+"'";
                rs=st.executeQuery(req2);
                System.out.println("okkkkkk");
                while(rs.next()){
                    String no=rs.getString("nom");
                    String pos=rs.getString("postnom");
                    String pre=rs.getString("prenom");
                    String mo=rs.getString("motif");
                    String mon=rs.getString("montant");
                    mon=mon+" fc";
                    String tot=rs.getString("total");
                    tot=tot+" fc";
                    String da=rs.getString("date");
                    
                     String sv[] = {no+" "+pos, pre, mo, mon,tot,da};
            DefaultTableModel model = (DefaultTableModel) tab2.getModel();
            model.addRow(sv);
                }
                
            }
        
        fermeture();
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage()); e.printStackTrace();
        }
    }

public PageFormat getPageFormat(PrinterJob pj){
   PageFormat pf= pj.defaultPage();
   Paper paper= pf.getPaper();
   
   double bodyHeight= bHeight;
   double headerHeight=5.0;
   double footerHeight=5.0;
   double width=cm_to_pp(8);
   double height=cm_to_pp(headerHeight+bodyHeight+footerHeight);
   paper.setSize(width, height);
   paper.setImageableArea(0, 10, width, height - cm_to_pp(1));
   
   pf.setOrientation(PageFormat.PORTRAIT);
   pf.setPaper(paper);
    
    return pf;
}


protected static double cm_to_pp(double cm){
    return toPPI(cm*0.393600787);
}
protected static double toPPI(double inch){
    return inch * 72d;
}


public class BillPrintable implements Printable{
    
    public int print(Graphics graphics, PageFormat pageFormat,int pageIndex)
        throws PrinterException
                {
        int r= itemName.size();
        ImageIcon icon= new ImageIcon("c:\\Users\\css");
        int result = NO_SUCH_PAGE;
        if(pageIndex==0){
            
            Graphics2D g2d=(Graphics2D) graphics;
            double width= pageFormat.getImageableWidth();
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY());
     
            try {
                
                int y=20;
                int yShift=10;
                int headerRectHeight=15;
                
                g2d.setFont(new Font("Monospaced", Font.PLAIN,9));
                g2d.drawImage(icon.getImage(), 50,20,90,30,rootPane);y+=yShift+30;
                g2d.drawString("----------------------------", 12, y);y+=yShift;
                g2d.drawString("    MA CAISSE REMIX 2.0", 12, y);y+=yShift;
                g2d.drawString("-------------", 12, y);y+=yShift;
                g2d.drawString("Nom : "+nom1.getText(), 12, y);y+=yShift;
                g2d.drawString("Post-nom : "+post1.getText(), 12, y);y+=yShift;
                g2d.drawString("Prenom : "+pre1.getText(), 12, y);y+=yShift;
                g2d.drawString("-----------------------------------------", 12, y);y+=yShift;
                g2d.drawString("Motif : "+motif, 12, y);y+=yShift;
                g2d.drawString("Compte : "+compte, 12, y);y+=yShift;
                g2d.drawString("montant : "+montantInserer, 12, y);y+=yShift;
               // g2d.drawString("montant : "+montantInserer, 12, y);y+=yShift;
               
                g2d.drawString("Frais : "+frais, 12, y);y+=yShift;
                g2d.drawString("Solde : "+nouveauMontant, 12, y);y+=yShift;
                g2d.drawString("Date : "+date.getText(), 12, y);y+=yShift;
                g2d.drawString("Heure : "+heure.getText(), 12, y);y+=yShift;
                
                g2d.drawString("-------------------------------------------------------------", 12, y);y+=yShift;
                g2d.drawString("Merci d'etre passé !!!", 12, y);y+=yShift;
                
                
                
            } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            result=PAGE_EXISTS;
        }return result;
    } 
    }
    



}
