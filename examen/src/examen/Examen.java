
package examen;

import javax.swing.JOptionPane;


public class Examen {

    
    public static void main(String[] args) {
        int x=0;
        int y=0;
        try{
            x=Integer.parseInt(JOptionPane.showInputDialog("entrer a"));
          if(x!=-999){
              for(int i=0;i<x;i++){
                  y=i*x;
                  JOptionPane.showMessageDialog(null,"le doule de "+x+" vaut "+y);
              }
          }
          else{
              System.exit(0);
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"il fallait taper un nombre");
        }
    }
    
}
