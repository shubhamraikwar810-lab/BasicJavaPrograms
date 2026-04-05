package Day7;

import java.util.Scanner;

public class SearchingAnElementLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a []= {1,2,3,4,5,6};
		
		Scanner sc = new Scanner (System.in); // Scanner class for input of number
		System.out.println("Enter search number");
		
		int search_num= sc.nextInt(); // for input of number from keyboard
		
		boolean status = false;
		for(int i=0; i<=5; i++)
		{
			if (search_num==a[i])
			{
				System.out.println("Element found");
				status=true;
			    break;	
			}
			
		}
		if (status==false)
         {
			System.out.println("Element Not Found");
         }
	}

}
