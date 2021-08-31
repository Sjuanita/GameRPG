package Game.danj;

import Game.Party;

public class Danj implements CoreDungeon {
    private boolean Open = false;


    @Override
    public void runDungeon() {

    }

    @Override
    public boolean openDanj(Party party) {
        if (party.getPartyMembers().length < 3) {
            System.out.println("Мало людей");
        } else {
            System.out.println("Добро пожаловать в подземелье!");
            Open = true;
        }
        return Open;
    }
}
