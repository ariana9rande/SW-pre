package day230728;

public abstract class Employee
{
	private String name;
	private int id;
	private String position;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int id, String position)
	{
		this.name = name;
		this.id = id;
		this.setPosition(position);
	}
	
	public abstract int computeSalary();
	
	public String toString()
	{
		return name + "(" + getPosition() + ", " + id + ")"; 
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}
}
