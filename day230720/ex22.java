package day230720;

public class ex22
{
	/*
	 * 2 ~ 100 소수 출력
	 */
	public static void main(String[] args)
	{
		// 2중 for문
//		for(int n = 2; n <= 100; n++)
//		{
//			boolean isPrime = true;
//			for(int div = 2; div <= Math.sqrt(n); div++)
//			{
//				if(n % div == 0)
//				{
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime)
//				System.out.print(n + " ");
//		}
		
		// 에라토스테네스의 체
		int n = 101;
		boolean[] isPrime = new boolean[n];
		
		for(int i = 2; i < isPrime.length; i++)
		{
			isPrime[i] = true;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(!isPrime[i])
				continue;
			if(isPrime[i])
			{
				for(int j = i * i; j <= n; j += i)
					isPrime[j] = false;
			}
		}
		
		for(int i = 2; i < isPrime.length; i++)
		{
			if(isPrime[i])
				System.out.print(i + " ");
		}
	}
}
