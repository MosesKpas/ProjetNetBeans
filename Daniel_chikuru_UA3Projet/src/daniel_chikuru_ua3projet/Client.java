package daniel_chikuru_ua3projet;

public class Client {
    int identifiant;
    String nom;
    String prenom;
    String tel;
    String codePostal;
    int num;
    
    //le costructeur
public Client(){}
public Client( String nom){
    this.nom = nom;
}
public Client(String nom,String prenom){
    this(nom);
    this.prenom = prenom;
}
public Client( String nom,String prenom,String tel){
    this( nom, prenom);
    this.tel = tel;
}
public Client(String nom,String prenom,String tel,String codePostal){
    this(nom,prenom,tel);
    this.codePostal = codePostal;
}
public Client(String nom,String prenom,String tel,String codePostal,int num){
    this(nom, prenom, tel, codePostal);
    this.num = num;
}

//Getter et Setter:
public int getIdentifiant(){
    return this.identifiant;
}
public void setIdentifian(int identifiant){
    this.identifiant = identifiant;
}
public String getNom(){
    return this.nom;
}
public void setNom(String nom){
    this.nom = nom;
}
public String getPrenom(){
    return this.prenom;
}
public void setPrenom(String prenom){
    this.prenom = prenom;
}
public String getTel(){
    return this.tel;
}
public void setTel(String tel){
    this.tel = tel;
}
public String getCodePostal(){
    return this.codePostal;
}
public void setCodePostal(String codePostal){
    this.codePostal = codePostal;
}
public int getNum(){
    return this.num;
}
public void setNum(int num){
    this.num = num;
}

//methodes
    public void afficherClient(){
        System.out.println("Client ("+
                "Identifiant ='"+identifiant+'\''+
                "Nom ='"+nom+'\''+
                ", Prenom='"+prenom +'\''+
                ", Tel='"+tel+
                ", CodePostal="+codePostal+
                ')');        
}
}


