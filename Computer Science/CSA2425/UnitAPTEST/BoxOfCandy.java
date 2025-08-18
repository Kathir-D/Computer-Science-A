public class BoxOfCandy {

  private Candy[][] box;

  public BoxOfCandy() {
    box = new Candy[4][3];
    box[0][1] = new Candy("lime");
    box[1][1] = new Candy("orange");
    box[2][2] = new Candy("cherry");
    box[3][1] = new Candy("lemon");
    box[3][2] = new Candy("grape");
  }

  public boolean moveCandyToFirstRow(int col) {
    return false;
  }

  public Candy removeNextByFlavor(String flavor) {
    return null;
  }

  public String toString() {
    String s = "";
    for (Candy[] r : box) {
      for (Candy c : r) {
        s += c + " ";
      }
      s += "\n";
    }
    return s;
  }
}
