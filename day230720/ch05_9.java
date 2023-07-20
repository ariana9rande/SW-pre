package day230720;

import java.util.Scanner;

public class ch05_9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] scores = null;
		boolean run = true;
		int n = 0;
		
		while(run)
		{
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			
			System.out.print("선택> ");
			int input = sc.nextInt();
			
			switch(input)
			{
				case 1:
					System.out.print("학생수> ");
					n = sc.nextInt();
					scores = new int[n];
					break;
				case 2:
					for(int i = 0; i < n; i++)
					{
						System.out.print("scores[" + i + "]> ");
						int score = sc.nextInt();
						scores[i] = score;
					}
					break;
				case 3:
					for(int i = 0; i < n; i++)
						System.out.println("scores[" + i + "]> " + scores[i]);
					break;
				case 4:
					int sum = 0, max = 0;
					for(int i = 0; i < scores.length; i++)
					{
						sum += scores[i];
						if(scores[i] > max)
							max = scores[i];
					}
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + (double)sum / n);
					break;
				case 5:
					System.out.println("프로그램 종료");
					run = false;
					break;
			}
		}
	}
}
