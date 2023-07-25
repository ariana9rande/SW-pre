package day230725;

import java.util.ArrayList;
import java.util.Scanner;

public class StringBuilderReverse
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.print("input : ");
		sb.append(sc.nextInt());
	
		sb.reverse();
		
		for(int i = 0; i < sb.length(); i++)
		{
			arr.add(sb.toString().charAt(i) - 48);
		}
		
		System.out.println(arr);
	}
}
