package formes;

public enum Couleur {

    ROUGE, VERT, BLEU, JAUNE, NOIR, ORANGE;


    private String nom;

    private Couleur(){

    }

    public String getNom() {
        return this.nom;
    }

    /*public String setNom() {
        this.nom = nom;
    }*/

    @Override
    public String toString() {
        return "Couleur{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
