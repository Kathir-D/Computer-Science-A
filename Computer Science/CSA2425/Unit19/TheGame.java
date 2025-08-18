import java.awt.Component;
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;

public class TheGame extends JFrame {

  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;

  public TheGame() {
    super("PONG");
    setSize(WIDTH, HEIGHT);

    Pong game = new Pong();

    ((Component) game).setFocusable(true);
    getContentPane().add(game);

    setVisible(true);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    TheGame run = new TheGame();
  }
}
