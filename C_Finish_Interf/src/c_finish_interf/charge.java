package c_finish_interf;

/**
 * @author Moses
 */
public class charge extends javax.swing.JFrame {

    public charge() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bar.setForeground(new java.awt.Color(0, 0, 0));
        bar.setBorderPainted(false);
        bar.setStringPainted(true);
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 534, 1000, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/charge.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) throws Exception{
       charge jo = new charge();
       jo.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            jo.bar.setValue(i);
            Thread.sleep(10);
        }
        jo.setVisible(false);
        jo.dispose();
        new user().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
