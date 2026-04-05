package Day4;

public class LargestAmong3Numbers 
{

	public static void main(String[] args) 
	{
		
		int a=10, b=20, c=30;  /// if a=20, b=20, c=10
		
		if (a>b && a>c ) // then this condition will fail as a=b
		{
			System.out.println("a is largest");
		}
		else if (b>a && b>c) // condition fail for b>a as b=a
		{
			System.out.println("b is largest");
			
		}
		else 
				{
			System.out.println("c is largest"); // so it will direct go to else statement and c will be printed
			
				}
	}

}
