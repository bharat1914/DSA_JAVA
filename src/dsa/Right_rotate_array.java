package dsa;

public class Right_rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int k=2;
		
		for(int i=0; i<k;i++) {
			int l = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]= arr[j-1];
			}
			arr[0]=l;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
