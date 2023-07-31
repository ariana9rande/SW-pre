package day230731;

public class PesonExample
{
	public static void main(String[] args)
	{
		Person[] arr = new Person[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = new Person(100 + i * 10);
		}
		
		for(Person p : arr)
			System.out.println(p);
	}
}
