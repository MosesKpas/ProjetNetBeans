
package ucc.projet;
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
public class enregistrement extends javax.swing.JFrame {
    
     private String url="jdbc:mysql://127.0.0.1:3306/uccprojet",user="root",pass="";
  private Statement st;
  private String requetteVerifier;
  private String requetteAide;
  private String requetteEnregisBilan;
  private String requetteInserer;
   private String requettedelete;
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


  
    public enregistrement() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        matri = new javax.swing.JComboBox<>();
        fac = new javax.swing.JComboBox<>();
        prom = new javax.swing.JComboBox<>();
        mail = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        lieu = new javax.swing.JTextField();
        motdepasse = new javax.swing.JTextField();
        dt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        dates = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("ENREGISTREMENT ");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 60));

        tab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "POSTNOM", "PRENOM", "FACULTE", "PROMOTION", "MATRICULE", "E-MAIL", " NUMERO"
            }
        ));
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 920, 460));

        cherche.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chercheKeyReleased(evt);
            }
        });
        jPanel1.add(cherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 70, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECHERCHE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(102, 153, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("MATRICULE");

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
        jLabel6.setText("FACULTE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("NOM:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("PROMOTION");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("E-MAIL");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("NUMERO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("LIEU DE NAISSANCE");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("DATE DE NAISSANCE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("MOT DE PASSE");

        matri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOUVEAU", "ANCIEN" }));
        matri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriActionPerformed(evt);
            }
        });

        fac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INFORMATIQUE", "MEDECINE", "DROIT", "ECONOMIE" }));

        prom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L1", "L2", "M1", "M2", "D1" }));

        mail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        num.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        motdepasse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        motdepasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motdepasseActionPerformed(evt);
            }
        });

        dt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(142, 142, 142)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(101, 101, 101)
                        .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(112, 112, 112)
                        .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(117, 117, 117)
                        .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGap(86, 86, 86)
                        .addComponent(prom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(95, 95, 95)
                        .addComponent(matri, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)
                        .addGap(126, 126, 126)
                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel11)
                        .addGap(112, 112, 112)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14)
                        .addGap(69, 69, 69)
                        .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lieu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addComponent(prom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8))
                    .addComponent(matri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(motdepasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 370, 460));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 31, -1, -1));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 89, 22));
        jPanel1.add(dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 538, 110, 14));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DATA");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 80, 30));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 80, 30));

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DEL");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 80, 30));

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PRINT");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 80, 30));

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("RETOUR");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 580, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chercheKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_chercheKeyReleased

    private void postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void motdepasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motdepasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motdepasseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String choixFac=(String)fac.getSelectedItem();
        String choixProm=(String)prom.getSelectedItem();
        String ChoixMat=(String)matri.getSelectedItem();
        
        //Informatique
        if(choixFac.equals("INFORMATIQUE") & choixProm.equals("L1") & ChoixMat.equals("NOUVEAU") ){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("INFORMATIQUE") & choixProm.equals("L2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("INFORMATIQUE") & choixProm.equals("M1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("INFORMATIQUE") & choixProm.equals("M2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("INFORMATIQUE") & choixProm.equals("D1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        //Medecine
        else if(choixFac.equals("MEDECINE") & choixProm.equals("L1") & ChoixMat.equals("NOUVEAU") ){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("MEDECINE") & choixProm.equals("L2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("MEDECINE") & choixProm.equals("M1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("MEDECINE") & choixProm.equals("M2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("MEDECINE") & choixProm.equals("D1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        //Droit
        else if(choixFac.equals("DROIT") & choixProm.equals("L1") & ChoixMat.equals("NOUVEAU") ){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("DROIT") & choixProm.equals("L2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("DROIT") & choixProm.equals("M1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("DROIT") & choixProm.equals("M2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("DROIT") & choixProm.equals("D1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        //Economie
        else if(choixFac.equals("ECONOMIE") & choixProm.equals("L1") & ChoixMat.equals("NOUVEAU") ){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("ECONOMIE") & choixProm.equals("L2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("ECONOMIE") & choixProm.equals("M1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("ECONOMIE") & choixProm.equals("M2") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        else if(choixFac.equals("ECONOMIE") & choixProm.equals("D1") & ChoixMat.equals("NOUVEAU")){
            save(nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText(),lieu.getText(),dt.getText(),motdepasse.getText());
            String sv[]={nom.getText(),post.getText(),pre.getText(),choixFac,choixProm,ChoixMat,mail.getText(),num.getText()};
        DefaultTableModel tableModel =(DefaultTableModel)tab.getModel();
        tableModel.addRow(sv);
        JOptionPane.showMessageDialog(null,"insrit a la faculte");
        }
        
            
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void matriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriActionPerformed

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
            java.util.logging.Logger.getLogger(enregistrement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enregistrement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enregistrement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enregistrement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enregistrement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cherche;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dates;
    private javax.swing.JTextField dt;
    private javax.swing.JComboBox<String> fac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lieu;
    private javax.swing.JTextField mail;
    private javax.swing.JComboBox<String> matri;
    private javax.swing.JTextField motdepasse;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField num;
    private javax.swing.JTextField post;
    private javax.swing.JTextField pre;
    private javax.swing.JComboBox<String> prom;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables

     public void save(String nom,String post,String pre,String choixFac,String choixProm,String ChoixMat,String mail,String num,String lieu,String da,String motdepasse){
        try{
            ouverture();
            this.st=(Statement)this.con.createStatement();
        String a="insert into inscrit value ('"+nom+"','"+post+"','"+pre+"','"+choixFac+"','"+choixProm+"','"+ChoixMat+"','"+mail+"','"+num+"','"+lieu+"','"+da+"''"+motdepasse+"')";
        this.st.executeUpdate(a);
        System.out.println("c'est bon");
        JOptionPane.showMessageDialog(null, "Inscription effectuer");
            fermeture();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
     }
}
