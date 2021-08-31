package Game;

import Game.classes.persons.Archer;
import Game.classes.persons.Knight;
import Game.classes.persons.Mage;
import Game.danj.Danj;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Anton"), new Knight("Valera"), new Archer("Vova"));
        party.info();
        Danj danj = new Danj();
       if (party.enterDanj(danj)) {
            party.setDanj(danj);
            party.runDanj();
       } else {
           System.out.println("ВЫ не прошли, увы(");
       }
    }
}
