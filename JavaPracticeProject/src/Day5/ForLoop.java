package Day5;

public class ForLoop 

{

	public static void main(String[] args) 
	
	{
		// Ex-1 print 1 to 10 numbers
		
		for(int i=1; i<=10; i++)
		{
		System.out.println(i);	
		}

		
		//Print even numbers upto 10 - Method 1
		
		for (int a=1; a<=10; a++)
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		}
		
		//Method2
		for(int b=2;b<=10;b+=2)
		{
			System.out.println(b);
		}
	
	// Ex-3 descenfing order
		for(int c=10;c>1;c--)
		{
			System.out.println(c);
		}
	
	}

}
