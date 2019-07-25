package za.co.wethinkcode.swingy.models.artefacts;

public class Armor extends Artefact {


    protected Armor(int id) {
        super(id);
    }

    @Override
    public int increaseValue(Artefact name) {
        return 0;
    }
}
