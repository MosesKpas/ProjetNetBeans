package ma_caisseremix;
/**
 * Ma Caisse
 * @author G5 PROGS 
 * Kapend  Moise
 * Ntumba  Sephora
 * Nyota Falonne
 * Kamuanya Tabitha
 */
public class Chargement extends javax.swing.JFrame {
    public Chargement() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("a Angkatan Bersenjata", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ma caisse");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 19, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ma_caisseremix/Images/depositphotos_6516995-stock-photo-cash-register-drawer-horizontal.jpg"))); // NOI18N

        txt.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N

        bar.setForeground(new java.awt.Color(0, 0, 0));
        bar.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception{
        Chargement jo = new Chargement();
        jo.setVisible(true);
        for (int i=0; i<=100; i++) {
            Thread.sleep(150);
        jo.bar.setValue(i);
        if(i==0){
               
                jo.txt.setText("Finished By G5 PROGS");
            }
            else if(i==15){
                jo.txt.setText("Gestion de la caisse");
            }
            else if(i==25){
                jo.txt.setText("Avec la participation:");
            }
            else if(i==30){
                jo.txt.setText("   -Chef du groupe: KAPEND MOISE ");
            }
            else if(i==40){
                jo.txt.setText("   -Secretaire: NTUMBA SEPHORA");
            }
            else if(i==50){
                jo.txt.setText("   -Adjoint: NYOTA  FALONNE ");
            }
            else if(i==60){
                jo.txt.setText("   -Conseillere: KAMUANYA TABITHA");
            }
            else if(i==70){
                jo.txt.setText("    -Adjoint : DIAKANUA  JEAN-CLAUDE");
            }
            else if(i==80){
                jo.txt.setText("Sous la responsabilite:  ");
            }
            else if(i==90){
                jo.txt.setText("  Du Doyen MUSANGU");
            }
        }
        jo.setVisible(false);
        jo.dispose();
        new Authentification().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
