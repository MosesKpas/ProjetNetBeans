package vente_l2_fasi;

/**
 *
 * @author Moses
 */
public class Achat {
    //Attributs
    
    String article;
    double prix,quantite;
    
    public double calculerTotal(){
        double  total=prix*quantite;
        return total;
    }
    
    public Achat(String a,double p,double q){
        article=a;
        prix =p;
        quantite= q;
    }
}
