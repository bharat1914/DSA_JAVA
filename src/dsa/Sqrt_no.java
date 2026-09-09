package dsa;

public class Sqrt_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t= 25;
		int l=0;
		int r=t;
		int c = -1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			if(mid*mid==t) {
				c=mid;
				break;
			}
			else if(mid*mid<t) {
				l=mid+1;
			}
			
			else {
				r=mid-1;  
			}
		}
		System.out.println(c);
	}

}
