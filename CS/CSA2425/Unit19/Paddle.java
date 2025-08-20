//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {

  private int speed;

  public Paddle() {
    super(10, 10);
    speed = 5;
  }

  public Paddle(int x, int y) {
    super(x, y);
    speed = 5;
  }

  public Paddle(int x, int y, int s) {
    super(x, y);
    speed = s;
  }

  public Paddle(int x, int y, int w, int h, int s) {
    super(x, y, w, h);
    speed = s;
  }

  public Paddle(int x, int y, int w, int h, Color col, int s) {
    super(x, y, w, h, col);
    speed = s;
  }

  public void setSpeed(int s) {
    speed = s;
  }

  public void moveUpAndDraw(Graphics window) {
    draw(window, Color.WHITE);
    setY(getY() - speed);
    draw(window, Color.BLACK);
  }

  public void moveDownAndDraw(Graphics window) {
    draw(window, Color.WHITE);
    setY(getY() + speed);
    draw(window, Color.BLACK);
  }

  public int getSpeed() {
    return speed;
  }

  public String toString() {
    return super.toString() + " " + getSpeed();
  }
}
/*

© A+ Computer Science – Pong - www.apluscompsci.com
Lab Goal : This lab was designed to teach you more object oriented programming and how to write a very
simple game.
Lab Description : Complete the code for the Paddle class located in Paddle.java. Test the Paddle
class using the PaddleTestOne.java and PaddleTestTwo.java files. As you are testing Paddle, you
will also be testing Block as Paddle is and extension of Block.
The Paddle class is going to move up and down in a fixed X position. The Paddle will never move side to side.
public class Paddle extends Block
{
private int speed;
public Paddle()
{
super(10,10);
speed =5;
}
//add other Paddle constructors
public void setSpeed(int s)
{
}
public void moveUpAndDraw(Graphics window)
{
}
public void moveDownAndDraw(Graphics window)
{
}
public int getSpeed()
{
return 50;
}
}
Sample Output ( PaddleTestOne.java )
10 10 10 10 java.awt.Color[r=0,g=0,b=0] 5
100 90 10 10 java.awt.Color[r=0,g=0,b=0] 5
100 100 10 10 java.awt.Color[r=0,g=0,b=0] 30
100 100 30 50 java.awt.Color[r=0,g=0,b=0] 8
100 100 30 20 java.awt.Color[r=0,g=255,b=0] 6
false
true
Files Needed ::
Block.java
Ball.java
Paddle.java
PaddleTestOne.java
PaddleTestTwo.java
Tester.java
A+ Computer Science PONG PART III
 */
