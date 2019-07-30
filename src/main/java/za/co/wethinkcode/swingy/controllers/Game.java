package za.co.wethinkcode.swingy.controllers;

import za.co.wethinkcode.swingy.views.console.Console;
import za.co.wethinkcode.swingy.views.GUI.GUI;
import za.co.wethinkcode.swingy.views.GUI.KeyManager;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Game implements Runnable{
    private GUI display;
    public int width, height;
    private Thread thread;
    private boolean running = false;
    public String title;
    private BufferStrategy bs;
    private Graphics g;

    private BufferedImage testImage;
    private SpriteSheet sheet;

    //states
    private State gameState;
    private State menuState;

    //Input
    private KeyManager keyManager;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
    }

    public void init(){

    menu();
//        display = new GUI(title, width, height);
//        display.getFrame().addKeyListener(keyManager);
//        Assets.init();
//
//        gameState = new State(this) {
//            @Override
//            public void update() {
//
//            }
//
//            @Override
//            public void render(Graphics g) {
//
//            }
//        };
//      //  menuState = new MenuState(this);
//        State.setState(gameState);
    }

    private void menu() {
        Console.menu();
    }


    private void update(){
        keyManager.update();
        if(State.getState() != null){
            State.getState().update();
        }
    }

    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //clear scree
        g.clearRect(0,0,width, height);

        //draw on screen
        if (State.getState() != null){
            State.getState().render(g);
        }
     //   new GUI.Main().setVisible(true);
        g.drawImage(Assets.hero, 5, 10, null);
        g.drawImage(Assets.enemy, 100, 100, null);
        bs.show();
        g.dispose();
    }

    public void run(){
        init();
        int fps = 60;
        double timePerTick;
        timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        long ticks = 0;

        while (running){
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            timer += now -lastTime;
            lastTime = now;

            if(delta >= 1) {
                update();
                render();
                ticks++;
                delta--;
            }
            //print every one second the frames and ticks
            if(timer >= 1000000000){
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
        stop();
    }

    public KeyManager getKeyManager(){
        return keyManager;
    }
    public synchronized void start(){
        if(running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        if(!running)
            return;
        running = false;
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

