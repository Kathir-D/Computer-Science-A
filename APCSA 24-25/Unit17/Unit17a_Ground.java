//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Unit17a_Ground {

  private ArrayList<Image> tiles;

  public Unit17a_Ground() throws IOException {
    //point the tiles at new array list

    tiles = new ArrayList<Image>();

    //add in each of the images for the grass.gif, gtoroad.gif, road.gif, rtograss.gif

    Image grass = ImageIO.read(new File("APCSA 24-25/Unit17a_grass.gif"));
    tiles.add(grass);
    Image gtoroad = ImageIO.read(new File("APCSA 24-25/Unit17a_gtoroad.gif"));
    tiles.add(gtoroad);
    Image road = ImageIO.read(new File("APCSA 24-25/Unit17a_road.gif"));
    tiles.add(road);
    Image rtograss = ImageIO.read(new File("APCSA 24-25/Unit17a_rtograss.gif"));
    tiles.add(rtograss);
    //tiles.add( ImageIO.read(new File("grass.gif")) );

  }

  public void drawGround(Graphics2D g) {
    //draw the ground on the screen

    /*
    Use nested loops and ifs to draw the different images. The tiles need to be drawn
    every 50 pixels since they are 50 x 50 px image.
    Use the y position to determine which tile to draw:
    The top two tiles are grass (when y is 0 and 50)
    The third tile is grass to road
    The middle tiles are road
    The second to last tile is road to grass
    The bottom tile is grass
     */
    int x, y = 0;
    int current = 0;

    for (int j = 0; j < 12; j++) {
      if (j == 0 || j == 1) {
        current = 0;
      } else if (j == 2) {
        current = 1;
      } else if (j > 2 && j < 9) {
        current = 2;
      } else if (j == 9) {
        current = 3;
      } else if (j == 10 || j == 11) {
        current = 0;
      }

      x = 0;
      for (int i = 0; i < 16; i++) {
        g.drawImage(tiles.get(current), x, y, null);
        x += 50;
      }

      y += 50;
    }
  }
}
