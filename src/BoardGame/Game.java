package BoardGame;

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
                    home(scanner); // Passer le scanner à la méthode
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
    public void home(Scanner scanner) {
        System.out.println("La partie commence !");

        // Demander le nom du joueur
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        // Demander le type de Character
        System.out.println("Choisissez votre type de Character : ");
        System.out.println("1. Warrior");
        System.out.println("2. Magician");
        System.out.print("Votre choix : ");
        int typeChoix = scanner.nextInt();
        scanner.nextLine(); // Consomme la nouvelle ligne

        Character joueur;

        switch (typeChoix) {
            case 1:
                joueur = new Character(nom, "Warrior") {
                    @Override
                    public void afficherInfos() {
                        System.out.println("Informations sur le Warrior.");
                    }

                    @Override
                    public void attaquer() {
                        System.out.println(nom + " attaque !");
                    }
                };

                // Demander le type d'armure
                System.out.println("Choisissez votre armure : ");
                System.out.println("1. Steel Wheels");
                System.out.println("2. Leather Armor");
                int armureChoix = scanner.nextInt();
                scanner.nextLine(); // Consomme la nouvelle ligne

                StuffDefense armor = switch (armureChoix) {
                    case 1 -> new Armor("Steel Wheels", 6);
                    case 2 -> new Armor("Leather Armor", 5);
                    default -> {
                        System.out.println("Armure invalide. Vous n'avez pas d'armure.");
                        yield null;
                    }
                };

                // Demander le type d'arme
                System.out.println("Choisissez votre arme : ");
                System.out.println("1. Sword");
                System.out.println("2. Club");
                int armeChoix = scanner.nextInt();
                scanner.nextLine(); // Consomme la nouvelle ligne
                Weapon weapon = switch (armeChoix) {
                    case 1 -> new Weapon("Sword");
                    case 2 -> new Weapon("Club");
                    default -> {
                        System.out.println("Arme invalide. Vous n'avez pas d'arme.");
                        yield null;
                    }
                };

                System.out.println("Votre Character : " + joueur +
                        (armor != null ? " avec l'armure : " + armor : " ") +
                        (weapon != null ? " et l'arme : " + weapon : " "));
                break;

            case 2:
                joueur = new Character(nom, "Magician") {
                    @Override
                    public void afficherInfos() {
                        System.out.println("Informations sur le Magician.");
                    }

                    @Override
                    public void attaquer() {
                        System.out.println(nom + " lance un sort !");
                    }
                };

                // Demander le type d'armure
                System.out.println("Choisissez votre armure : ");
                System.out.println("1. Steel Wheels");
                System.out.println("2. Leather Armor");
                armureChoix = scanner.nextInt();
                scanner.nextLine(); // Consomme la nouvelle ligne

                armor = switch (armureChoix) {
                    case 1 -> new Armor("Steel Wheels", 6);
                    case 2 -> new Armor("Leather Armor", 5);
                    default -> {
                        System.out.println("Armure invalide. Vous n'avez pas d'armure.");
                        yield null;
                    }
                };

                // Demander le type de sort
                System.out.println("Choisissez votre sort : ");
                System.out.println("1. Fire");
                System.out.println("2. Storm");
                int sortChoix = scanner.nextInt();
                scanner.nextLine(); // Consomme la nouvelle ligne
                Spell spell = switch (sortChoix) {
                    case 1 -> new Spell("Fire");
                    case 2 -> new Spell("Storm");
                    default -> {
                        System.out.println("Sort invalide. Vous n'avez pas de sort.");
                        yield null;
                    }
                };

                System.out.println("Votre Character : " + joueur +
                        (armor != null ? " avec l'armure : " + armor : " ") +
                        (spell != null ? " et le sort : " + spell : " "));
                break;

            default:
                System.out.println("Choix invalide. Par défaut, vous êtes un Humain.");
                break;
        }
    }
}
