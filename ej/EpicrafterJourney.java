package ej;

public class EpicrafterJourney {

    public static void main(String[] args) {
       try {
        Porte port1 = new Porte(2, 2, 2, true);
        port1.verrouiller();
       } catch (IllegalBlocException e) {
        System.out.println("Impossible de construire le bloc.");
       }catch(PorteVerrouilleException e){
        System.out.println("la porte est déjà vérouillée");
       }
    }
}