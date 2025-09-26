package CS22526.Labs.Unit3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends Canvas implements MouseListener {

  private int mouseX, mouseY;
  private boolean mouseClicked, gameOver;
  private int mouseButton, prevMouseButton;
  private Grid board;

  private static final int WIDTH = 150;
  private static final int HEIGHT = 150;
  private static final int SCALE = 50;
  private static final int BOARDSIZE = 3;

  public GameBoard() {
    mouseClicked = false;
    mouseX = mouseY = 0;
    mouseButton = 0;
    prevMouseButton = -1;

    board = new Grid(BOARDSIZE, BOARDSIZE);

    addMouseListener(this);
    setBackground(Color.WHITE);
  }

  public void mouseClicked(MouseEvent e) {
    mouseClicked = true;
    mouseX = e.getX();
    mouseY = e.getY();
    mouseButton = e.getButton();
    repaint();
  }

  public void paint(Graphics window) {
    window.setColor(Color.white);
    window.fillRect(0, 0, 640, 480);
    window.setFont(new Font("TAHOMA", Font.BOLD, 12));
    window.setColor(Color.blue);
    window.drawString("TIC TAC TOE", 420, 55);
    window.drawString("left mouse click == [X]", 420, 85);
    window.drawString("right mouse click == [O]", 420, 105);

    window.drawRect(50, 50, WIDTH, HEIGHT);
    window.drawRect(100, 50, WIDTH / 3, HEIGHT);
    window.drawRect(50, 100, WIDTH, HEIGHT / 3);

    if (mouseClicked) {
      markBoard();
      board.drawGrid(window);

      if (determineWinner(window)) {
        board = new Grid(BOARDSIZE, BOARDSIZE);
        paint(window);
        prevMouseButton = -1;
      }
      mouseClicked = false;
    }
  }

  public void markBoard() {
    if (
      mouseX >= WIDTH / 3 &&
      mouseX <= WIDTH + 50 &&
      mouseY >= HEIGHT / 3 &&
      mouseY <= HEIGHT + 50
    ) {
      int r = mouseY / 50 - 1;
      int c = mouseX / 50 - 1;
      Piece piece = (Piece) board.getSpot(r, c);
      //if BUTTON1 was pressed and BUTTON1 was not pressed last mouse press
      if (
        mouseButton == MouseEvent.BUTTON1 && prevMouseButton != mouseButton
      ) { //left mouse button pressed
        if (piece == null) {
          board.setSpot(
            r,
            c,
            new Piece(
              5 + c * 50 + 50,
              5 + r * 50 + 50,
              WIDTH / 3 - 10,
              HEIGHT / 3 - 10,
              "X",
              Color.GREEN
            )
          );
        }
        //save the current button pressed to compare to next button pressed
        prevMouseButton = mouseButton;
      }
      if (mouseButton == MouseEvent.BUTTON3 && prevMouseButton != mouseButton) {
        if (piece == null) {
          board.setSpot(
            r,
            c,
            new Piece(
              5 + c * 50 + 50,
              5 + r * 50 + 50,
              WIDTH / 3 - 10,
              HEIGHT / 3 - 10,
              "O",
              Color.RED
            )
          );
        } //left mouse button pressed

        //save the current button pressed to compare to next button pressed
        prevMouseButton = mouseButton;
      }
    }
  }

  public boolean determineWinner(Graphics window) {
    String winner = "";
    for (int r = 0; r < board.getNumRows(); r++) {
      Piece row0 = (Piece) board.getSpot(r, 0);
      Piece row1 = (Piece) board.getSpot(r, 1);
      Piece row2 = (Piece) board.getSpot(r, 2);

      if (row0 == null || row1 == null || row2 == null) continue;

      if (
        row0.getName().equals(row1.getName()) &&
        row0.getName().equals(row2.getName())
      ) {
        winner = row0.getName() + " wins horizontally!";
        break;
      }
    }

    for (int r = 0; r < board.getNumRows(); r++) {
      Piece row0 = (Piece) board.getSpot(0, r);
      Piece row1 = (Piece) board.getSpot(1, r);
      Piece row2 = (Piece) board.getSpot(2, r);

      if (row0 == null || row1 == null || row2 == null) continue;

      if (
        row0.getName().equals(row1.getName()) &&
        row0.getName().equals(row2.getName())
      ) {
        winner = row0.getName() + " wins vertically!";
        break;
      }
    }

    if (winner.equals("")) {
      Piece row0 = (Piece) board.getSpot(0, 0);
      Piece row1 = (Piece) board.getSpot(1, 1);
      Piece row2 = (Piece) board.getSpot(2, 2);

      if (row0 != null && row1 != null && row2 != null &&
        row0.getName().equals(row1.getName()) &&
        row0.getName().equals(row2.getName())
      ) {
        winner = row0.getName() + " wins diagonaly!";
      }
    }

    if (winner.equals("")) {
      Piece row0 = (Piece) board.getSpot(0, 2);
      Piece row1 = (Piece) board.getSpot(1, 1);
      Piece row2 = (Piece) board.getSpot(2, 0);

      if (row0 != null && row1 != null && row2 != null &&
        row0.getName().equals(row1.getName()) &&
        row0.getName().equals(row2.getName())
      ) {
        winner = row0.getName() + " wins diagonaly!";
      }
    }

    if (winner.indexOf("no name") > -1) {
      board.drawGrid(window);
      return false;
    } else if (board.drawGrid(window) && winner.length() == 0) {
      winner = "cat's game - no winner!\n\n";
    }

    if (winner.length() > 0) {
      window.setFont(new Font("TAHOMA", Font.BOLD, 22));
      window.setColor(Color.orange);
      window.drawString(winner, 320, 355);
      try {
        Thread.currentThread().sleep(1500);
      } catch (Exception e) {}
      repaint();
      return true;
    }
    return false;
  }

  public void mouseEntered(MouseEvent e) {}

  public void mouseExited(MouseEvent e) {}

  public void mousePressed(MouseEvent e) {}

  public void mouseReleased(MouseEvent e) {}
}
