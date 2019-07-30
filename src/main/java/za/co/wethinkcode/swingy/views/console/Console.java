package za.co.wethinkcode.swingy.views.console;

import java.lang.*;
import java.util.Scanner;

import za.co.wethinkcode.swingy.controllers.Game;
import za.co.wethinkcode.swingy.views.View;

public class Console extends View {
    //first there needs to be input

    public static void menu() {
        System.out.println("========================================================");
        System.out.println("Welcome to Swingy");
        System.out.println("Press 1 for GUI or 2 for Console");
        System.out.println("========================================================");
        Scanner input = new Scanner(System.in);
        int number = 0;

        do {
             number = input.nextInt();
            if (number == 1) {
                //go to GUI
                System.out.println("You will be redirected to the GUI");
            } else if (number == 2) {
                //continue with console
                Scanner creload = new Scanner(System.in);
                System.out.println("Your game will continue in the Console");
                System.out.println("Would you like to create a new hero or load a saved one?");
                System.out.println("Press 1 to create new hero or 2 to load saved hero");
                int i = 0;
                    do{
                        i = creload.nextInt();
                        if(i == 1){

                            //use name_ to instatiate new hero with given name
                            createHero();//{
//                                System.out.println("Create a new player");
//                                System.out.print("Name :");
//                                Scanner name = new Scanner(System.in);
//                                String name_ = name.nextLine();
//                            }
                        }
                        else if(i == 2){
                            System.out.println("Loading new player");
                            //load previously saved player
                            selectHero();
                        }
                        else {
                            System.out.println("Invalid input, hero names can not be alphanumeric");
                        }
                    }while(i != 1 || i != 2);
            } else
                System.out.println("Invalid input, try again");

        }while (number != 1 || number != 2);
    }
}
