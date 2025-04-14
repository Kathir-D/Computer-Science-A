package Unit19; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

class BlinkyBall extends Ball {

  public BlinkyBall() {
    super();
  }

  public BlinkyBall(int x, int y) {
    super(x, y);
  }

  public BlinkyBall(int x, int y, int wid, int ht) {
    super(x, y, wid, ht);
  }

  public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
    super(x, y, wid, ht, xSpd, ySpd);
  }

  public BlinkyBall(
    int x,
    int y,
    int wid,
    int ht,
    Color col,
    int xSpd,
    int ySpd
  ) {
    super(x, y, wid, ht, col, xSpd, ySpd);
  }

  public Color randomColor() {
    int r = (int) (Math.random() * 256);
    int g = (int) (Math.random() * 256);
    int b = (int) (Math.random() * 256);
    return new Color(r, g, b);
  }

  public void moveAndDraw(Graphics window) {
    setColor(randomColor());
    super.moveAndDraw(window);
  }
}
