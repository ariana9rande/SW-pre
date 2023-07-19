package day230719;

import java.util.Scanner;

public class ex13
{
	// ex1 첫글자
//	public static void main(String[] args)
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("input : ");
//		String str = sc.next();
//		
//		char chr = str.charAt(0);
//		
//		if(chr >= 'a' && chr <= 'z')
//			System.out.println("output : " + (char)(chr - 32));
//		else if(chr >= 'A' && chr <= 'Z')
//			System.out.println("output : " + (char)(chr + 32));
//		else
//			System.out.println("알파벳이 아닙니다.");
//	}

	// ex2 단어
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String result = "";
		String str;
		boolean check;

		while (true)
		{
			check = false;
			System.out.print("input : ");
			str = sc.next();

			for (int i = 0; i < str.length(); i++)
			{
				char chr = str.charAt(i);

				if ((chr < 'A' || chr > 'z') || (chr > 'Z' && chr < 'a'))
				{
					check = true;
					break;
				}
			}
			if (check)
				System.out.println("알파벳만 입력해주세요");
			else
				break;
		}

		for (int i = 0; i < str.length(); i++)
		{
			char chr = str.charAt(i);

			if (chr >= 'a' && chr <= 'z')
				result += (char) (chr - 32);
			else if (chr >= 'A' && chr <= 'Z')
				result += (char) (chr + 32);
		}
		System.out.println("output : " + result);
	}
}