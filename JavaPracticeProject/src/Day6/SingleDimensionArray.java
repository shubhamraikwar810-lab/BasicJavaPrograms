package Day6;

import java.util.Arrays;

public class SingleDimensionArray {
	
	/*1. Declaration of array
	 * 2. Add values into array
	 * 3. Find size of an array
	 * 4. Read single value from an array
	 * 5. Read multiple values from an array */
	 
	

	public static void main(String[] args) {
		
		// Declaration of an array
		
	// Approach 1 = Declaration + Adding values to array
		
		int a []= new int [5];   //Declaration
		
		a[0]=5;   // Adding values to array
		a[1]=6;
		a[2]=8;
		a[3]=10;
		a[4]=15;
		
		
		System.out.println(a[3]);
		
		
		// Approach 2 = Adding values directly = declaration + assiging values
		
		
		int b[]= {10,20,30,40,50,60}; // each values are assigned in indexing form from 0 to n-1
		
		// 3. Find size of an array
		
		System.out.println(a.length);  //size (length) of array a is 5
		
		System.out.println(b.length);  // size of array b is 6
		
		
		// 4. Read single value of an array
		
		System.out.println(b[3]);  // returns 40
		
		// 5. Read multiple values from an array
		
		// Approach 1 == System.out.println(Arrays.toString(a));  // [5, 6, 8, 10, 15]
		
		
		// Approach 2 // In which we can operate each value one by one
		
	for (int i =0; i<=4; i++)
	{
		
		System.out.println(a[i]);
	}
			
		
	
	// Enhanced for loop //  For each loop
	
	for (int x: a)
	{
		System.out.println(x);
	}
	
	}

}
