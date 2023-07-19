package day230718;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ex7
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr2 = new ArrayList<>();
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(0, "앞");
		map2.put(1, "뒤");
		
		for(int i = 0; i < 3; i++)
			arr2.add((int)(Math.random() * 2));
		
		for(int item : arr2)
			System.out.print(map2.get(item) + " ");
		System.out.println();
	}
}
