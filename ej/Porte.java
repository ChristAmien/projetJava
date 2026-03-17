package ej;

public class Porte extends Bloc {
    private boolean verrouille;

    // Constructeurs 
    public Porte (int longueur, int largeur, int hauteur, boolean verrouille){
        super(longueur, largeur, hauteur);
        this.verrouille = verrouille;
        this.couleur = Couleur.BLEU;
    }

    public boolean estVerrouille(){
        if (verrouille) {
            return true;
        }
        return false;
    }

}
