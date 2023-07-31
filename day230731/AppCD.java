package day230731;

public class AppCD extends CD implements Lendable
{
	private String borrower;
	private String checkOutDate;
	private boolean state;
	
	public AppCD(String registerNo, String CDTitle)
	{
		super(registerNo, CDTitle);
		this.state = false;
	}
	
	@Override
	public void checkOut(String borrower, String checkOutDate)
	{
		if(state)
			System.out.println("대출 실패. " + this.getCDTitle() + "은 이미 대출 중입니다.");
		else
		{
			this.state = true;
			this.borrower = borrower;
			this.checkOutDate = checkOutDate;
			System.out.println("이름 : " + this.getCDTitle() + ", 대출자 : " + borrower + ", 대출일 : " + checkOutDate + " 대출 처리 되었습니다.");
		}
		System.out.println();
	}
	
	@Override
	public void checkIn()
	{
		if(!state)
			System.out.println("반납 실패. " + this.getCDTitle() + "은 대출중이 아닙니다.");
		else
		{
			this.state = false;
			this.borrower = null;
			this.checkOutDate = null;
			System.out.println("제목 : " + this.getCDTitle() + " 반납 처리 되었습니다.");
		}
		System.out.println();
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
}
