package day230801;

import java.util.Scanner;

public class MemberApplication2
{
	public static void main(String[] args)
	{
		MemberService2 memberService = new MemberService2();
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run)
		{
			System.out.println("** 회원 관리 프로그램 **");
			System.out.println("1.가입 2.검색 3.탈퇴 4.전체 출력 5.종료");
			
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu)
			{
				case 1 ->
				{
					memberService.add();
				}
				case 2 ->
				{
					memberService.printMember();
				}
				case 3 ->
				{
					memberService.delete();
				}
				case 4 ->
				{
					memberService.printMembers();
				}
				case 5 ->
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
