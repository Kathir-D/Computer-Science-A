package Unit19; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block {

  private int xPos;
  private int yPos;
  private int width;
  private int height;

  private Color color;

  public Block() {}

  public Block(int x, int y) {
    xPos = x;
    yPos = y;
    width = 10;
    height = 10;
    color = Color.BLACK;
  }

  public Block(int x, int y, int w, int h) {
    xPos = x;
    yPos = y;
    width = w;
    height = h;
    color = Color.BLACK;
  }

  public Block(int x, int y, int w, int h, Color c) {
    xPos = x;
    yPos = y;
    width = w;
    height = h;
    color = c;
  }

  public void setX(int x) {
    xPos = x;
  }

  public void setY(int y) {
    yPos = y;
  }

  public void setWidth(int w) {
    width = w;
  }

  public void setHeight(int h) {
    height = h;
  }

  public void setColor(Color c) {
    color = c;
  }

  public void draw(Graphics window) {
    //uncomment after you write the set and get methods
    window.setColor(color);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public void draw(Graphics window, Color col) {}

  public boolean equals(Object obj) {
    return false;
  }

  public int getX() {
    return xPos;
  }

  public int getY() {
    return yPos;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public Color getColor() {
    return color;
  }

  public String toString() {
    return xPos + " " + yPos + " " + width + " " + height + " " + color;
  }
}
/*

© A+ Computer Science – Pong - www.apluscompsci.com
Lab Goal : This lab was designed to teach you more object oriented programming and how to write a very
simple game.
Lab Description : Complete the code for the Block class located in Block.java. Test Block using the
BlockTestOne.java and BlockTestTwo.java files. The Block class is the building block for the Pong
project. Ball and Paddle are Blocks. Both Ball and Paddle will extend Block. The Block class stores position,
size, and color properties.
public class Block
{
private int xPos; //x position of the block
private int yPos; //y position of the block
private int width; //width of the block
private int height; //height of the block
private Color color; //color of the block
public Block(){
}
//add other Block constructors
//other modifiers not shown
public void draw(Graphics window){
window.setColor(color);
window.fillRect(getX(), getY(), getWidth(), getHeight());
}
public void draw(Graphics window, Color col)
{
}
public boolean equals(Object obj)
{
}
//other accessors not shown
}
Files Needed ::
Block.java
BlockTestOne.java
BlockTestTwo.java
Tester.java
Sample Output ( BlockTestOne.java )
// x – y – wid – ht - color
100 150 10 10 java.awt.Color[r=0,g=0,b=0]
50 50 30 30 java.awt.Color[r=0,g=0,b=0]
350 350 15 15 java.awt.Color[r=255,g=0,b=0]
450 50 20 60 java.awt.Color[r=0,g=255,b=0]
false
true
A+ Computer Science PONG PART I

 */
