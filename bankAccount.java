package Codsoft;

import java.util.Scanner;

class bankAccount
{
	String name;
	String userName;
	String passWord;
	String accountNo;
	double previousTransaction;
	double balance=10000;
	int flag=0;
	double transaction=0;
	String transactionHistory="";
	
	public void register()
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter name: ");
		this.name=input.nextLine();
		System.out.println("enter userName: ");
		this.userName=input.nextLine();
		System.out.println("enter passWord: ");
		this.passWord=input.nextLine();
		System.out.println("enter account no.: ");
		this.accountNo=input.nextLine();
		System.out.println("congrats! registration successfully completed.....");
	}
	
	

	public void checkbalance()
	{
		System.out.println("your account balance: "+balance+"Rupees are available.");
	}
	
	public void deposite()
	{
		System.out.println("enter an amount which you want to deposite: ");
		Scanner input=new Scanner(System.in);
		double amount=input.nextDouble();
		
		try
		{
			if(amount<=1000000)
			{
				transaction++;
				balance +=amount;
				previousTransaction=amount;
				System.out.println("your money deposition is successful!!!");
				String str = " Rupees " + amount +"deposited\n";
				transactionHistory=transactionHistory.concat(str);
				
			}else {
				System.out.println("sorry! your acount balance is already 1000000");
			}
		}catch(Exception e)
		{
			
		}
	}
	
	public void withdraw()
	{
		System.out.println("enter an amount which you want to withdraw: ");
		Scanner input=new Scanner(System.in);
		double amount=input.nextDouble();
		try
		{
			if(balance>=amount)
			{
				transaction++;
				balance-=amount;
				previousTransaction -=amount;
				System.out.println("your money withdrawle is successful!!!");
				String str = " Rupees " + amount +"withdraw\n";
				transactionHistory=transactionHistory.concat(str);
				
			}else {
				System.out.println("due to your lower account balance. money withdraw not possible!!\n  sorry !!");
			}
			
		}catch(Exception e)
		{
			
		}
	}
	
	public void transfer()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter receiver name: ");
		String receiver=input.nextLine();
		System.out.println("enter the amount with you want to trasfer: ");
		double amount=input.nextDouble();
		try
		{
			if(balance>=amount)
			{
				if(balance <=1000000)
				{
					transaction++;
					balance-=amount;
					System.out.println("your Rs."+amount+" is transfer successfully to "+receiver);
					String str = amount +" Rupees transfer to"+receiver+"\n";
					transactionHistory=transactionHistory.concat(str);
					
				}else
				{
					System.out.println("due to your account balance. money transfer not possible!!\n  sorry !!");
				}
				
			}else
			{
				System.out.println("transfer failed !!!");
			}
			
		}catch(Exception e)
		{
			
		}
		
	}
	
	public void getPreviousTransaction()
	{
		if(previousTransaction >0)
		{
			System.out.println("Deposition : "+previousTransaction);
		}
		else if(previousTransaction<0)
		{
			System.out.println("withdrawle : "+ Math.abs(previousTransaction));
		}
		else {
			System.out.println("no transaction on this account.");
		}
	}
	
	public void transactionHistory()
	{
		if(transaction==0)
		{
			System.out.println("no transaction (empty)!!");
		}
		else
		{
			System.out.println("\n"+transactionHistory);
		}
	}
	
	public boolean login()
	{
		boolean isLogin= false;
		Scanner input =new Scanner(System.in);
		while(!isLogin) {
			System.out.println("entr username: ");
			String UserName=input.nextLine();
			if(UserName.equals(userName)) {
				while(!isLogin) {
					System.out.println("enter password: ");
					String PassWord=input.nextLine();
					if(PassWord.equals(passWord)) {
						System.out.println("login Successful!!!!");
						isLogin=true;
					}else {
						System.out.println("your password incorrect...");
					}
				}
			}else {
				System.out.println("your username was not found....");
			}
		}
		return isLogin;
	}
	
}
