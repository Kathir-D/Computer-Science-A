//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Unit17a_GroundRunner implements Runnable, KeyListener {

  static final int WIDTH = 800;
  static final int HEIGHT = 600;
  static boolean RUNNING = true;

  // Person
  private Unit17a_Person p;

  // Ground
  private Unit17a_Ground gro;

  private JFrame frame;
  private Canvas canvas;
  private BufferStrategy bufferStrategy;

  public Unit17a_GroundRunner() throws IOException {
    frame = new JFrame("GroundRunner");

    JPanel panel = (JPanel) frame.getContentPane();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    panel.setLayout(null);

    canvas = new Canvas();
    canvas.setBounds(0, 0, WIDTH, HEIGHT);
    canvas.setIgnoreRepaint(true);

    panel.add(canvas);

    // Initialize person
    p = new Unit17a_Person(400, 100);

    // Initialize ground
    gro = new Unit17a_Ground();

    // ******************************************************************

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setResizable(false);
    frame.setVisible(true);

    canvas.createBufferStrategy(2);
    bufferStrategy = canvas.getBufferStrategy();

    canvas.requestFocus();
    canvas.addKeyListener(this);
  }

  // GroundRunner loop
  public void run() {
    while (RUNNING) {
      try {
        render();
      } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {}
    }
  }

  private void render() throws IOException {
    Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
    g.clearRect(0, 0, WIDTH, HEIGHT);
    render(g);
    g.dispose();
    bufferStrategy.show();
  }

  // DRAW METHOD
  void render(Graphics2D g) throws IOException {
    gro.drawGround(g);
    p.drawPerson(g);
  }

  public void keyTyped(KeyEvent e) {
    // not used
  }

  public void keyReleased(KeyEvent e) {
    // not used
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == e.VK_W) {
      p.moveUp();
    }
    if (e.getKeyCode() == e.VK_S) {
      p.moveDown();
    }
    if (e.getKeyCode() == e.VK_A) {
      p.moveLeft();
    }
    if (e.getKeyCode() == e.VK_D) {
      p.moveRight();
    }
  }

  // ******************************************************************
  public static void main(String[] args) throws IOException {
    Unit17a_GroundRunner GroundRunner = new Unit17a_GroundRunner();
    new Thread(GroundRunner).start();
  }
}
