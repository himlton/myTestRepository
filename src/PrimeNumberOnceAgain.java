
public class PrimeNumberOnceAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = findPrimeNumber(15);
		if(flag)
			System.out.println("number is prime number");
		else
			System.out.println("number is not prime number");

	}

	public static boolean findPrimeNumber(int number) {

		if(number == 1 || number == 2) {
			return true;
		}
		else {

			for (int i=2;i<number;i++) {
				if(number%i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
