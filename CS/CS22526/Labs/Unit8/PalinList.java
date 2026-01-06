package CS22526.Labs.Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
  private String[] list;

	public PalinList()
	{
    queue = new LinkedList<String>();
    stack = new Stack<String>();
		setList("");
	}

	public PalinList(String list)
	{
    queue = new LinkedList<String>();
    stack = new Stack<String>();
    setList(list);
	}

	public void setList(String list)
	{
    String[] items = list.split(" ");
    this.list = items;
    for(String item : items) {
      queue.add(item);
      stack.push(item);
    }
	}

	public boolean isPalin()
	{

    while(!queue.isEmpty() && !stack.isEmpty()) {
      String a = queue.poll();
      String b = stack.pop();
      if(!a.equals(b)){
        return false;
      }
    }
		return true;
	}

  public String toString() {
    if(isPalin()){
      return Arrays.toString(list) + " is a palindrome.";
    } else {
      return Arrays.toString(list) + " is not a palindrome.";
    }
  }
}