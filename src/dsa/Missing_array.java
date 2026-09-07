package dsa;

public class Missing_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,0,4};
		int n=arr.length;
		int sum =0;
		int miss = 0;
		for(int i=0;i<arr.length;i++) {
			
			sum += arr[i];
		}
//		System.out.println(sum);
		miss  = (n*(n+1))/2-sum;
		System.out.println(miss);
		
	}

}
