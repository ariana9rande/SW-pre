package day230728;

import java.util.Arrays;

public class CircleExample
{
	public static void main(String[] args)
	{
		Circle a = new Circle(5);
		Circle b = new Circle(1);
		Circle c = new Circle(3);
		
		Circle[] circles = {a, b, c};
		
		Arrays.sort(circles);
		for(Circle circle : circles)
			System.out.println(circle.getRadius());
	}
}
