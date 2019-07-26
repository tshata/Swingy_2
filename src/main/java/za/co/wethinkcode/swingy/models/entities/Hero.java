package za.co.wethinkcode.swingy.models.entities;

import za.co.wethinkcode.swingy.models.artefacts.Artefact;

import java.awt.*;

public abstract class Hero implements Entity {

    protected String name;
    protected String rank;
    protected int level;
    protected int attack;

    protected int defence;
    protected int hitPoints;
    protected Artefact artefact;
    protected int id;

    protected Hero(String name, String rank, int level, int attack, int defence, int hitPoints, Artefact artefact, int id) {
        this.name = name;
        this.rank = rank;
        this.level = level;
        this.attack = attack;
        this.defence = defence;
        this.hitPoints = hitPoints;
        this.artefact = artefact;
        this.id = id;
    }

    public void fight() {

    }

    public void run() {

    }

    public void pickUpArtefact(Artefact artefact) {

    }

    public abstract void update();

    public abstract void render(Graphics g);
}
