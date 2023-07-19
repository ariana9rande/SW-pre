package day230718;

import java.util.HashMap;
import java.util.Map;

public class ex6
{
	public static void main(String[] args)
	{
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
	}
}
