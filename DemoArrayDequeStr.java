package com.collections;

import java.util.ArrayDeque;

public class DemoArrayDequeStr 
{

	   public static void main(String[] args)
	{
		   ArrayDeque<String> ard = new ArrayDeque<String>();  //creating object for ArrayDeque
		   
		   //Inserting elements into the ArrayQue using add() method
		   
		   ard.add("rose");
		   ard.add("lotus");
		   ard.add("Sunflwr");
		   ard.add("tulip");
		   ard.add("marigold");
		   ard.add("lotus");
		   ard.add("lavender");
		   
		   System.out.println(ard);     //printing the list of array
		   
		   System.out.println(ard.getFirst());   //This method will print the first element of the Deque
		   
		   System.out.println(ard.getLast());    //This method prints the Last element of the Deque
		   
		   System.out.println(ard.peek());      //This will print the top most element
		   
		   System.out.println(ard.poll());     //This method removes the top element
		   
		   System.out.println(ard);        //To print the List
		   
		   System.out.println(ard.peekFirst());   //Prints the First element in Deque
		   
		   System.out.println(ard.peekLast());   //Prints the last element in Deque
		   
		   ard.removeFirstOccurrence("lotus");   //This method prints First observed value of specified string
		   
		   System.out.println(ard);
		   
		   ard.removeLastOccurrence("lotus");     //This method prints last value of specified element
		   
		   System.out.println(ard);
		   
		   System.out.println(ard.size());       //To print the number of elements in Deque
		   
		   ard.push("lilly");           //insert element at the front of Deque
		   
		   System.out.println(ard);
		   
		   ard.addFirst("hibiscus");   //Insert the specified element at the front of Deque
		   ard.addLast("daisy");       //Insert the specified element at the end of Deque
		   
		   System.out.println(ard);
		   
		   System.out.println(ard.element());    //This prints the head of the Deque
		   
		   System.out.println(ard.offerFirst("lilly")); //This method Inserts the specified element at the front of Deque.
		   
		   System.out.println(ard.offerLast("flower")); //This method Inserts the specified element at the end of  Deque.
		   System.out.println(ard.remove());        // removes the head of the Deque
		   System.out.println(ard);
	}

}
