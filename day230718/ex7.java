package day230718;

public class ex7
{
	public static void main(String[] args)
	{
		System.out.println("P\tQ\tAND\tOR\tXOR");
		printTable(true, true);
		printTable(true, false);
		printTable(false, true);
		printTable(false, false);
	}
	
	public static void printTable(boolean p, boolean q)
	{
		System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q) + "\t" + (p ^ q));
	}
}
