package day230720;

import java.util.Scanner;

public class ex25
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int student = 2, subject = 3;
		int[][] scores = new int[student][subject];
		
		int[] sum = new int[student];
		double[] avg = new double[student];
		
		for(int i = 0; i < student; i++)
		{
			for(int j = 0; j < subject; j++)
			{
				System.out.print("학생" + (i + 1) + " - 과목" + (j + 1) + " 점수 : ");
				int score = sc.nextInt();
				scores[i][j] = score;
				sum[i] += score;
			}
			System.out.println();
		}
		
		for(int i = 0; i < student; i++)
		{
			avg[i] = (double)sum[i] / subject;
			System.out.println("학생" + (i + 1) + " 점수 합계 : " + sum[i]);
			System.out.println("학생" + (i + 1) + " 점수 평균 : " + avg[i]);
			System.out.println();
		}
		System.out.println("전체 평균 : " + ((double)(sum[0] + sum[1]) / student) / subject);
	}
}
