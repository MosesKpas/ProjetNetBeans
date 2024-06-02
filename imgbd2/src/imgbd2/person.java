package imgbd2;


public class person {
    private String matricule;
    private String prenom;
    private String nom;
    private byte[] picture;
    
    public person(String pmatricule, String pprenom, String pnom, byte [] img){
        this.matricule = pmatricule;
        this.prenom = pprenom;
        this.nom = pnom;
        this.picture = img;
    }
    
    public String getMatricule(){
        return matricule;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getNom(){
        return nom;
    }
    public byte[] getPicture(){
        return picture;
    }
     
}
