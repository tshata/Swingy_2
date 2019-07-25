package za.co.wethinkcode.swingy;

import static za.co.wethinkcode.swingy.controllers.DatabaseController.connect;

public class App {
    public static void main(String[] args) {
        connect();
        System.out.println("Hello World!");
    }
}
