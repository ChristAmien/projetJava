// import java.util.ArrayList;
// import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import ej.Bloc;
import ej.Mur;
import ej.Porte;

public class Main {

    public static void main(String[] args) {
        //============classe JAVA.UTIL.LIST & ARRAYLIST====================

        // List<Integer> quantiteBlocsUtilises = new ArrayList<Integer>(); //la clesse nous permet de gerer dess doublons
        // quantiteBlocsUtilises.add(1);
        // quantiteBlocsUtilises.add(3);
        // quantiteBlocsUtilises.add(1); //s'affiche car les doublon sont autoriser avec la classe java.util.List

        // quantiteBlocsUtilises.remove(Integer.valueOf(3));
        // for (Integer quantite : quantiteBlocsUtilises) {
        //     System.out.println(quantite);
        // }

        //========== classe JAVA.UTIL.SET & LinkedHashSet============

        //DEFINITION

        //il faut savoir que la classe JAVA.UTIL.SET n'autorise pas les doublons alors que JAVA.UTIL.LIST l'autorise 

        // Set <String> motsCles = new LinkedHashSet<String>();//Ici j’ai utilisé la classe LinkedHashSet qui a pour spécificité de maintenir dans l’ordre les éléments de la collection. L’ordre des éléments correspond à l’ordre d’insertion.
        // motsCles.add("Cabane");
        // motsCles.add("cabane");
        // motsCles.add("Muraille");

        // for (String motCle : motsCles) {
        //     System.out.println(motCle);
        // }

        Map<Bloc, Integer> quantiteBloc = new HashMap<Bloc, Integer>();
        quantiteBloc.put(new Mur(4, 4, 1, true), 4);
        quantiteBloc.put(new Porte(4, 4, 1, true), 4);

        Set<Bloc> cles = quantiteBloc.keySet();
        for (Bloc cle : cles) {
            Integer valeur = quantiteBloc.get(cle);
            System.out.println(cle.getClass().getName()+ " : "+ valeur);
        }
    }
}