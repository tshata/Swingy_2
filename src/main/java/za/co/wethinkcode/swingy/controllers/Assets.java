package za.co.wethinkcode.swingy.controllers;

import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage hero, enemy;


    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/assets/sheet2.png"));
        enemy = sheet.crop(0,0, 85, 75);
        hero = sheet.crop(95, 0, 85, 75);
    }
}
