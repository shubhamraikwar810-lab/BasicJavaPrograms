package Day3;

public class Operator
{

	public static void main(String[] args)
	
	{
	// Arithmetic Operators
		int a=10, b=20;
		System.out.println("Sum of a and b is :" +(a+b)); // + is for concatination and (a+b) is for summation
		System.out.println("Diff of a and b is :" +(a-b));
		System.out.println("Multiply of a and b is :" +(a*b));
		System.out.println("Division of a and b is :" +(a/b));
		System.out.println("Modular division of a and b is :" +(a%b));
	
	// Relational/ Comparison Operators > >= < <= != ==
		//It will return Boolean value == true or false
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b); // a not equal to b
		System.out.println(a==b);
		
		
	// Logical operator
		// It will return boolean value == true or false
		//Works between 2 boolean values
		
		boolean x = true;
		boolean y = false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!y);
		System.out.println(!x);
		
		
		boolean b1 = 10<20; // 10<20 is true so boolean will store true value and will be reflected on print
		System.out.println(b1); 
		
		boolean b2 = 20<10; // false
		System.out.println(b2);
		
		System.out.println(b1 && b2); // true and false == false
		System.out.println(b1 || b2); // true
		
		
		System.out.println((10<20)&&(20>10));  // true
		System.out.println((10<20)||(20>10));  // true

		System.out.println(!(10<20));  // false
		
		
		
		
		
	
	}

}
