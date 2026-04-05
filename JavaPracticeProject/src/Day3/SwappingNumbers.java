package Day3;

public class SwappingNumbers 
{   

	public static void main(String[] args) 
	
	{
		//My try of assignment
		int a =20, b=40;
		b=b-a;
		System.out.println(b);
		a=2*b;
		System.out.println(a);
		
		
	//Logic 1 (third temporary variable)
		
		int c=30, d=50;
		int t = c;
		c=d;
		d=t;
		System.out.println("After swapp value of c and d is"+c +" " +d); // c=50, d=30
		
		//Logic 2 (Using + and -)
		
		int e = 30, f=50;
		e=e+f;  // 30+50 = 80 =e
		f=e-f; // 80-50 = 30=f
		e=e-f;  // 80-30 = e
		
		System.out.println("Value of e and f are " +e +"&" +f);
		
		//Logic 3 (Usage of * and / operators)
		// In this value of variable should be not equal to 0
		
		int g = 40, h=80;
		g=2*g;
		h=h/2;
		System.out.println("Value of g and h are " + g +" &"+ h);
			
		

	}

}
