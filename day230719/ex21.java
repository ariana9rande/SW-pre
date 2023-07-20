package day230719;

public class ex21
{
	/*
	 * 4. while과 Math.random() 이용해서 두 개의 주사위를 던진 결과를 (눈1, 눈2) 형태로 출력
	 * 눈의 합이 5가 아니면 계속 던지고 합이 5면 멈춤
	 */
	public static void main(String[] args)
	{
		int a = 0, b = 0;
		
		while(a + b != 5)
		{
			a = (int)(Math.random() * 6) + 1;
			b = (int)(Math.random() * 6) + 1;
			System.out.println("(" + a + ", " + b + ")");
		}
	}
}
