package day230717;

import java.util.Scanner;

public class ScannerExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("age : ");
		int age = sc.nextInt();

		System.out.print("weight : ");
		double weight = sc.nextDouble();

		System.out.print("height : ");
		double height = sc.nextDouble();

		System.out.println("age : " + age + "\nweight : " + weight + "\nheight : " + height);
	}
}
