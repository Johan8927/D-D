public class Main {
    public static void main(String[] args) {
        Game game = new Game();  // Créer un objet Game
        game.startGame();        // Démarrer le jeu

        // Après avoir joué le jeu, initialiser le plateau de jeu
        boardGame boardGame = new boardGame();  // Créer un objet BoardGame
        boardGame.initializeBoard();            // Initialiser le plateau de jeu
        boardGame.displayBoard();               // Afficher le plateau de jeu

        // Vous pouvez ensuite jouer aux autres jeux comme "craps" ici si nécessaire
        craps craps = new craps();  // Créer un objet Craps
        craps.startGame();          // Démarrer le jeu Craps (ou une méthode similaire dans Craps)
    }
}
