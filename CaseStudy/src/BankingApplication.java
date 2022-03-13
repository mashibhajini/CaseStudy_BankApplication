import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BankAccount obj1 = new BankAccount();
         obj1.showMenu();
	}

}

class BankAccount
{
	BankingApp b1=new BankingApp();
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	public BankAccount() {}
	
	BankAccount(String cname,String cid,int balance,int previousTransaction)
	{
		customerName = cname;
		customerId = cid;
		this.balance=balance;
		this.previousTransaction=previousTransaction;
	}
	//int amount=1000;
	int deposit(int amount)
	{
		if(amount !=0)
		{
			balance=balance+ amount;
		}
		return balance;
	}
	int withdraw(int amount)
	{
		if(amount !=0)
		{
			balance=balance- amount;
			//previousTransaction =- amount;
		}
		return balance;
	}
	void getpreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("No Transaction occured");
		}
	}
	void showMenu()
	{
	 char option='\0';
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("welcome "+customerName);
	 System.out.println("Your ID is "+customerId);
	 System.out.println("\n");
	 System.out.println("A. Check Balance");
	 System.out.println("B. Deposit");
	 System.out.println("C. Withdraw");
	 //System.out.println("D. Previous transaction");
	 System.out.println("D. Exit");
	 //int balance=b1.calculateBalance(option);
	 
	 
	 do
	 
	 {
		 System.out.println("==========================================================");
		 System.out.println("Enter an option");
		 System.out.println("===========================================================");
		 option = scanner.next().charAt(0);
		 System.out.println("\n");
		 
		 
		 switch(option)
		 {
		 
		 
		 case 'A':
			 
			 System.out.println("------------------------------------------------------------");
			 System.out.println("Balance ="+balance);
			 System.out.println("-------------------------------------------------------------");
			 System.out.println("\n");
			 break;
			 
		 case 'B':
			 System.out.println("------------------------------------------------------------");
			 System.out.println("Enter an amount to deposit:");
			 System.out.println("-------------------------------------------------------------");
			 int amount = scanner.nextInt();
			 deposit(amount);
			 System.out.println("\n");
			 break;
			 
			 
		 case 'c':
			 System.out.println("------------------------------------------------------------");
			 System.out.println("Enter an amount to withdraw:");
			 System.out.println("-------------------------------------------------------------");
			 int amount2 = scanner.nextInt();
			 withdraw(amount2);
			 System.out.println("\n");
			 break;
			 
			 
		 case'D':
			 System.out.println("------------------------------------------------------------");
			 getpreviousTransaction();
			 System.out.println("-------------------------------------------------------------");
			 System.out.println("\n");
			 break;
			 
		 case'E':
			 System.out.println("********************************************************");
			 break;
			 
			 
			 default:
				 System.out.println("Invalid option!!,please enter again");
				 break;
				 
		 }
	 }
	 
	 while(option !='E');
	 System.out.println("ThankYou for using our services");
		 
		scanner.close();	 
			 
		 }
	
}
			
			
	
