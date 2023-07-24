package day230724;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonExample
{
	/*
	 * Person 클래스에 name, tel 필드 정의 후. ArrayList에 4명의 정보를 추가해서 출력
	 */
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> arr = new ArrayList<>();
		String name, tel;
		
		for(int i = 0; i < 4; i++)
		{
			System.out.print("name : ");
			name = sc.nextLine();
			
			System.out.print("tel : ");
			tel = sc.nextLine();
			
			arr.add(new Person(name, tel));
		}
		
		for(int i = 0; i < arr.size(); i++)
			System.out.println(arr.get(i).toString());
		
		sc.close();
	}
}
