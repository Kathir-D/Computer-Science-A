//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;

public class Unit17a_Person {

  private ArrayList<Image> list;
  private int x, y, current;

  public Unit17a_Person(int x, int y) throws IOException {
    this.x = x;
    this.y = y;
    //point the array list at a new ArrayList

    //add all images to the list
  }

  // will return true if person collides with another object
  public boolean collide(int x, int y) {
    Rectangle a = new Rectangle(this.x, this.y, 50, 50);
    Rectangle b = new Rectangle(x, y, 50, 50);
    return a.intersects(b);
  }

  public void drawPerson(Graphics2D g) {
    //draw the current image on the screen
  }

  public Image getCurrent() {
    //return the current image
    return null;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void moveRight() {
    //finish
  }

  public void moveLeft() {
    //finish
  }

  public void moveUp() {
    //finish
  }

  public void moveDown() {
    //finish
  }
}
