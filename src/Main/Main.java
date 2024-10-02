package Main;

import BoardGame.BoardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Créer un nouveau plateau de jeu
        BoardGame game = new BoardGame();

        // Scanner pour interagir avec l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans BoardGame!");

        // Interaction simple: Demander à l'utilisateur d'ajouter un ennemi ou un item
        System.out.println("Souhaitez-vous ajouter un ennemi ou un item ? (Oui/Non)");
        String input = scanner.nextLine();

        System.out.println("Entrez le numéro de la case (1-64) :");
        int index = scanner.nextInt() - 1;

        if (input.equalsIgnoreCase("Oui")) {
            game.addEnemy(index);
        } else if (input.equalsIgnoreCase("Non")) {
            game.addItem(index);
        } else {
            System.out.println("Choix non valide.");
        }

        scanner.close();
    }
}
