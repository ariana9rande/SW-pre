package day230726;

public class Magazine extends Book
{
	private String releasedDate;
	
	public Magazine(String title, int pages, String writer, String releasedDate)
	{
		super(title, pages, writer);
		this.releasedDate = releasedDate;
	}

	public String getReleasedDate()
	{
		return releasedDate;
	}

	public void setReleasedDate(String releasedDate)
	{
		this.releasedDate = releasedDate;
	}
}
