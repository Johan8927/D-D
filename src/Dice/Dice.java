package Dice;

public class Dice {
    private int sides;
    public Dice(int sides) {
        this.sides = sides;
    }
    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }
    public static void main(String[] args) {
        Dice d6 = new Dice(6);
        System.out.println("Un dé de 6 tourne et rapporte " + d6.roll());
    }
}
