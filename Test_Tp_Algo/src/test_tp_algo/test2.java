package test_tp_algo;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("entrez la taille");
        int taille=clavier.nextInt();
        String x="";
        int tab1[]= new int[taille];
        int tab2[]= new int[taille];
        int tab[]= new int[taille];
         String tab3[]= new String[taille];
         int s1=10,s2=11,s3=12,s4=13,s5=14,s6=15;
         int reponse;
        // premier nombre
        for(int i=0;i<=taille-1;i++){
        System.out.println("entrez la valeur du caractere "+i+" du premier nombre");
          x=clavier.next();
          
           if(x.equals("a")){
           tab1[i]=10;}
           
        else   if(x.equals("b")){
           tab1[i]=11;}
           
        else   if(x.equals("c")){
           tab1[i]=12;
           }
        else   if(x.equals("d")){
           tab1[i]=13;
           }
        else   if(x.equals("e")){
           tab1[i]=14;
           }
        else   if(x.equals("f")){
           tab1[i]=15;
           }
         else   if(x.equals("0")){
           tab1[i]=0;
           }
        else   if(x.equals("1")){
           tab1[i]=1;
           }
        else   if(x.equals("2")){
           tab1[i]=2;
           }
         else  if(x.equals("3")){
           tab1[i]=3;
           }
        else   if(x.equals("4")){
           tab1[i]=4;
           }
        else   if(x.equals("5")){
           tab1[i]=5;
           }
       else     if(x.equals("6")){
           tab1[i]=6;
           }
        else   if(x.equals("7")){
           tab1[i]=7;
           }
         else  if(x.equals("8")){
           tab1[i]=8;
           }
         
         else  if(x.equals("9")){
           tab1[i]=9;
           }
           
                    // deuxieme nombre
          
            
    } 
         for(int i=0;i<=taille-1;i++){
        System.out.println("entrez la valeur du caractere "+i+" du deuxieme nombre");
          x=clavier.next();
          
           if(x.equals("a")){
           tab2[i]=10;}
           
        else   if(x.equals("b")){
           tab2[i]=11;}
           
        else   if(x.equals("c")){
           tab2[i]=12;
           }
        else   if(x.equals("d")){
           tab2[i]=13;
           }
        else   if(x.equals("e")){
           tab2[i]=14;
           }
        else   if(x.equals("f")){
           tab2[i]=15;
           }
         else   if(x.equals("0")){
           tab2[i]=0;
           }
        else   if(x.equals("1")){
           tab2[i]=1;
           }
        else   if(x.equals("2")){
           tab2[i]=2;
           }
         else  if(x.equals("3")){
           tab2[i]=3;
           }
        else   if(x.equals("4")){
           tab2[i]=4;
           }
        else   if(x.equals("5")){
           tab2[i]=5;
           }
       else     if(x.equals("6")){
           tab2[i]=6;
           }
        else   if(x.equals("7")){
           tab2[i]=7;
           }
         else  if(x.equals("8")){
           tab2[i]=8;
           }
         
         else  if(x.equals("9")){
           tab2[i]=9;
           }      
    }
         /*
         * Affichage des deux nombres a additionner
         */
         for(int i=0; i<=taille-1;i++){
             System.out.print(""+tab1[i]+"\t" );
         }
         System.out.println("");
          for(int i=0; i<=taille-1;i++){
             System.out.print(""+tab2[i]+"\t");
         }
          System.out.println("");
          System.out.println("__________________");
          System.out.println("");
          
          /*
          * Vrai calcul commence
          */
           for(int i=0; i<=taille-1;i++){
            reponse=tab1[taille-i-1]+tab2[taille-i-1];
            tab[taille-i-1]=reponse;
         }
         
           for(int i=0; i<=taille-1;i++){
             do { 
             if(tab[i]==10){ tab3[i]="A";}
            else if(tab[i]==11){ tab3[i]="B";}
            else if(tab[i]==12){ tab3[i]="C";}
            else if(tab[i]==13){ tab3[i]="D";}
            else if(tab[i]==14){ tab3[i]="E";}
             else if(tab[i]==15){ tab3[i]="F";}
              else if(tab[i]>15){
             tab[i]=tab[i]-16;
             int reste=1;
             
             //tab3[i]=""+tab[i];
             
             }
        } while (tab[i]>15);
             
               
            if(tab[i]==10){ tab3[i]="A";}
            else if(tab[i]==11){ tab3[i]="B";}
            else if(tab[i]==12){ tab3[i]="C";}
            else if(tab[i]==13){ tab3[i]="D";}
            else if(tab[i]==14){ tab3[i]="E";}
             else if(tab[i]==15){ tab3[i]="F";}
             
             else if(tab[i]>15){
             tab[i]=tab[i]-16;
             //tab3[i]=""+tab[i];
             
             }
             
             else{ tab3[i]=""+tab[i];    }
             
               System.out.print(""+tab3[i]+"\t");
               
         }
       
          
    }
}
