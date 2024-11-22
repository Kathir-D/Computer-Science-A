import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Unit3b_BigHouse extends Canvas
{
   public Unit3b_BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.PINK);

      window.fillRect( 200, 200, 400, 400 );

      window.setColor(Color.WHITE);
      window.fillRect(350,400,100,200);
      window.setColor(Color.BLACK);
      window.fillArc(350,480,15,15,0,360);
      window.setColor(Color.RED);
      window.fillRect(100,100,600,100);


   }
}