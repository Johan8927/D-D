package Stuff;

import java.util.Random;

enum SurpriseItem {
    FIRE, STORM, CLUB, SWORD, BIG_POTIONS, SMALL_POTIONS;

    // Method to get a random item
    public static SurpriseItem getRandomItem() {
        SurpriseItem[] items = SurpriseItem.values();
        Random random = new Random();
        return items[random.nextInt(items.length)];
    }
}

class SurpriseBox {

    // Method to open the box and get a random item
    public SurpriseItem open() {
        SurpriseItem item = SurpriseItem.getRandomItem();
        System.out.println("You found: " + item);
        return item;
    }

    public static void main(String[] args) {
        // Create a surprise box
        SurpriseBox box = new SurpriseBox();

        // Open several boxes to see the obtained items
        for (int i = 0; i < 5; i++) {
            System.out.println("Box #" + (i + 1));
            SurpriseItem foundItem = box.open(); // Use the returned item
            // Additional code using foundItem if needed
        }
    }
}
