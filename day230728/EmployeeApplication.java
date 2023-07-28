package day230728;

import java.util.Scanner;

public class EmployeeApplication
{
	public static void main(String[] args)
	{
		EmployeeService employeeService = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run)
		{
			System.out.println("** 사원 관리 **");
			System.out.println("1.추가 2.조회 3.삭제 4.사원목록 5.종료");
			
			System.out.print("선택> ");
			int input = Integer.parseInt(sc.nextLine());
			
			switch(input)
			{
				case 1 ->
				{
					employeeService.add();
				}
				case 2 ->
				{
					employeeService.printEmployee();
				}
				case 3 ->
				{
					employeeService.delete();
				}
				case 4 ->
				{
					employeeService.printEmployees();
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
