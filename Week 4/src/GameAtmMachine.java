import java.util.Date;
import java.util.Scanner;

public class GameAtmMachine {

	public static void main(String[] args) 
	{

	Scanner input = new Scanner(System.in); 
		Account[] accountArray; 
	 accountArray= new Account[10]; 
		int id=10; 
		 int x = 0; 
		 for(int i=0; i<9; i++){ 
	 accountArray[i]= new Account(i, 100.00); 
} 
		 		 
	System.out.print("Enter an id: "); 
		 id = input.nextInt(); 
		 			 
		while (id != 11){ 
		 	while (x!=4){ 
	System.out.print("\nMain menu\n 1:Check Balance\n 2:Withdraw\n 3:Deposit\n 4:Exit\n Enter a choice: "); 
		 	x = input.nextInt(); 
			switch (x){ 
		 	case 1: System.out.print("The balance is "+accountArray[id].getbalance()); System.out.print("\n"); break; 
		 	case 2:	System.out.print("Enter an amount to withdraw: "); 
		 			double y = input.nextDouble(); 
		 	accountArray[id].setbalnancewithdraw(y); break; 
		 			case 3: System.out.print("Enter an amount to deposit: ");	 
		 			double m = input.nextDouble(); 
		 	accountArray[id].setbalnancedeposit(m); break; 
		 			case 4: break; 
	} 
	} 
		 	System.out.print("\nEnter an id: "); 
		 	id = input.nextInt(); 
		 	x=0; 
} 
		 input.close(); 
 } 
} 
		class Account{ 
		 	private int id; 
		 	private double balance; 
		 	private double annualInterestRate; 
		 	private Date dateCreated; 
		 
		 
		 Account(){ 
		 	id = 0; 
		 	balance = 0; 
		 	annualInterestRate = 0; 
	} 
		 Account(int newid, double newbalance){ 
		 	id = newid; 
			balance = newbalance; 
	} 
		 int getid(){ 
		 	return id;
	} 
		 double getbalance(){ 
		 	return balance; 
	} 
		 double getannualInterestRate(){ 
		 	return annualInterestRate; 
} 
		 Date getdateCreated(){ 
		 	return dateCreated; 
	} 
		 public void setid(int newid){ 
		 	id = newid; 
	} 
		 public void setbalance(double newbalance){ 
		 	balance = newbalance; 
} 
		 public void setannualInterestRate(double newannualInterestRate){ 
			annualInterestRate = newannualInterestRate; 
} 
		 double getMonthlyInterestRate(){ 
		 	return annualInterestRate/(12*100); 
} 
		 double getMonthlyInterest(){ 
			 return balance*(annualInterestRate/(12*100)); 
} 
		 public void setbalnancewithdraw(double wnewbalance){ 
		 	balance = balance - wnewbalance; 
} 
		 public void setbalnancedeposit(double dnewbalance){ 
		 	balance = balance + dnewbalance; 
	} 

	}