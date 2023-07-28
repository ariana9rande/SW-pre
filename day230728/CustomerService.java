package day230728;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService
{
	ArrayList<Customer> customers = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void add()
	{
		int id;

		do
			id = (int)(Math.random() * 900) + 100;
		while(searchById(id) != null);

		System.out.print("이름 : ");
		String name = sc.nextLine();

		if(searchByName(name) != null)
			System.out.println("이름 중복");
		else
		{
			System.out.print("등급 : ");
			String grade = sc.nextLine();

			switch(grade.toLowerCase())
			{
				case "silver" ->
				{
					customers.add(new SilverCustomer(id, name, grade, 0.1));
				}
				case "gold" ->
				{
					customers.add(new GoldCustomer(id, name, grade, 0.2, 0.1));
				}
				case "vip" ->
				{
					int agentId = (int)(Math.random() * 90) + 10;
					customers.add(new VIPCustomer(id, name, grade, 0.5, 0.2, agentId));
				}
			}
			System.out.println(grade.toUpperCase() + " 고객 " + name + "-" + id + " 생성 완료.");
		}
		System.out.println();
	}

	public Customer searchById(int id)
	{
		for(Customer c : customers)
			if(c.getCustomerID() == id)
				return c;
		return null;
	}

	public Customer searchByName(String name)
	{
		for(Customer c : customers)
			if(c.getCustomerName().equals(name))
				return c;
		return null;
	}

	public void sell()
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("상품 가격 : ");
		int price = Integer.parseInt(sc.nextLine());

		double bonusRatio = switch(searchByName(name).getCustomerGrade().toLowerCase())
		{
			case "silver" -> 0.1;
			case "gold" -> 0.2;
			case "vip" -> 0.5;
			default -> 0;
		};

		System.out.print("지불할 금액 : " + searchByName(name).calcPrice(price) + ", ");
		searchByName(name).setBonusPoint((int)(price * bonusRatio));
		System.out.println("보너스 포인트 : " + searchByName(name).getBonusPoint());
		System.out.println();
	}

	public void printBonusPoint()
	{
		System.out.print("조회할 이름 : ");
		String name = sc.nextLine();

		if(searchByName(name) != null)
		{
			System.out.println(name + "의 보너스 포인트 : " + searchByName(name).getBonusPoint());
		}
		else
			System.out.println("해당 이름의 고객을 찾을 수 없습니다.");
		System.out.println();
	}

	public void printCustomers()
	{
		boolean check = false;

		for(Customer c : customers)
		{
			System.out.println(c.showCustomerInfo());
			check = true;
		}

		if(!check)
			System.out.println("Customer가 없습니다.");
		System.out.println();
	}

	public void delete()
	{
		System.out.print("삭제할 이름 : ");
		String name = sc.nextLine();

		if(searchByName(name) != null)
			customers.remove(customers.indexOf(searchByName(name)));
		else
			System.out.println("해당 이름의 고객을 찾을 수 없습니다.");
		System.out.println();
	}
}
