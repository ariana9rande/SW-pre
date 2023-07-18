package day230717;

import java.util.Scanner;

public class ex3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();

		System.out.print("b : ");
		int b = sc.nextInt();

		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + a * b);
		System.out.println("평균 = " + (double) (a + b) / 2);
		System.out.println("큰 수 = " + (a > b ? a : b));
		System.out.println("작은 수 = " + (a > b ? b : a));
	}
}
