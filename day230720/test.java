package day230720;

public class test
{
	/*
	 * 3x + 10y = 100의 해 출력
	 * 0 <= x, y <= 10
	 */
	public static void main(String[] args)
	{
		// 2중 for
//		for(int x = 0; x <= 10; x++)
//		{
//			for(int y = 0; y <= 10; y++)
//			{
//				if(x * 3 + y * 10 == 100)
//					System.out.println("(" + x + ", " + y + ")");
//			}
//		}
		
		// 단일 for
		for(int x = 0; x <= 10; x++)
		{
			if((100 - x * 3) % 10 == 0)
				System.out.println("(" + x + ", " + (100 - x * 3) / 10 + ")");
		}
	}
}