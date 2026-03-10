package CS22526.Labs.Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
		BinarySearchTree tree = new BinarySearchTree();
		int[] data = {90,80,100,70,85,98,120};
		for (int value : data)
		{
			tree.add(value);
		}

		out.println("IN ORDER");
		tree.inOrder();

		out.println("PRE ORDER");
		tree.preOrder();

		out.println("POST ORDER");
		tree.postOrder();

		out.println("REVERSE ORDER");
		tree.revOrder();

		out.println("Tree height is " + tree.getHeight());
		out.println("Tree diameter is " + tree.getDiameter());
		out.println("Tree width is " + tree.getWidth());
		out.println("Number of leaves is " + tree.getNumLeaves());
		out.println("Number of nodes is " + tree.getNumNodes());
		out.println("Number of levels is " + tree.getNumLevels());
		out.println("Tree as a string " + tree);
		out.println(tree.isFull() ? "The tree is full." : "The tree is not full.");

		out.println(tree.contains(100) ? "The tree contains 100!" : "The tree does not contain 100!");
		out.println(tree.contains(114) ? "The tree contains 114!" : "The does not contain 114!");
		out.println("The smallest tree node " + tree.getSmallest());
		out.println("The largest tree node " + tree.getLargest());

		out.println("Tree before removing any nodes - using level order traversal.");
		out.println(tree.levelOrder());

		int[] deletes = {90,70,85,98,80,120,100};
		for (int value : deletes)
		{
			tree.delete(value);
			out.println("Tree after removing " + value + ".");
			out.println(tree.levelOrder());
		}
 
   }
}
