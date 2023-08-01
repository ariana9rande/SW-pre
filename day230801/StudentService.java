package day230801;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentService
{
	Scanner sc = new Scanner(System.in);
	TreeMap<String, String> students = new TreeMap<>();

	public void add()
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("전화번호 : ");
		String tel = sc.nextLine();

		if(students.containsKey(name))
			System.out.println("이미 존재하는 학생입니다.");
		else
		{
			students.put(name, tel);
			System.out.println("(" + name + ", " + tel + ") 추가 완료.");
		}
	}

//	public Student search(String name, String tel)
//	{
//		Set<Entry<String, String>> studentSet = students.entrySet();
//		for(Entry<String, String> student : studentSet)
//			if(student.getKey().equals(name) && student.getValue().equals(tel))
//				return (Student)student;
//		return null;
//	}

	public void printStudent()
	{
		System.out.print("조회할 이름 : ");
		String name = sc.nextLine();

		Set<Entry<String, String>> studentSet = students.entrySet();
		for(Entry<String, String> student : studentSet)
			if(student.getKey().equals(name))
				System.out.println("이름 : " + student.getKey() + " 전화번호 : " + student.getValue());
			else
				System.out.println("해당 이름의 학생이 존재하지 않습니다.");
	}

	public void delete()
	{
		System.out.print("삭제할 이름 : ");
		String name = sc.nextLine();

		Set<Entry<String, String>> studentSet = students.entrySet();
		for(Entry<String, String> student : studentSet)
			if(student.getKey().equals(name))
				System.out.println("(" + name + ", " + students.remove(name) + ") 삭제 완료.");
			else
				System.out.println("해당 이름의 학생이 존재하지 않습니다.");
	}

	public void printStudents()
	{
		if(students.size() == 0)
			System.out.println("학생이 존재하지 않습니다.");
		else
		{
			Set<Entry<String, String>> studentSet = students.entrySet();
			for(Entry<String, String> student : studentSet)
				System.out.println("이름 : " + student.getKey() + " 전화번호 : " + student.getValue());
		}
	}
}
