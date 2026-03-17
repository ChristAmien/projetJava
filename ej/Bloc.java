package ej;

// 
public abstract class Bloc {
    protected int longueur;
    protected int largeur;
    protected int hauteur;

    //Constructeur
   public Bloc(int longueur,int largeur,int hauteur){
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


}
