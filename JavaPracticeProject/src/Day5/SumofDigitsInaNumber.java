package Day5;

public class SumofDigitsInaNumber 
{

	public static void main(String[] args) 
	
	{
		int a=12345;
		int sum=0;
		while(a>0) 
		{
			int digit = a%10; //1234 // 123
			sum+=digit; //1234 //
			a=a/10; //1234
			
		}
		System.out.println("sum of number is " +sum);//1234
		

	}

}
