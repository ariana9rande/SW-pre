package day230803;

public class Member
{
	private int memberId;
	private String memberName;
	private String password;
	private String role;
	private Book book;
	private boolean late;

	public Member(String memberName, String password, String role)
	{
		this.memberName = memberName;
		this.password = password;
		this.role = role;
		this.book = null;
		this.late = false;
	}
	
	public int getMemberId()
	{
		return memberId;
	}

	public void setMemberId(int memberId)
	{
		this.memberId = memberId;
	}

	public String getMemberName()
	{
		return memberName;
	}

	public void setMemberName(String memberName)
	{
		this.memberName = memberName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getRole()
	{
		return role;
	}

	public void setRole(String role)
	{
		this.role = role;
	}

	public Book getBook()
	{
		return book;
	}

	public void setBook(Book book)
	{
		this.book = book;
	}

	public boolean isLate()
	{
		return late;
	}

	public void setLate(boolean late)
	{
		this.late = late;
	}

}
