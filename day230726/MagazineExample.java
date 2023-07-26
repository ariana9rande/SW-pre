package day230726;

import java.util.Scanner;

public class MagazineExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("n : ");
		int n = Integer.parseInt(sc.nextLine());
		
		Magazine[] magazines = new Magazine[n];

		for (int i = 0; i < n; i++)
		{
			System.out.print("잡지 이름 : ");
			String title = sc.nextLine();

			System.out.print("페이지 수 : ");
			int pages = Integer.parseInt(sc.nextLine());

			System.out.print("저자 : ");
			String writer = sc.nextLine();

			System.out.print("발매일 : ");
			String releasedDate = sc.nextLine();

			magazines[i] = new Magazine(title, pages, writer, releasedDate);
		}
		
		for(Magazine m : magazines)
			System.out.println("책 이름 : " + m.getTitle() + "\n페이지 수 : " + m.getPages() 
					+ "\n저자 : " + m.getWriter() + "\n발매일 : " + m.getReleasedDate());
		
		sc.close();
	}
}
