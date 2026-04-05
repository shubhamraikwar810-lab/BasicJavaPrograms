package Day5;

public class WhileVsDoWhile 
{

	public static void main(String[] args) 
	{
		int i=10;
		while(i<=5) //Condition is false so code will execute but give no output
		
		{
		System.out.println(i);
		i++;
		}

		//do while case same condition
		
		int a=10;
		do
		{
		System.out.println(a);// In this case it will print the value of 10 and then check for condition, and if condition is false it will not go inside while.
		a++;
		}while (a<=5);
		
		
		
	}
	
	

}
