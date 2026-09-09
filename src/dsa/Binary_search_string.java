package dsa;

public class Binary_search_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"abcd","apple","ball","cat"};
		String t = "ball";
		int l=0,r=a.length-1,mid;
		
		while(l<=r) {
			mid = (l+r)/2;
			
			if(a[mid]==t) {
				System.out.println("found ele at "+mid);
				return;
			}
			else if(a[mid].charAt(0)>t.charAt(0)) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		System.out.println("ele not found");
	}

}
