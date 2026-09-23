package dsa;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {2,7,11,15};
		int t = 9;
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<a.length;i++) {
			int comp=t-a[i];
			if(map.containsKey(comp)) {
				System.out.println("indexes : "+map.get(comp)+" "+ i);
				return;
			}
			map.put(a[i], i);
		}
		System.out.println("no pair found");
	}

}
