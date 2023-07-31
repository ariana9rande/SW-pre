package day230731;

public class LendableExample
{
	public static void main(String[] args)
	{
		Book b = new Book("1234", "책1", "hjh");
		AppCD cd = new AppCD("12345", "CD1");
		
		//반납 실패
		b.checkIn();
		//대출 성공
		b.checkOut("홍재호", "2023.07.31");
		//대출 실패
		b.checkOut("홍재호", "2023.07.31");
		//반납 성공
		b.checkIn();
		
		//반납 실패
		cd.checkIn();
		//대출 성공
		cd.checkOut("홍재호", "2023.07.31");
		//대출 실패
		cd.checkOut("홍재호", "2023.07.31");
		//반납 성공
		cd.checkIn();
	}
}
