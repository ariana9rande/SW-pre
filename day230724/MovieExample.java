package day230724;

import java.util.Scanner;

public class MovieExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Movie[] arr = new Movie[2];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = new Movie();
			
			System.out.print("name : ");
			arr[i].name = sc.nextLine();
			
			System.out.print("director : ");
			arr[i].director = sc.nextLine();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("{" + arr[i].name + ", " + arr[i].director + "} ");
		}
	}
}
