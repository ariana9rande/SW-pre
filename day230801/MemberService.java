package day230801;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MemberService
{
	Scanner sc = new Scanner(System.in);
	HashSet<Member> members = new HashSet<>();

	public void add()
	{
		System.out.print("추가할 회원의 아이디는 : ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.print("추가할 회원의 이름은 : ");
		String name = sc.nextLine();

		if(searchById(id) == null)
		{
			members.add(new Member(id, name));
			System.out.println(id + ", " + name + " 회원 추가 완료.");
		}
		else
			System.out.println("중복된 ID입니다.");
	}

	public void delete()
	{
		System.out.print("삭제하려는 회원의 아이디는 : ");
		int id = Integer.parseInt(sc.nextLine());

		String name = "";

		if(searchById(id) != null)
		{
			name = searchById(id).getName();
			members.remove(searchById(id));
			System.out.println(id + ", " + name + " 회원 삭제 완료.");
		}
		else
			System.out.println("id " + id + "에 해당하는 회원이 존재하지 않습니다.");
	}

	public Member searchById(int id)
	{
		Iterator<Member> members_itr = members.iterator();
		while(members_itr.hasNext())
		{
			Member next = members_itr.next();
			if(next.getId() == id)
				return next;
		}
		return null;
	}

//	public Member searchByName(String name)
//	{
//		for(Member m : members)
//			if(m.getName().equals(name))
//				return m;
//		return null;
//	}

	public void printMembers()
	{
		Iterator<Member> members_itr = members.iterator();
		if(members.size() == 0)
			System.out.println("회원이 존재하지 않습니다.");
		else
			while(members_itr.hasNext())
				System.out.println(members_itr.next());
	}
}
