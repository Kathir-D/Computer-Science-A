//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Unit18b_APlusImage extends Canvas {

  private int[][] image;
  private String fileName;

  public Unit18b_APlusImage() {
    try {
      //read from the file
      //load the file information
      //into the matrix

    } catch (Exception e) {}

    setSize(640, 480);
    setBackground(Color.WHITE);
    setVisible(true);
  }

  public Unit18b_APlusImage(String name) {
    try {
      //read from the file
      //load the file information
      //into the matrix

    } catch (Exception e) {}

    setSize(640, 480);
    setBackground(Color.WHITE);
    setVisible(true);
  }

  public void paint(Graphics window) {
    window.setFont(new Font("TAHOMA", Font.BOLD, 12));
    window.setColor(Color.BLUE);
    window.drawString("APLUS IMAGE", 420, 40);
    window.drawString("IMAGES", 420, 55);

    showImage(window);
  }

  public void showImage(Graphics window) {
    //roygbiv
    //2 red
    //4 orange
    //6 yellow
    //8 green
    //10 blue
    //12 indigo
    //14 violet

    //draw the image on the screen

  }
}
