package CS22526.Labs.Unit3;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.awt.Color;

public class PieceTester {

  public static void main(String[] args) {
    Piece pieceOne = new Piece();
    out.println(pieceOne);

    Piece redChecker = new Piece("red checker");
    out.println(redChecker);

    Piece theShoe = new Piece(100, 100, "the shoe from a money game");
    out.println(theShoe);

    Piece bishop = new Piece(200, 200, 20, 20, "bishop", Color.WHITE);
    out.println(bishop);
  }
}
