package day230731;

public class Person implements Comparable<Person>
{
	private int height;
	
	public Person(int height)
	{
		this.height = height;
	}
	
	@Override
	public int compareTo(Person p)
	{
		return (int)(this.height - p.height);
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public Person getMaximum(Person[] arr)
	{
		Person p = new Person(0);
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].compareTo(p) >= 0)
			{
				p = arr[i];
			}
		}
		return p;
	}
	
	@Override
	public String toString()
	{
		return "height : " + this.height;
	}
}
