package CSA2425;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class Unit3c_SpongeBob extends Canvas {

  public Unit3c_SpongeBob() {
    setSize(800, 600);
    setBackground(Color.WHITE);
    setVisible(true);
  }

  public void paint(Graphics window) {
    window.setColor(Color.BLACK);
    window.drawRect(250, 100, 300, 350); // outline
    window.setColor(Color.YELLOW);
    window.fillRect(250, 100, 300, 300); // Body

    window.setColor(Color.WHITE);
    window.fillOval(300, 150, 80, 80); // Left Eye
    window.fillOval(420, 150, 80, 80); // Right Eye
    window.setColor(Color.BLUE);

    window.setColor(Color.BLACK);
    window.fillOval(355, 195, 10, 10); // Left Eye dot
    window.fillOval(445, 195, 10, 10); // Right Eye dot

    window.setColor(Color.BLACK);
    window.drawArc(320, 250, 150, 50, 0, -180); // Mouth

    window.setColor(Color.WHITE);
    window.fillRect(370, 300, 20, 20); // Left Tooth
    window.fillRect(410, 300, 20, 20); // Right Tooth

    window.setColor(Color.BLACK);
    window.drawRect(250, 350, 300, 100); // Outline
    window.setColor(Color.RED);
    window.fillRect(250, 400, 300, 50); // Brown pants
    window.setColor(Color.WHITE);
    window.fillRect(250, 350, 300, 50); // White Shirt

    window.setColor(Color.YELLOW);
    window.fillRect(300, 450, 20, 50); // Left Leg
    window.fillRect(480, 450, 20, 50); // Right Leg

    window.setColor(Color.BLACK);
    window.fillRect(290, 500, 40, 20); // Left Shoe
    window.fillRect(470, 500, 40, 20); // Right Shoe
  }
}
