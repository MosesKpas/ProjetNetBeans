
package daniel_chikuru_ua3projet;

public class Article {
    int reference;
    String designation;
    String couleur;
    double prixHT;
    double tauxTVA=13;
    
  //les constructeurs
    public Article(){}
    public Article(int reference){
        this.reference = reference;
    }
    public Article(int reference, String designation){
        this(reference);
        this.designation = designation;
    }
    public Article(int reference, String designation,String couleur){
        this(reference,designation);
        this.couleur = couleur;
    }
    public Article(int reference,String designation,double prixHT){
        this(reference,designation);
        this.prixHT =prixHT;
    }
    public Article(int reference, String designation,String couleur, double prixHT){
        this(reference,designation,couleur);
        this.prixHT = prixHT;
    }
   
  //Getter et Setter  
    public String getDesignation(){
        return this.designation;
    }
  //Methodes
    public void afficherArticle(){
         System.out.println("Article {" +
                ": Référence: " + reference + '\t' +
                ", Désignation: " + designation + '\t' +
                ",Couleur: " + couleur + '\t' +
                ",Prix HT: " + prixHT + '\t' +
                ",Le Prix TTC est: " + calculerPrixTTC() +
                '}');
    }
     double calculerPrixTTC(){
         double prixTTC=this.prixHT+(this.prixHT*this.tauxTVA/100);
         return prixTTC;
}
double p(int num){
    num=this.reference;
    return num;
}
   
}
