package za.co.wethinkcode.swingy.models.artefacts;

public class Weapon extends Artefact {


    protected Weapon(int id) {
        super(id);
    }

    @Override
    public int increaseValue(Artefact name) {
        return 0;
    }
}
