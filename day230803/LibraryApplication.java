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
			Member currentMember = new Member();

			switch(startMenu)
			{
				case 1 -> currentMember = memberService.login();
				case 2 -> memberService.register();
			}

			if(currentMember != null)
			{
				switch(currentMember.getRole())
				{
					case "손님" ->
					{
						System.out.println("** 도서 관리 프로그램 **");
						System.out.println("1.대출 2.반납 3.검색 4.전체 출력 5.종료");

						System.out.print("선택> ");
						int menu = Integer.parseInt(sc.nextLine());

						switch(menu)
						{
							case 1 -> bookService.checkOut();
							case 2 -> bookService.checkIn();
							case 3 -> bookService.search();
							case 4 -> bookService.searchAll();
							case 5 ->
							{
								run = false;
								System.out.println("프로그램 종료");
								break;
							}
						}
					}
					case "직원" ->
					{
						System.out.println("** 도서 관리 프로그램 **");
						System.out.println("1.추가 2.검색 3.삭제 4.전체 출력 5.종료");

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
				}
			}
			else
				System.out.println("다시 로그인 해주세요");
		}
		sc.close();
	}
}
