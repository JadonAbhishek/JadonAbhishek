package webdriverBasics;

public class Constructor {

	public Constructor()
	{	
		this(5,15,25);
		System.out.println("default constructor");
	}
	
	public Constructor(int a)
	{
		this();
		System.out.println("one parameterised constructor ");
	}
	
	public Constructor(int c , int b) 
	{
		this(35);
		System.out.println("two parameterised constructor");
	}
	
	public Constructor(int x , int y , int z) 
	{
		this(45,55);
		System.out.println("three parameterised constructor");
	}
	public Constructor(int x , int y , int z ,int d) 
	{
		this(65,75,85,95);
		System.out.println("four parameterised constructor");
	}
	public static void main(String[] args) {
		int x=25,y=35,z=45,d=65;
		Constructor A = new Constructor();
	/*	Constructor B = new Constructor();
		Constructor C = new Constructor(15);
		Constructor D = new Constructor(25,35);
		Constructor E = new Constructor(15,35,55,75);
		*/

	}

}
