//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Unit17a_Enemy {

  private Image enemy;
  private int x, y, speed;

  public Unit17a_Enemy(int x, int y, int speed) throws IOException {
    this.x = x;
    this.y = y;
    this.speed = speed;

    enemy = ImageIO.read(new File("enemy.gif"));
  }

  public Image getEnemy() {
    return enemy;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getSpeed() {
    return speed;
  }

  public void move() {
    x += speed;
  }

  public void draw(Graphics2D g) {
    g.drawImage(enemy, x, y, null);
  }
}
