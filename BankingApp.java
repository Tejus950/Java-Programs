package com.collections;

public class BankingApp 
{
	   int accountNo;          //Declaring variables
	   int balance; //5000
	   
	   //Constructor with parameters that initializes accountno and balance 
	   
	public BankingApp(int accountNo , int balance)
	{
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
      //for depositing amount to the account
	 void deposite(int amt)
	 {
		 balance+=amt;   //Adds the deposit amount to the balance
		 
		 System.out.println("Account no :" +accountNo);
		 System.out.println("New balance :"+balance);
	 }
	 
   //for withdrawing amount
	 void withDraw(int amt) throws InsufficientBalanceException
	 {
		 if(balance>amt)   //checks condition if balance is greater than withdrawal amount 
		 {
			 balance-=amt;
			 System.out.println("Amount withdrawn successfully"+amt+"\n New Balance:"+balance);
		 }
		 else
			 throw new InsufficientBalanceException("Insufficient Balance");  //throws custom exception is balance is insufficient
	 }
	
     	 //Main method to test the Application
	 
	   public static void main(String[] args) throws InsufficientBalanceException
	{
		   //Creating an object
		   
        BankingApp bankingApp = new BankingApp(10253025 , 3000);
        bankingApp.deposite(5000);          //deposits amount into the account
        try
        {
        bankingApp.withDraw(30000);    //Withdraw amount from the account
        }
        catch(InsufficientBalanceException e)
        {
        	System.out.println(e);     //catches the exception and prints the InsufficientBalanceException
        }
	}

}



