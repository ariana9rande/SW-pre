package day230718;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class randomExample
{
	public static void main(String[] args)
	{
		// 1
		System.out.print("1 ~ 10 사이의 난수 : ");
		System.out.printf("%.2f\n", Math.random() * 9 + 1);
		System.out.println();
		
		// 2
		int start = 100;
		int n = 200;
		System.out.println("start = " + start + " n = " + n);
		System.out.print("start ~ n 사이의 정수 : ");
		System.out.println((int)(Math.random() * 100) + start);
		System.out.println();
		
		// 3
		System.out.print("주사위 번호 중 하나(1 ~ 6) : ");
		System.out.println((int)(Math.random() * 6) + 1);
		System.out.println();
		
		// 4
		System.out.print("로또 번호 중 하나(1 ~ 45) : ");
		System.out.println((int)(Math.random() * 45) + 1);
		System.out.println();
		
		// 5
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
		
		// 6
		int cnt = 0;
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "앞");
		map.put(1, "뒤");
		
		while(true)
		{
			int a = (int)(Math.random() * 2);
			int b = (int)(Math.random() * 2);
			cnt++;
			
			System.out.println(map.get(a) + ", " + map.get(b));
			
			if(a == b && a == 0)
				break;
		}
		
		System.out.println("count = " + cnt);
		System.out.println();
		
		// 7
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
