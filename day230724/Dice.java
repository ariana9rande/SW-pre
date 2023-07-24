package day230724;

public class Dice
{
	private int num;
	
	public Dice()
	{
		this.num = (int)(Math.random() * 6) + 1;
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}
}
