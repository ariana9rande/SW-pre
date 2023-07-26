package day230726;

public class ChildExample
{
	public static void main(String[] args)
	{
//		Child child = new Child();
//		
//		Parent parent = child;
//		
//		parent.method1();
//		parent.method2();

		Parent parent = new Child();

		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		Child child = (Child)parent;

		child.field2 = "data2";
		child.method3();
	}
}