import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1. Démarrer une nouvelle partie\n2. Quitter");
            choix = scanner.nextInt();
            if (choix == 1) {
                 demarrerPartie();
            } else if (choix != 2) {
                System.out.println("Choix invalide.");
            }
        } while (choix != 2);
        System.out.println("Merci d'avoir joué !");
    }
    public static void demarrerPartie() {
        Personnage joueur = new Personnage();
        System.out.println("Partie démarrée avec " + joueur);
    }

}
