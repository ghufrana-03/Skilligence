package skilligence;

import java.util.*;

public class Bank_application {
	
		static Scanner sc = new Scanner(System.in);
		String name, actype;
		int accNo, bal, amt;

		Bank_application(String name, int accNo,  int bal)
		{
			this.name = name;
			this.accNo = accNo;
			this.bal = bal;
		}
		void display()
		{
			System.out.println("Name:" + name);
			System.out.println("Account No:" + accNo);
			System.out.println("Balance:" + bal);

		}


		int deposit() 
		{
			System.out.print("Enter amount to deposit:");
			amt = sc.nextInt();
			System.out.println("The deposited amount is :"+ amt);
			bal = bal + amt;
			System.out.println("Total Balance : "+ bal);
			return 0;
		}

		int withdraw()
		{
			System.out.println("Your Balance=" + bal);
			System.out.print("Enter amount to withdraw:");
			amt = sc.nextInt();
			if (bal < amt)
			{
				System.out.println("Not sufficient balance.");
				return 1;
			}
			System.out.println("The amount withdrawn is "+ amt);
			bal = bal - amt;
			System.out.println("Total Balance:"+bal);
			return 0;
		}

		
		void bal()
		{
			System.out.println("Balance:" + bal);
		}

		public static void main(String args[])
		{
			System.out.println("Enter your Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Account Number: ");
			int num =sc.nextInt();
			System.out.println("Enter Initial Balance: ");
			int bal = sc.nextInt();
			Bank_application b1 = new Bank_application(name, num,  bal);
			int menu;
			System.out.println("Menu");
			System.out.println("1. Display Info");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("4. Exit");
			boolean quit=true;
				System.out.print("Please enter your choice: ");
				menu = sc.nextInt();
				do
				{
				switch (menu)
				{
				case 1:
					b1.display();
					break;

				case 2:
					b1.deposit();
					break;

				case 3:
					b1.withdraw();
					break;

				case 4:
					System.out.println("Do you want to continue? 1 or 0"  );
					boolean exit=sc.nextBoolean();
					if(exit = true)
					break;
					else 
						continue;
				}
				}
				while(!quit);
				
		}
	}


