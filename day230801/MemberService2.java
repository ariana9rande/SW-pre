package day230801;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MemberService2
{
	Scanner sc = new Scanner(System.in);
	TreeSet<Member2> members = new TreeSet<>();

	public void add()
	{
		boolean check = true;

		System.out.print("추가할 회원의 이름은 : ");
		String name = sc.nextLine();

		System.out.print("추가할 회원의 나이는 : ");
		int age = Integer.parseInt(sc.nextLine());

		Iterator<Member2> members_itr = members.iterator();
		while(members_itr.hasNext())
		{
			Member2 member = members_itr.next();
			if(member.compareTo(new Member2(name, age)) == 0)
			{
				System.out.println("동일한 회원이 존재합니다.");
				check = false;
			}
		}

		if(check)
		{
			members.add(new Member2(name, age));
			System.out.println("(" + name + ", " + age + ") 추가 완료.");
		}
	}

	public void delete()
	{
		System.out.print("삭제하려는 회원의 이름은 : ");
		String name = sc.nextLine();
		
		System.out.print("삭제하려는 회원의 나이는 : ");
		int age = Integer.parseInt(sc.nextLine());

		if(searchByName(name) != null && searchByName(name).getAge() == age)
		{
			members.remove(searchByName(name));
			System.out.println("(" + name + ", " + age + ") 회원 삭제 완료.");
		}
		else
			System.out.println("(" + name + ", " + age + ") 회원이 존재하지 않습니다.");
	}

	public Member2 searchByName(String name)
	{
		for(Member2 m : members)
			if(m.getName().equals(name))
				return m;
		return null;
	}

	public void printMember()
	{
		System.out.print("조회할 이름 : ");
		String name = sc.nextLine();

//		System.out.print("나이 : ");
//		int age = Integer.parseInt(sc.nextLine());

		Iterator<Member2> members_itr = members.iterator();

		if(searchByName(name) == null)
			System.out.println(name + " 회원을 찾을 수 없습니다.");
		else
		{
			while(members_itr.hasNext())
			{
				Member2 next = members_itr.next();
				if(next.getName().equals(name))
					System.out.println(next);
			}
		}

	}

	public void printMembers()
	{
		Iterator<Member2> members_itr = members.iterator();
		if(members.size() == 0)
			System.out.println("회원이 존재하지 않습니다.");
		else
			while(members_itr.hasNext())
				System.out.println(members_itr.next());

	}
}
