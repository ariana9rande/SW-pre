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
	public boolean checkOut(String borrower, String checkOutDate)
	{
		if(state)
		{
			System.out.println("대출 실패. " + getCDTitle() + "는(은) 이미 대출 중입니다.");
			return false;
		}
		else
		{
			this.state = true;
			this.borrower = borrower;
			this.checkOutDate = checkOutDate;
			System.out.println("제목 : " + getCDTitle() + ", 대출자 : " + borrower + ", 대출일 : " + checkOutDate + " 대출 처리 되었습니다.");
			return true;
		}
	}
	
	@Override
	public boolean checkIn()
	{
		if(!state)
		{
			System.out.println("반납 실패. " + getCDTitle() + "는(은) 대출중이 아닙니다.");
			return false;
		}
		else
		{
			this.state = false;
			this.borrower = null;
			this.checkOutDate = null;
			System.out.println("제목 : " + getCDTitle() + " 반납 처리 되었습니다.");
			return true;
		}
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
	
	public String toString()
	{
		String str = "등록번호 : " + getRegisterNo() + " 제목 : " + getCDTitle();
		if(this.state)
			str += " 대출자 : " + this.borrower + " 대출일자 : " + this.checkOutDate;
		return str;
	}
}
