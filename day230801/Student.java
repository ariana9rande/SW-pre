package day230801;

public class Student //implements Comparable<Student>
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

//	@Override
//	public int compareTo(Student s)
//	{
//		return this.tel.compareTo(s.getTel());
//	}
	
//	@Override
//	public String toString()
//	{
//		return "이름 : " + name + " 전화번호 : " + tel;
//	}
}
