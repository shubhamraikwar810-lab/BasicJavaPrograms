package Day3;

public class IncrementOperator 

{

	public static void main(String[] args) 
	
	
	{
	// Increment Operator
		
		int a = 10;
		
		
		a++; //a=a+1
		System.out.println(a);
		
		
		int b=20;
		int res = b++;
		System.out.println(res); // Post increment - output 20
		
	int test = ++b;
	System.out.println(test); // Pre Increment - output 22 (as in above case value is changed to 21 and it is incoremented to 22
	
	
	int c=20;
	int rest = c--;
	System.out.println(res); // Post decrement - output 20
	
	int d=20;
	int resting = --d;
	System.out.println(resting); // Pre decrement - output 19
	
	
	
	}

}
