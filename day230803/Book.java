package day230803;

public class Book
{
	private int bookId;
	private String title;
	private String author;
	private int category;
	private boolean available;

	public Book(String title, String author, int category)
	{
		this.title = title;
		this.author = author;
		this.category = category;
		this.available = true;
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

	public int getCategory()
	{
		return category;
	}

	public void setCategory(int category)
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
