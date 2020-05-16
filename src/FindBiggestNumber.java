import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {1,5,90, 100, 107,107, 675, 897,0,564, 34, 675, 512,999,999};
		//findBiggestNumber(number);
		//findDuplicateNumbers(number);
		reverseArray(number);

	}

	public static void findBiggestNumber(int[] number) {
		int biggestNumber = Integer.MIN_VALUE;
		int smallestNumber = Integer.MAX_VALUE;
		for (int num:number) {
			if (num> biggestNumber)
				biggestNumber = num;
			if (num<smallestNumber)
				smallestNumber = num;
		}

		System.out.println("Biggest number is: " + biggestNumber);
		System.out.println("Smallet number is: " + smallestNumber);
	}

	public static void findDuplicateNumbers(int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();
		java.util.List<Integer> list = new ArrayList<Integer>();
		for(int i:numbers) {
			if(set.contains(i))
				list.add(i);
			else
				set.add(i);
				
		}

		System.out.println("Duplicate values are: ");
		for(int j:list)
			System.out.println(j);
	}
	
	public static void reverseArray(int[] number) {
		for(int i = number.length-1;i>=0;i--) {
			System.out.println(number[i]);
		}
		
	}
}