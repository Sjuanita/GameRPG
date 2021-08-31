package Game.classes.persons;

import Game.classes.CoreClass;
import Game.classes.TypeAttack;

public class Mage extends CoreClass {
    public Mage(String name) {
        this.setLvl(1);
        this.setMaxHP(100);
        this.setMaxMP(200);
        this.setAttackValue(12);
        this.setHP(100);
        this.setMP(200);
        this.setTypeAttack(TypeAttack.MAGICAL);
        this.setName(name);
    }
}
