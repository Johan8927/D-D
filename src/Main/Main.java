package Main;
import BoardGame.BoardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardGame game = new BoardGame();  // Créer une nouvelle instance de BoardGame





        // Afficher un message de bienvenue au joueur et informer qu'il peut lancer les dés ou quitter
        System.out.println("Welcome to the game!");
        System.out.println("Pour lancer les dés et déplacer le joueur tapez 'ok', ou pour quitter tapez 'non'.");
        System.out.println("Bienvenue dans le jeu ! Le plateau est prêt.");

        // Boucle de jeu
        boolean jeuEnCours = true;
        while (jeuEnCours) {
            System.out.println("ok pour jeter les dés");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("non")) {
                jeuEnCours = false;  // Sortir de la boucle, fin du jeu
                System.out.println("Merci d'avoir joué !");
            } else if (input.equalsIgnoreCase("ok")) {
                // Lancer les dés et déplacer le joueur
                int resultDes = new BoardGame.Dice().roll();
                System.out.println("Résultat des dés : " + resultDes);

                // Déplacer le joueur en fonction du résultat du jet de dés
                game.deplacerJoueur(resultDes);

                // Afficher l'état du plateau après le déplacement
                game.displayBoard();
            } else {
                System.out.println("Commande non reconnue, veuillez essayer à nouveau.");
            }
        }

        scanner.close();  // Fermer le scanner après la fin du jeu
    }
}
