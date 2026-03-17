package ej;

public class Mur extends Bloc {
    private boolean porteur;

    public Mur(int longueur, int largeur, int hauteur, boolean porteur){
        super(longueur,largeur,hauteur);
        this.porteur=porteur;
    }

    public boolean estTraversable(){
        if (porteur) {
           return false; 
        }
        return true;
    }

}
