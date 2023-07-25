package day230725;

import day230724.Member;

public class MemberService2
{
	Member[] members = new Member[5];
	int index = 0;
	
	public boolean joinCheck()
	{
		// members 배열 중 비어있는 가장 작은 인덱스값을 index에 대입
		for(int i = 0; i < members.length; i++)
		{
			if(members[i] == null)
			{
				index = i;
				break;
			}
		}
		
		// index가 배열의 길이보다 작고 해당 인덱스가 null인 경우
		// = member를 추가할 수 있는 경우
		if (index < members.length && members[index] == null)
		{
			return true;
		}
		return false;
	}
	
	public void join(String name, String id, String password, int age)
	{
		if(joinCheck())
		{
			if (search(id) != null)
				System.out.println("중복된 ID가 존재합니다.");
			else
			{
				members[index] = new Member(name, id, password, age);
				index++;
				System.out.println(id + " 회원가입 완료");
			}
		}
		else
			System.out.println("더 이상 member를 추가할 수 없습니다.");
	}

	public Member search(String id)
	{
		for (int i = 0; i < members.length; i++)
		{
			if (members[i] != null && members[i].getId().equals(id))
				return members[i];
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

	public void delete(String id)
	{
		for (int i = 0; i < members.length; i++)
		{
			if (members[i] == search(id))
			{
				System.out.println(members[i].getId() + "삭제 완료");
				members[i] = null;
				return;
			}
		}
		System.out.println("해당 id의 멤버가 없습니다.");
	}
	
	public void printMembers()
	{
		boolean check = true;

		for (Member m : members)
		{
			if (m != null)
			{
				System.out.println(m.getName() + ", " + m.getId() + ", " 
								+ m.getPassword() + ", " + m.getAge());
				check = false;
			}
		}
		if (check)
		{
			System.out.println("member가 존재하지 않습니다");
		}
	}
}
