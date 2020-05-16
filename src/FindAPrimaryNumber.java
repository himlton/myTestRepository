import java.util.Scanner;

public class FindAPrimaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("77 is primary number: " + findPrimeNumber(77));
//		System.out.println("77 is primary number: " + findPrimeNumber(23));
		System.out.println("77 is primary number: " + primeNumberRecursive(11, 11/2));
		System.out.println("77 is primary number: " + primeNumberRecursive(10, 10/2));
	}

	public static boolean findPrimeNumber(int number) {
		if(number<=1)
			return false;
		else {
			for(int i=2; i<number;i++) {
				if(number%i ==0) {
					return false;
				}
			}
			return true;
		}

	}

	public static boolean primeNumberRecursive(int number, int temp) {
		if (temp == 1)
			return true;
		else if(number%temp == 0)
			return false;
		else
		return primeNumberRecursive(number, temp-1);

	}

}
