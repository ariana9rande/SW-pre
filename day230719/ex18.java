package day230719;

import java.util.Scanner;

public class ex18
{
	/*
	 * 간단한 계산기를 구현하는 프로그램을 작성
	 * 연산자와 피연산자 2개를 입력받은 후 결과를 출력
	 * ex) + 3 8 -> 11
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		String[] input = sc.nextLine().split(" ");
		
		switch(input[0])
		{
			case "+":
				System.out.println("output : " + (Integer.parseInt(input[1]) + Integer.parseInt(input[2])));
				break;
			case "-":
				System.out.println("output : " + (Integer.parseInt(input[1]) - Integer.parseInt(input[2])));
				break;
			case "*":
				System.out.println("output : " + (Integer.parseInt(input[1]) * Integer.parseInt(input[2])));
				break;
			case "/":
				if(Integer.parseInt(input[2]) != 0)
					System.out.println("output : " + ((double)Integer.parseInt(input[1]) / Integer.parseInt(input[2])));
				else
					System.out.println("0으로 나눌 수 없습니다.");
				break;
		}
	}
}
