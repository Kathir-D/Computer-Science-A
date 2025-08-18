import java.util.ArrayList;
import java.util.Collections;

public class Sign {

  private String msg;
  private int linesWidth;

  public Sign(String s, int n) {
    msg = s;
    linesWidth = n;
  }

  public int numberOfLines() {
    if (linesWidth == msg.length()) return 1;

    return ((int) Math.ceil((double) (msg.length() / linesWidth))) + 1;
  }

  public String getLines() {
    StringBuilder sb = new StringBuilder(msg);

    ArrayList<Integer> ar = new ArrayList<>();

    for (int i = 1; i < numberOfLines() + 1; i++) {
      ar.add(linesWidth * i);
    }
    Collections.reverse(ar);

    for (int i = 0; i < ar.size(); i++) {
      int position = ar.get(i);
      if (position < sb.length()) { //don't error, check
        sb.insert(position, ';');
      }
    }

    return sb.toString();
  }

  public String toString() {
    return "";
  }
}
