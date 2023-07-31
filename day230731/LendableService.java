package day230731;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class LendableService
{
	Scanner sc = new Scanner(System.in);
	ArrayList<Member> members = new ArrayList<>();
	ArrayList<Book> books = new ArrayList<>();
	ArrayList<AppCD> CDs = new ArrayList<>();

	public void add()
	{
		System.out.print("회원, 책, CD(1, 2, 3) : ");
		int input = Integer.parseInt(sc.nextLine());

		switch(input)
		{
			case 1 ->
			{
				int id;

				do
					id = (int)(Math.random() * 900) + 100;
				while(searchMemberById(id) != null);

				System.out.print("이름 : ");
				String name = sc.nextLine();

				members.add(new Member(id, name));
				System.out.println("Member 추가 완료. " + members.get(members.size() - 1));
			}
			case 2 ->
			{
				String id;

				do
					id = String.valueOf((int)(Math.random() * 9000) + 1000);
				while(searchBookById(id) != null);

				System.out.print("책 제목 : ");
				String title = sc.nextLine();

				System.out.print("책 저자 : ");
				String writer = sc.nextLine();

				books.add(new Book(id, title, writer));
				System.out.println("Book 추가 완료. " + books.get(books.size() - 1));
			}
			case 3 ->
			{
				String id;

				do
					id = String.valueOf((int)(Math.random() * 90000) + 10000);
				while(searchBookById(id) != null);

				System.out.print("CD 제목 : ");
				String title = sc.nextLine();

				CDs.add(new AppCD(id, title));
				System.out.println("CD 추가 완료. " + CDs.get(CDs.size() - 1));
			}
		}
		System.out.println();
	}

	public Member searchMemberById(int id)
	{
		for(Member m : members)
			if(m.getId() == id)
				return m;
		return null;
	}

	public Member searchMemberByName(String name)
	{
		for(Member m : members)
			if(m.getName().equals(name))
				return m;
		return null;
	}

	public void printMembers()
	{
		System.out.println("------------");
		System.out.println("회원 조회");
		System.out.println("------------");

		if(members.size() == 0)
			System.out.println("회원이 존재하지 않습니다.");
		else
			for(Member m : members)
				System.out.println(m);
		System.out.println();
	}

	public Book searchBookByTitle(String title)
	{
		for(Book b : books)
			if(b.getBookTitle().equals(title))
				return b;
		return null;
	}

	public Book searchBookById(String requestNo)
	{
		for(Book b : books)
			if(b.getRequestNo().equals(requestNo))
				return b;
		return null;
	}

	public AppCD searchCDByTitle(String title)
	{
		for(AppCD cd : CDs)
			if(cd.getCDTitle().equals(title))
				return cd;
		return null;
	}

	public AppCD searchCDById(String registerNo)
	{
		for(AppCD cd : CDs)
			if(cd.getRegisterNo().equals(registerNo))
				return cd;
		return null;
	}

	public void checkOut()
	{
		System.out.println("------------");
		System.out.println("대출");
		System.out.println("------------");

		System.out.print("이름 : ");
		String borrower = sc.nextLine();

		LocalDate today = LocalDate.now();
		DateTimeFormatter formattedToday = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String checkOutDate = today.format(formattedToday);

		if(searchMemberByName(borrower) != null)
		{
			System.out.print("책, CD 선택(1, 2) : ");
			int input = Integer.parseInt(sc.nextLine());

			if(input == 1)
			{
				System.out.print("대출할 책 제목 : ");
				String title = sc.nextLine();

				if(searchBookByTitle(title) != null)
					searchBookByTitle(title).checkOut(borrower, checkOutDate);
				else
					System.out.println("해당 제목의 책을 찾을 수 없습니다.");
			}
			else if(input == 2)
			{
				System.out.print("대출할 CD 제목 : ");
				String title = sc.nextLine();

				if(searchCDByTitle(title) != null)
					searchCDByTitle(title).checkOut(borrower, checkOutDate);
				else
					System.out.println("해당 제목의 CD를 찾을 수 없습니다.");
			}
		}
		else
			System.out.println("해당 이름의 회원을 찾을 수 없습니다.");
		System.out.println();
	}

	public void checkIn()
	{
		System.out.println("------------");
		System.out.println("반납");
		System.out.println("------------");

		System.out.print("책, CD 선택(1, 2) : ");
		int input = Integer.parseInt(sc.nextLine());

		if(input == 1)
		{
			System.out.print("반납할 책 제목 : ");
			String title = sc.nextLine();

			if(searchBookByTitle(title) != null)
				searchBookByTitle(title).checkIn();
			else
				System.out.println("해당 제목의 책을 찾을 수 없습니다.");
		}
		else if(input == 2)
		{
			System.out.print("반납할 CD 제목 : ");
			String title = sc.nextLine();

			if(searchCDByTitle(title) != null)
				searchCDByTitle(title).checkIn();
			else
				System.out.println("해당 제목의 CD를 찾을 수 없습니다.");
		}
		System.out.println();
	}

	public void printBooks()
	{
		System.out.println("------------");
		System.out.println("Book 조회");
		System.out.println("------------");

		if(books.size() == 0)
			System.out.println("책이 존재하지 않습니다.");
		else
			for(Book b : books)
				System.out.println(b);
		System.out.println();
	}

	public void printCDs()
	{
		System.out.println("------------");
		System.out.println("CD 조회");
		System.out.println("------------");

		if(CDs.size() == 0)
			System.out.println("CD가 존재하지 않습니다.");
		else
			for(AppCD cd : CDs)
				System.out.println(cd);
		System.out.println();
	}
}
