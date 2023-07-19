package day230719;

import java.util.ArrayList;

public class ex14
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		int sum_total = 0, sum_3 = 0, result = 0;
		boolean check = false;

		for (int i = 0; i < 20; i++)
			arr.add((int) (Math.random() * 50) + 1);

		System.out.print("난수 : ");
		for(int item : arr)
			System.out.print(item + " ");
		System.out.println();

		for (int i = 0; i < arr.size(); i++)
		{
			sum_total += arr.get(i);
			if (arr.get(i) % 3 != 0)
				result += arr.get(i);
			else
			{
				if (!check)
				{
					System.out.print("3의 배수 : ");
					check = true;
				}
				sum_3 += arr.get(i);
				System.out.print(arr.get(i) + " ");
			}
		}

		System.out.println();
		System.out.println("3의 배수의 합 : " + sum_3);
		System.out.println("총합 : " + sum_total);
		System.out.println("3의 배수 제외한 합 : " + result);
	}
}
