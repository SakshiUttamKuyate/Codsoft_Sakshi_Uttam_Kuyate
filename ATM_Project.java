package Codsoft;
import java.util.Scanner;

public class ATM_Project {
	
	public static int takeInput(int limit) {
		int input=0;
		boolean flag=false;
		while(!flag) {
			try {
				Scanner sc=new Scanner(System.in);
				input=sc.nextInt();
				flag=true;
				if(flag && input>limit || input<1) {
					System.out.println("choose the no. between 1 to "+limit);
					flag=false;
				}
			}catch(Exception e)
			{
				
			}
		};
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME IN ATM INTERFACE");
		System.out.println("1.regiteration\n 2.exit\n");
		System.out.println("Enter your choice: ");
		int choice=takeInput(2);
		if(choice==1)
		{
			bankAccount ba=new bankAccount();
			ba.register();
			while(true) {
				System.out.println("1.Login\n 2.exit\n");
				System.out.println("Enter your choice: ");
				int ch=takeInput(2);
				if(ch==1) {
				
					if(ba.login()) {
						System.out.println("WELCOME "+ba.name+ "\n");
						boolean isfinished=false;
						while(!isfinished) {
							System.out.println("\n1.check balance \n2.deposite \n3.withdraw \n4.transfer \n5.last transaction \n6.transactionHistory \n7.exit");
							System.out.println("Enter your choice: ");
							int c=takeInput(7);
							switch(c) {
							case 1: ba.checkbalance();
							break;
							case 2: ba.deposite();
							break;
							case 3: ba.withdraw();
							break;
							case 4: ba.transfer();
							break;
							case 5: ba.getPreviousTransaction();
							break;
							case 6: ba.transactionHistory();
							break;
							case 7: isfinished=true;
							break;
							}
						}
	
					}
				}
				else {
					System.exit(0);
				}
			}
		}else {
			System.exit(0);
		}
 
	}

}
