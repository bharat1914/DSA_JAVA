package dsa;

import java.util.Arrays;
import java.util.List;

public class Search_using_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = Arrays.asList("pen","paper","book","pencil");
		String t = "book";
		
		for(int i=0;i<li.size();i++) {
			if(li.get(i).equals(t)) {
				System.out.println("found");
				return;
			}
		}
		System.out.println("not found");
	}

}
