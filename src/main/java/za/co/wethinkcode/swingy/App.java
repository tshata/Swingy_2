package za.co.wethinkcode.swingy;

import za.co.wethinkcode.swingy.controllers.Game;


import static za.co.wethinkcode.swingy.controllers.DatabaseController.connect;

public class App {


    public static void main(String[] args) {
        connect();
        System.out.println("Hello World!");
        Game game = new Game("Swingy", 1200, 950);
        game.start();
    }
}
