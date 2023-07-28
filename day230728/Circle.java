package day230728;

public class Circle implements Comparable<Circle>
{
	double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public int compareTo(Circle c)
	{
		return (int)(this.radius - c.radius);
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
}
