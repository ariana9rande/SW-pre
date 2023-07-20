package day230720;

import java.util.ArrayList;
import java.util.Scanner;

public class ex23
{
	/*
	 * n 입력 받아서 n개의 피보나치 수열 출력
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		int input = sc.nextInt();
		
		fib(input);
	}
	
	public static void fib(int n)
	{
		ArrayList<Integer> fib = new ArrayList<>();
		fib.add(0);
		fib.add(1);
		
		for(int i = 2; i <= n; i++)
		{
			fib.add(i, fib.get(i - 2) + fib.get(i - 1));
		}
		
		for(int item : fib)
			System.out.print(item + " ");
	}
}
