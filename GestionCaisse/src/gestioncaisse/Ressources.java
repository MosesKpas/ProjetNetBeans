package gestioncaisse;

//Importation
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Ressources {
    //
    private String url="jdbc:mysql://127.0.0.1:3306/caisse2",user="root",pass="";
    //
    private Connection con;
    //
    private Statement st;
    //
    void ouverture(){
        //
        try{
            Class.forName("con.mysql.jdbc.Driver");
            //
            this.con=(Connection) DriverManager.getConnection(url,user,pass);
            //
            System.out.println("ouverture");
            
        }catch(Exception e){
            //
            JOptionPane.showMessageDialog(null,e.getMessage());
            //
        }
        
    }
    void fermeture(){
        //
        try{
            //
            this.con.close();
            //
            this.st.close();
            System.out.println("fermeture");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }
    }
    
    
}
