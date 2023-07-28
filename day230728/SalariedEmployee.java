package day230728;

public class SalariedEmployee extends Employee
{
	private int monthly;
	
	public SalariedEmployee(String name, int id, String position, int monthly)
	{
		super(name, id, position);
		this.monthly = monthly;
	}
	
	public int getMonthly()
	{
		return this.monthly;
	}
	
	public void setMonthly(int monthly)
	{
		this.monthly = monthly;
	}
	
	@Override
	public int computeSalary()
	{
		return monthly * 12;
	}

	public String toString()
	{
		return this.getName() + "(" + this.getPosition() + ", " + this.getId() + ")" + ", " + computeSalary(); 
	}
}
