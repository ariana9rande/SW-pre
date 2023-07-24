package day230720;

import java.util.Calendar;

public class WeekExample2
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
		
		System.out.print("오늘은 ");
		// 1
		if((Week.valueOf(today.toString()) == Week.SUNDAY) || (Week.valueOf(today.toString()) == Week.SATURDAY))
				System.out.println("주말");
		else
			System.out.println("평일");
		
		// 2
		for(Week day : Week.values())
			System.out.print(day + " ");
	}
}
