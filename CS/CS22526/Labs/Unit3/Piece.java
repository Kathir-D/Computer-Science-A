package CS22526.Labs.Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Piece extends Cell implements Nameable {

  private String name;
  private Color color;

  public Piece() {
    super(5, 5, 5, 5);
    setName("empty");
    setColor(Color.BLUE);
  }

  public Piece(String n) {
    super(5, 5, 5, 5); // ima just use the values in the default constructor
    setName(n);
    setColor(Color.BLUE);
  }

  public Piece(int x, int y, String n) {
    super(x, y, 5, 5);
    setName(n);
    setColor(Color.BLUE);
  }

  public Piece(int x, int y, int w, int h, String n) {
    super(x, y, w, h);
    setName(n);
    setColor(Color.BLUE);
  }

  public Piece(int x, int y, int w, int h, String n, Color c) {
    super(x, y, w, h);
    setName(n);
    setColor(c);
  }

  public void setName(String n) {
    this.name = n;
  }

  public void setColor(Color c) {
    this.color = c;
  }

  public String getName() {
    return name;
  }

  public Color getColor() {
    return color;
  }

  public void draw(Graphics window) {
    window.setFont(new Font("TAHOMA", Font.BOLD, 28));
    window.setColor(getColor());
    window.drawString(getName(), getX(), getY() + 25);
  }

  public String toString() {
    return (
      "X: " +
      getX() +
      "\n" +
      "Y: " +
      getY() +
      "\n" +
      "Width: " +
      getWidth() +
      "\n" +
      "Height: " +
      getHeight() +
      "\n" +
      "Name: " +
      getName() +
      "\n" +
      "Color: " +
      getColor() +
      "\n"
    );
  }
}
