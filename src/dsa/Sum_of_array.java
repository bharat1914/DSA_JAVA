package dsa;

public class Sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,11,12,13,14};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
	}

}
