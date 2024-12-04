//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Unit3b_SmileyFace extends Canvas {

  public Unit3b_SmileyFace() { //constructor - sets up the class
    setSize(800, 600);
    setBackground(Color.WHITE);
    setVisible(true);
  }

  public void paint(Graphics window) {
    smileyFace(window);
  }

  public void smileyFace(Graphics window) {
    window.setColor(Color.BLUE);
    window.drawString("SMILEY FACE LAB ", 35, 35);

    window.setColor(Color.YELLOW);
    window.fillOval(210, 100, 400, 400);

    window.setColor(Color.black);
    window.fillOval(330, 200, 25, 25);
    window.fillOval(530, 200, 25, 25);

    window.fillArc(410, 300, 100, 100, 180, 360); // close enough to smile
  }
}
