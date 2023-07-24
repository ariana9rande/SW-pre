package day230724;

import java.util.Scanner;

public class ECarExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ECar eCar1 = new ECar();
		
		while(true)
		{
			System.out.println("-----------------------------------");
			System.out.println("1.차 상태 조회 | 2.주행 | 3.충전 | 4.종료");
			System.out.println("-----------------------------------");
			
			int input = sc.nextInt();
			
			if(input == 1)
			{
				eCar1.dispDistance();
				eCar1.dispBattery();
			}
			else if(input == 2)
			{
				System.out.println("주행 거리 입력 : ");
				int dist = sc.nextInt();
				
				for(int i = 0; i < dist; i++)
				{
					eCar1.drive();
				}
			}
			else if(input == 3)
			{
				eCar1.charge();
			}
			else if(input == 4)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		sc.close();
	}
}
