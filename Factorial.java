package assignments1.week1day1;

public class Factorial 
{

	public static void main(String[] args) 
	{

		int i = 5;
		int fact = 1;

		for (i = 1; i <= 5; i++) 
		{
			fact = fact * i;
			// fact = 1 * 1; fact 1
			// fact = 1*2; fact 2
			// fact = 2*3; fact 6
			System.out.println(fact);
		}

	}
}