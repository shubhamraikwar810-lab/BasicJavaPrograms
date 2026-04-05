package Day7;

public class NumberofevenandODdNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,2,3,4,5,10};
		
		
	int even = 0;
		int odd =0;
		
		for (int value:a)
		{
			if (value%2==0)
			{
				even++; // for checking the number of even number
			}
			else
			{
				odd++; // for checking number of odd numbers
			}
		
		}
		
		System.out.println("Number of even numbers "+even);
		System.out.println("Number of odd numbers "+odd);

	}

}
