package CS.CS22526.Labs.Unit11;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

import java.util.LinkedList;

public class BinarySearchTree {

  private TreeNode root;

  public BinarySearchTree() {
    root = null;
  }

  public void add(Comparable val) {
    root = add(val, root);
  }

  private TreeNode add(Comparable val, TreeNode tree) {
    if (tree == null) tree = new TreeNode(val);
    else if (val.compareTo(tree.getValue()) < 0) tree.setLeft(
      add(val, tree.getLeft())
    );
    else if (val.compareTo(tree.getValue()) > 0) tree.setRight(
      add(val, tree.getRight())
    );

    return tree;
  }

  public void inOrder() {
    inOrder(root);
    System.out.println("\n\n");
  }

  private void inOrder(TreeNode tree) {
    if (tree != null) {
      inOrder(tree.getLeft());
      System.out.print(tree.getValue() + " ");
      inOrder(tree.getRight());
    }
  }

  //add preOrder
  public void preOrder() {
    preOrder(root);
    out.println("\n");
  }

  private void preOrder(TreeNode tree) {
    if (tree != null) {
      out.print(tree.getValue() + " ");
      preOrder(tree.getLeft());
      preOrder(tree.getRight());
    }
  }

  //postOrder
  public void postOrder() {
    postOrder(root);
    out.println("\n");
  }

  private void postOrder(TreeNode tree) {
    if (tree != null) {
      postOrder(tree.getLeft());
      postOrder(tree.getRight());
      out.print(tree.getValue() + " ");
    }
  }

  //and revOrder
  public void revOrder() {
    revOrder(root);
    out.println("\n");
  }

  private void revOrder(TreeNode tree) {
    if (tree != null) {
      revOrder(tree.getRight());
      out.print(tree.getValue() + " ");
      revOrder(tree.getLeft());
    }
  }

  public int getNumLevels() {
    return getNumLevels(root);
  }

  private int getNumLevels(TreeNode tree) {
    if (tree == null) return 0;
    return (
      1 + Math.max(getNumLevels(tree.getLeft()), getNumLevels(tree.getRight()))
    );
  }

  //methods to write

  //getNumLeaves
  public int getNumLeaves() {
    return getNumLeaves(root);
  }

  private int getNumLeaves(TreeNode tree) {
    if (tree == null) return 0;
    if (tree.getLeft() == null && tree.getRight() == null) return 1;
    return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());
  }

  //getDiameter
  public int getDiameter() {
    return getDiameter(root);
  }

  private int getDiameter(TreeNode tree) {
    if (tree == null) return 0;
    int throughRoot =
      getHeight(tree.getLeft()) + getHeight(tree.getRight()) + 2;
    int leftDiam = getDiameter(tree.getLeft());
    int rightDiam = getDiameter(tree.getRight());
    return Math.max(throughRoot, Math.max(leftDiam, rightDiam));
  }

  //getWidth
  public int getWidth() {
    if (root == null) return 0;
    int max = 0;
    LinkedList<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      int levelSize = q.size();
      max = Math.max(max, levelSize);
      for (int i = 0; i < levelSize; i++) {
        TreeNode current = q.removeFirst();
        if (current.getLeft() != null) q.add(current.getLeft());
        if (current.getRight() != null) q.add(current.getRight());
      }
    }
    return max;
  }

  //getHeight
  public int getHeight() {
    return getHeight(root);
  }

  private int getHeight(TreeNode tree) {
    if (tree == null) return -1;
    return 1 + Math.max(getHeight(tree.getLeft()), getHeight(tree.getRight()));
  }

  //getNumNodes
  public int getNumNodes() {
    return getNumNodes(root);
  }

  private int getNumNodes(TreeNode tree) {
    if (tree == null) return 0;
    return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight());
  }

  //isFull
  public boolean isFull() {
    return isFull(root);
  }

  private boolean isFull(TreeNode tree) {
    if (tree == null) return true;
    if (tree.getLeft() == null && tree.getRight() == null) return true;
    if (tree.getLeft() == null || tree.getRight() == null) return false;
    return isFull(tree.getLeft()) && isFull(tree.getRight());
  }

  //search
  public boolean contains(Comparable val) {
    return contains(val, root);
  }

  private boolean contains(Comparable val, TreeNode tree) {
    if (tree == null) return false;
    int cmp = val.compareTo(tree.getValue());
    if (cmp == 0) return true;
    if (cmp < 0) return contains(val, tree.getLeft());
    return contains(val, tree.getRight());
  }

  //getLargest
  public Comparable getLargest() {
    if (root == null) return null;
    TreeNode current = root;
    while (current.getRight() != null) current = current.getRight();
    return current.getValue();
  }

  //getSmallest
  public Comparable getSmallest() {
    if (root == null) return null;
    TreeNode current = root;
    while (current.getLeft() != null) current = current.getLeft();
    return current.getValue();
  }

  //remove - delete
  public void delete(Comparable val) {
    root = delete(val, root);
  }

  private TreeNode delete(Comparable val, TreeNode tree) {
    if (tree == null) return null;

    int cmp = val.compareTo(tree.getValue());
    if (cmp < 0) tree.setLeft(delete(val, tree.getLeft()));
    else if (cmp > 0) tree.setRight(delete(val, tree.getRight()));
    else {
      if (tree.getLeft() == null) return tree.getRight();
      if (tree.getRight() == null) return tree.getLeft();

      TreeNode successor = tree.getRight();
      while (successor.getLeft() != null) successor = successor.getLeft();
      tree.setValue(successor.getValue());
      tree.setRight(delete(successor.getValue(), tree.getRight()));
    }
    return tree;
  }

  //BONUS SECTION

  //level order
  public String levelOrder() {
    if (root == null) return "";
    StringBuilder out = new StringBuilder();
    LinkedList<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode current = q.removeFirst();
      out.append(current.getValue()).append(" ");
      if (current.getLeft() != null) q.add(current.getLeft());
      if (current.getRight() != null) q.add(current.getRight());
    }
    return out.toString().trim();
  }

  //display like a tree

  public String toString() {
    return toString(root).trim();
  }

  private String toString(TreeNode tree) {
    if (tree == null) return "";
    return (
      toString(tree.getLeft()) +
      tree.getValue() +
      " " +
      toString(tree.getRight())
    );
  }
}
