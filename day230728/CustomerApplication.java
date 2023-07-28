package day230728;

import java.util.Scanner;

public class CustomerApplication
{
	public static void main(String[] args)
	{
		CustomerService customerService = new CustomerService();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run)
		{
			System.out.println("** 고객 판매관리 **");
			System.out.println("1.추가 2.판매 3.조회 4.회원목록 5.삭제 6.종료");
			
			System.out.print("선택 > ");
			int input = Integer.parseInt(sc.nextLine());
			
			switch(input)
			{
				case 1 ->
				{
					customerService.add();
				}
				case 2 ->
				{
					customerService.sell();
				}
				case 3 ->
				{
					customerService.printBonusPoint();
				}
				case 4 ->
				{
					customerService.printCustomers();
				}
				case 5 ->
				{
					customerService.delete();
				}
				case 6 ->
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
