package Day4;

public class Assignment1day4 
{

	public static void main(String[] args) 
	
	{ //largest of 2 numbers (using if else ,, ternary operators
		
		int a =3, b=10;
		if (a>b)
		{
			System.out.println("a is larger than b");
		}
		else
		{
			System.out.println("b is larger");
		}
	
		// Using ternary operator
		
		int c=30, d=50;
		int num = (c>d)?c:d;
		System.out.println(num);
	}

}
