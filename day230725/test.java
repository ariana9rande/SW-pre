package day230725;

import java.util.ArrayList;

public class test
{
	static ArrayList<String> chairs = new ArrayList<>(3);
	static ArrayList<Integer> indexes = new ArrayList<>(3);
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
				// 같은 동물이 앉아 있는 인덱스를 indexes에서 삭제하고 다시 추가해서 최근에 앉은 자리로 설정
				indexes.remove(indexes.indexOf(chairs.indexOf(arr.get(i))));
				indexes.add(chairs.indexOf(arr.get(i)));
				// 시간 1초 증가
				result++;
			}
			// 같은 동물이 없는 경우
			else
			{
				// 빈 자리가 있는 경우
				if (chairs.size() < 3)
				{
					// 빈 자리에 앉히고 해당 인덱스를 indexes에 추가해서 최근에 앉은 자리로 설정
					chairs.add(arr.get(i));
					indexes.add(chairs.indexOf(arr.get(i)));
					// 시간 60초 증가
					result += 60;
				}
				// 빈 자리가 없는 경우
				else
				{
					// 가장 앉은 지 오래된 자리를 temp에 대입하고 삭제
					int temp = indexes.get(0);
					indexes.remove(0);
					// 새로운 동물을 앉히고 해당 자리를 indexes에 추가해서 최근에 앉은 자리로 설정
					chairs.set(temp, arr.get(i));
					indexes.add(temp);
					// 시간 60초 증가
					result += 60;
				}
			}
		}
	}
}
