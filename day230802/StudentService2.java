package day230802;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StudentService2
{
	Scanner sc = new Scanner(System.in);
	HashMap<Student, String> students = new HashMap<>();

	public void add()
	{
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("전화번호 : ");
		String tel = sc.nextLine();
		
		System.out.print("학과 : ");
		String dept = sc.nextLine();

		Student newStudent = new Student(name, tel);
		
		if(students.containsKey(newStudent))
			System.out.println("이미 존재하는 학생입니다.");
		else if(hasTel(tel))
			System.out.println("이미 사용중인 전화번호입니다.");
		else
		{
			students.put(newStudent, dept);
			System.out.println(newStudent + "-" + dept + " 추가 완료.");
		}
	}

	public boolean hasTel(String tel)
	{
		Set<Entry<Student, String>> studentSet = students.entrySet();
		for(Entry<Student, String> student : studentSet)
			if(student.getKey().getTel().equals(tel))
				return true;
		return false;
	}

	public void printStudent()
	{
		System.out.print("조회할 이름 : ");
		String name = sc.nextLine();
		boolean check = false;

		Set<Entry<Student, String>> studentSet = students.entrySet();
		for(Entry<Student, String> student : studentSet)
			if(student.getKey().getName().equals(name))
			{
				check = true;
				System.out.println(student.getKey() + "-" + student.getValue());
			}
		if(!check)
			System.out.println("해당 학생이 존재하지 않습니다.");
	}

	public void delete()
	{
		System.out.print("삭제할 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("전화번호 : ");
		String tel = sc.nextLine();
		
		boolean check = false;

		Set<Entry<Student, String>> studentSet = students.entrySet();
		for(Entry<Student, String> student : studentSet)
			if(student.getKey().equals(new Student(name, tel)))
			{
				check = true;
				System.out.println(student.getKey() + "-" + student.getValue() + " 삭제 완료.");
				students.remove(student.getKey());
				break;
			}
		if(!check)
			System.out.println("해당 학생이 존재하지 않습니다.");
	}

	public void printStudents()
	{
		if(students.size() == 0)
			System.out.println("학생이 존재하지 않습니다.");
		else
		{
			Set<Entry<Student, String>> studentSet = students.entrySet();
			for(Entry<Student, String> student : studentSet)
				System.out.println(student.getKey() + "-" + student.getValue());
		}
	}
}
