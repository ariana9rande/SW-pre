package day230801;

public class Member2 implements Comparable<Member2>
{
	private String name;
	private int age;
	
	public Member2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "이름 : " + name + " 나이 : " + age;
	}

	@Override
	public int compareTo(Member2 m)
	{
		return this.name.compareTo(m.name) + (this.age - m.age);
	}
}
