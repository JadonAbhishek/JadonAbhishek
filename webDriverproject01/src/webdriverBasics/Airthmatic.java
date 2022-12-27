package webdriverBasics;

public class Airthmatic {

	public int sum(int a ,int b) {
		int c;
		c= a+b;
		System.out.println("sum result 10+2 = "+ c);
		return c;				}
	public int sum1(int d, int e)	{
		int f;
		f = d+e;
		System.out.println("sum1result (10+2)+2 = " + f);	
		return f;					}
	public  int sub(int x , int y )	{
		int z;
		z= x-y;
		System.out.println("sub result (10+2)+2)-2)= " + z);	
		return z;					}
	public int multi(int x1, int y1)	{
		int z2;
		z2 = x1*y1;
		System.out.println("multiply result is (10+2)+2)-2)*2 = "+ z2);    
		return z2;						}
	public void div(int x2 , int y2)   	{
		int z3;
		z3 = x2/y2;
		System.out.println("Final result (10+2)+2)-2)*2)/2) = "+ z3);	}
	public static void main(String[] args) {
		
		Airthmatic object = new Airthmatic();
		int sumresult= object.sum(10, 2);
		int sum1result = object.sum1(sumresult, 2);
		int subresult = object.sub(sum1result, 2);
		int multiresult = object.multi(subresult, 2);
		object.div(multiresult, 2);
	}
}
