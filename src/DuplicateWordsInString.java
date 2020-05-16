import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hare Ram Hare Ram Ram Ram Hare Hare Hare Krishna Hare Krishna Krishna Krishna Hare Hare";
		findDuplicateWords(str);


	}


	public static void findDuplicateWords(String inputString) {
		String[] str = inputString.split(" ");
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for(String strValue:str) {
			if(wordCount.containsKey(strValue.toUpperCase())) {
				wordCount.put(strValue.toUpperCase(), wordCount.get(strValue.toUpperCase())+1);
			}
			else {
				wordCount.put(strValue.toUpperCase(), 1);
			}
		}

		Set<String> wordsInString = wordCount.keySet();
		for(String key:wordsInString) {
			if(wordCount.get(key)>1)
				System.out.println(key + ": " + wordCount.get(key));
		}
	}
}
