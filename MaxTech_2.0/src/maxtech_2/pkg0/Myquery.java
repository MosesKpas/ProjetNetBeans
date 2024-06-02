/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxtech_2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Myquery {
    
    public Connection getConnection(){
        Connection con = null ;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/maxtech2.0", "root", "");
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }
      
        return con;
    }
    
    public ArrayList<Product> BindTable(){
        
   ArrayList<Product> list = new ArrayList<Product>();
   Connection con = getConnection();
   Statement st;
   ResultSet rs;
   
   try {
   st = (Statement) con.createStatement();
   rs = st.executeQuery("SELECT `code`, `nom`, `prix`, `qte`, `image` FROM `produit`");
   
   Product p;
   while(rs.next()){
   p = new Product(
   rs.getString("code"),
   rs.getString("nom"),
   rs.getInt("prix"),
   rs.getInt("qte"),
   rs.getBytes("image")
   );
   list.add(p);
   }
   
   } catch (SQLException ex) {
       Logger.getLogger(Myquery.class.getName()).log(Level.SEVERE, null, ex);
   }
   return list;
   }
    
}
