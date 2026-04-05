package Day7;

public class FindHowManyTimesNumberIsRepeatedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {10,20,10,20,40,30};
		
		int num = 10;
		int count =0;
		
		for(int value:a)
		{
			if (value==num)
			{
				count++;
				
			}
		}
System.out.println("Number of duplicates is " +count);
	}

}
