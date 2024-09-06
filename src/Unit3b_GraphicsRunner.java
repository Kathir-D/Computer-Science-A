//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;

public class Unit3b_GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Unit3b_GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new Unit3c_SPONGE());
		
		//add other classes to run them 
		//BigHouse, Robot, Character, or ShapePanel 

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		Unit3b_GraphicsRunner run = new Unit3b_GraphicsRunner();
	}
}