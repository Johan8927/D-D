package BoardGame;

import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner pour les entrées de l'utilisateur
        Random ranNum = new Random();            // Générateur de nombres aléatoires

        // Boucle infinie pour relancer les dés tant que l'utilisateur le souhaite
        while (true) {
            System.out.print("Enter the number of Dice: ");
            int numberOfDice = input.nextInt();

            System.out.print("Hey Coder! You rolled: ");
            int total = 0;
            int randomNumber = 0;

            // Lancer les dés et afficher les résultats
            for (int i = 0; i < numberOfDice; i++) {
                randomNumber = ranNum.nextInt(6) + 1;  // Générer un nombre entre 1 et 6
                total += randomNumber;                 // Ajouter à la somme totale
                System.out.print(randomNumber + " ");
            }

            System.out.println("\nTotal: " + total);  // Afficher le total

            // Demander à l'utilisateur s'il veut rejouer
            System.out.print("Do you want to roll again? (yes/no): ");
            String response = input.next();  // Lire la réponse de l'utilisateur

            // Si l'utilisateur répond "no", on arrête la boucle
            if (response.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing!");
                break;  // Sortir de la boucle
            }

            // Sinon, on continue le jeu
        }

        input.close();  // Fermer le scanner
    }
}
