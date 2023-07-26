package day230726;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		System.out.print("input : ");
		sb.append(sc.nextLine());
		
		System.out.print("n : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < sb.length(); i++)
		{
			char temp = sb.charAt(i);
			if(temp >= 'A' && temp <= 'Z')
			{
				if(temp + n > 'Z')
					temp -= 26;
				result.append((char)(temp + n));
			}
			else if(temp >= 'a' && temp <= 'z')
			{
				if(temp + n > 'z')
					temp -= 26;
				result.append((char)(temp + n));
			}
			else if(temp == ' ')
				result.append(temp);
		}
		System.out.println(result.toString());
		sc.close();
	}
}
