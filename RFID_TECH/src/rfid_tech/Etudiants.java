package rfid_tech;

/**
 *
 * @author moise
 */
public class Etudiants {
    private String matricule;
    private String prenom;
    private String nom;
    private byte[] image;
    
    public Etudiants(String pmatricule, String pprenom, String pnom, byte [] img){
        this.matricule = pmatricule;
        this.prenom = pprenom;
        this.nom = pnom;
        this.image = img;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public byte[] getPicture() {
        return image;
    }
    
}
