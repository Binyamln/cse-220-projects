package chapter_07;

import java.text.NumberFormat;
import java.util.*;

public class account {

		private final double RATE = 0.035;

		private long acctNumber;

		private double balance;

		private String name;


		public account (String owner, long account, double initial) 
		{ 
		name = owner;

		acctNumber = account;

		balance = initial;

		}


		public double deposit (double amount) { 
		
		if (amount >= 0) {
		balance = balance + amount;
		return balance;
		}
		else {
		System.out.println("ERROR NEGATIVE DEPOSIT");
		return balance;
		}
		}


		public double withdraw (double amount, double fee)
		{
		balance = balance - amount - fee;
		
		if (balance < 0)
		{
		return balance;
		}
		else
		{
		System.out.println("ERROR NEGATIVE BALANCE");
		balance = balance + amount + fee;
		return balance;
		}
		}
		


		public double addInterest () { 
			
		balance += (balance * RATE);

		return balance;

		}


		public double getBalance () { 
			
		return balance;

		}


		public String toString () { 
			
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));

		} 

		public class Transactions
		{
		public void main (String[] args) { 
			
		int fee = 5;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String user = scan.nextLine();
		
		
		account acct1 = new account (user, 99999, 2019.36);
		
		System.out.println("Would you like to withdraw or deposit! \n 1. Withdraw \n 2. Deposit");
		int dep = scan.nextInt();
		
		if(dep == 1) { 
			System.out.println("How much would you like to withdraw?");
			int with = scan.nextInt();
			acct1.withdraw(with, fee);
			acct1.addInterest();
			System.out.println("New balance:");
			System.out.println (acct1);

		}
		if(dep == 2){
		System.out.println("How much would you like to deposit?");
		int draw = scan.nextInt();
		acct1.deposit (draw);
		acct1.addInterest();
		System.out.println("New balance:");
		System.out.println (acct1);
			
		}
		
		else
		{
			System.out.println("ERROR INVALID INPUT");
		}

		} }

}
