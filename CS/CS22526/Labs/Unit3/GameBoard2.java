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

public class GameBoard2 extends Canvas implements MouseListener {

  private int mouseX, mouseY;
  private boolean mouseClicked, gameOver;
  private int mouseButton, prevMouseButton;
  private Grid board;
  private boolean isXTurn; // Track whose turn it is

  private static final int WIDTH = 150;
  private static final int HEIGHT = 150;
  private static final int SCALE = 50;
  private static final int BOARDSIZE = 3;

  public GameBoard2() {
    mouseClicked = false;
    mouseX = mouseY = 0;
    mouseButton = 0;
    prevMouseButton = -1;
    isXTurn = true; // X goes first

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

    // Display whose turn it is
    window.setColor(Color.BLACK);
    if (isXTurn) {
      window.drawString("Current Turn: X (Left Click)", 420, 125);
    } else {
      window.drawString("Current Turn: O (Right Click)", 420, 125);
    }

    window.drawRect(50, 50, WIDTH, HEIGHT);
    window.drawRect(100, 50, WIDTH / 3, HEIGHT);
    window.drawRect(50, 100, WIDTH, HEIGHT / 3);

    // Always draw the board first
    board.drawGrid(window);

    if (mouseClicked) {
      markBoard();
      board.drawGrid(window);

      if (determineWinner(window)) {
        // Reset the game after showing winner
        resetGame();
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

      // Only allow moves if the spot is empty and it's the correct player's turn
      if (piece == null) {
        //if BUTTON1 was pressed and it's X's turn
        if (mouseButton == MouseEvent.BUTTON1 && isXTurn) { //left mouse button pressed
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
          isXTurn = false; // Switch turn to O
          prevMouseButton = mouseButton;
        }
        //if BUTTON3 was pressed and it's O's turn
        else if (mouseButton == MouseEvent.BUTTON3 && !isXTurn) { //right mouse button pressed
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
          isXTurn = true; // Switch turn to X
          prevMouseButton = mouseButton;
        }
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

    //check for vertical winner
    if (winner.equals("")) {
      for (int c = 0; c < board.getNumCols(); c++) {
        Piece col0 = (Piece) board.getSpot(0, c);
        Piece col1 = (Piece) board.getSpot(1, c);
        Piece col2 = (Piece) board.getSpot(2, c);

        if (col0 == null || col1 == null || col2 == null) continue;

        if (
          col0.getName().equals(col1.getName()) &&
          col0.getName().equals(col2.getName())
        ) {
          winner = col0.getName() + " wins vertically!";
          break;
        }
      }
    }

    if (winner.equals("")) {
      //check for diagonal winner (top-left to bottom-right)
      Piece diag0 = (Piece) board.getSpot(0, 0);
      Piece diag1 = (Piece) board.getSpot(1, 1);
      Piece diag2 = (Piece) board.getSpot(2, 2);

      if (diag0 != null && diag1 != null && diag2 != null) {
        if (
          diag0.getName().equals(diag1.getName()) &&
          diag0.getName().equals(diag2.getName())
        ) {
          winner = diag0.getName() + " wins diagonally!";
        }
      }
    }

    if (winner.equals("")) {
      //check for diagonal winner (top-right to bottom-left)
      Piece diag0 = (Piece) board.getSpot(0, 2);
      Piece diag1 = (Piece) board.getSpot(1, 1);
      Piece diag2 = (Piece) board.getSpot(2, 0);

      if (diag0 != null && diag1 != null && diag2 != null) {
        if (
          diag0.getName().equals(diag1.getName()) &&
          diag0.getName().equals(diag2.getName())
        ) {
          winner = diag0.getName() + " wins diagonally!";
        }
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

  public void resetGame() {
    // Create a new empty board
    board = new Grid(BOARDSIZE, BOARDSIZE);
    // Reset turn to X
    isXTurn = true;
    // Reset mouse state
    mouseClicked = false;
    prevMouseButton = -1;
  }

  public void mouseEntered(MouseEvent e) {}

  public void mouseExited(MouseEvent e) {}

  public void mousePressed(MouseEvent e) {}

  public void mouseReleased(MouseEvent e) {}
}
