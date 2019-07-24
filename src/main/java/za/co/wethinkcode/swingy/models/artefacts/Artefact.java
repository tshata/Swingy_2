package za.co.wethinkcode.swingy.models.artefacts;

public abstract class Artefact {
    private int value;
    private String name;

    public abstract int increaseValue(Artefact name);

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
