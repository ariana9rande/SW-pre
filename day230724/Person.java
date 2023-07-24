package day230724;

public class Person
{
	private String name;
	private String tel;

	public Person(String name, String tel)
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
	public String toString()
	{
		return "(" + this.name + ", " + this.tel + ")";
	}
}
