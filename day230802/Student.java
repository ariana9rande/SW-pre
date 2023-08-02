package day230802;

public class Student implements Comparable<Student>
{
	private String name;
	private String tel;
//	private String dept;
	
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

//	public String getDept()
//	{
//		return dept;
//	}
//
//	public void setDept(String dept)
//	{
//		this.dept = dept;
//	}
	
	@Override
	public int compareTo(Student s)
	{
		return this.name.compareTo(s.name) + this.tel.compareTo(s.tel);
	}
	
	@Override
	public String toString()
	{
//		if(dept != "")
//			return "(" + name + ", " + tel + ", " + dept + ")";
//		else
			return "(" + name + ", " + tel + ")";
	}
}
