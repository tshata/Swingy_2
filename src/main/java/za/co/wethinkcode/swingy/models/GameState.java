package za.co.wethinkcode.swingy.models;

import za.co.wethinkcode.swingy.controllers.Game;
import za.co.wethinkcode.swingy.models.artefacts.Artefact;
import za.co.wethinkcode.swingy.models.entities.Enemy;
import za.co.wethinkcode.swingy.models.entities.Hero;
import za.co.wethinkcode.swingy.models.entities.MiniEnemies;
import za.co.wethinkcode.swingy.models.entities.SuperHero;

import java.awt.*;
import java.util.Random;

public class GameState {
    private Hero hero;
    private Enemy enemy = new MiniEnemies() {
        @Override
        public void run() {

        }

        @Override
        public void pickUpArtefact() {

        }

        @Override
        public Artefact artefact() {
            return null;
        }
    };


    Random rand = new Random();
    public GameState(Game game) {
                int n = rand.nextInt(800);
        int m = rand.nextInt(700);

        n++;
        m++;
    }


    public void update() {
        hero.update();
        enemy.update();
    }

    public void render(Graphics g) {
        //  g.drawImage(Assets.enemy,0,0,null);
        hero.render(g);
        enemy.render(g);
    }
}
