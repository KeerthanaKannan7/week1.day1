package assignments1.week1day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int i = 6;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.print(firstNum);
		System.out.print(" " + secNum);
		// 0

		for (i = 1; i <= 6; i++) {
			sum = firstNum + secNum;
			// sum = 0+1 >> sum = 1
			firstNum = secNum;
			// firstNum = 1
			secNum = sum;
			// sum = 1
			System.out.print(" " + sum);
			// 1

		}

	}
}
