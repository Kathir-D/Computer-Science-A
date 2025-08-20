package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Unit3d_ShapePanel extends JPanel {

  public Unit3d_ShapePanel() {
    setBackground(Color.WHITE);
    setVisible(true);
  }

  public void update(Graphics window) {
    paint(window);
  }

  /*
   * All of your test code should be placed in paint.
   */
  public void paint(Graphics window) {
    Unit3d_Shape obj = new Unit3d_Shape(200, 200, 100, 100, Color.BLUE);
    Unit3d_Shape obj2 = new Unit3d_Shape(150, 320, 25, 100, Color.GRAY);
    Unit3d_Shape obj3 = new Unit3d_Shape(342, 463, 74, 59, Color.RED);

    window.setColor(Color.WHITE);
    window.fillRect(0, 0, getWidth(), getHeight());
    window.setColor(Color.BLUE);
    window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
    window.setFont(new Font("TAHOMA", Font.BOLD, 18));
    window.drawString("CREATE YOUR OWN SHAPE!", 40, 40);

    obj.draw(window.create());
    obj2.draw(window.create());
    obj3.draw(window.create());
    // instantiate a Shape
    // tell your shape to draw

    // instantiate a Shape
    // tell your shape to draw

    // instantiate a Shape
    // tell your shape to draw
  }
}
