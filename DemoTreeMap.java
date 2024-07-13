package com.collections;

import java.util.TreeMap;

public class DemoTreeMap
{

	public static void main(String[] args)
	{
          //Creating object for Tree map
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		
		//adding elements into the map using put()
		tmap.put(11, "Developer");
		tmap.put(2, "Tester");
		tmap.put(13, "Tech Support");
		tmap.put(41, "Data Analyst");
		tmap.put(10, "Data Base Administrator");
		tmap.put(-3, "Tester");       //adding negative  keys 
		
		System.out.println(tmap);     //Printing the Inserted keys and values
		
	//	tmap.put(null,"");      //inserting key as null Null pointer exception arises
		tmap.put(0, null);  // it will accept null as a value
		
		tmap.put(2, "HR");
		
		tmap.put(-1, "System Architect");
		tmap.put(-5, "System Engneer");
		
		System.out.println(tmap.firstKey());    //Returns first lower key
		System.out.println(tmap.higherKey(2));  //Returns greater then given key
		System.out.println(tmap);
		System.out.println(tmap.remove(10));   //removes the key and value
		
	    //	creating another object for tree map to use float values
		
		TreeMap<Double,Integer> tmap1 = new TreeMap<Double,Integer>();
		//inserting float values
		
		tmap1.put(32.01, 100);
		tmap1.put(56.432, 43);
		tmap1.put(23.21, 501);
		tmap1.put(63.25, 80);
		System.out.println(tmap1);
		System.out.println(tmap1.floorKey(70.1));   //floor key will Returns the  key less than or equal to the given key
		System.out.println(tmap1.ceilingKey(20.1));  // ceiling key returns the greater then or equal to given key
	
	}

}
