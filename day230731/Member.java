package day230731;

public class Member
{
	private int id;
	private String name;
	private boolean state;
	private Book book;
	private AppCD CD;

	public Member(int id, String name)
	{
		this.id = id;
		this.name = name;
		this.state = false;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public boolean getState()
	{
		return state;
	}

	public void setState(boolean state)
	{
		this.state = state;
	}

	public Book getBook()
	{
		return book;
	}

	public void setBook(Book book)
	{
		this.book = book;
	}

	public AppCD getCD()
	{
		return CD;
	}

	public void setCD(AppCD CD)
	{
		this.CD = CD;
	}

	@Override
	public String toString()
	{
		String str = "ID : " + id + " 이름 : " + name;
		
		if(this.state)
		{
			str += " 대출 목록 : ";
			
			if(this.book != null)
				str += book.getBookTitle();
			else if(this.CD != null)
				str += CD.getCDTitle();
		}
		return str;
	}
}
