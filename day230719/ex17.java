package day230719;

import java.util.Scanner;

public class ex17
{
	/*
	 * 230719
	 * while, Scanner 이용하여 예금, 출금, 조회, 종료기능
	 * switch-case이용
	 * 1 입력 : 예금액 증가
	 * 2 입력 : 예금액 감소
	 * 3 입력 : 잔고 출력
	 * 4 입력 : run을 false로 만들어 종료
	 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int money = 0;
		boolean run = true;
		
		while(run == true)
		{
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			int input = sc.nextInt();
			
			switch(input)
			{
				case 1:
					System.out.print("예금액> ");
					int input_1 = sc.nextInt();
					money += input_1;
					break;
				case 2:
					System.out.print("출금액> ");
					int input_2 = sc.nextInt();
					if(money >= input_2)
						money -= input_2;
					else
						System.out.println("출금액이 잔고를 초과합니다.");
					break;
				case 3:
					System.out.println("잔고> " + money);
					break;
				case 4:
					System.out.println("프로그램 종료");
					run = false;
					break;
			}
		}
	}
}
