package day230724;

import java.util.ArrayList;

public class MemberService
{
	ArrayList<Member> members = new ArrayList<>();

	public void join(String name, String id, String password, int age)
	{
		boolean check = false;

		for (int i = 0; i < members.size(); i++)
		{
			if (members.get(i).getId().equals(id))
			{
				System.out.println("중복된 ID가 존재합니다.");
				check = true;
			}
		}

		if (!check)
		{
			members.add(new Member(name, id, password, age));
			System.out.println(id + " 회원가입 완료");
		}
	}

	public Member search(String id)
	{
		Member member = new Member();
		
		for (int i = 0; i < members.size(); i++)
			if (members.get(i).getId().equals(id))
			{
				member = members.get(i);
				return member;
			}
		return null;
	}

	public boolean login(String id, String password)
	{
		Member member = search(id);

		if (member != null)
		{
			if (member.getPassword().equals(password))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
//	public void logout(String id)
//	{
//		Member member = search(id);
//		
//		System.out.println(member.getId() + "님이 로그아웃 되었습니다.");
//	}

	public void delete(String id)
	{
		Member member = search(id);

		if (member != null)
		{
			System.out.println(member.getId() + " 삭제 완료.");
			members.remove(members.indexOf(member));
		}
		else
			System.out.println("해당 id의 멤버가 없습니다.");
	}
	
	public void printMembers()
	{
		if (members.size() != 0)
			for (Member m : members)
				System.out.println(m.getName() + ", " + m.getId() + 
						", " + m.getPassword() + ", " + m.getAge());
		else
			System.out.println("member가 존재하지 않습니다.");
		System.out.println();
	}
}
