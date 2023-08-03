package day230803;

public class Book
{
	private int bookId;
	private String title;
	private String author;
	private String category;
	private String borrower;
	private String checkOutDate;
	private boolean available;

	public Book(String title, String author, String category)
	{
		this.title = title;
		this.author = author;
		this.category = category;
		this.available = true;
	}
	
	public Book(int id, String title, String author, String category, String borrower, String checkOutDate,
			boolean b)
	{
		this.bookId = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.available = b;
	}

	public int getBookId()
	{
		return bookId;
	}

	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public boolean getAvailable()
	{
		return available;
	}

	public void setAvailable(boolean available)
	{
		this.available = available;
	}

}
