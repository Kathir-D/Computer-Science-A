package Unit19; //(c) A+ Computer Science

import static java.lang.Character.*;

import java.awt.Canvas;
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable {

  private Ball ball;
  private Paddle leftPaddle;
  private Paddle rightPaddle;
  private boolean[] keys;
  private BufferedImage back;

  public Pong() {
    ball = new Ball();
    ball.setXSpeed(1);
    leftPaddle = new Paddle(0, 100, 10, 50, 2);
    rightPaddle = new Paddle(790, 100, 10, 50, 2);

    keys = new boolean[4];

    setBackground(Color.WHITE);
    setVisible(true);

    new Thread(this).start();
    addKeyListener(this); //starts the key thread to log key strokes
  }

  public void update(Graphics window) {
    paint(window);
  }

  public void paint(Graphics window) {
    //set up the double buffering to make the game animation nice and smooth
    Graphics2D twoDGraph = (Graphics2D) window;

    //take a snap shop of the current screen and same it as an image
    //that is the exact same width and height as the current screen
    if (back == null) back = (BufferedImage) (createImage(
        getWidth(),
        getHeight()
      ));

    //create a graphics reference to the back ground image
    //we will draw all changes on the background image
    Graphics graphToBack = back.createGraphics();

    graphToBack.setColor(Color.WHITE); // so it doesn't leave a trail
    graphToBack.fillRect(0, 0, getWidth(), getHeight());

    // Draw the game elements on the clean background
    ball.moveAndDraw(graphToBack);
    leftPaddle.draw(graphToBack);
    rightPaddle.draw(graphToBack);

    //see if ball hits left wall or right wall
    if (!(ball.getX() >= 10 && ball.getX() <= 780)) {
      ball.setXSpeed(0);
      ball.setYSpeed(0);
    }

    //see if the ball hits the top or bottom wall
    if (!(ball.getY() >= 10 && ball.getY() <= 580)) {
      ball.setYSpeed(-ball.getYSpeed());
    }

    //see if the ball hits the left paddle
    if (
      ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() &&
      ball.getY() >= leftPaddle.getY() &&
      ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()
    ) {
      ball.setXSpeed(-ball.getXSpeed());
    }

    //see if the ball hits the right paddle
    if (
      ball.getX() >= rightPaddle.getX() - ball.getWidth() &&
      ball.getY() >= rightPaddle.getY() &&
      ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()
    ) {
      ball.setXSpeed(-ball.getXSpeed());
    }

    //see if the paddles need to be moved
    if (keys[0]) {
      leftPaddle.moveUpAndDraw(graphToBack);
    }
    if (keys[1]) {
      leftPaddle.moveDownAndDraw(graphToBack);
    }
    if (keys[2]) {
      rightPaddle.moveUpAndDraw(graphToBack);
    }
    if (keys[3]) {
      rightPaddle.moveDownAndDraw(graphToBack);
    }

    twoDGraph.drawImage(back, null, 0, 0);
  }

  public void keyPressed(KeyEvent e) {
    switch (toUpperCase(e.getKeyChar())) { // Why was W,Z,I,M used instead of anything normal?
      case 'W':
        keys[0] = true;
        break;
      case 'S':
        keys[1] = true;
        break;
      case 'I':
        keys[2] = true;
        break;
      case 'J':
        keys[3] = true;
        break;
    }
  }

  public void keyReleased(KeyEvent e) {
    switch (toUpperCase(e.getKeyChar())) {
      case 'W':
        keys[0] = false;
        break;
      case 'S':
        keys[1] = false;
        break;
      case 'I':
        keys[2] = false;
        break;
      case 'J':
        keys[3] = false;
        break;
    }
  }

  public void keyTyped(KeyEvent e) {}

  public void run() {
    try {
      while (true) {
        Thread.currentThread().sleep(8);
        repaint();
      }
    } catch (Exception e) {}
  }
}
