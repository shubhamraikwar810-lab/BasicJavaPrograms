package Day7;

import java.util.Arrays;

public class SortElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Sorting numbers
		int a[] = {1,4,23,0,43,10,11,45};
		System.out.println("Before sorting" +Arrays.toString(a)); // Before sorting in ascending order
		
		
	Arrays.sort(a);
	
	System.out.println("After Soritng"+ Arrays.toString(a));
		
		
		// Sorting Strings
	
String b[] = {"A", "C", "Y","X", "Z"};

System.out.println("Before sorting" +Arrays.toString(b)); // Before sorting in ascending order


Arrays.sort(b);

System.out.println("After Soritng"+ Arrays.toString(b));// After sorting
		
		
		
		
		
		
		

	}

}
