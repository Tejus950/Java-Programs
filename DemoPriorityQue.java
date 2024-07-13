package com.collections;

import java.util.PriorityQueue;

public class DemoPriorityQue
{

	    public static void main(String[] args)
	{
		//Creating Object for the PriorityQue
		
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>();    
       
       //Adding elements to the Queue using add() method
       
       pq.add(10);
       pq.add(20);
       pq.add(30);
       pq.add(40);
       pq.add(50);
       pq.add(60);
       
       System.out.println(pq);    //printing the Que elements
       pq.add(70);  
       
       System.out.println(pq.size());  //Returns the number of elements in the Que
       
       System.out.println(pq.peek());   // Returns the head of this queue
       
       System.out.println(pq.poll());  //This method removes the head of this queue
       
       pq.remove(20);          //Removes a single specified element from the queue
       
       System.out.println(pq);
       System.out.println(pq.element());  //Print the head of this queue
       
	}

}
