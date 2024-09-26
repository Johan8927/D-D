package Stuff;

public class StuffAttak {

        private final String type;  // Arme ou Sort

        // Constructeur de la classe StuffAttak
        public StuffAttak(String type, int lvlAttack, String name) {
            this.type = type;
        }


        public String getTypeMage() {

            if (this.type.equals("Armes")) {
                return "Mage";
            } else {
                return "Warrior";
            }
        }

        // Redéfinition de la méthode toString
        @Override
        public String toString() {
            return type ;

        }
    }

