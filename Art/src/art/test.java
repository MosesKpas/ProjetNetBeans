package art;

/**
 * @author moise
 */
public class test {
    public static void main(String[] args) {
        System.out.println("-----------------------main : Article-----------------------");
        Article a1 = new Article();
        Article a2 = new Article(2,"a2",6);
        Article a4 = new Article(4,"a4",4);        
        a1.toString();
        a2.toString();
        a4.toString();  
        System.out.println("--calculerPrixTTC  :"+a4.calculerPrixTTC());
    }
    
}
