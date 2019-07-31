package za.co.wethinkcode.swingy.models.entities;

import za.co.wethinkcode.swingy.models.artefacts.Artefact;

public interface Entity {
    public void fight();
    public void run();
    public void pickUpArtefact(Artefact artefact);
}
