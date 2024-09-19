public class Game toString(){

public StartGame() {
    Scanner scanner = new Scanner(System.in);
    int choix;

// Boucle pour afficher le menu jusqu'à ce que l'utilisateur choisisse de quitter
    do {
        // Affichage du menu
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Démarrer une nouvelle partie");
        System.out.println("2. Options");
        System.out.println("3. Quitter");
        System.out.print("Choisissez une option : ");
        choix = scanner.nextInt();

// Gestion des options du menu
        switch (choix) {
            case 1:
                demarrerPartie();
                break;
            case 2:
                afficherOptions();
                break;
            case 3:
                System.out.println("Merci d'avoir joué ! À bientôt.");
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
        }
    } while (choix != 3);
}

// Méthode pour démarrer une nouvelle partie
public void demarrerPartie() {
    System.out.println("La partie commence !");
    // Logique pour démarrer une nouvelle partie ici
    // Par exemple : initialiser un personnage, une carte, etc.
    Personnage joueur = new Personnage("Arthur", "Chevalier");
    System.out.println("Votre personnage : " + joueur);
}

// Méthode pour afficher les options (par exemple)
public void afficherOptions() {
    System.out.println("=== OPTIONS ===");
    // Ajouter des options supplémentaires ici si nécessaire
    System.out.println("Option 1 : Aucune pour l'instant.");

}
}
