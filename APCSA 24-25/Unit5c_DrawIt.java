//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;

public class Unit5c_DrawIt extends JFrame {

  public static int WIDTH = 800;
  public static int HEIGHT = 600;

  public Unit5c_DrawIt() {
    super("DrawIt");
    setSize(WIDTH, HEIGHT);
    setBackground(Color.BLACK);

    Unit5c_Tablet tb = new Unit5c_Tablet(this);
    ((Component) tb).setFocusable(true);

    getContentPane().add(tb);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String args[]) {
    Unit5c_DrawIt run = new Unit5c_DrawIt();
  }
}
