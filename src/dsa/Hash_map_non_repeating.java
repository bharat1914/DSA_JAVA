package dsa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hash_map_non_repeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "bharat";
		Map<Character,Integer> m = new HashMap<>();
		
		for(char c : a.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		int max = Collections.max(m.values());
		for(int i=0;i<a.length();i++) {
			if(m.get(a.charAt(i))==max) {
				System.out.println("index: "+a.charAt(i));
				return;
			}
		}
	}

}
