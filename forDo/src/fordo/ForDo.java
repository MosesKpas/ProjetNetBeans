package fordo;

import javax.swing.JOptionPane;

/**
 * @author Moses
 */
public class ForDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age,mot_de_passe,choix_sexe;
        double taille;
        do{
        mot_de_passe = Integer.parseInt(JOptionPane.showInputDialog("Inserez le mot de passe"));
        if (mot_de_passe == 1234){
        age = Integer.parseInt(JOptionPane.showInputDialog("Candidature \nEntrez votre Age"));
        taille =Double.parseDouble(JOptionPane.showInputDialog("Specifiez votre taille"));
        
        choix_sexe =Integer.parseInt(JOptionPane.showInputDialog("Sexe\n 1.Masculin\n2.feminin"));
       
            if(age>=30 && age <=40 && taille >=175 && taille <=180  && choix_sexe ==1){
                JOptionPane.showMessageDialog(null,"Felicitations , vous etes engages");
            }
            else {
                JOptionPane.showMessageDialog(null,"Desole , vous ne remplissez pas les conditions ");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Mot de passe incorrect");
        }
        }while(mot_de_passe != 1234);
    }
    
}
