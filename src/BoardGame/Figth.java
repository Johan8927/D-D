package BoardGame;

import Character.Character;

import java.util.List;



public class Figth {
    private final Character player; // Renamed from "joueur" to "player"
    private final List<Character> Enemies; // Renamed from "ennemis" to "Enemies"
    private int turn; // Renamed from "tour" to "turn"

    public Figth(Character player, List<Character> Enemies) {
        this.player = player;
        this.Enemies = Enemies;
        this.turn = 0;
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


        // Then each enemy attacks
        for (Character enemy : Enemies) {
            if (enemy.getHealth() > 0) {
                System.out.println("It's " + enemy.getName() + "'s turn!");

            }
        }
    }

    // Method to check if the combat is over
    private boolean checkEndOfCombat() {
        // Check if the player or all Enemies are at 0 heal
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

    // Method to add a new enemy to the combat
    public void addEnemy(Character enemy)
    {
        Enemies.add(enemy);
    }
}
