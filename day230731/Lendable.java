package day230731;

public interface Lendable
{
	boolean checkOut(String borrower, String checkOutDate);
	boolean checkIn();
}
