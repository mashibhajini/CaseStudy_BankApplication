import java.util.Scanner;

public class BankingApp {
	Scanner scanner = new Scanner(System.in);
	public int balance;
	BankAccount b=new BankAccount();
	//public int previousTransaction;
	public String customerName;
	public String customerId;
	public int calculateBalance(char option) {
		
		{		 
		if (option=='A') {

			System.out.println("------------------------------------------------------------");
			System.out.println("Balance ="+balance);
			System.out.println("-------------------------------------------------------------");
			System.out.println("\n");
			return balance;
		}
			

			else	if (option=='B') {
			System.out.println("------------------------------------------------------------");
			System.out.println("Enter an amount to deposit:");
			System.out.println("-------------------------------------------------------------");
			int amount = scanner.nextInt();
			b.deposit(amount);
			System.out.println("\n");
			return balance;
			}

			else if(option=='C') {
			System.out.println("------------------------------------------------------------");
			System.out.println("Enter an amount to withdraw:");
			System.out.println("-------------------------------------------------------------");
			int amount2 = scanner.nextInt();
			b.withdraw(amount2);
			System.out.println("\n");
	    }
			


			//		 case'D':
			//			 System.out.println("------------------------------------------------------------");
			//			 getpreviousTransaction();
			//			 System.out.println("-------------------------------------------------------------");
			//			 System.out.println("\n");
			//			 break;

			else	(option=='D')
			System.out.println("Invalid option!!,please enter again");
			

			

		}


		while(option !='D');
		System.out.println("ThankYou for using our services");

	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

}

