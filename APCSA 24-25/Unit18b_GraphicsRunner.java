//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class Unit18b_GraphicsRunner extends JFrame {

  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;

  public Unit18b_GraphicsRunner() {
    super("Graphics Runner");
    setSize(WIDTH, HEIGHT);

    getContentPane().add(new Unit18b_APlusImage());

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Unit18b_GraphicsRunner run = new Unit18b_GraphicsRunner();
  }
}
