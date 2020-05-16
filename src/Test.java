import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		int arr[] = {1,3,6,1,3,6,9,10,5,10,9,10};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++) {
			hm.put(arr[i], i);
		}
		System.out.println(hm.keySet());
			}
}