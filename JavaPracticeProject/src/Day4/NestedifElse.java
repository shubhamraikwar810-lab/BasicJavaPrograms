package Day4;

public class NestedifElse 
{

	public static void main(String[] args) 
	
	{
		/*if (true)
		{
			System.out.println(1);  // first condition is true so output will be 1
		}
		else
		{
			System.out.println(2);
		}*/

	
		if (1==1) // COndition pass
		{
			if (1==2) // condition fail, now it will go to else
			{
				System.out.println("Value fail");
			}
			else
			{
				System.out.println("Passed");
			}
		}
		else // if condition is passed so it will never come here, if the first if condition is failed than only it will come to else condition
			
		{
			if(3==3)
			{
				System.out.println("Working");
			}
		}
	}
}

