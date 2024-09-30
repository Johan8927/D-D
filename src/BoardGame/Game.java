package BoardGame;

import Character.Character;
import Character.Magician;
import Character.Warrior;
import StuffAttack.*;
import StuffDef.LeatherArmor;
import StuffDef.SteelArmor;
import StuffDef.StuffDefense;

import java.util.Scanner;

public class Game {

    public void home() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Boucle pour afficher le menu jusqu'à ce que l'utilisateur choisisse de quitter
        do {
            // Affichage du menu
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Démarrer une nouvelle partie");
            System.out.println("2. Quitter");
            System.out.print("Choisissez une option : ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            // Gestion des options du menu
            switch (choice) {
                case 1:
                    startNewGame(scanner); // Passer le scanner à la méthode
                    break;
                case 2:
                    System.out.println("Merci d'avoir joué ! À bientôt.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choice != 2);
        scanner.close(); // Ferme le scanner à la fin du jeu
    }

    // Méthode pour démarrer une nouvelle partie
    public void startNewGame(Scanner scanner) {
        System.out.println("La partie commence !");

        // Demander le nom du joueur
        System.out.print("Entrez votre nom : ");
        String name = scanner.nextLine();

        // Demander le type de personnage
        System.out.println("Choisissez votre type de personnage : ");
        System.out.println("1. Guerrier");
        System.out.println("2. Magicien");
        System.out.print("Votre choix : ");
        int typeChoix = scanner.nextInt();
        scanner.nextLine(); // Consomme la nouvelle ligne

        Character joueur;

        switch (typeChoix) {
            case 1:
                joueur = new Warrior(name);
                break;
            case 2:
                joueur = new Magician(name);
                break;
            default:
                System.out.println("Choix invalide. Vous serez un Humain par défaut.");
                joueur = new Warrior(name); // On peut définir un type par défaut
        }

        // Demander le type d'armure
        System.out.println("Choisissez votre armure : ");
        System.out.println("1. Steel Wheels");
        System.out.println("2. Leather Armor");
        int armureChoix = scanner.nextInt();
        scanner.nextLine(); // Consomme la nouvelle ligne

        StuffDefense armor = switch (armureChoix) {
            case 1 -> new LeatherArmor("Steel Wheels");
            case 2 -> new SteelArmor("Leather Armor");
            default -> {
                System.out.println("Armure invalide. Vous n'avez pas d'armure.");
                yield null;
            }
        };

        // Choisir arme ou sort selon le type de personnage
        if (joueur instanceof Warrior) {
            System.out.println("Choisissez votre arme : ");
            System.out.println("1. Épée");
            System.out.println("2. Gourdin");
            int armeChoix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne
            Weapon weapon = switch (armeChoix) {
                case 1 -> new Sword();
                case 2 -> new Club();
                default -> {
                    System.out.println("Arme invalide. Vous n'avez pas d'arme.");
                    yield null;
                }
            };
            System.out.println("Votre personnage : " + joueur +
                    (armor != null ? " avec l'armure : " + armor : "") +
                    (weapon != null ? " et l'arme : " + weapon : ""));
        } else if (joueur instanceof Magician) {
            System.out.println("Choisissez votre sort : ");
            System.out.println("1. Fire");
            System.out.println("2. Storm");
            int sortChoix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne
            Weapon spell = switch (sortChoix) {
                case 1 -> new Fire();
                case 2 -> new Storm();
                default -> {
                    System.out.println("Sort invalide. Vous n'avez pas de sort.");
                    yield null;
                }
            };
            System.out.println("Votre personnage : " + joueur +
                    (armor != null ? " avec l'armure : " + armor : "") +
                    (spell != null ? " et le sort : " + spell : ""));
        }

        // Démarrer la partie avec le personnage créé
        joueur.afficherInfos();
    }


}
