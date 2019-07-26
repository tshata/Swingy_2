package za.co.wethinkcode.swingy.views.GUI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {

    private boolean[] keys;
    public boolean up, down, left, right;


    public void update() {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
    }
    public KeyManager(){
        keys = new boolean[256];
    }
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        System.out.println("pressed");
    }


    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
}
