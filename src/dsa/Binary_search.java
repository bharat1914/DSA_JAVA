package dsa;
import java.util.Arrays;
public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a[] = {"dog","ball","cat","apple","abcd"};
//		int a[] = {10,20,30,40,50,60};
		String a[] = {"abcd","apple","ball","cat","dog"};
		//Arrays.sort(a);
		String t = "apple";
		int l = 0,r=a.length-1,mid;
		
		while(l<=r) {
			
			mid=(l+r)/2;
			int comp = a[mid].compareTo(t);
			if(comp==0) {
				System.out.println("found at "+mid);
				return;
			}
			
			else if(comp>0) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		System.out.println("no ele found");
	}

}
