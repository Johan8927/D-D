package BoardGame;

import Case.Case;
import Enemies.Dragon;
import Enemies.Enemy;
import Enemies.Goblins;
import Enemies.Wizard;

public class EnemyCase extends Case {
private Enemy currentEnemy;
    public EnemyCase() {
        super();

      int random = (int) (Math.random() * 3)+1 ;
      if (random == 1){
          currentEnemy = new Dragon("Dragon" , 4);
      }
      else if (random == 2){
          currentEnemy = new Goblins("Goblins",1);
      }
      else
      {
          currentEnemy = new Wizard("Wizard",2);
      }
    }
}
