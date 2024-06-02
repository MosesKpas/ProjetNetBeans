
package art;

public class Article {
    int code;
    String designation;
    double prixHT;
    double tauxTVA=13;
    
  //les constructeurs
    public Article(){}
    public Article(int reference){
        this.code = reference;
    }
    public Article(int reference, String designation){
        this(reference);
        this.designation = designation;
    }

    public Article(int reference,String designation,double prixHT){
        this(reference,designation);
        this.prixHT =prixHT;
    }
   
  //Getter et Setter  
    public String getDesignation(){
        return this.designation;
    }
  //Methodes
    @Override
    public String toString(){
         System.out.println("Article {" +
                ": Référence: " + code + '\t' +
                ", Désignation: " + designation + '\t' +
                ",Prix HT: " + prixHT + '\t' +
                ",Le Prix TTC est: " + calculerPrixTTC() +
                '}');
         return "";
    }
     double calculerPrixTTC(){
         double prixTTC=this.prixHT+(this.prixHT*this.tauxTVA/100);
         return prixTTC;
}
double p(int num){
    num=this.code;
    return num;
}
   
}
