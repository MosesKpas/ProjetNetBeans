/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

/**
 *
 * @author hans hybani
 */
public class copyIntro {
    public static void main(String[]args){
        intro in = new intro();
        in.setVisible(true);
      
        try{
            for(int i=0; i<=100 ;i++){
              Thread.sleep(50);
             
            }
            connexion con = new connexion();
            con.setVisible(true);
            in.setVisible(false);
        
        }catch(Exception e){
    }
    }
    }
