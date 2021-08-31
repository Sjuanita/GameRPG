package Game;

import Game.classes.CoreClass;
import Game.danj.Danj;

public class Party {
    private CoreClass[] partyMembers;
    private Danj danj;

    public Party(CoreClass... members) {
        partyMembers = new CoreClass[members.length];
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = members[i];
        }
    }
    public boolean enterDanj(Danj danj) {
        return danj.openDanj(this);
    }

    public CoreClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CoreClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }
    public void info() {
        for(CoreClass partyMembers : partyMembers) {
            partyMembers.info();
        }
    }
    public void runDanj() {

    }

    public Danj getDanj() {
        return danj;
    }

    public void setDanj(Danj danj) {
        this.danj = danj;
    }
}
