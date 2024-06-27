package com.collections;

import java.util.HashMap;

public class DemoHashMap_Cc
{

	    public static void main(String[] args)
	{
		//Creating object for  Hash map
		 HashMap<String,Integer> cc = new HashMap<String,Integer>();
		 
		//Inserting keys and values into the map
		 cc.put("US", 1);
		 cc.put("India", 91);
		 cc.put("Russia",7);
		 cc.put("Australia", 61);
		 cc.put("China",36);
		 cc.put("Pakisthan", 92);
		 
		 System.out.println(cc);               //Printing the Keys and values 
		 
		 System.out.println(cc.keySet());      //Returns the keys present in the map
		 
		 System.out.println(cc.values());      //Returns the values present in the map
		 
		 System.out.println(cc.entrySet());    //Returns a Set view of the mappings contained in this map
		 
		 System.out.println(cc.get("US"));     //Returns the value to which the specified key is mapped
		 
		 System.out.println(cc.containsKey("China"));    //Returns true if this map contains a mapping for the specified key
		 
		 System.out.println(cc.replace("US", 8));     //Replaces the value of the given key
		 
		 System.out.println(cc);
		 System.out.println(cc.remove("Pakisthan"));    //Removes the mapping for the specified key from this map if present
		 
		 cc.putIfAbsent("Brazil", 55);              //If the specified key is not already present it will insert the key
		 
		 cc.put(null, 12);                          //Inserting a null Key (Hash map accepts null key)
		 
		 cc.put("Canada", null);                    //Inserting a null value (Hash map accepts null value)
		 
		 System.out.println(cc);
		 
		 System.out.println(cc.size());            //Returns the number of key-value mappings in this map
		 System.out.println(cc);
		 
	}

}
