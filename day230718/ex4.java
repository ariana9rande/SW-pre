package day230718;

import java.util.Scanner;

public class ex4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("시간 간격을 입력하시오 (단위: 초): ");
		int input = sc.nextInt();

		int distance = input * 340;
		System.out.println("번개가 발생한 곳까지의 거리: " + distance);
	}
}
