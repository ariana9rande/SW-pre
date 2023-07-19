package day230719;

import java.util.Scanner;

public class ex16
{
	/*
	 * n명의 점수를 입력받은 후, 평균을 출력하고, 평균을 가로막대 그래프(***)로 표현
	 * ex) 평균이 88이면 * 8개 출력
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg;
		
		System.out.print("input n : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("grade : ");
			int grade = sc.nextInt();
			sum += grade;
		}
		
		avg = sum / n;
		System.out.println("점수 총합 : " + sum);
		System.out.println("점수 평균 : " + avg);
		System.out.print("graph : ");
		for(int i = 0; i < (int)avg / 10; i++)
		{
			System.out.print("*");
		}
	}
}
