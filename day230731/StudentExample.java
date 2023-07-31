package day230731;

import java.util.HashSet;

public class StudentExample
{
	public static void main(String[] args)
	{
		HashSet<Student2> hashSet = new HashSet<Student2>();
		
		hashSet.add(new Student2("1"));
		hashSet.add(new Student2("1"));
		hashSet.add(new Student2("2"));
		
		System.out.println("저장된 Student 수 : " + hashSet.size());
	}
}
