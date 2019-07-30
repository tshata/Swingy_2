package za.co.wethinkcode.swingy.views.GUI;

import javax.swing.*;
import java.awt.*;

public class GridMap extends JPanel {
    int width, height, rows, cols;
    GridMap(int w, int h, int r, int c){
        setSize(width = w, height = h);
        rows = r;
        cols = c;
    }

    public void paintGrid(Graphics g){
        int i;
        width = getSize().width;
        height = getSize().height;

        //draw rows
        int rowHt = height / rows;
        for(i = 0; i < rows; i++)
            g.drawLine(0, i * rowHt, width, i * rowHt);

        int rowWid = width / cols;
        for(i = 0; i < cols; i++)
            g.drawLine(i * rowWid, 0, i * rowWid, height);
    }
}
