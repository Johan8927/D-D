package BoardGame;

import java.util.List;

public class Figth {
    private Character player; // Renamed from "joueur" to "player"
    private List<Character> Enemies; // Renamed from "ennemis" to "Enemies"
    private int turn; // Renamed from "tour" to "turn"

    public Figth(Character player, List<Character> Enemies) {
        this.player = player;
        this.Enemies = Enemies;
        this.turn = 0; // Starts at turn 0
    }

    // Method to initiate combat
    public void startCombat() {
        System.out.println("The combat begins!");
        while (!checkEndOfCombat()) {
            takeTurn();
            turn++; // Move to the next turn
        }
        System.out.println("The combat is over!");
    }

    // Method to manage the turn of play
    private void takeTurn() {
        // Player attacks first
        System.out.println("It's the player's turn!");
        // Logic for player attack
        // For example, player.attack(enemy);

        // Then each enemy attacks
        for (Character enemy : Enemies) {
            if (enemy.getHealth() > 0) {
                System.out.println("It's " + enemy.getName() + "'s turn!");
                // Logic for enemy attack
                // For example, enemy.attack(player);
            }
        }
    }

    // Method to check if the combat is over
    private boolean checkEndOfCombat() {
        // Check if the player or all Enemies are at 0 health
        if (player.getHealth() <= 0) {
            System.out.println("The player has been defeated!");
            return true;
        }
        for (Character enemy : Enemies) {
            if (enemy.getHealth() > 0) {
                return false; // Combat is still ongoing
            }
        }
        System.out.println("All Enemies have been defeated!");
        return true; // Combat has ended
    }
}
