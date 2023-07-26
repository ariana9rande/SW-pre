package day230725;

import java.util.ArrayList;

public class test
{
	static ArrayList<String> chairs = new ArrayList<>(3);
	static int result;

	public static void main(String[] args)
	{
		ArrayList<String> input = new ArrayList<>();
		input.add("척추동물");
		input.add("어류");
		input.add("척추동물");
		input.add("무척추동물");
		input.add("파충류");
		input.add("척추동물");
		input.add("어류");
		input.add("파충류");

		LRU(input);
		
		if(result >= 60)
			System.out.print(result / 60 + "분 ");
		
		if(result % 60 != 0)
			System.out.println(result % 60 + "초");
	}

	public static void LRU(ArrayList<String> arr)
	{
		for (int i = 0; i < arr.size(); i++)
		{
			// 같은 동물이 앉아 있는 경우
			if (chairs.contains(arr.get(i)))
			{
				chairs.remove(arr.get(i));
				chairs.add(arr.get(i));
				result++;
			}
			// 같은 동물이 없는 경우
			else
			{
				// 빈 자리가 있는 경우
				if (chairs.size() < 3)
				{
					chairs.add(arr.get(i));
					result += 60;
				}
				// 빈 자리가 없는 경우
				else
				{
					chairs.remove(0);
					chairs.add(arr.get(i));
					result += 60;
				}
			}
		}
	}
}
