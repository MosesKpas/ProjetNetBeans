package exam;

public class cadre extends agent{
    String grade;
    double prime;
    

    double calculSalaire(int heure, double salaire,double pr) {
        prime =pr;
        return super.calculSalaire(heure, salaire) + pr;
    }

    
}
