package Game.classes.persons;

import Game.classes.CoreClass;
import Game.classes.TypeAttack;

public class Archer extends CoreClass {
    public Archer(String name) {
        this.setLvl(1);
        this.setMaxHP(120);
        this.setMaxMP(120);
        this.setAttackValue(10);
        this.setHP(120);
        this.setMP(120);
        this.setTypeAttack(TypeAttack.RANGED);
        this.setName(name);
    }
}
