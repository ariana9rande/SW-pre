package day230728;

public abstract class Customer
{
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;

	public Customer(int id, String name, String grade)
	{
		this.customerID = id;
		this.customerName = name;
		this.customerGrade = grade;
		this.bonusPoint = 0;
	}

	public abstract int calcPrice(int price);
	
	public String showCustomerInfo()
	{
		return customerID + ", " + customerName + "(" + customerGrade + ")";
	}
	
	public int getCustomerID()
	{
		return customerID;
	}

	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public String getCustomerGrade()
	{
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade)
	{
		this.customerGrade = customerGrade;
	}
	
	public int getBonusPoint()
	{
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint)
	{
		this.bonusPoint = bonusPoint;
	}
}
