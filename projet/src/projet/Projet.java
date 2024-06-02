package projet;
import java.awt.*;
import javax.swing.JOptionPane;

public class Projet {

    
    public static void main(String[] args) {
        charge c = new charge ();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
        
        try {
            for (int i = 0; i <=100; i++) {
                Thread.sleep(30);
                charge.pource.setText(Integer.toString(i)+"%");
                charge.chargement.setValue(i);
            }
            c.dispose();
            connect np = new connect();
            np.setVisible(true);
            np.setLocationRelativeTo(null);
            np.setResizable(true);
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur");
        }
    }
    
}
