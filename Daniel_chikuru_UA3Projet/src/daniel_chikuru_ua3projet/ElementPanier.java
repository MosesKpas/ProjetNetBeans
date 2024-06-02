
package daniel_chikuru_ua3projet;

import java.util.Scanner;


public class ElementPanier {
    Scanner sc = new Scanner(System.in);
    Article article;
    int qteAticle=0;
    
public void afficherElementPanier(){
    this.article.afficherArticle();
    System.out.println("Quantite est :" +qteAticle);
}
int ajouterQuantite(int quantite){
    int qte=0;
    return qte;
}
public Article getArticle(){
    return this.article;
}
public void setArticle(Article article){
    this.article = article;
}
public int getQteArticle(){
    return this.qteAticle;
}
public void setQteArticle(int qteArticle){
    this.qteAticle = qteArticle;
}

}
