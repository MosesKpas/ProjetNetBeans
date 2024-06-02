/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macaisse1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Anne
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int choix,chx,chxx=0;
         float depot = 0, retrait,sdepot, sd;
         do{
         choix=Integer.parseInt(JOptionPane.showInputDialog("Gestion \n\n 1.depot \n 2. retrait"));
         switch(choix){
             case 1:
                 depot = Float.parseFloat(JOptionPane.showInputDialog("Inserer un montan"));
                 JOptionPane.showMessageDialog(null,"vous avez fait un depot de :"+depot);
                 chxx=Integer.parseInt(JOptionPane.showInputDialog(" 1. continuer\n 2.fermer"));
             case 2:
                 sdepot =depot/10;
                 sd = depot -sdepot;
                 retrait= Float.parseFloat(JOptionPane.showInputDialog("vous disposez de :"+sd+"\n\n faire un retrait de combien?"));
                 chxx=Integer.parseInt(JOptionPane.showInputDialog(" 1. continuer\n 2.fermer"));
             default:
                 
                 
                 
         }
         }while(chxx==1);
         
        }
    
}
