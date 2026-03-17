package ej;
// 
public abstract class Bloc implements IBloc {
    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    //Constructeur
   public Bloc(int longueur,int largeur,int hauteur){ //ici lorsqu'on ajoute un nouvelélement en paramêtre cela n'a pas d'effet sur la classe Rempart uniquement sur les classes filles 
    this.hauteur=hauteur;
    this.largeur=largeur;
    this.longueur=longueur;
   }

//    les accesseurs
   public int getLongueur(){
    return longueur;
   }

   public int getLargeur(){
    return largeur;
   }

   public int getHauteur(){
    return hauteur;
   }

   public void setCouleur(Couleur nouvelleCouleur){
      this.couleur = nouvelleCouleur;
   }

}
