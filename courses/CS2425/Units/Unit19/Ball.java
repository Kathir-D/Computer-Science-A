//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {

  private int xSpeed;
  private int ySpeed;

  public Ball() {
    super(200, 200);
    xSpeed = 3;
    ySpeed = 1;
  }

  public Ball(int x, int y) {
    super(x, y);
    xSpeed = 3;
    ySpeed = 1;
  }

  public Ball(int x, int y, int width, int height) {
    super(x, y, width, height);
    xSpeed = 3;
    ySpeed = 1;
  }

  public Ball(int x, int y, int width, int height, Color col) {
    super(x, y, width, height, col);
    xSpeed = 3;
    ySpeed = 1;
  }

  public Ball(int x, int y, int width, int height, Color col, int xS, int yS) {
    super(x, y, width, height, col);
    xSpeed = xS;
    ySpeed = yS;
  }

  public Ball(int x, int y, int width, int height, int xS, int yS) {
    super(x, y, width, height);
    xSpeed = xS;
    ySpeed = yS;
  }

  public void setXSpeed(int xS) {
    xSpeed = xS;
  }

  public void setYSpeed(int yS) {
    ySpeed = yS;
  }

  public void moveAndDraw(Graphics window) {
    draw(window, Color.white);
    window.fillOval(getX(), getY(), getWidth(), getHeight());
    setX(getX() + xSpeed);
    setY(getY() + ySpeed);

    window.setColor(Color.black);
    window.fillOval(getX(), getY(), getWidth(), getHeight());
  }

  public boolean equals(Object obj) {
    Ball ball = (Ball) obj;
    if (ball.getXSpeed() != xSpeed) {
      return false;
    }
    if (ball.getYSpeed() != ySpeed) {
      return false;
    } else {
      return true;
    }
  }

  public int getXSpeed() {
    return xSpeed;
  }

  public int getYSpeed() {
    return ySpeed;
  }

  public String toString() {
    return super.toString() + " " + xSpeed + " " + ySpeed;
  }
}
/*

© A+ Computer Science – Pong - www.apluscompsci.com
Lab Goal : This lab was designed to teach you more object oriented programming and how to write a very
simple game. You will show that you understand inheritance as well by creating the Ball class.
Lab Description : Complete the code for the Ball class located in Ball.java. Test the Ball class
using the BallTestOne.java and BallTestTwo.java files. As you are testing Ball, you will also be
retesting Block as Ball is and extension of Block.
The Ball is going to bounce around the screen. It will bounce around the screen because of checks placed in
the BallTest. You can change the boundaries to create a larger field for the Ball. Eventually, the Ball will
bounce off of the upper and lower walls and the paddles, but stop when it contacts the left and right walls.
public class Ball extends Block
{
private int xSpeed;
private int ySpeed;
public Ball(){
super(200,200);
xSpeed = 3;
ySpeed = 1;
}
//add other Ball constructors
//set methods
public void moveAndDraw(Graphics window)
{
//draw a white ball at
//old ball location
setX(getX()+xSpeed);
//setY
//draw ball at new location
}
//equals method
//get methods
public String toString(){
return " ";
}
}
Files Needed ::
Block.java
Ball.java
BallTestOne.java
BallTestTwo.java
Tester.java
Sample Output ( BallTestOne.java )
200 200 10 10 java.awt.Color[r=0,g=0,b=0] 3 1
100 90 10 10 java.awt.Color[r=0,g=0,b=0] 3 1
100 100 30 50 java.awt.Color[r=0,g=0,b=0] 3 1
100 100 30 50 java.awt.Color[r=0,g=0,b=255] 3 1
100 100 30 50 java.awt.Color[r=0,g=0,b=255] 5 6
100 100 30 50 java.awt.Color[r=0,g=0,b=255] 5 6
false
true
A+ Computer Science PONG PART II
 */
