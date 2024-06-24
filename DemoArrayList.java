package apjfsa;

import java.util.ArrayList;

public class DemoArrayList
{

     	public static void main(String[] args)
	{

     		ArrayList<Integer> arrayList = new ArrayList<Integer>();
     		
     		//Inserting elements in to the array
     		
     		arrayList.add(10);    //add method will insert the value into array
     		arrayList.add(20);
     		arrayList.add(30);
     		arrayList.add(40);
     		arrayList.add(50);
     		
     		System.out.println(arrayList);   //printing the List of array inserted
     		
     		System.out.println(arrayList.get(0));     //to return the element present at a particular index
     		
     		System.out.println(arrayList.lastIndexOf(arrayList));  //returns the index of last occurence  in the list
     		
     		System.out.println(arrayList.indexOf(20));    //returns the index of given element
     	
     		System.out.println(arrayList.remove(1));    //removes the element at given index
     		
     		System.out.println(arrayList);   //To print the list of array
     		
	}
}
