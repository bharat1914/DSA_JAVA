package dsa;

public class Find_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,2,2,2,2,3,4,4};
		int t = 2;
		
		int l=0,r=arr.length-1,mid;
		int ind =-1;
		
		while(l<=r) {
			mid = (l+r)/2;
			
			if(arr[mid]==t) {
				ind=mid;
				l = mid+1;
			}
			else if(arr[mid]<t) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		System.out.println(ind);
	}

}
