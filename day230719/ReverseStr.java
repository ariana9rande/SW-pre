package day230719;

import java.util.Scanner;

public class ReverseStr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		String str = sc.nextLine();
//		String result = "";
//		
//		System.out.print("output : ");
//		for(int i = str.length() - 1; i >= 0; i--)
//		{
//			result += str.charAt(i);
//		}
//		
//		System.out.println(result);
		
		System.out.print("output : ");
		for(int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
	}
}
