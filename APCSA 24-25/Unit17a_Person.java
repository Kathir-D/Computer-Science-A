//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class Unit17a_Person {

  private ArrayList<Image> list;
  private int x, y, current;

  public Unit17a_Person(int x, int y) throws IOException {
    this.x = x;
    this.y = y;
    current = 0;
    //point the array list at a new ArrayList
    list = new ArrayList<Image>();
    //add all images to the list
    Image front = ImageIO.read(new File("APCSA 24-25/Unit17a_dude.gif"));
    list.add(front);
    Image left = ImageIO.read(new File("APCSA 24-25/Unit17a_dudeL.gif"));
    list.add(left);
    Image right = ImageIO.read(new File("APCSA 24-25/Unit17a_dudeR.gif"));
    list.add(right);
    Image back = ImageIO.read(new File("APCSA 24-25/Unit17a_dudeU.gif"));
    list.add(back);
  }

  // will return true if person collides with another object
  public boolean collide(int x, int y) {
    Rectangle a = new Rectangle(this.x, this.y, 50, 50);
    Rectangle b = new Rectangle(x, y, 50, 50);
    return a.intersects(b);
  }

  public void drawPerson(Graphics2D g) {
    //draw the current image
    g.drawImage(list.get(current), x, y, null);
  }

  public Image getCurrent() {
    //return the current image
    return list.get(current);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void moveRight() {
    x += 10;
    current = 2;
    //finish
  }

  public void moveLeft() {
    x -= 10;
    current = 1;
    //finish
  }

  public void moveUp() {
    y -= 10;
    current = 3;
    //finish
  }

  public void moveDown() {
    y += 10;
    current = 0;
    //finish
  }
}
