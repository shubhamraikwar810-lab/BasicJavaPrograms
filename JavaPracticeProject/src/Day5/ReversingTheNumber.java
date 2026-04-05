package Day5;

public class ReversingTheNumber
{

	public static void main(String[] args) 
	{
		// Reverse a number (% / operators)
		
		int n = 1234;
		int rev = 0;

		while(n > 0) {
		    int digit = n % 10; //1.(4)  //2.(3) // 3.(2) // 4.(1)
		    rev = rev * 10 + digit; //1.(4)  //2.(3) //3.(2) //4.(1)
		    n = n / 10;//1.(123) //2.(12) // 3.(1) //4.(0.1)
		}
		
		System.out.println(rev); //4321
		
		
		
		
		
		
		

	}

}
