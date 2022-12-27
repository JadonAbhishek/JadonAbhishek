package webdriverBasics;

public class Student {

	int a;

	public void display1()
	{
	System.out.println("Created first method");
	}
	int b;
	public void display2()
	{
	System.out.println("second method created");
	}
	public static void main(String[] args) {
	Student Abhishek = new Student();
	Abhishek.display1();
	Abhishek.display2();
	Abhishek.a = 156591;
	System.out.println(Abhishek.a);
	Abhishek.b = 023260;
	System.out.println(Abhishek.b);
	}
	}


