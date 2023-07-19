package day230719;

import java.util.Scanner;

public class 구구단1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= 9; i++)
		{
			System.out.println(input + " * " + i + " = " + input * i);
		}
	}
}
