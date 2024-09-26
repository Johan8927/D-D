package Stuff;


class Club extends StuffAttak {
    private String name;
    private int attack;
    public Club(String name, int attack) {
        super("Armes", attack, name);
        this.name = name;
        this.attack = attack;
    }

}

