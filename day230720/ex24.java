package day230720;

import java.util.Scanner;

public class ex24
{
	/*
	 * 배열을 메소드의 매개변수로 전달 main()에서 배열의크길르 입력받아 배열 생성 후, 배열에 점수를 저장하는 메소드 getValue()와
	 * 평균을 구하는 메소드 getAverage() 배열의 요소를 출력하는 printArray() 작성
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기 : ");
		int input = sc.nextInt();

		int[] scores = new int[input];

		getValue(scores);

		System.out.println("평균 : " + getAverage(scores));

		printArray(scores);
	}

	public static void getValue(int[] scores)
	{
		Scanner sc = new Scanner(System.in);

		if (scores.length > 0)
		{
			for (int i = 0; i < scores.length; i++)
			{
				System.out.print("scores[" + i + "] : ");
				int score = sc.nextInt();
				scores[i] = score;
			}
		}
	}

	public static double getAverage(int[] scores)
	{
		int sum = 0;
		for (int i = 0; i < scores.length; i++)
			sum += scores[i];

		return (double) sum / scores.length;
	}

	public static void printArray(int[] scores)
	{
		for (int i = 0; i < scores.length; i++)
			System.out.println("scores[" + i + "] : " + scores[i]);
	}
}
