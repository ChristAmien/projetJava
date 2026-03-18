package ej;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kit {
    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> motsCles = new LinkedHashSet<String>();

    public Kit() {
       
        blocs.add(new Mur(3, 2, 2, true));
        blocs.add(new Mur(3, 2, 2, true));
        blocs.add(new Mur(3, 2, 2, false));
        blocs.add(new Mur(3, 2, 2, false));
        blocs.add(new Porte(1,2,2,true));

        motsCles.add("Cabane");
        motsCles.add("Muraille");
    }

    public void afficherKit(){
        System.out.println("Nombre de blocs dans le kit : " + blocs.size());
        System.out.println("Liste des mots clés du kit: ");
        for(String motcle: motsCles){
            System.out.println(motcle + " ");
        }
    }
}
