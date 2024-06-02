package test_tp_algo;

import javax.swing.JOptionPane;

public class troisieme {
    public static void main(String[] args) {
        Addition add = new  Addition();
        String a="";
        String b="";
        a=JOptionPane.showInputDialog("a");
        b=JOptionPane.showInputDialog("b");
        add.Addition_hexa(a, b);
        
    }
 
}
