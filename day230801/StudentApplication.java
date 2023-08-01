package day230801;

import java.util.Scanner;

public class StudentApplication
{
	public static void main(String[] args)
	{
		StudentService studentService = new StudentService();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run)
		{
			System.out.println("** 전화번호 관리 프로그램 **");
			System.out.println("1.추가 2.조회 3.삭제 4.전체 출력 5.종료");
			
			System.out.print("선택> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu)
			{
				case 1 ->
				{
					studentService.add();
				}
				case 2 ->
				{
					studentService.printStudent();
				}
				case 3 ->
				{
					studentService.delete();
				}
				case 4 ->
				{
					studentService.printStudents();
				}
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
