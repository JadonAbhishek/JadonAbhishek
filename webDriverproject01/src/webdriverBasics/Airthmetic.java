package webdriverBasics;

public class Airthmetic {

	public int sum(int a , int b)  				//Method 01
	{
		int c;
		c=a+b;
		System.out.println("sum result is "+ c);
		return c;
	}
	public int sub(int a1 , int a2) 			//Method 02
	{	
		int result;
		result = a1-a2;
		System.out.println("sub result is" + result);
		return result;
	 }
	 public void multi (int x , int y)			//Method 03
	 {
		 int z;
		 z = x*y;
		 System.out.println("Final result is " + z);
	}
	public static void main(String[] args) 
	{	
		Airthmetic obj = new Airthmetic();
		int sumresult = obj.sum(12, 2);
		int subresult = obj.sub(12, 2);
		obj.multi(sumresult, subresult);
	}
}
