package day230728;

public class VIPCustomer extends Customer
{
	private double bonusRatio;
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int custId, String name, String grade, double bonusRatio, double saleRatio, int agentID)
	{
		super(custId, name, grade);
		this.bonusRatio = bonusRatio;
		this.saleRatio = saleRatio;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price)
	{
		return (int)(price * (1 - saleRatio));
	}

	@Override
	public String showCustomerInfo()
	{
		return super.showCustomerInfo() + " - " + agentID;
	}
	
	public double getBonusRatio()
	{
		return bonusRatio;
	}
	
	public void setBonusRatio(double bonusRatio)
	{
		this.bonusRatio = bonusRatio;
	}
	
	public double getSaleRatio()
	{
		return saleRatio;
	}
	
	public void setSaleRatio(double saleRatio)
	{
		this.saleRatio = saleRatio;
	}
}
