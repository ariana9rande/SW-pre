package day230725;

import java.util.Scanner;

import day230724.Member;

public class MemberTest2
{
	public static void main(String[] args)
	{
		MemberService2 memberService = new MemberService2();

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run)
		{
			System.out.println("** 회원 관리 프로그램 ** 객체 배열 ver.");
			System.out.println("1.로그인  2.추가  3.삭제  4.조회  5.종료");

			System.out.print("선택> ");
			String input = sc.next();

			switch (input)
			{
				case "1" ->
				{
					System.out.print("id : ");
					String login_id = sc.next();

					System.out.print("password : ");
					String login_password = sc.next();

					if (memberService.login(login_id, login_password))
						System.out.println(login_id + " 로그인 성공");
					else
						System.out.println("id/password가 잘못되었습니다.");
					System.out.println();
				}
				case "2" ->
				{
					String name = "", id = "", password = "";
					int age = 0;

					if (memberService.joinCheck())
					{
						System.out.print("name : ");
						name = sc.next();

						System.out.print("id : ");
						id = sc.next();

						System.out.print("password : ");
						password = sc.next();

						System.out.print("age : ");
						age = Integer.parseInt(sc.next());
					}
					memberService.join(name, id, password, age);
					System.out.println();
				}
				case "3" ->
				{
					System.out.print("삭제시킬 member의 id : ");
					String delete_id = sc.next();

					memberService.delete(delete_id);
					System.out.println();
				}
				case "4" ->
				{
					memberService.printMembers();
					System.out.println();
				}
				case "5" ->
				{
					System.out.println("프로그램 종료");
					run = false;
				}
				default ->
				{
					System.out.println("1 ~ 5의 숫자를 입력해주세요.");
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
