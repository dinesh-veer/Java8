import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deletion("aaaabbc"));

	}

	private static int deletion(String string) {

		char[] arr= string.toCharArray();
		Set<Character> elements= new HashSet<>();
		for(char c:arr)
			elements.add(c);
		HashMap<Character,Integer> hashmap= new HashMap<>();
		
		for(char c:arr) {
			if(hashmap.containsKey(c))
				hashmap.put(c,(Integer)hashmap.get(c)+1);
			else
				hashmap.put(c,1);
		}
		
		
		Map<Character, Integer> map=hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
				collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldvalue,newValue)->newValue, LinkedHashMap::new ));
		
		System.out.println(map);
		Set<Character> charSet=map.keySet();
		ArrayList<Integer> arraylist = new ArrayList<>();
		for (Character character : charSet) {
			arraylist.add(map.get(character));
		}
		Collections.sort(arraylist);
		System.out.println(arraylist);
		System.out.println(hashmap);
		
		return 0;
	}

}
