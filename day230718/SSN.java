package day230718;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SSN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "남자");
//		map.put(2, "여자");
//		map.put(3, "남자");
//		map.put(4, "여자");

		String a, result = "";
		
		while(true)
		{
			System.out.print("주민등록번호 : ");
			String input = sc.nextLine();

			String[] str = input.split("-");
			int target = (int)(str[1].charAt(0) - '0');
			
//			System.out.println(map.get(target));
			
			switch(target)
			{
				case 1:
				case 3:
					result = "남자";
					break;
				case 2:
				case 4:
					result = "여자";
					break;
				default:
					break;
			}
			
			System.out.println(result);
			
			System.out.println("입력을 계속하시겠습니까?(y/n)");
			a = sc.nextLine();
			
			if(a.equals("y"))
				continue;
			else if(a.equals("n"))
				break;
			else
			{
				do
				{
					System.out.println("y/n를 입력해주세요");
					System.out.println("입력을 계속하시겠습니까?(y/n)");
					a = sc.nextLine();
				}
				while(!a.equals("y") && !a.equals("n"));
			}
			
			if(a.equals("n"))
				break;
		}
	}
}
