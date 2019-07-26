package za.co.wethinkcode.swingy.models.entities;

import za.co.wethinkcode.swingy.models.artefacts.Artefact;

import java.awt.*;

public class SuperHero extends Hero {

    protected SuperHero(String name, String rank, int level, int attack, int defence, int hitPoints, Artefact artefact, int id) {
        super(name, rank, level, attack, defence, hitPoints, artefact, id);
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics g) {

    }

    @Override
    public void pickUpArtefact() {

    }

    public Artefact artefact() {
        return null;
    }
}
