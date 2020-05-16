import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a number to check if it is Palindrome or not: ");
		String str = Integer.toString(scan.nextInt());
		
		int lengthStr = str.length()/2;

		for (int i=0; i<lengthStr;i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				System.out.println(str + " is not palindrome number");
				break;
			}
			else if(i == lengthStr-1) {
				System.out.println(str + " is palindrome number");
			}
		}
	}
}
