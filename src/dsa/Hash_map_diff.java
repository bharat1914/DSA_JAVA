package dsa;

import java.util.HashMap;
import java.util.Map;

public class Hash_map_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,5,4};
		int t= 2;
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length;i++) {
			int comp = a[i]-t;
				if(map.containsKey(comp))
				{
					System.out.println("index: "+map.get(comp)+" "+i);
					System.out.println("values: "+comp+" "+a[i]);
					return;
				}
				
			else {
				int sum = a[i]+t;
				if(map.containsKey(sum)) {
					System.out.println("index : "+map.get(sum)+" "+i);
					System.out.println("values: "+comp+" "+a[i]);
					return;
				}
				
			}
			map.put(a[i], i);
		}
		System.out.println("no pair found");
	}

}
