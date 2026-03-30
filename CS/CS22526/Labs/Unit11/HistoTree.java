package CS.CS22526.Labs.Unit11;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class HistoTree {

  private HistoNode root;

  public HistoTree() {
    root = null;
  }

  public void addData(Comparable data) {
    root = add(data, root);
  }

  private HistoNode add(Comparable data, HistoNode tree) {
    if (tree == null) return new HistoNode(data, 1, null, null);

    int cmp = data.compareTo(tree.getData());
    if (cmp < 0) tree.setLeft(add(data, tree.getLeft()));
    else if (cmp > 0) tree.setRight(add(data, tree.getRight()));
    else tree.setDataCount(tree.getDataCount() + 1);

    return tree;
  }

  public HistoNode search(Comparable data) {
    return search(data, root);
  }

  private HistoNode search(Comparable data, HistoNode tree) {
    if (tree == null) return null;
    int cmp = data.compareTo(tree.getData());
    if (cmp == 0) return tree;
    if (cmp < 0) return search(data, tree.getLeft());
    return search(data, tree.getRight());
  }

  public String toString() {
    return toString(root).trim();
  }

  private String toString(HistoNode tree) {
    if (tree == null) return "";
    return (
      toString(tree.getLeft()) +
      tree.getData() +
      " - " +
      tree.getDataCount() +
      " " +
      toString(tree.getRight())
    );
  }
}
