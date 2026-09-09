package dsa;

public class Find_first_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,2,3,4,5};
		int t=2;
		
		int l=0, r=a.length-1, mid, ind=-1,ind2 = -1;
		
		while(l<=r) {
			mid = (l+r)/2;
			
			if(a[mid]==t) {
				ind = mid;
			}
		}
	}

}
