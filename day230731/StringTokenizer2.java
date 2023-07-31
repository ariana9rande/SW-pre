package day230731;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int n = 0;
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			n++;
		}
		System.out.println("n : " + n);
		sc.close();
	}
}
