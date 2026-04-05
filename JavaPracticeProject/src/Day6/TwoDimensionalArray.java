package Day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*1. Declaration of array
		 * 2. Add values into array
		 * 3. Find size of an array
		 * 4. Read single value from an array
		 * 5. Read multiple values from an array */
		
		
		// Declaration
		
		//approach 1
		
		int a [][] = new int [3][2];
		
		a[0][0]=100;
		a[1][0]=300;
		a[2][0]=500;
		
		a[0][1]=200;
		a[1][1]=400;
		a[2][1]=600;
		
				// approach 2
		
		int b [][] = {{100,200},{300,400}, {500,600}}; // each row value with column data in single curly bracket
		
		
		// 3. Find size of an array
		
		System.out.println(b.length); /// will give number of row
		// Now to find number of column
		
		System.out.println(b[0].length); // will give number of column in first row
		
		
		//4. Read single value from an array 
		
		System.out.println(b[1][1]);
	
		// 5.  5. Read multiple values from an array (from 2D array)
		
		
		for (int i=0;i<=2;i++) // For rows
		{
			for(int j=0; j<=1; j++) // For column
			{
				System.out.println(b[i][j]);
			}
		}
		
		
		// Using enhanced for loop
		
		for(int arr[]:b)
		{
		for (int x:arr)
		{
			System.out.println(x);
		}
		}

		
		// Sum of values of array
		
		int d[] = {1,2,3,4,5};
		int e = d[0]+d[1]+d[2]+d[3]+d[4];
		System.out.println(e);
		
		
		// Print even and odd numbers from array
		
		int f[] = {1,2,3,4,5,6};
		
		for (int k=0;k<=6; k++)
		{
			if (k%2==0)
				System.out.println(k); // Print even number
			}
			
			
					
		}
		
		
	}

}
