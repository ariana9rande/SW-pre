package day230731;

public class Student2
{
	public String studentNum;
	
	public Student2(String studentNum)
	{
		this.studentNum = studentNum;
	}

	public String getStudentNum()
	{
		return studentNum;
	}
	
	public int hashCode()
	{
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student2 target)
			if(studentNum.equals(target.getStudentNum()))
				return true;
		return false;
	}
}
