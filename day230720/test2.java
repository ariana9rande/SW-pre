package day230720;

public class test2
{
	public static void main(String[] args)
	{
		if(args.length != 2)
		{
			System.out.println("2개의 argument 필요");
		}
		
		String str1 = args[0];
		String str2 = args[1];
		
		System.out.println("이름 : " + str1 + "\n전화번호 : " + str2);
	}
}
