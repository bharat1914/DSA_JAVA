package dsa;

public class Insert_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,4,5};
		int t=2;
		
		int l=0;
		int r = a.length-1;
		int mid;
		
		while(l<=r) {
			mid=(l+r)/2;
			if(a[mid]<t) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		System.out.println(l);
	}

}
