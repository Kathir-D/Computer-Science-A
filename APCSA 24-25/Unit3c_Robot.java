import java.awt.*;

class Unit3c_Robot extends Canvas {

  public Unit3c_Robot() { //constructor method - sets up the class
    setSize(800, 600);
    setBackground(Color.WHITE);
    setVisible(true);
  }

  public void paint(Graphics window) {
    window.setColor(Color.BLUE);

    window.drawString("Robot LAB ", 35, 35);

    head(getGraphics());
    upperBody(getGraphics());
    lowerBody(getGraphics());
  }

  public void head(Graphics window) {
    window.setColor(Color.YELLOW);

    window.fillOval(300, 100, 200, 100);

    window.setColor(Color.RED);
    window.drawArc(320, 125, 150, 50, 180, 180);

    window.setColor(Color.GREEN);
    window.fillArc(330, 125, 8, 8, 0, 360);
    window.fillArc(430, 125, 8, 8, 0, 360);
    window.setColor(Color.black);
    window.fillArc(380, 140, 15, 8, 0, 360);
  }

  public void upperBody(Graphics window) {
    window.setColor(Color.BLUE);
    window.fillRect(300, 250, 200, 140);
    window.setColor(Color.BLACK);
    window.drawLine(200, 200, 300, 250);
    window.drawLine(500, 250, 600, 200);
  }

  public void lowerBody(Graphics window) {
    window.setColor(Color.GRAY);
    window.fillRect(300, 400, 200, 140);
    window.setColor(Color.BLACK);
    window.drawLine(500, 540, 600, 580);
    window.drawLine(300, 540, 200, 580);
  }
}
