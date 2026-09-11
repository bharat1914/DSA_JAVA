package dsa;

public class Pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,6};
		int t = 6;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==t) {
					System.out.println(a[i]+"+"+a[j]+"="+t);
					break;
				}
			}
		}
	}

}
