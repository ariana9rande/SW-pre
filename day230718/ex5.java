package day230718;

import java.util.Scanner;

public class ex5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("가격 : ");
		int price = sc.nextInt();

		System.out.print("받은 금액 : ");
		int money = sc.nextInt();

		int vat = price / 10;

		System.out.println("부가세 : " + vat + "\n잔돈 : " + (money - price));
	}
}