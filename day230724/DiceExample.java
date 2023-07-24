package day230724;

public class DiceExample
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			Dice d1 = new Dice();
			Dice d2 = new Dice();
			
			if(d1.getNum() + d2.getNum() == 10)
				System.out.print("*");
			System.out.println("(" + d1.getNum() + ", " + d2.getNum() + ")");
		}
	}
}
