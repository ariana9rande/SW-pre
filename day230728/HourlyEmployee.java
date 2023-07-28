package day230728;

public class HourlyEmployee extends Employee
{
	private int rate;
	private int hours;
	
	public HourlyEmployee(String name, int id, String position, int rate, int hours)
	{
		super(name, id, position);
		this.rate = rate;
		this.hours = hours;
	}
	
	public int getRate()
	{
		return rate;
	}
	
	public void setRate(int rate)
	{
		this.rate = rate;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public void setHours(int hours)
	{
		this.hours = hours;
	}
	
	@Override
	public int computeSalary()
	{
		return rate * hours * 12;
	}
	
	@Override
	public String toString()
	{
		return this.getName() + "(" + this.getPosition() + ", " + this.getId() + ")" + ", " + computeSalary();
	}
}
