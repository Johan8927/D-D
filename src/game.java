import java.util.Scanner;

class Game {

    public void startGame() {
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
                    demarrerPartie(scanner); // Passer le scanner à la méthode
                    break;
                case 2:
                    System.out.println("Merci d'avoir joué ! À bientôt.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choice != 2);
    }

    // Méthode pour démarrer une nouvelle partie
    public void demarrerPartie(Scanner scanner) {
        System.out.println("La partie commence !");

        // Demander le nom du joueur
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        // Demander le type de personnage
        System.out.println("Choisissez votre type de personnage : ");
        System.out.println("1. Warrior");
        System.out.println("2. Magician");
        System.out.print("Votre choix : ");
        int typeChoix = scanner.nextInt();
        scanner.nextLine(); // Consomme la nouvelle ligne

        personnage joueur;


        // Création du personnage en fonction du choix
        switch (typeChoix) {
            case 1:
                joueur = new personnage(nom, "Warrior");

                // Demander le type d'arme
                System.out.println("Choisissez votre arme : ");
                System.out.println("1. Sword");
                System.out.println("2. Club");
                int armeChoix = scanner.nextInt();
                weapon weapon;
                switch (armeChoix) {
                    case 1:
                        weapon = new weapon();
                        break;
                    case 2:
                        weapon = new weapon();
                        break;
                    default:
                        System.out.println("Arme invalide. Vous n'avez pas d'arme.");
                        weapon = null;
                        break;
                }
                System.out.println("Votre personnage : " + joueur + (weapon != null ? " avec l'arme : " + weapon : ""));
                break;

            case 2:
                joueur = new personnage(nom, "Magician");

                // Demander le type de sort
                System.out.println("Choisissez votre sort : ");
                System.out.println("1. Fire");
                System.out.println("2. Storm");
                int spellChoix = scanner.nextInt();
                spell spell;
                switch (spellChoix) {
                    case 1:
                        spell = new spell();
                        break;
                    case 2:
                        spell = new spell();
                        break;
                    default:
                        System.out.println("Sort invalide. Vous n'avez pas de sort.");
                        spell = null;
                        break;
                }
                System.out.println("Votre personnage : " + joueur + (spell != null ? " avec le sort : " + spell : ""));
                break;

            default:
                System.out.println("Choix invalide. Par défaut, vous êtes un Humain.");
                new personnage(nom, "");
                break;
        }
    }
}






