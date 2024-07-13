package com.collections;

public class SyncFact extends  Thread

{
	 FactorialCal fac;
	
	//constructor of FactorialCal
    	public SyncFact(FactorialCal fac)
	{
		super();
		this.fac = fac;
	}
    	// Method that executes when thread starts
	  public void run()
	{
		  //calling the synchronized factorial method
		fac.factorial();
	}
	// Main method to start the program
	  public static void main(String[] args)
	{
		// Creating an object of FactorialCal with initial values
			
		FactorialCal fc = new FactorialCal(1,1);
		
		//creating object of syncFact with FactorialCal obj
		SyncFact sf1 = new SyncFact(fc);
		//Start method to start the thread to execute factorial of number
		sf1.start();
		
		//to check multiple threads creating obj for syncFact
		SyncFact sf2 = new SyncFact(fc);
		sf2.start();
		
		SyncFact sf3 = new SyncFact(fc);
		sf3.start();
		
	}
}
