/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Devernay Mbala
 */
public class resultat extends javax.swing.JFrame {

    ArrayList<String> arl = new ArrayList<>();
    private static String text;

    /**
     * Creates new form resultat
     */
    static String prenom;
    public resultat(String prenom) {
        initComponents();
        this.prenom = prenom;
    }

    public resultat(ArrayList<String> a) {
        initComponents();
        this.arl = a;
        //coco.setText();
        if (a.size() < 2) {
            if (search("MAUX DE GORGE")) {
                text = "Il se peut que vous ayez une angine \n "
                        + "Eviter de prendre des aliments chauds ou boissons froides, privilégier plus la consomation d'aliment chaud ou boisson chaude pour éviter cela.\n"
                        + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                        + "L'auto-médication n'est pas une bonne chose \n"
                        + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);

            } else if (search("MAUX DE VENTRE")) {
                text = "Il se peut que vous ayez des levures \n"
                        + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                        + "L'auto-médication n'est pas une bonne chose \n"
                        + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
                
            } else if (search("MAUX DE TETE")){
                text = "Vous avez peut-etre été éxposé trop longtemps aux rayon solaire \n"
                    + "Mais cela peut etre aussi un stress non modéré, ou un manque de sommeil \n"
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
                
            } else if (search("VOMISSEMENT")){
                text = "Une consomation non modérée d'une boisson alcoolique peut aboutir à une tel cause ou une suralimentation \n"
                    + "Voir meme la consomation d'aliment périmé \n"
                    + "Cela peut etre aussi due à une grossese si vous etes une femme \n"
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
                
            } else if (search("YEUX JAUNE")){
                text = "Ce cas de figure est souvent associer à une fièvre jaune car un jaunissement pareil \n "
                    + "Ne peut etre que la cause de cette bacterie, pour ce faire \n"
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité"; 
                coco.setText(text);
          
            } else if (search("FIEVRE")){
                text = "Une fievre est la reaction de notre organisme due à la présence d'un corps étranger \n"
                    + "un allergène, un parasite ou encore un virus \n"
                    + "Pour ce faire rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
            
            } else if (search("DIARHEE")){
                text = "Une diarhee est provoqué lorsque le cycle digéstif connait une pértubation, \n"
                    + "cette pérturbation peut etre due à : "
                    + "Un aliment non frais ou une bactérie qui trouble le système digestif. \n"
                    + "Pour ce faire rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
            
            } else if (search("TOUX")){
                text = "Une toux,sec ou grasse est due à plusieurs facteurs, Mais ce qui est sur est  c'est une irritation, \n"
                    + "Due à une exposition aux aliments trop froid ou à un climat trop froid ou une grippe qui s'annonce \n"
                    + "Pour ce faire rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
            
            } else if (search("NEZ QUI COULE")){
                text = "Une perte de muquese nazale est le signe d'un rhume, pouvant survenir lors d'une trop longue exposition à des températures basse \n"
                    + "Pour ce faire rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner. \n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
            
            } else if (search("VERTIGE")){
                text = "Un vertige est due à une anomalie dans notre systeme vestibulaire,\n"
                    + "La partie de l'oreil interne qui assure la fonction de l'équilibre\n"
                    + "Pour ce faire rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n"
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
            
            }
            
        } else {
            System.err.println(a.toString());
            String [] grippe={"MAUX DE GORGE","NEZ QUI COULE","TOUX"};
            String [] malaria={"VERTIGE","VOMISSEMENT","MAUX DE TETE","FIEVRE"};
            String [] fjaune={"YEUX JAUNE","DIARHEE","FIEVRE","MAUX DE TETE"}; 
            String [] gastro={"DIARHEE","VOMISSEMENT","MAUX DE VENTRE"};
            String [] meningite={"MAUX DE TETE","FIEVRE"};
            String [] sjaune={"YEUX JAUNE","FIEVRE"};
            String [] agrippe={"TOUX","NEZ QUI COULE"};
            String [] irritation={"MAUX DE GORGE","TOUX"};
            String [] intoxication={"MAUX DE VENTRE","DIARHEE"};
            if ((search("MAUX DE GORGE") && search("NEZ QUI COULE") && search("TOUX")) && containsAllElementsOf(grippe)) {
                text = "Vous avez une grippe \n"
                        + "Mais en ces temps de covid 19 Nous ne sommes jamais assez prudent, \n"
                        + "Pour ce faire rendez-vous grace au GPS dans l'un des centre indiquer afin de vous faire soignez. \n"
                        + "L'auto-médication n'est pas une bonne chose \n"
                        + "Votre santé, notre priorité";
                coco.setText(text);

            } else if ((search("VERTIGE") && search("VOMISSEMENT") && search("MAUX DE TETE") && search("FIEVRE")) && containsAllElementsOf(malaria)) {
                text = "Vous avez la malaria \n"
                        + "Vous avez sans doute été époser à des moustiques, \n"
                        + "Afin de prévénir des futurs cas dormez sous une moustiquaire,\n"
                        + "Mais pour le moment rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                        + "L'auto-médication n'est pas une bonne chose \n"
                        + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
                
            } else if ((search("YEUX JAUNE") && search("DIARHEE") && search("FIEVRE") && search("MAUX DE TETE")) && containsAllElementsOf(fjaune)) {
                text = "Vous avez la fièvre jaune \n"
                    + "Rendez-vous au plus vite dans l'un des centre indiquer par le GPS afin de predre un traitemnet proportionelle \n"
                    + "L'auto-médication n'est pas une bonne chose \n "
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
                      
            } else if ((search("DIARHEE") && search("VOMISSEMENT")&& search("MAUX DE VENTRE")) && containsAllElementsOf(gastro)){
                text = "Vous avez une gastroentérique "
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n "
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
                resultat r=new resultat(prenom);
                
            } else if ((search("MAUX DE TETE") && search("FIEVRE")) && containsAllElementsOf(meningite)) {
                text = "Il se peut que vous ayez une méningite \n"
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n "
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
                
            } else if ((search("YEUX JAUNE") && search("FIEVRE")) && containsAllElementsOf(sjaune)){
                text= "Ceci est un signe d'un venue de la fievre jaune \n"
                    + "C'est une maladie plutot dangereuse, pour ce faire \n"
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n "
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
             
            } else if ((search("TOUX") && search("NEZ QUI COULE")) && containsAllElementsOf(agrippe)){
                text= "Ces symptomes annonce la venue d'une grippe \n"
                    + "Comme vous le savez en ces temps de Covid, vos mieux se peotéger avant la venue de la bete noir, pour ce faire \n"
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n "
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text); 
                
            } else if ((search("MAUX DE GORGE") && search("TOUX")) && containsAllElementsOf(irritation)){
                text= "Ceci est une irritation de la gorge qui prévient la venue d'une angine \n"
                    + "Ou d'une ri"
                    + "Rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n "
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text); 
                
            } else if ((search("MAUX DE VENTRE") && search("DIARHEE")) && containsAllElementsOf(intoxication)){
                text = "Vous avez surment été éxposer à une intoxivation alimentaire \n "
                    + "Mais cela peut etre aussi des levures \n"
                    + "Pour le moment rendez-vous dans l'un des centres indiquer par le GPS afin de vous faire soigner.\n"
                    + "L'auto-médication n'est pas une bonne chose \n "
                    + "N'oubliez pas votre santé, notre priorité";
                coco.setText(text);
            
            }else {
                text = "Les symptomes que vous avez choisie ne font pas partie à notre connaissance d'une maladie connu pour remedier à votre problème veuillez vous rendre dans l'un des centre indiquer par le GPS afin de réaliser des examens plus approfondie";
                coco.setText(text);
            }
        }
        a.clear();
    }

    private boolean search(String value) {
        for (String arl : arl) {
            if (arl.trim().equals(value)) {
                return true;
            }
        }
        return false;
    }
    private boolean containsAllElementsOf(String [] sympt){
        ArrayList<String> s=new ArrayList<>();
        s.addAll(Arrays.asList(sympt));
        
        if(arl.size()==s.size()){
            if(s.containsAll(arl)){
                return true;
            }
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coco = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Doctor.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 10, 160, 340);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/retour.png"))); // NOI18N
        jButton2.setText("RETOUR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 310, 230, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/accueilIcon.jpeg"))); // NOI18N
        jButton1.setText("ACCUEIL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(590, 320, 220, 40);

        coco.setEditable(false);
        coco.setBorder(null);
        coco.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        coco.setForeground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(coco);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 100, 490, 140);

        setSize(new java.awt.Dimension(895, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Diagnostique d = new Diagnostique(prenom);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acceuil ac = new acceuil(prenom);
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultat(prenom).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane coco;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
