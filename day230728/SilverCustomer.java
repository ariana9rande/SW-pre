package day230728;

public class SilverCustomer extends Customer
{
	private double bonusRatio;
	
	public SilverCustomer(int id, String name, String grade, double bonusRatio)
	{
		super(id, name, grade);
		this.bonusRatio = bonusRatio;
	}
	
	@Override
	public int calcPrice(int price)
	{
		return price;
	}
	
	public double getBonusRatio()
	{
		return bonusRatio;
	}
	
	public void setBonusRatio(double bonusRatio)
	{
		this.bonusRatio = bonusRatio;
	}
}
