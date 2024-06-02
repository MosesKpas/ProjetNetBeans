/*****************************************************************
 ** Nom & prénom : Écrire votre nom et prénom
 ** Numéro	: Écrire votre identifiant
 ** Date	: Écrire la date du jour
 ** Classe	: Écrire le nom de la classe
 *****************************************************************/
public class Article {
     reference;  // Doit etre saisie par l'utilisateur
    designation;
    couleur = "n/o"; // s'applique sur certain articles
    prixHT;
    tauxTVA = 13; //constante partagée au niveau de la classe Article


    // Constructeurs



    // Setter et Getter


//Les methodes

    // Afficher
    public void afficherArticle() {
        System.out.println("Article {" +
                ": Référence: " + reference + '\t' +
                ", Désignation: " + designation + '\t' +
                ",Couleur: " + couleur + '\t' +
                ",Prix HT: " + prixHT + '\t' +
                ",Le Prix TTC est: " + calculerPrixTTC() +
                '}');
    }


    // Calculer le Prix TTC calculerPrixTTC()




}