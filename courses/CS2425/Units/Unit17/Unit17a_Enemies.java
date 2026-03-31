//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.ArrayList;

public class Unit17a_Enemies {

  private ArrayList<Unit17a_Enemy> enemies;
  private Unit17a_Person guy;

  public Unit17a_Enemies(Unit17a_Person p) {
    enemies = new ArrayList<Unit17a_Enemy>();
    guy = p;
  }

  // DRAW AND COLLISION METHOD
  public void drawAndCollision(Graphics2D g) throws IOException {
    // ADD ENEMIES
    addEnemy();

    // REMOVE ENEMIES THAT GO OUT OF BOUND
    for (int i = 0; i < enemies.size(); i++) {
      if (enemies.get(i).getX() > 800) {
        enemies.remove(i);
      }
    }

    // GO THROUGH THE LIST OF ENEMIES AND CALL THEIR draw() and move() method and check if their collide with guy if so then call the GAMEOVER() METHOD
    for (int i = 0; i < enemies.size(); i++) {
      enemies.get(i).draw(g);
      enemies.get(i).move();
      if (guy.collide(enemies.get(i).getX(), enemies.get(i).getY())) {
        GAMEOVER(g);
      }
    }

    // IF THE PLAYER REACHES THE GRASS ON THE BOTTOM SIDE CALL THE VICTORY() method
    if (guy.getY() > 400) {
      VICTORY(g);
    }
  }

  public void GAMEOVER(Graphics2D g) {
    Unit17a_Game.RUNNING = false;
    Font f = new Font("Dialog", Font.PLAIN, 24);
    g.setFont(f);
    g.drawString("GAME OVER!", 400, 300);
  }

  public void VICTORY(Graphics2D g) {
    Font f = new Font("Dialog", Font.PLAIN, 24);
    g.setFont(f);
    g.drawString("VICTORY!", 400, 300);
    Unit17a_Game.RUNNING = false;
  }

  // ADDS AN ENEMY TO THE ENEMY LIST
  public void addEnemy() throws IOException {
    if (Math.random() < 0.1) {
      enemies.add(
        new Unit17a_Enemy(
          0,
          (int) (Math.random() * 500),
          (int) (Math.random() * 10) + 1
        )
      );
    }
  }

  // RETURN HOW MANY ENEMIES THERE ARE
  public int numEnemies() {
    return enemies.size();
  }
}
