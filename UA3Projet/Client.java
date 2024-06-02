/*****************************************************************
 ** Nom & prénom : Écrire votre nom et prénom
 ** Numéro	: Écrire votre identifiant
 ** Date	: Écrire la date du jour
 ** Classe	: Écrire le nom de la classe
 *****************************************************************/
public class Client {
      identifiant;  // generer automatiquement
      nom;
      prenom;
      tel;
      codePostal;
      int num = 0; // Nombre des clients

    // Construteurs


    // Getter setter


// Les methodes

    public void afficherClient() {
        System.out.println("Client{" +
                "Identifiant='" + identifiant + '\'' +
                "Nom='" + nom + '\'' +
                ", Prenom='" + prenom + '\'' +
                ", Tel=" + tel +
                ", CodePostal=" + codePostal +
                '}');
    }
}

