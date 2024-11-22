//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.*;

public class Unit3d_Shape {
    // instance variables
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    public Unit3d_Shape(int x, int y, int wid, int ht, Color col) {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = col;
    }

    public void draw(Graphics window) {
        window.setColor(color);
        window.fillRect(xPos, yPos, width, height);
        window.setColor(Color.WHITE);
        window.fillRect((int) (xPos + width * 0.1), (int) (yPos + height * 0.1), (int) (width * 0.8), (int) (height * 0.8));
        window.setColor(Color.GREEN);
        window.fillOval((int) (xPos + width * 0.1), (int) (yPos + height * 0.1), (int) (width * 0.8), (int) (height * 0.8));
        window.setColor(Color.RED);
        window.drawLine((int) (xPos - width * 0.1), (int) (yPos - height * 0.1), xPos, yPos);
        window.drawLine((xPos + width), yPos, (int) (xPos + width * 1.1), (int) (yPos - height * 0.1));
        window.setColor(Color.ORANGE);
        window.fillRect((int) (xPos + width * 0.2), (int) (yPos + height * 1.0), (int) (width * 0.1), (int) (height * 0.4));
        window.fillRect((int) (xPos + width * 0.7), (int) (yPos + height * 1.0), (int) (width * 0.1), (int) (height * 0.4));
    }

    public String toString() {
        return xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
}
        /*
        window.setColor(color);
        window.fillRect(xPos,yPos,width,height);
        window.setColor(Color.WHITE);
        window.fillRect((int) (xPos*1.05), (int) (yPos*1.05), (int) (width*0.8), (int) (height*0.8));
        window.setColor(Color.GREEN);
        window.fillOval((int) (xPos*1.05),(int) (yPos*1.05),(int)(width*0.8),(int) (height*0.8));
        window.setColor(Color.RED);
        window.drawLine((int)(xPos*0.9),(int) (yPos*0.9),xPos,yPos);
        window.drawLine((int)((xPos)*1.1)+width,(int) (yPos*0.9),xPos+width,yPos);
        window.setColor(Color.ORANGE);
        window.fillRect(xPos,(int) ((yPos+width)*1.2),40,40);
        */