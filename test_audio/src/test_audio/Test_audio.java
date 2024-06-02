package test_audio;

import t2s.son.LecteurTexte;


public class Test_audio {


    public static void main(String[] args) {
        LecteurTexte lecteur = new LecteurTexte("bonjour");
        lecteur.playAll();
        lecteur.setTexte("je sui jo");
        lecteur.play();
    }
    
}
