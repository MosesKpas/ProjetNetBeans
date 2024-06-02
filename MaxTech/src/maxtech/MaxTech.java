package maxtech;

import javax.swing.JOptionPane;


public class MaxTech {

    
    public static void main(String[] args) {
        Charge b = new Charge ();
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        
        try {
            for (int i = 0; i <=100; i++) {
                Thread.sleep(30);
                Charge.pource.setText(Integer.toString(i)+"%");
                Charge.chargement.setValue(i);
            }
            b.dispose();
            utilisateur np = new utilisateur();
            np.setVisible(true);
            np.setLocationRelativeTo(null);
            np.setResizable(true);
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur");
        }
    }
    
}
