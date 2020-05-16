
public class FindArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 is a armstrong number: " + calculateArmStrongNumber(1));
		System.out.println("2 is a armstrong number: " + calculateArmStrongNumber(2));
		System.out.println("3 is a armstrong number: " + calculateArmStrongNumber(3));
		System.out.println("4 is a armstrong number: " + calculateArmStrongNumber(4));
		System.out.println("5 is a armstrong number: " + calculateArmStrongNumber(5));
		System.out.println("6 is a armstrong number: " + calculateArmStrongNumber(6));
		System.out.println("153 is a armstrong number: " + calculateArmStrongNumber(153));
		System.out.println("370 is a armstrong number: " + calculateArmStrongNumber(370));
		System.out.println("371 is a armstrong number: " + calculateArmStrongNumber(371));
		System.out.println("407 is a armstrong number: " + calculateArmStrongNumber(407));
		System.out.println("1634 is a armstrong number: " + calculateArmStrongNumber(1634));
		System.out.println("8208 is a armstrong number: " + calculateArmStrongNumber(8208));
		System.out.println("9474 is a armstrong number: " + calculateArmStrongNumber(9474));
		System.out.println("54748 is a armstrong number: " + calculateArmStrongNumber(54748));


	}

	public static boolean calculateArmStrongNumber(int number) {
		int sum = 0;
		//		String str = Integer.toString(number);
		//		
		//		for (int i = 0; i<str.length();i++) {
		//			
		//			char charValue = str.charAt(i);
		//			int intValue = Character.getNumericValue(charValue);
		//			sum += intValue*intValue*intValue;
		//		}
		//		if(number == sum) 
		//			return true;
		//		else 
		//			return false;

		int r;
		int t = number;


		while(number>0) {
			r = number%10;
			sum += r*r*r;
			number = number/10;
		}

		if(t == sum)
			return true;
		else
			return false;


	}

}
