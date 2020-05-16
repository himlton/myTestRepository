
public class FindFactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Factorial value of 5 is: " + factotialNumber(5));
//		System.out.println("Factorial value of 3 is: " + factotialNumber(3));
//		System.out.println("Factorial value of 7 is: " + factotialNumber(7));
//		System.out.println("Factorial value of 0 is: " + factotialNumber(0));
		System.out.println("Factorial value of 5 is: " + factorialRecursive(7));
	}
	
//	public static int factotialNumber(int number) {
//		int fact =1;
//		s
//		if (number <=0)
//			return 0;
//		
//		while(number > 0) {s
//			fact = fact * number;
//			number--;
//		}
//		
//		return fact;
//	}
	
	public static int factorialRecursive(int number) {
		if(number == 1)
			return 1;
		else
			return (number * factorialRecursive(number-1));
	}

}
