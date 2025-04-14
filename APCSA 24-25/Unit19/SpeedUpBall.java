package Unit19; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;

class SpeedUpBall extends Ball {

  public SpeedUpBall() {
    super();
  }

  public SpeedUpBall(int x, int y) {
    super(x, y);
  }

  public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
    super(x, y, xSpd, ySpd);
  }

  public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
    super(x, y, wid, ht, xSpd, ySpd);
  }

  public SpeedUpBall(
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

  public void setXSpeed(int xSpd) {
    if (xSpd == 0) {
      super.setXSpeed(xSpd);
    } else if (xSpd > 0) {
      super.setXSpeed(xSpd + 1);
    } else {
      super.setXSpeed(xSpd - 1);
    }
    if (getYSpeed() == 0) {
      super.setYSpeed(getYSpeed());
    } else if (getYSpeed() > 0) {
      super.setYSpeed(getYSpeed() + 1);
    } else {
      super.setYSpeed(getYSpeed() - 1);
    }
  }

  public void setYSpeed(int ySpd) {
    if (ySpd == 0) {
      super.setYSpeed(ySpd);
    } else if (ySpd > 0) {
      super.setYSpeed(ySpd + 1);
    } else {
      super.setYSpeed(ySpd - 1);
    }
    if (getXSpeed() == 0) {
      super.setXSpeed(getXSpeed());
    } else if (getXSpeed() > 0) {
      super.setXSpeed(getXSpeed() + 1);
    } else {
      super.setXSpeed(getXSpeed() - 1);
    }
  }
}
