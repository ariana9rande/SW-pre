package day230719;

import java.util.Scanner;

public class ex2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++)
		{
			for(int j = 0; j < input + i; j++)
			{
				if(j >= input - 1 - i && j <= input - 1 + i)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}
}
