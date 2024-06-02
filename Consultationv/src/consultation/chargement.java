package consultation;

 //@author moise
 
public class chargement extends javax.swing.JFrame {


    public chargement() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/120130.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/120130.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Docteur.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 24, -1, -1));

        bar.setStringPainted(true);
        jPanel1.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 621, -1));

        txt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt.setText("j");
        jPanel1.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 453, 487, 31));

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

    public static void main(String args[]) throws Exception{
        chargement jo = new chargement();
        jo.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(50);
            jo.bar.setValue(i);
            
            if(i==0){
                jo.txt.setText("Consultation ");
            }
            else if(1==10){
                jo.txt.setText("Finished by:");
            }
            else if(i==25){
                jo.txt.setText("Chef du groupe:Mbelu");
            }
            else if(i==35){
                jo.txt.setText("Adjoint:Esongola");
            }
            else if(i==45){
                jo.txt.setText("Conseiller:Zamwiduko");
            }
            else if(i==55){
                jo.txt.setText("Adjoint:Mulumba");
            }
            else if(i==65){
                jo.txt.setText("Secretaire:Makopa");
            }
            else if(i==75){
                jo.txt.setText("Sous la responsabilite");
            }
            else if(i==85){
                jo.txt.setText("Doyen Musangu");
            }
        }
        jo.setVisible(false);
        jo.dispose();
        new connexion().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
