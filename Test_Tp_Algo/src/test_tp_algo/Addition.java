package test_tp_algo;

import javax.swing.JOptionPane;

public class Addition {
    
    public int Decimal(char x){
        if(x=='a'){
            return 10;
        }
        if(x=='b'){
            return 11;
        }
        if(x=='c'){
            return 12;
        }
        if(x=='d'){
            return 13;
        }
        if(x=='e'){
            return 14;
        }
        if(x=='f'){
            return 15;
        }
        return x-1;
    }
    public void Addition_hexa(String nb1,String nb2){
        int n=nb1.length();
        int m=nb2.length();
        int i=n-1;
        int j=m-1;
        int cont=0;
        int support =0;
        String result ="";
        char[]hexa={'0','1','2','4','5','6','7','8','9','a','b','c','d','e','f'};
        while (i>=0||j>=0) {
            if(i>=0 &&j>=0){
                cont=Decimal(nb1.charAt(i))+Decimal(nb2.charAt(j))+support;
                i--;
                j--;
            }
            else if(i>=0){
                cont=Decimal(nb1.charAt(i))+support;
                i--;
            }
            else{
                cont=Decimal(nb2.charAt(j));
                j--;
            }
            
            
        }
        result=hexa[(cont%16)]+result;
            support=cont/16;
            if(support!=0){
                result=hexa[support]+result;
                JOptionPane.showMessageDialog(null, result);
            }
        
        
    }
}
