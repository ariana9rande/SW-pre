package day230728;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Student s)
	{
		return this.name.compareTo(s.name);
	}
	
//	@Override
//	public int compareTo(Student s)
//	{
//		return this.age - s.age;
//	}

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
		return "이름 : " + name + ", 나이 : " + age;
	}
}
