package day230726;

public class Account
{
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private int balance;
	private String accountNum;

	public Account()
	{
		
	}
	
	public Account(String accountNum)
	{
		this.balance = 0;
		this.accountNum = accountNum;
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int balance)
	{
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
//		else
//			System.out.println("잔고 범위 초과");
	}
	
	public void printBalance()
	{
		System.out.println("현재 잔고 : " + balance);
	}

	public String getAccountNum()
	{
		return accountNum;
	}

	public void setAccountNum(String accountNum)
	{
		this.accountNum = accountNum;
	}
}
