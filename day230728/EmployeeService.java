package day230728;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService
{
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> employees = new ArrayList<>();

//	public boolean addCheck()
//	{
//		for(int i = 0; i < employees.size(); i++)
//		{
//			if(employees.get(i) == null)
//			{
//				index = i;
//				break;
//			}
//		}
//
//		if(index < employees.size() && employees.get(index) == null)
//		{
//			return true;
//		}
//		return false;
//	}

	public void add()
	{
		int id;
		do
		{
			id = (int)(Math.random() * 900) + 100;
		}
		while(search(id) != null);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("직급(사원, 알바) : ");
		String position = sc.nextLine();


		if(position.equals("사원"))
		{
			System.out.print("월급 : ");
			int monthly = Integer.parseInt(sc.nextLine());

			employees.add(new SalariedEmployee(name, id, position, monthly));
			System.out.println(name + ", " + id + " 회원가입 완료");
		}
		else if(position.equals("알바"))
		{
			System.out.print("시급 : ");
			int rate = Integer.parseInt(sc.nextLine());

			System.out.print("근무 시간 : ");
			int hours = Integer.parseInt(sc.nextLine());

			employees.add(new HourlyEmployee(name, id, position, rate, hours));
			System.out.println(name + ", " + id + " 회원가입 완료");
		}
		else
			System.out.println("올바르지 않은 직급입니다.");
		System.out.println();
	}

	public Employee search(int id)
	{	
		for(int i = 0; i < employees.size(); i++)
		{
			if(employees.get(i).getId() == id)
			{
				return employees.get(i);
			}
		}
		return null;
	}

	public void printEmployee()
	{
		System.out.print("조회할 id : ");
		int id = Integer.parseInt(sc.nextLine());

		if(search(id) != null)
			System.out.println(search(id).toString());
		else
			System.out.println("해당 id를 가진 Employee를 찾을 수 없음");
		System.out.println();
	}

	public void delete()
	{
		System.out.print("삭제할 id : ");
		int id = Integer.parseInt(sc.nextLine());

		if(search(id) != null)
		{
			System.out.println(search(id).getName() + " 삭제 완료");
			employees.remove(employees.indexOf(search(id)));
		}
		else
			System.out.println("해당 id를 가진 Employee를 찾을 수 없음");
		System.out.println();
	}

	public void printEmployees()
	{
		if(employees.size() != 0)
			for(Employee e : employees)
			{
				System.out.println(e.toString());
			}
		else
			System.out.println("Employee가 존재하지 않습니다.");
		System.out.println();
	}
}
