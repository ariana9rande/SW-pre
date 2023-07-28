package day230728;

public class GoldCustomer extends Customer
{
	private double bonusRatio;
	private double saleRatio;
	
	public GoldCustomer(int id, String name, String grade, double bonusRatio, double saleRatio)
	{
		super(id, name, grade);
		this.bonusRatio = bonusRatio;
		this.saleRatio = saleRatio;
	}
	
	@Override
	public int calcPrice(int price)
	{
		return (int)(price * (1 - saleRatio));
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
