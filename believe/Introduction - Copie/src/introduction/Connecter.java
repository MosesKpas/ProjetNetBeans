/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

import java.sql.*;

/**
 *
 * @author Devernay Mbala
 */
public class Connecter {
    static Connection con;
  static String prenombb;
    
    
    public Connecter(){
        prenombb = "";
}
    
    
    public static  Connection obtenirconnexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.err.println(e);
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/conseils_sante", "root", "");
        }catch(SQLException e){System.err.println(e);
        }
        System.out.println("Pilote de connexion réussi");
        return con;
    }
    
    
    
   //insertion des données
    public static void enregistrement (String Prenom, double Taille,double Poids,int Age,String Sexe,String Commune_habite,String Nom_utilisateur,String mot_passe){
        
    
    
    Connection co = Connecter.obtenirconnexion();
    
    try{
        String req = "INSERT INTO UTILISATEURS(Prenom, Taille, Poids, Age, Sexe, Commune_habite, Nom_utilisateur, mot_passe) Values('"+Prenom+"', "+Taille+","+Poids+" , "+Age+", '"+Sexe+"', '"+Commune_habite+"', '"+Nom_utilisateur+"', '"+mot_passe+"')";        
        Statement st = co.createStatement();
        
        st.executeUpdate(req);
        System.out.println("Insertion Ok");
        
    }catch(Exception e){
        e.printStackTrace();
        System.out.println("Probleme d'inser.");
    }
    
    }
    
    
    public static String connexion(String Nom_utilisateur, String mot_passe){
        
         Connection co = Connecter.obtenirconnexion();
         String mot_passebb="";
         
        try{
            String req1 = "select mot_passe from utilisateurs where nom_utilisateur='"+Nom_utilisateur +"' and mot_passe ='"+mot_passe+"'";
            String req2 = "select prenom from utilisateurs where nom_utilisateur='"+Nom_utilisateur +"' and mot_passe ='"+mot_passe+"'";
        
            Statement st = co.createStatement();
            ResultSet result = st.executeQuery(req1);
        
            while(result.next()){
                mot_passebb = result.getString("mot_passe");
      
            }
         result = st.executeQuery(req2);
        
        while(result.next()){
                prenombb = result.getString("prenom");
                
            }
        
         }catch(Exception e){
            e.printStackTrace();
            System.out.println("Probleme de connexion");
        }
        
        if(mot_passebb.equals(mot_passe)){
                return "OK";
        }
         else{
            return "ErreurConnexion";
         }
        
    }
    
    public static String mot_passe_oublie(String Nom_utilisateur, String Prenom, String Commune_habite){
        
        Connection co = Connecter.obtenirconnexion();
        String user_bb = "";
        String prenom_bb = "";
        String commune_bb = "";
        
        try{
            String req1 = "select nom_utilisateur from utilisateurs where nom_utilisateur = '"+Nom_utilisateur+"' and prenom = '"+Prenom+"' and commune_habite = '"+Commune_habite+"'";
            String req2 = "select prenom from utilisateurs where nom_utilisateur = '"+Nom_utilisateur+"' and prenom = '"+Prenom+"' and commune_habite = '"+Commune_habite+"'";
            String req3 = "select commune_habite from utilisateurs where nom_utilisateur = '"+Nom_utilisateur+"' and prenom = '"+Prenom+"' and commune_habite = '"+Commune_habite+"'";
            Statement st = co.createStatement();
            ResultSet result = st.executeQuery(req1);
        
            while(result.next()){
                 user_bb = result.getString(1);
                 
            }
            
            result = st.executeQuery(req2);
             while(result.next()){
                 prenom_bb = result.getString(1);
                 
            }
             
            result = st.executeQuery(req3);
             while(result.next()){
                 commune_bb = result.getString(1);
                 
            }
            
           
        
         }catch(Exception e){
            e.printStackTrace();
            System.out.println("informations non cohérentes");
        }
         if((user_bb.equals(Nom_utilisateur)) && (prenom_bb.equals(Prenom) ) && (commune_bb.equals(Commune_habite))) {
                return "OK";
        }
         else{
            return "ErreurConnexion";
         }
        
        
    
        
        
    }
    
    public static String mot_passe_change(String mot_passe, String nom_utilisateur, String prenom, String commune_habitee){
        Connection co = Connecter.obtenirconnexion();
        
        try{
            String req = "UPDATE Utilisateurs SET mot_passe = '" +mot_passe +"' WHERE nom_utilisateur = '"+nom_utilisateur+"' AND prenom = '"+prenom+"' AND commune_habite = '"+commune_habitee+"'";
            
        
            Statement st = co.createStatement();
            
        
            
                st.executeUpdate(req);
      
            
        
        
        
        
         }catch(Exception e){
            e.printStackTrace();
            System.out.println("Probleme de connexion");
        }
        
        
        
        
        
        return null;
        
        
    }
    
    public static String getPrenom(){
         return prenombb;
    }
    
    
    //verification
   /* public static void main(String arg[]){
        Connecter co = new Connecter();
        co.enregistrement("Joseph", 4.25, 80.2, 25, "Homme", "Kalamu", "JosBack", "Jos45");
    }
*/
    
    
        
    
}
