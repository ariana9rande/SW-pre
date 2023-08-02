package day230802;

public class Student implements Comparable<Student>
{
	private String name;
	private String tel;

	public Student(String name, String tel)
	{
		this.name = name;
		this.tel = tel;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	@Override
	public int compareTo(Student s)
	{
		return this.name.compareTo(s.name) + this.tel.compareTo(s.tel);
	}

	@Override
	public String toString()
	{
		return "(" + name + ", " + tel + ")";
	}
	
	@Override
	public int hashCode()
	{
		return this.name.hashCode() + this.tel.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student target)
			if(name.equals(target.getName()) && tel.equals(target.getTel()))
				return true;
		return false;
	}
}
