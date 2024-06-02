/*****************************************************************
 ** Nom & prénom : Écrire votre nom et prénom
 ** Numéro	: Écrire votre identifiant
 ** Date	: Écrire la date du jour
 ** Classe	: Écrire le nom de la classe
 *****************************************************************/


import java.util.ArrayList;

public class Panier {
        client;
    ArrayList<ElementPanier> listeElementPanier = new ArrayList<ElementPanier>();  // liste article
   numPanier; // Numero automatique du panier
  num = 0; // Nombre des paniers


    // Constructeur


    // Getter et Setter


    //Les methodes

    // xxx  rechercherArticle retourn 0 si pas d'article et retourn ne nombre des articles si existe
   // rechercherArticle(Article a)




// rechercherElementPanier(Article a)




    //  ajouter un article
    //ajouterArticle(Article a, int qte)





    // supprimer  un article
 // supprimerArticle(Article a)







    // modifier Quantite un article
    //  modifierQuantiteArticle(Article a , int qte)






    // retourner le montant d'un panier
    //getMontantPanier()





    // vider le panier
    //viderPanier()






    // xxxxafficher le panier
    public void afficherPanier() {
        System.out.println("------------------------- Panier -----------------------------");
        if (this.listeElementPanier.size() == 0)
            System.out.println("** Le panier numero "+this.getNumPanier()+"  est Vide **");
        else {
            System.out.println("** Le panier numero "+this.getNumPanier()+"  contient les articles suivants : **");
            for (int i = 0; i < listeElementPanier.size(); i++) {
                listeElementPanier.get(i).getArticle().afficherArticle();
                System.out.println("  Quantite : " + listeElementPanier.get(i).getQteArticle());
            }
        }
    }





}


