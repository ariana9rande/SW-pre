package day230728;

import java.util.Arrays;

public class StudentExample
{
	public static void main(String[] args)
	{
		Student a = new Student("홍재호", 27);
		Student b = new Student("김주홍", 25);
		Student c = new Student("김재훈", 26);

		Student[] students = { a, b, c };
		
		Arrays.sort(students);
		
		System.out.println("이름 기준 오름차순 정렬");
		for(Student s : students)
			System.out.println(s);
	}
}
