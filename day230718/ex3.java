package day230718;

import java.util.Scanner;

public class ex3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int input;
		String answer = "";

		while (true)
		{
			System.out.print("input : ");
			input = sc.nextInt();

			if (input >= 100)
			{
				System.out.print("입력값 범위 초과\n");
			}
			else
				break;
		}

		if (input == 0)
			answer = "0";
		else
		{
			while (input != 0)
			{
				answer += input % 2;
				input /= 2;
			}
		}
		
		System.out.print("output : ");
		
		for(int i = answer.length() - 1; i >= 0; i--)
		{
			System.out.print(answer.charAt(i));
		}
	}
}
