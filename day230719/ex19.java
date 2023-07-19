package day230719;

import java.util.Scanner;

public class ex19
{
	/*
	 * 3 6 9 게임 프로그램
	 * 입력 받은 수에 대해 실행
	 * ex) 15 입력 : 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		int input = sc.nextInt();
		String result = "";

		for (int i = 1; i <= input; i++)
		{
			if (Integer.toString(i).contains("3")
					|| Integer.toString(i).contains("6")
					|| Integer.toString(i).contains("9"))
				result += "짝 ";
			else
				result += i + " ";
		}
		System.out.println(result);
	}
}
