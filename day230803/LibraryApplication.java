package day230803;

import java.util.Scanner;

public class LibraryApplication
{
	public static void main(String[] args)
	{
		MemberService memberService = new MemberService();
		BookService bookService = new BookService();
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while(run)
		{
			System.out.println("1.로그인 2.회원가입");
			int startMenu = Integer.parseInt(sc.nextLine());

			switch(startMenu)
			{
				case 1 ->
					memberService.login();
				case 2 ->
					memberService.register();
			}

			System.out.println("** 도서 관리 프로그램 **");
			System.out.println("1.추가 2.조회 3.삭제 4.전체 출력 5.종료");

			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());

			switch(menu)
			{
				case 1 -> bookService.insert();
				case 2 -> bookService.search();
				case 3 -> bookService.delete();
				case 4 -> bookService.searchAll();
				case 5 ->
				{
					run = false;
					System.out.println("프로그램 종료");
					break;
				}
			}
		}

		sc.close();
	}
}
