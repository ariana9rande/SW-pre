package day230718;

import java.util.ArrayList;

public class ex5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < 3; i++)
			arr.add((int)(Math.random() * 100) + 1);
		
		int max = 0;
		for(int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i) > max)
				max = arr.get(i);
		}
		
		System.out.print("1 ~ 100 범위의 세 수 : ");
		
		for(int item : arr)
			System.out.print(item + " ");
		
		System.out.println("\n최대값 : " + max);
		System.out.println();
	}
}
