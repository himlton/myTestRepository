
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert a String: ");
		String inputStr = scan.nextLine();
		//reverseString(inputStr);
		//reverseStringUsingBuffer(inputStr);
		reverseStringRecursively(inputStr);
		

	}
	
	public static void reverseString(String inputStr) {
		for(int i=inputStr.length()-1;i>=0;i--) {
			System.out.print(inputStr.charAt(i));
		}
	}

	public static void reverseStringUsingBuffer(String inputStr) {
		String sb =new StringBuffer(inputStr).reverse().toString();
	//	sb = sb.reverse();
		System.out.println(sb);		
	}
	
	public static String reverseStringRecursively(String inputStr) {
		if(inputStr.length() < 2) 
			return inputStr;
		
		return reverseStringRecursively(inputStr.substring(1)+ inputStr.charAt(0));
		
		
	}
	
}
