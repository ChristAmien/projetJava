package ej;

public class Mur extends Bloc {
    private boolean porteur;

    public Mur(int longueur, int largeur, int hauteur, boolean porteur) throws IllegalBlocException {
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
        this.couleur = Couleur.GRIS;
    }

    public boolean estTraversable() {
        if (porteur) {
            return false;
        }
        return true;
    }

    public Couleur getCouleur() {
        return Couleur.GRIS;
    }

}
