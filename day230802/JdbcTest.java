package day230802;

import java.util.Scanner;

public class JdbcTest
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		boolean run = true;

		while(run)
		{
			System.out.println();
			System.out.println("\t\t ** Student DB **");
			System.out.println("1.입력(insert) | 2.수정(update) | 3.삭제(delete) | 4.검색(select) | 5.종료");
			System.out.print("Student 테이블의 원하는 명령을 선택 : ");
			menuNo = sc.nextInt();

			switch(menuNo)
			{
				case 1: // insert (삽입)
					JdbcMethod insert = new JdbcMethod();
					insert.insertMethod();
					break;
				case 2: // update (수정)
					JdbcMethod update = new JdbcMethod();
					update.updateMethod();
					break;
				case 3: // delete (삭제)
					JdbcMethod delete = new JdbcMethod();
					delete.deleteMethod();
					break;
				case 4: // select (검색)
					JdbcMethod select = new JdbcMethod();
					select.selectMethod();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다. ");
					run = false;
					break;
			}
		}
		sc.close();
	}
}