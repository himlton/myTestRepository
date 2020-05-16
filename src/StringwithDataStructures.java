import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StringwithDataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
	//	findDuplicateChar(str);
	//	anagramString("army", "mary");
	 //stringRecursively("Hello World");
	//	System.out.println(reverseStr);
		//StringWordRecursive("Hello World");
		countVowel("Hello World");
	}


	public static void findDuplicateChar(String str) {
		String[] strString = str.split(" ");
		ArrayList<Character> list = new ArrayList<Character>();
		Set<Character> set = new HashSet<Character>();
		for(int i=0; i<strString.length;i++) {
			char[] charArray = strString[i].toCharArray();
			for(char c:charArray) {
				if(set.contains(c)) {
					if(list.contains(c))
						continue;
					else 
						list.add(c);
				}
				else
					set.add(c);
			}
		}

		for (int j =0 ; j<list.size();j++) {
			System.out.println(list.get(j));
		}
	}

	
	public static boolean anagramString(String str1, String str2) {
	
		
		if(str1.length() == str2.length()) {
			char[] arr = str1.toCharArray();
			 
			for(char c:arr) {
				int index = str2.indexOf(c);
				if(index != -1) {
					str2 = str2.substring(0, index) + str2.substring(index+1);
				}
				else
					return false;
			}
			return str2.isEmpty();
		}
		else
			return false;
	
	}
	
	public static void stringRecursively(String str) {
		if(str.length()<2) System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			stringRecursively(str.substring(0, str.length()-1));
		}
	}

	public static void StringWordRecursive(String str) {
		
		String[] strArray = str.split(" ");
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i] + " ");
		}
	}
	
	public static void countVowel(String str) {
		char[] charArray = str.toCharArray();
		int count =0;
		for(char c:charArray) {
			if(c == 'a' || c == 'e' || c=='i'||c=='o'||c=='u')
				count++;
		}
		System.out.println(count);
	}
	
}
