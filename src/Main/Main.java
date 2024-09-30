package Main;

import BoardGame.BoardGame;
import BoardGame.Game;
import StuffAttack.Club;
import StuffAttack.Fire;
import StuffAttack.Storm;
import StuffAttack.Sword;
import StuffDef.*;
import SurpriseBox.SurpriseBox;

public class Main {
    public static void main(String[] args) {

        // démarrage du jeu
        Game game = new Game();  // Créer un objet Game
        game.home();        // Démarrer le jeu

        do {
            game = new Game.nextTurn(perso,sc);
        } while (game.equals("IN PROGRESS"));

    }
}
