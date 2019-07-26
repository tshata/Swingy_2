package za.co.wethinkcode.swingy.models.entities;

import java.awt.*;

public abstract class Enemy implements Entity{

    public void fight() {

    }

    public abstract void update();

    public abstract void render(Graphics g);
}
