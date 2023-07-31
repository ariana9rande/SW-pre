package day230731;

public class Book implements Lendable
{
	private String requestNo;
	private String bookTitle;
	private String writer;
	private String borrower;
	private String checkOutDate;
	private boolean state;

	public Book(String requestNo, String bookTitle, String writer)
	{
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
		this.state = false;
	}

	@Override
	public boolean checkOut(String borrower, String checkOutDate)
	{
		if(state)
		{
			System.out.println("대출 실패. " + bookTitle + "는(은) 이미 대출 중입니다.");
			return false;
		}
		else
		{
			this.state = true;
			this.borrower = borrower;
			this.checkOutDate = checkOutDate;
			System.out.println("제목 : " + bookTitle + ", 대출자 : " + borrower + ", 대출일 : " + checkOutDate + " 대출 처리 되었습니다.");
			return true;
		}
	}

	@Override
	public boolean checkIn()
	{
		if(!state)
		{
			System.out.println("반납 실패. " + bookTitle + "는(은) 대출중이 아닙니다.");
			return false;
		}
		else
		{
			this.state = false;
			this.borrower = null;
			this.checkOutDate = null;
			System.out.println("제목 : " + bookTitle + " 반납 처리 되었습니다.");
			return true;
		}
	}

	public String getRequestNo()
	{
		return requestNo;
	}

	public void setRequestNo(String requestNo)
	{
		this.requestNo = requestNo;
	}

	public String getBookTitle()
	{
		return bookTitle;
	}

	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}

	public String getWriter()
	{
		return writer;
	}

	public void setWriter(String writer)
	{
		this.writer = writer;
	}

	public String getBorrower()
	{
		return borrower;
	}

	public void setBorrower(String borrower)
	{
		this.borrower = borrower;
	}

	public String getCheckOutDate()
	{
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate)
	{
		this.checkOutDate = checkOutDate;
	}

	public boolean isState()
	{
		return state;
	}

	public void setState(boolean state)
	{
		this.state = state;
	}

	@Override
	public String toString()
	{
		String str = "청구번호 : " + requestNo + " 제목 : " + bookTitle + " 저자 : " + writer;
		if(this.state)
			str += " 대출자 : " + this.borrower;
		return str;
	}
}
