package dsa;

public class Update_aarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,12,13,14,15};
		int pos=3;
		int n=10;
		for(int i=0;i<arr.length;i++) {
			if(i==pos) {
				arr[i]=n;
			}
			System.out.print(arr[i]+" ");
		}
	}

}
