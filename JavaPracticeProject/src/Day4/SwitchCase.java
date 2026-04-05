package Day4;

public class SwitchCase 
{

	public static void main(String[] args) 
	
	{
		int num = 10;
		switch (num)
		{
		case 1: System.out.println("Sunday");
		break; // Break command is used to break the value until it gets passed, if passed it will not move to next cases, iif failed it will move to further cases in the sequence
		case 2: System.out.println("Monday");
        break;//if break is not used than it will go to next case and run that
		case 3: System.out.println("tuesday");
        break;
		case 4: System.out.println("Wednesday");
        break;
		case 5: System.out.println("Thursday");
        break;
		case 6: System.out.println("Friday");
        break;
		case 7: System.out.println("Saturday");
        break;
		default: System.out.println("Invalid Week Number"); // it is the last option where all other cases are failed
	
		}

	}

}
