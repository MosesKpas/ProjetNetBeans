
package consultation;

// @author moise

public class diagnostique extends javax.swing.JFrame {
    /**
     * Creates new form diagnostique
     */
    public diagnostique() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mdt = new javax.swing.JCheckBox();
        vert = new javax.swing.JCheckBox();
        mdg = new javax.swing.JCheckBox();
        mdv = new javax.swing.JCheckBox();
        fiev = new javax.swing.JCheckBox();
        dia = new javax.swing.JCheckBox();
        toux = new javax.swing.JCheckBox();
        nqc = new javax.swing.JCheckBox();
        vom = new javax.swing.JCheckBox();
        yeu = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/docta.jpg"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rose", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 3, 14), new java.awt.Color(0, 51, 51))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel5.setText("Dites, comment vous sentez-vous ?");

        jLabel6.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel6.setText("Choisissez parmi ces symptomes...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SALLE DE DIAGNOSTIQUE");

        mdt.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        mdt.setText("MAUX DE TETE");

        vert.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        vert.setText("VERTIGE");

        mdg.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        mdg.setText("MAUX DE GORGE");

        mdv.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        mdv.setText("MAUX DE VENTRE");

        fiev.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        fiev.setText("FIEVRE");
        fiev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fievActionPerformed(evt);
            }
        });

        dia.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        dia.setText("DIARHEE");

        toux.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        toux.setText("TOUX");
        toux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                touxActionPerformed(evt);
            }
        });

        nqc.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        nqc.setText("NEZ QUI COULE");
        nqc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nqcActionPerformed(evt);
            }
        });

        vom.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        vom.setText("VOMISSEMENT");

        yeu.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        yeu.setText("YEUX JAUNE");
        yeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeuActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VERIFIER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ACCUEIL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mdg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(fiev, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mdv, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mdt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(toux, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(vom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(nqc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yeu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdg)
                    .addComponent(fiev))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mdv)
                    .addComponent(dia))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mdt)
                    .addComponent(toux))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vom)
                    .addComponent(nqc))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yeu)
                    .addComponent(vert))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txt.setEditable(false);
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txt.setRows(5);
        txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(121, 121, 121))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
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

    private void yeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yeuActionPerformed

    private void fievActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fievActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fievActionPerformed

    private void touxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_touxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_touxActionPerformed

    private void nqcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nqcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nqcActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //
        this.dispose();
        new accueil().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 
        
        if(mdg.isSelected()){
           txt.setText(" Il se peut que vous ayez une angine\n"+                  
                        "Eviter de prendre des aliments chauds ou boissons froides"
                   + "\n, privilégier plus la consomation d'aliment chaud ou boisson"
                   + "\n chaude pour éviter cela.\n" +
                        "Rendez-vous dans l'un des centres le plus proche\n" +
                        "L'auto-médication n'est pas une bonne chose\n" +
                        "N'oubliez pas votre santé, notre priorité");
        }
        if(mdv.isSelected()){
            txt.setText("Il se peut que vous ayez des levures"
                        + "Rendez-vous dans l'un des centres le plus proche de vous.\n"
                        + "L'auto-médication n'est pas une bonne chose \n"
                        + "N'oubliez pas votre santé, notre priorité");
        }
        if (mdt.isSelected()){
            txt.setText( "Vous avez peut-etre été éxposé trop longtemps aux rayon solaire \n"
                    + "Mais cela peut etre aussi un stress non modéré, ou un manque de sommeil \n"
                    + "Rendez-vous dans l'un des centres le plus proche de vous.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if (vom.isSelected()){
            txt.setText("Une consomation non modérée d'une boisson alcoolique peut aboutir à une tel cause ou une suralimentation \n"
                    + "Voir meme la consomation d'aliment périmé \n"
                    + "Cela peut etre aussi due à une grossese si vous etes une femme \n"
                    + "Rendez-vous dans l'un des centres le plus proche de vous. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if (yeu.isSelected()){
            txt.setText("Ce cas de figure est souvent associer à une fièvre jaune car un jaunissement pareil \n "
                    + "Ne peut etre que la cause de cette bacterie, pour ce faire \n"
                    + "Rendez-vous dans l'un des centres le plus proche de vous. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if (fiev.isSelected()){
            txt.setText("Une fievre est la reaction de notre organisme due à la présence d'un corps étranger \n"
                    + "un allergène, un parasite ou encore un virus \n"
                    + "Pour ce faire Rendez-vous dans l'un des centres le plus proche de vous.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if (dia.isSelected()){
            txt.setText("Une diarhee est provoqué lorsque le cycle digéstif connait une pértubation, \n"
                    + "cette pérturbation peut etre due à : "
                    + "Un aliment non frais ou une bactérie qui trouble le système digestif. \n"
                    + "Pour ce faire Rendez-vous dans l'un des centres le plus proche de vous. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if(mdt.isSelected()&&fiev.isSelected()&&vert.isSelected()){
            txt.setText("Maladie Algorithmique!!!!!\n"
                    + "Vous etes probablement un informaticien a L'UPC"
                    + "\net vous etes atteint de l'Algoritmique Sanctimus\n"
                    + "Il faut essayer de vous reposer!\n"
                    + "ou sinon c'est la mort garentie!");
        }
        if (toux.isSelected()){
            txt.setText("Une toux,sec ou grasse est due à plusieurs facteurs, Mais ce qui est sur est  c'est une irritation, \n"
                    + "Due à une exposition aux aliments trop froid ou à un climat trop froid ou une grippe qui s'annonce \n"
                    + "Pour ce faire Rendez-vous dans l'un des centres le plus proche de vous.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if (nqc.isSelected()){
            txt.setText("Une perte de muquese nazale est le signe d'un rhume, pouvant survenir lors d'une trop longue exposition à des températures basse \n"
                    + "Pour ce faire Rendez-vous dans l'un des centres le plus proche de vous. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if (vert.isSelected()){
            txt.setText("Un vertige est due à une anomalie dans notre systeme vestibulaire,\n"
                    + "La partie de l'oreil interne qui assure la fonction de l'équilibre\n"
                    + "Pour ce faire Rendez-vous dans l'un des centres le plus proche de vous.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité");
        }
        if(mdg.isSelected()&&nqc.isSelected()&&toux.isSelected()){
            txt.setText("Vous avez une grippe \n"
                        + "Mais en ces temps de covid 19 Nous ne sommes jamais assez prudent, \n"
                        + "Pour ce faire Rendez-vous dans l'un des centres le plus proche de vous. \n"
                        + "L'auto-médication n'est pas une bonne chose \n"
                        + "Votre santé, notre priorité");
        }
        if(mdt.isSelected()&&fiev.isSelected()&&toux.isSelected()){
            txt.setText("Attention au covid!\n"
                    + "Vous avez des smptomes qui indiquent que la covid n'est pas \n"
                    + "aussi loin de vous!\n"
                    + "Que faire?. Au plus vite, aller faire un test dans un centre 'n"
                    + "beaucoup se reposer, se mettre en quarentaine et ca va passer!\n"
                    + "Merci");
        }
        if(vert.isSelected()&&vom.isSelected()&&mdt.isSelected()&&fiev.isSelected()){
            txt.setText("Vous avez la malaria \n"
                        + "Vous avez sans doute été époser à des moustiques, \n"
                        + "Afin de prévénir des futurs cas dormez sous une moustiquaire,\n"
                        + "Mais pour le moment Rendez-vous dans l'un des centres le plus proche de vous.\n"
                        + "L'auto-médication n'est pas une bonne chose \n"
                        + "N'oubliez pas votre santé, notre priorité");
        }
        if(mdt.isSelected()&&nqc.isSelected()&&fiev.isSelected()&&vert.isSelected()&&vom.isSelected()&&toux.isSelected()&&mdg.isSelected()&&yeu.isSelected()&&dia.isSelected()&&mdv.isSelected()){
            txt.setText("Shilooooo!!! Mais pourquoi etre malade jusqu'a ce point la?"
                        + "\nVous etes probablement proche de la mort!\n"
                        + "Reposez-vous jusqu'a ce que la mort passera chez vous"
                        + "\nMerci ");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new diagnostique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox dia;
    private javax.swing.JCheckBox fiev;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox mdg;
    private javax.swing.JCheckBox mdt;
    private javax.swing.JCheckBox mdv;
    private javax.swing.JCheckBox nqc;
    private javax.swing.JCheckBox toux;
    private javax.swing.JTextArea txt;
    private javax.swing.JCheckBox vert;
    private javax.swing.JCheckBox vom;
    private javax.swing.JCheckBox yeu;
    // End of variables declaration//GEN-END:variables
}