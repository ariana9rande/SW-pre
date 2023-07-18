package day230718;

import java.util.Scanner;

public class 첫글자_대소문자_판별
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input : ");
		String str = sc.nextLine();
		
		char firstChar = str.charAt(0);
		System.out.println("첫글자 : " + firstChar);
		
		if((int)firstChar >= 65 && (int)firstChar <= 90)
			System.out.println("대문자");
		else if((int)firstChar >= 97 && (int)firstChar <= 122)
			System.out.println("소문자");
	}
}
