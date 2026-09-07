package dsa;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int k=2;
		for(int i=0;i<k;i++) {
			int f = arr[0];
			
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=f;
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
