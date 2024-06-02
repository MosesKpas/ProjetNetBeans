package ma_caisse_final_version;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moses
 */
public class bilan extends javax.swing.JInternalFrame {

    private final String url = "jdbc:mysql://127.0.0.1:3306/caisse", user = "root", pass = "";
    private Statement st;
    private Connection con;

    void ouverture() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("ouvert");
        } catch (Exception e) {
            System.out.println("pas ouvert" + e);
        }
    }

    void fermeture() {
        try {
            this.con.close();
            this.st.close();
            System.out.println("fermer");
        } catch (Exception e) {
            System.out.println("pas fermer" + e);
        }
    }

    public bilan() {
        initComponents();
        valide.setVisible(false);
        Timer updateTimer;
        int play = 100;
        updateTimer = new Timer(play, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date cur = new Date();
                String FormatTimer = "hh:mm:ss";
                String FormatTimer2 = "dd/MM/yyyy";
                DateFormat as = new SimpleDateFormat(FormatTimer);
                DateFormat ase = new SimpleDateFormat(FormatTimer2);
                String a = as.format(cur);
                String b = ase.format(cur);
                heure.setText(a);
                date.setText(b);

            }
        });
        updateTimer.start();
        this.setBorder(null);
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mdp = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        post = new javax.swing.JTextField();
        valide = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        montantdollar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        montantfranc = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        fraisf = new javax.swing.JTextField();
        fraisd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BoutonPrintù = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roblox Font", 1, 36)); // NOI18N
        jLabel2.setText("BILAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        date.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        heure.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        heure.setForeground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_user_32px.png"))); // NOI18N

        nom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nom.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_password_32px.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        mdp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mdp.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Verification");

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("VERIFIER");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PRENOM   :");

        pre.setEditable(false);
        pre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("POSTNOM:");

        post.setEditable(false);
        post.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(mdp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "PRENOM", "MOTIF", "SOLDE", "TOTAL", "DATE"
            }
        ));
        jScrollPane1.setViewportView(tab);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Disponible", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        montantdollar.setEditable(false);
        montantdollar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel5.add(montantdollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("$");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 33, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("FC");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 77, -1, -1));

        montantfranc.setEditable(false);
        montantfranc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel5.add(montantfranc, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 73, 70, -1));

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FRAIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fraisf.setEditable(false);
        fraisf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel6.add(fraisf, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 76, 93, -1));

        fraisd.setEditable(false);
        fraisd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel6.add(fraisd, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, 93, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("$");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 33, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("Fc");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 73, 35, 29));

        BoutonPrintù.setBackground(new java.awt.Color(51, 0, 153));
        BoutonPrintù.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoutonPrintù.setForeground(new java.awt.Color(255, 255, 255));
        BoutonPrintù.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_print_24px.png"))); // NOI18N
        BoutonPrintù.setText("PRINT");
        BoutonPrintù.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BoutonPrintù.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonPrintùActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout valideLayout = new javax.swing.GroupLayout(valide);
        valide.setLayout(valideLayout);
        valideLayout.setHorizontalGroup(
            valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, valideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(valideLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(BoutonPrintù)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        valideLayout.setVerticalGroup(
            valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, valideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(valideLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(valideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(valideLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(BoutonPrintù, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 536, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(valide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valide, javax.swing.GroupLayout.PREFERRED_SIZE, 384, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        verifier_le_client(nom.getText(), mdp.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BoutonPrintùActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonPrintùActionPerformed
        // Pour imprimer:
        MessageFormat header = new MessageFormat("Bilan");
        MessageFormat footer = new MessageFormat("Merci d'avoir utiisé notre service");
        try {
            tab.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format(" erreur d'impression", e.getMessage());
        }
    }//GEN-LAST:event_BoutonPrintùActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonPrintù;
    private javax.swing.JLabel date;
    private javax.swing.JTextField fraisd;
    private javax.swing.JTextField fraisf;
    private javax.swing.JLabel heure;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField mdp;
    private javax.swing.JTextField montantdollar;
    private javax.swing.JTextField montantfranc;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField post;
    private javax.swing.JTextField pre;
    private javax.swing.JTable tab;
    private javax.swing.JPanel valide;
    // End of variables declaration//GEN-END:variables

    public void verifier_le_client(String NOM, String CODE) {
        try {
            ouverture();
            Statement stm = (Statement) con.createStatement();
            String sql = "select * from ajoutclient where NOM ='" + NOM + "' and code = '" + CODE + "'";
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                completer_le_postnom(NOM, CODE);
                completer_le_prenom(NOM, CODE);
                valide.setVisible(true);
                verf_franc(NOM, CODE);
                verf_dollar(NOM, CODE);
            } else {
                JOptionPane.showMessageDialog(this, "Oups!! \nNom ou Mot de passe incorrect");
                valide.setVisible(false);
                nom.setText("");
                mdp.setText(null);
                post.setText("");
                pre.setText("");
            }
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pas de verificatioin");
        }
    }

    public void verf_franc(String NOM, String CODE) {
        try {
            ouverture();
            Statement st = (Statement) con.createStatement();
            String sql = "select *from franc where nom='" +NOM+ "' and code='" + CODE + "' ";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Nom = rs.getString("nom");
                String PRENOM = rs.getString("prenom");
                String motif = rs.getString("motif");
                String solde = rs.getString("solde");
                solde = solde + " fc";
                String total = rs.getString("total");
                total = total + " fc";
                String date = rs.getString("date");
                String tdData[] = {Nom, PRENOM, motif, solde, total, date};
                DefaultTableModel tbModel = (DefaultTableModel) tab.getModel();
                tbModel.addRow(tdData);
            }
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void verf_dollar(String NOM, String CODE) {
        try {
            ouverture();
            Statement st = (Statement) con.createStatement();
            String sql = "select *from dollar where nom='" +NOM+ "' and code='" + CODE + "' ";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Nom = rs.getString("nom");
                String PRENOM = rs.getString("prenom");
                String motif = rs.getString("motif");
                String solde = rs.getString("solde");
                solde = solde + " $";
                String total = rs.getString("total");
                total = total + " $";
                String date = rs.getString("date");
                String tdData[] = {Nom, PRENOM, motif, solde, total, date};
                DefaultTableModel tbModel = (DefaultTableModel) tab.getModel();
                tbModel.addRow(tdData);
            }
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void completer_le_postnom(String Nom, String Code) {
        try {
            ouverture();
            this.st = (Statement) this.con.createStatement();
            String rech = "Select postnom from ajoutclient where nom='" + Nom + "' and code='" + Code + "'  ";
            ResultSet rs = this.st.executeQuery(rech);
            while (rs.next()) {
                String n = rs.getString("postnom");
                post.setText(n);
            }
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "non complet");
        }
    }

    public void completer_le_prenom(String Nom, String Code) {
        try {
            ouverture();
            this.st = (Statement) this.con.createStatement();
            String rech = "Select prenom from ajoutclient where nom='" + Nom + "' and code='" + Code + "' ";
            ResultSet rs = this.st.executeQuery(rech);
            while (rs.next()) {
                String n = rs.getString("prenom");
                pre.setText(n);
            }
            fermeture();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "non complet");
        }
    }
}
