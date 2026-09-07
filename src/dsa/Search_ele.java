package dsa;

public class Search_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {10,20,18,20,30};
		int k=18 ;
		int index = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				index = i;
				break;
			}
		}
		System.out.println("found at index: "+index);
	}

}
