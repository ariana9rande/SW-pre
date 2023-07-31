package day230731;

import java.util.Arrays;

public class test
{
	public static void main(String[] args)
	{
		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int n = 0;
		System.out.print("[");
		for(int i : solution(arr, commands))
		{
			if(n < commands.length - 1)
			{
				System.out.print(i + ", ");
				n++;
			}
			else
				System.out.print(i);
		}
		System.out.print("]");
	}

	public static int[] solution(int[] arr, int[][] commands)
	{
		int[] result = new int[commands.length];

		for(int i = 0; i < commands.length; i++)
		{
			int[] temp = Arrays.copyOfRange(arr, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			result[i] = temp[commands[i][2] - 1];
		}

		return result;
	}
}
