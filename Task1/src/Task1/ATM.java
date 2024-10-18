package Task1;

import java.util.Scanner;

public class ATM{
	private String accountNumber;
	private double balance;
	public ATM(String accountNumber,double initialBalance) {
		this.accountNumber=accountNumber;
		this.balance=initialBalance;
	}
	//method to display the menu and handle user input
	public void start() {
		Scanner scanner=new Scanner(System.in);
		boolean exit=false;
		System.out.println("welcome to the ATM:");
		while(!exit) {
			System.out.println(".......ATM menu......");
			System.out.println("1.check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.withdraw");
			System.out.println("4.exit");
			System.out.println("select an option");
			int choice =scanner.nextInt();
		     switch(choice) {	
		     
		     case 1:
		    	 System.out.println("Your balance is:$"+balance);
		    	 break;
		case 2:
				System.out.println("Enter amount to deposit");
				double depositAmount=scanner.nextDouble();
				deposit (depositAmount);
				break;
		case 3:
			System.out.println("Enter amount to withdraw:");
			double withdrawAmount=scanner.nextDouble();
			withdraw(withdrawAmount);
			break;
		case 4:
			exit=true;
			System.out.println("Thank you for your valuable time......");
			break;
			default:
				System.out.println("Invalid option .... please try again.............");
		     }
				
		}
		scanner.close();
	}
	//method to deposit money
	private void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit successfully .New balance:$"+balance);
			
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	//method to withdraw money
	private void withdraw (double amount) {
		if(amount>0&&amount<=balance) {
			balance-=amount;
			System.out.println("withdraw successfully.new balance:$"+balance);
			
		}
		else {
			System.out.println("Invalid withdraw amount or insufficient funds");
		}
	}
	//main method to the run program
	
	public static void main(String[]args) {
		//initialize ATM with an account number and aninitial balance
		ATM atm=new ATM("12345",1000.00);
		atm.start();
	}
}

