package assignments1.week1day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 13;

		int flag = 0;

		for (int i = 2; i < input; i++) {
			if (input % i == 0)
			// (13 % 2 = 1) condition fail
			// 12%2 = 0 condition pass
			{
				System.out.println("Not a prime number");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		// flag = 0
		{
			System.out.println("Prime Number");
		}
	}
}
