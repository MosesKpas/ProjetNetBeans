/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.,,,
 */
package depotretrait;

import javax.swing.JOptionPane;

/**
 *
 * @author moise
 */
public class Depotretrait {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        float retrait,depot = 0,sdepot,sd,sdr;
        int choix,chxx = 0;
        do{
        choix=Integer.parseInt(JOptionPane.showInputDialog("Depot et Retrait\n\n 1.Depot\n 2.Retrait\n"));
        switch(choix){
            case 1:
                depot =Float.parseFloat(JOptionPane.showInputDialog("inserer un  montant"));
                JOptionPane.showMessageDialog(null,"vous avez deposez une somme de "+depot);
                chxx=Integer.parseInt(JOptionPane.showInputDialog("Continuer l'operation? \n\n 1.oui 0. non"));
                break;
            case 2:
                sdepot =depot/10;
                sd=depot-sdepot;
                retrait = Float.parseFloat(JOptionPane.showInputDialog("vous disposez de "+sd+"\n\n faire un retrait de combien?"));
                 if(retrait>sd){
                    JOptionPane.showMessageDialog(null,"Votre solde est insuffisant!!");
                    chxx=Integer.parseInt(JOptionPane.showInputDialog("Continuer l'operation? \n\n 1.oui 0. non"));
                }
                sdr=sd-retrait;
                JOptionPane.showMessageDialog(null,"vous avez effectuer un retrait de: "+retrait+"\n votre solde actuel est de: "+sdr);
                chxx=Integer.parseInt(JOptionPane.showInputDialog("Continuer l'operation? \n\n 1.oui 0. non"));             
            break;
                default:JOptionPane.showMessageDialog(null,"Pas d'option");
                chxx=Integer.parseInt(JOptionPane.showInputDialog("Continuer l'operation? \n\n 1.oui 0. non")); 
        }
        }while(chxx==1);
        JOptionPane.showMessageDialog(null,"Merci");
    }   
}
