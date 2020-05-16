import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,7,6,5,7,8,9,14,3,5,3,7,9};
		
	 Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
	 Map<Integer, Integer> ht = new Hashtable<Integer, Integer>();
	
	 for (int j:arr) {
		 hm.put(j, j);
	 }
	 	 
		Set<Integer> set = hm.keySet();
		for(int k:set)
			System.out.println(k);
		 
	}

}
