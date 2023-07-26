package day230726;

import java.util.Scanner;

public class BankApplication
{
	public static void main(String args[])
	{
		AccountService accountService = new AccountService();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run)
		{
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.이체 | 6.종료");
			System.out.println("--------------------------------------------------");
			
			System.out.print("선택 > ");
			String input = sc.nextLine();
			
			switch(input)
			{
				case "1" ->
				{
					System.out.println("----------");
					System.out.println("계좌생성");
					System.out.println("----------");
					
					accountService.generateAccount();
				}
				case "2" ->
				{
					System.out.println("----------");
					System.out.println("계좌목록");
					System.out.println("----------");
					
					accountService.printAccounts();
				}
				case "3" ->
				{
					System.out.println("----------");
					System.out.println("예금");
					System.out.println("----------");
					
					System.out.print("계좌번호 : ");
					String accountNum = sc.nextLine();
					
					System.out.print("예금액 : ");
					int money = Integer.parseInt(sc.nextLine());
					
					accountService.deposit(accountNum, money);
				}
				case "4" ->
				{
					System.out.println("----------");
					System.out.println("출금");
					System.out.println("----------");
					
					System.out.print("계좌번호 : ");
					String accountNum = sc.nextLine();
					
					System.out.print("출금액 : ");
					int money = Integer.parseInt(sc.nextLine());
					
					accountService.withdraw(accountNum, money);
				}
				case "5" ->
				{
					System.out.println("----------");
					System.out.println("이체");
					System.out.println("----------");
					
					System.out.print("출금 계좌번호 : ");
					String accountNum1 = sc.nextLine();
					
					System.out.print("이체 계좌번호 : ");
					String accountNum2 = sc.nextLine();
					
					System.out.print("이체액 : ");
					int money = Integer.parseInt(sc.nextLine());
					
					accountService.transfer(accountNum1, accountNum2, money);
				}
				case "6" ->
				{
					System.out.println("프로그램 종료");
					run = false;
					break;
				}
			}
		}
		sc.close();
	}
}
