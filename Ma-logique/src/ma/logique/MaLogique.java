
package ma.logique;

import javax.swing.JOptionPane;

public class MaLogique {

  
    public static void main(String[] args) {
        float a=0,b=0;
        float c=0,d=0,d1=0;
        float r=0;
        JOptionPane.showMessageDialog(null,"La nouvelle facon de diviser");
        a=Float.parseFloat(JOptionPane.showInputDialog("inserer la valeure de A"));
        b=Float.parseFloat(JOptionPane.showInputDialog("Inserer la cvaleure de B"));
        JOptionPane.showMessageDialog(null,"Vous avez inserer "+a+"/"+b);
        c=b-a;
        JOptionPane.showMessageDialog(null,"la difference donne "+c);
        d=a/c;
        d1=b/c;
        r=d/d1;
        JOptionPane.showMessageDialog(null,"Le resultat de cette division donne "+r);
        
        
    }
    
}
