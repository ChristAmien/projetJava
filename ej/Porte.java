package ej;

public class Porte extends Bloc {
    private boolean verrouille;

    // Constructeurs
    public Porte(int longueur, int largeur, int hauteur, boolean verrouille) throws IllegalBlocException{
        super(longueur, largeur, hauteur);
        this.verrouille = verrouille;
        this.couleur = Couleur.BLEU;
    }

    public boolean estVerrouille(){
        return verrouille;
    }

    public void verrouiller() throws PorteVerrouilleException {
        if (verrouille) {
            throw new PorteVerrouilleException("La porte est déjà verrouilée");
        } else {
            verrouille = true;
        }
    }

}
