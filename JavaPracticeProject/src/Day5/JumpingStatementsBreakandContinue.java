package Day5;

public class JumpingStatementsBreakandContinue 
{

	public static void main(String[] args) 
	
	{
		for(int i=1;i<+10;i++) // 1 to 10 number
		{
			if(i==5) //Till 4 it will run and at 5 it will stop
			{
				break;
			}
		
			System.out.println(i);
		}
			
// Continue
		
		for(int a=1;a<+10;a++) // 1 to 10 number
		{
			if(a==5) 
			{
				continue; // It will run till 4 as 5 comes it will skip this and goes to 6 and print till 10
				
			}
		
			System.out.println(a);
			
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			
			//Need to skip 3,5,7 === Method 1
			
			for(int b=1;b<=10;b++)
			{
				if(b==3)
				{
					continue;
					
				}
				else if(b==5)
				{
					continue;
					
				}
				else if(b==7)
				{
					continue;
				}
				System.out.println(b);
			}
			System.out.println("@#@##$#$#$$##$#$#$#$$##$#$#$#$#$#$#$#$#$");
			
			
			//Need to skip 3,5,7 === Method 2
			
			for(int c=1;c<+10;c++)
			{
				if(c==3||c==5||c==7)
				{
					continue;
				}
				System.out.println(c);
			}
			
			
			
			
		}
		
		
	}

}
