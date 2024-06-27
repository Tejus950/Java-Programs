package com.collections;

public class DemoArithmaticExe
{

	public static void main(String[] args)
	{
		// Variable declarations
         int a,b,c;
         a=10;
         b=10;
         
             // Printing  a  message
         System.out.println("start of the program");
         
            try      //try block  code to throw an exception
         {
        	 c=a/b;       //To Perform arithmetic operation
        	 
        	 System.out.println("c="+c);
        	 
           //  System.out.println("End of the program"); 
             
             int arr[] = {1,2,3};    //Declaring array to raise arrayIndex out of bound exception
             
             System.out.println(arr[4]);
         }
         
            catch(ArithmeticException ae)     // Catch block to identify(to catch) arithmetic exceptions
         {
        	 System.out.println("Exception caught");
         }
         
            catch(ArrayIndexOutOfBoundsException ae)     // Catch  block to identify(to catch) array index out of bounds exceptions
         {
        	System.out.println("Array Exception caught"); 
         }
         
            finally      // Finally block to execute important code (block will always run)
         {
        	 System.out.println(" End of the Prgrm");
         }
       
	}

}
