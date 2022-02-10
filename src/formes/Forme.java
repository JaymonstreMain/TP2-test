package formes;

import org.w3c.dom.ls.LSOutput;

public abstract class Forme {

    //Propriétés communes et aux formes
    public static final int MIN_VAL = 1;
    public static final int MAX_VAL = 30;
//    public static final Couleur COULEUR_DEFAUT = "rouge";


    //atributs
    private String nom;
    private Couleur couleur;

    public Forme(String nom, Couleur couleur) {
        //setNom(nom);
        setCouleur(couleur);


    }

    //Obtient la couleur
    public Couleur getCouleur() {
        return couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setCouleur(Couleur couleur) {
        Couleur.values();
    }


}
