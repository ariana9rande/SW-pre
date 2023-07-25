package day230724;

import java.util.Scanner;

public class MemberExample
{
	public static void main(String[] args)
	{
		MemberService memberService = new MemberService();

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run == true)
		{
			System.out.println("** 회원 관리 프로그램 **");
			System.out.println("1.로그인  2.추가  3.삭제  4.조회  5.종료");

			System.out.print("선택> ");
			String input = sc.next();

			if (input.equals("1"))
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
			else if (input.equals("2"))
			{
				System.out.print("name : ");
				String name = sc.next();

				System.out.print("id : ");
				String id = sc.next();

				System.out.print("password : ");
				String password = sc.next();

				System.out.print("age : ");
				int age = Integer.parseInt(sc.next());

				memberService.join(name, id, password, age);
				System.out.println();
			}
			else if (input.equals("3"))
			{
				System.out.print("삭제시킬 member의 id : ");
				String delete_id = sc.next();

				memberService.delete(delete_id);
				System.out.println();
			}
			else if (input.equals("4"))
			{
				if (memberService.members.size() != 0)
					for (Member m : memberService.members)
						System.out.println(m.getName() + ", " + m.getId() + 
								", " + m.getPassword() + ", " + m.getAge());
				else
					System.out.println("member가 존재하지 않습니다.");
				System.out.println();
			}
			else if (input.equals("5"))
			{
				System.out.println("프로그램 종료");
				run = false;
			}
			else
			{
				System.out.println("1 ~ 5의 숫자를 입력해주세요.");
				System.out.println();
			}
		}
		sc.close();
	}
}
