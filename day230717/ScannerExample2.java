package day230717;

import java.util.Scanner;

public class ScannerExample2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("밑변 : ");
		double width = sc.nextDouble();

		System.out.print("높이 : ");
		double height = sc.nextDouble();

		double area = width * height / 2;

		System.out.println("넓이 : " + area);
	}
}
