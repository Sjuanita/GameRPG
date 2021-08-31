package Game.classes.persons;

import Game.classes.CoreClass;
import Game.classes.TypeAttack;

public class Knight extends CoreClass {
    public Knight(String name) {
        this.setLvl(1);
        this.setMaxHP(150);
        this.setMaxMP(50);
        this.setAttackValue(8);
        this.setHP(150);
        this.setMP(50);
        this.setTypeAttack(TypeAttack.PHYSICAL_MELEE);
        this.setName(name);
    }
}
