package tp_algorithme;
/***************************
 * NOM:     KAPEND         * 
 * POSTNOM: MBAV           *
 * PRENOM:  MOISE          *
 *      L2 FASI            * 
 * *************************
 
/**
 * @author Moses
 */
import java.util.Scanner;
public class TP_Algorithme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition en Hexadecimal\n----------------------------\n");
        System.out.println("Entrer la taille max");
        int longeur =sc.nextInt();
        //les tableaux
        int tableau[]= new int[longeur+1];
        int tableau1[]= new int[longeur];
        int tableau2[]= new int[longeur];
        String tableau3[]= new String[longeur+1];
        int reste[]=new int[1];
        reste[0]=1;
        int restes[]=new int[1];
        restes[0]=0;
        //fin tableaux
        int reponse;
        String valeur="";
        
        //Remplire le premier tableau
        for (int i = 0; i <=longeur-1; i++) {
            System.out.print("\nValeurs de A"+i+": ");
            valeur=sc.next();
            if(valeur.equals("a")||valeur.contains("A")){
                tableau1[i]=10;
            }
            else if(valeur.equals("b")||valeur.contains("B")){
                tableau1[i]=11;}
           
            else if(valeur.equals("c")||valeur.contains("C")){
                tableau1[i]=12;
           }
            else if(valeur.equals("d")||valeur.contains("D")){
                tableau1[i]=13;
           }
            else if(valeur.equals("e")||valeur.contains("E")){
                tableau1[i]=14;
           }
            else if(valeur.equals("f")||valeur.contains("F")){
                tableau1[i]=15;
           }
            else if(valeur.equals("0")){
                tableau1[i]=0;
           }
            else if(valeur.equals("1")){
                tableau1[i]=1;
           }
            else if(valeur.equals("2")){
                tableau1[i]=2;
           }
            else if(valeur.equals("3")){
                tableau1[i]=3;
           }
            else if(valeur.equals("4")){
                tableau1[i]=4;
           }
            else if(valeur.equals("5")){
                tableau1[i]=5;
           }
            else if(valeur.equals("6")){
                tableau1[i]=6;
           }
            else if(valeur.equals("7")){
                tableau1[i]=7;
           }
            else  if(valeur.equals("8")){
                tableau1[i]=8;
           }
         
            else  if(valeur.equals("9")){
                tableau1[i]=9;
           }
            else{
                System.out.println("N'est pas en Hexadecimal\nCase initialiser a 0");
            }
        }
        //Remplire le deuxieme tableau
        for (int i = 0; i <=longeur-1; i++) {
            System.out.print("\nValeurs de B"+i+": ");
            valeur=sc.next();
            if(valeur.equals("a")||valeur.contains("A")){
                tableau2[i]=10;
            }
            else if(valeur.equals("b")||valeur.contains("B")){
                tableau2[i]=11;}
           
            else if(valeur.equals("c")||valeur.contains("C")){
                tableau2[i]=12;
           }
            else if(valeur.equals("d")||valeur.contains("D")){
                tableau2[i]=13;
           }
            else if(valeur.equals("e")||valeur.contains("E")){
                tableau2[i]=14;
           }
            else if(valeur.equals("f")||valeur.contains("F")){
                tableau2[i]=15;
           }
            else if(valeur.equals("0")){
                tableau2[i]=0;
           }
            else if(valeur.equals("1")){
                tableau2[i]=1;
           }
            else if(valeur.equals("2")){
                tableau2[i]=2;
           }
            else if(valeur.equals("3")){
                tableau2[i]=3;
           }
            else if(valeur.equals("4")){
                tableau2[i]=4;
           }
            else if(valeur.equals("5")){
                tableau2[i]=5;
           }
            else if(valeur.equals("6")){
                tableau2[i]=6;
           }
            else if(valeur.equals("7")){
                tableau2[i]=7;
           }
            else  if(valeur.equals("8")){
                tableau2[i]=8;
           }
         
            else  if(valeur.equals("9")){
                tableau2[i]=9;
           }
            else{
                System.out.println("N'est pas en Hexadecimal\nCase initialiser a 0");
            }
        }
                 
        
        //Addition
         for(int i=0; i<=longeur-1;i++){
            reponse=tableau1[longeur-i-1]+tableau2[longeur-i-1];
            tableau[longeur-i-1]=reponse;
            tableau[0]=0;
            if(reponse>15 &&longeur-i-1>0){
                i=i+1;
                reponse=tableau1[longeur-i-1]+tableau2[longeur-i-1]+1;
                tableau[longeur-i-1]=reponse;
                tableau3[0]=""+reste[0];
            }
            else if(reponse>15 &&longeur-i-1==0){
                reponse=tableau1[longeur-i-1]+tableau2[longeur-i-1]+1;
                tableau3[0]=""+reste[0];
            }
            else{
                tableau3[0]=""+restes[0];
                tableau[longeur-i-1]=reponse;
            }
            
         }
         //Montrer le calcul
         System.out.println("\nLe resultat de l'addition:\n\n");
         for(int i=0; i<=longeur-1;i++){
             System.out.print(""+tableau1[i]+"\t" );
         }
         System.out.println("");
          for(int i=0; i<=longeur-1;i++){
             System.out.print(""+tableau2[i]+"\t");  
         }
          System.out.println("");
          System.out.println("-----------------");
           for(int i=0; i<=longeur-1;i++){
             do{
                if(tableau[i]==10){
                    tableau3[i]="A";
                }
                else if(tableau[i]==11){
                    tableau3[i]="B";
                }
                else if(tableau[i]==12){
                    tableau3[i]="C";
                }
                else if(tableau[i]==13){
                    tableau3[i]="D";
                }
                else if(tableau[i]==14){
                    tableau3[i]="E";
                }
                else if(tableau[i]==15){
                    tableau3[i]="F";
                }
                else if(tableau[i]>15){
                  tableau[i]=tableau[i]-16;             
             }  
            } while (tableau[i]>15);
            if(tableau[i]==10){
                tableau3[i]="A";
            }
            else if(tableau[i]==11){
                tableau3[i]="B";
            }
            else if(tableau[i]==12){
                tableau3[i]="C";
            }
            else if(tableau[i]==13){
                tableau3[i]="D";
            }
            else if(tableau[i]==14){
                tableau3[i]="E";
            }
             else if(tableau[i]==15){
                 tableau3[i]="F";
             }
             else if(tableau[i]>15){
             tableau[i]=tableau[i]-16;
             tableau3[i]=""+tableau[i];
             }
             else{ 
                 tableau3[i]=""+tableau[i];
             }
               System.out.print(""+tableau3[i]+"\t");
         }
    }
    
}
