package ej;

// 
public abstract class Bloc implements IBloc {
   protected int longueur;
   protected int largeur;
   protected int hauteur;
   protected Couleur couleur;

   // Constructeur
   public Bloc(final int longueur, final int largeur,final  int hauteur) throws IllegalBlocException{

      if (longueur < MIN_LONGUEUR || largeur < MIN_LARGEUR || hauteur < MIN_HAUTEUR) {
         throw new IllegalBlocException();
      }
      this.hauteur = hauteur;
      this.largeur = largeur;
      this.longueur = longueur;
   }

   // les accesseurs
   public int getLongueur() {
      return longueur;
   }

   public int getLargeur() {
      return largeur;
   }

   public int getHauteur() {
      return hauteur;
   }

   public void setCouleur(Couleur nouvelleCouleur) {
      this.couleur = nouvelleCouleur;
   }

}
