
public class PalindromeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(1234);
	}
	
	public static void checkNumber(int number) {
		int temp = number;
		int rem = 0;
		int sum = 0;
			while(number >0) {
				rem = number%10;
				sum = (sum*10)+rem;
				number = number/10;
				
			}
		if(temp == sum)
			System.out.println("Number is Palindrome number");
		else
			System.out.println("Number is not Palindrome number");
	}

}
