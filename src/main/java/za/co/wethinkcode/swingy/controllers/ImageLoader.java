package za.co.wethinkcode.swingy.controllers;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {
    public static BufferedImage loadImage(String path){
        try{
            return  ImageIO.read(ImageLoader.class.getResource("sheet2.png"));
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
