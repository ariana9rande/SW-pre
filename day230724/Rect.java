package day230724;

public class Rect
{
	int width, height;

	public Rect(int w, int h)
	{
		this.width = w;
		this.height = h;
	}

	double calcArea()
	{
		return (double)width * height;
	}
}
