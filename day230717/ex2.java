package day230717;

import java.util.Scanner;

public class ex2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("mile : ");
		Double mile = sc.nextDouble();

		Double kilo = mile * 1.6;
		System.out.println("kilo : " + kilo);
	}
}
