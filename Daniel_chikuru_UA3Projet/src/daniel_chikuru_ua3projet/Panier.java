
package daniel_chikuru_ua3projet;

import java.util.ArrayList;

public class Panier {
    Client Client;
    ArrayList<ElementPanier> listeElementPanier = new ArrayList<ElementPanier>();
    int numPanier;
    int num=0;   
      
 //le constructeur:
    public Panier(){}
    public Panier(Client Client){
        this.Client= Client;
    }
    public Panier(Client Client,ArrayList listeElementPanier){
        this(Client);
        this.listeElementPanier = listeElementPanier;
    }
    public Panier(Client Client,ArrayList listeElementPanier,int numPanier){
        this(Client,listeElementPanier);
        this.numPanier = numPanier;
    }
    public Panier(Client Client,ArrayList listeElementPanier, int numPanier,int num){
        this(Client,listeElementPanier,numPanier);
        this.num = num;
    }
    
    //Getter et Setter:
    public Client getClient(){
        return this.Client;
    }
    public void setClient(Client Client){
        this.Client = Client;
    }
    public ArrayList getListeElementPanier(){
        return this.listeElementPanier;
    }
    public void setListeElementPanier(ArrayList listeElementPanier){
        this.listeElementPanier = listeElementPanier;
    }
    public int getNumPanier(){
        return this.numPanier;
    }
    public void setNumPanier(int numPanier){
        this.numPanier = numPanier;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }
    //les methodes
    boolean j=false;
  /* ElementPanier rechercheElementPanier(Article a){
      if(!listeElementPanier.contains("a5")){
          this.j=true;
      } else {
          this.j=false;
        }
      return ;
  }*/

  
  
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


