package day230731;

import java.util.Scanner;

public class LendableApplication
{
	public static void main(String[] args)
	{
		LendableService lendableService = new LendableService();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run)
		{
			System.out.println("** 도서 대여 프로그램 **");
			System.out.println("1.대출 2.반납 3.회원조회 4.Book조회 5.CD조회 6.추가 7.종료");
			
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu)
			{
				case 1 ->
				{
					lendableService.checkOut();
				}
				case 2 ->
				{
					lendableService.checkIn();
				}
				case 3 ->
				{
					lendableService.printMembers();
				}
				case 4 ->
				{
					lendableService.printBooks();
				}
				case 5 ->
				{
					lendableService.printCDs();
				}
				case 6 ->
				{
					lendableService.add();
				}
				case 7 ->
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
