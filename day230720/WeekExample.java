package day230720;

import java.util.Calendar;

public class WeekExample
{
	public static void main(String[] args)
	{
		Week today = null;

		Calendar cal = Calendar.getInstance();

		int week = cal.get(Calendar.DAY_OF_WEEK);

		today = switch (week)
		{
			case 1 -> Week.SUNDAY;
			case 2 -> Week.MONDAY;
			case 3 -> Week.TUESDAY;
			case 4 -> Week.WEDNESDAY;
			case 5 -> Week.THURSDAY;
			case 6 -> Week.FRIDAY;
			case 7 -> Week.SATURDAY;
			default -> null;
		};

		if(today == Week.SUNDAY)
			System.out.println("일요일에는 축구를 합니다.");
		else
			System.out.println("열심히 자바를 공부합니다.");
	}
}
