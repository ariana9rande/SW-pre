package day230801;

import java.util.Scanner;

public class MemberApplication
{
	public static void main(String[] args)
	{
		MemberService memberService = new MemberService();
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run)
		{
			System.out.println("** 회원 관리 프로그램 **");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 삭제");
			System.out.println("3. 전체 회원 출력");
			System.out.println("4. 종료");
			
			System.out.print("선택하려는 메뉴의 번호를 입력하세요>> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu)
			{
				case 1 ->
				{
					memberService.add();
				}
				case 2 ->
				{
					memberService.delete();
				}
				case 3 ->
				{
					memberService.printMembers();
				}
				case 4 ->
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
