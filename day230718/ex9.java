package day230718;

import java.util.Scanner;

public class ex9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("input : ");
		String str = sc.next();
		int 자음 = 0, 모음 = 0;
		boolean check;

		char[] arr = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

		for (int i = 0; i < str.length(); i++)
		{
			check = false;
			for (int j = 0; j < arr.length; j++)
			{
				if(arr[j] == str.charAt(i))
				{
					모음++;
					check = true;
					break;
				}
			}
			if(!check)
				자음++;
		}
		System.out.println("자음 : " + 자음 + "개");
		System.out.println("모음 : " + 모음 + "개");
	}
}
