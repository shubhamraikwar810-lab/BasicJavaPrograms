package Day7;

import java.util.Scanner;  /// Added for Scanner class for input through keyboard


public class TakingInputfromKyeboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in); // It will throw error until the package of Scanner class is imported 
		// Package of Scanner class is Import java.util.Scanner
		
		System.out.println("Enter a value");
		int a =sc.nextInt(); /// Only for Integer
		System.out.println("Given value of a is "+ a);
		
		
		System.out.println("Enter the value of b");
		
		double b = sc.nextDouble(); // for decimal value
		
		System.out.println("Given value of b is "+ b);
		
		
		// String as an Input
		
		System.out.println("Enter the value of Name");
		
		String name= sc.next();
		
		System.out.println("Given value of b is "+ name);
		
		
		
		

	}

}
