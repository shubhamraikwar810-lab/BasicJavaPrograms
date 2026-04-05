package Day5;

public class Whileloop 

{

	public static void main(String[] args) 
	
	//Example  1 -- Print 1 to 10 number by using looping statement
	{
		
		int i=1;    // Initialization
		while(i<=10)   //Condition
		{
			System.out.println(i);
			i++;   // Incrementation
		}
		
		System.out.println("*****************************************");

	//Ex-2 Print Hello message 10 times
		
		int a=1;
		while(a<=10)
		{
		System.out.println("Hello");
		a++;
		
		}
	
		//Ex-3 : Print even number upto 10 
		//method 1
		
		int c=2;
		while(c<=10)
		{
			System.out.println(c);
			c=c+2;
		}
		
		System.out.println("##################################3");
		//Method=2
		
		int d=1;
		while(d<=10)
		{
			if(d%2==0)
			{
				System.out.println(d);
			}
			d++;
		}
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		// Ex-4 : Print odd number between 1 to 10
		
		int e=1;
		while(e<=10)
		{
			if(e%2!=0)
			{
				System.out.println(e);
			}
			e++;
		}
	
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	// Ex-5 Print 1 to 10 in descending order
		
		int f=10;
		while(f>0)
		{
			
			System.out.println(f);
			f--;
			
			
		}
	
	
	
	
	}
}
