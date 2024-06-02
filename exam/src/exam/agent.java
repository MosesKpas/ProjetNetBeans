package exam;

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.jdbc.*;
import java.sql.SQLException;

public class agent {

    //Ceci concerne la base de donnee
    private String url = "jdbc:mysql://localhost/upc";
    private String user = "root";
    private String pass = "";
    private Statement st;
    private Connection con;
    //les attributs de la classe agent
    String nom;
    String prenom;
    int age;
    int date;

    double calculSalaire(int nbHeure, double salaireDeBase) {
        return nbHeure * salaireDeBase;
    }

    String getnom(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        nom = JOptionPane.showInputDialog("nom");
        prenom = JOptionPane.showInputDialog("prenom");
        return "L'gent " + prenom + " " + nom + " bienvenue";
    }

    void ouverture() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = (Connection) DriverManager.getConnection(url, user, pass);
            System.out.println("oklm");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("pas oklm");
        }
    }

    void fermeture() {
        try {
            this.con.close();
            this.st.close();
            System.out.println("closed");
        } catch (SQLException e) {
            System.out.println("not close");
        }
    }

    void ajouterAjent(String nom, String prenom, int age, int hh) {
        try {
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
            date = hh;
            ouverture();
            this.st = (Statement) this.con.createStatement();
            String sql = "insert into agentt values('" + nom + "','" + prenom + "','" + age + "','" + hh + "')";
            this.st.executeUpdate(sql);
            fermeture();
            System.out.println("in");
        } catch (SQLException e) {
            System.out.println("pas de in");
        }
    }

}
