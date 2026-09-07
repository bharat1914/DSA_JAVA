package dsa;

public class Union_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,3,4};
		int ar[] = {2,4,4};
		for(int i=0;i<arr.length;i++) {
			boolean found = false;
			for(int j=0;j<ar.length;j++) {
				if(arr[i]==ar[j]) {
					
					found = true;
					break;
				}
			}
			if (found) {
				boolean printed = false;
				for(int k=0;k<i;k++) {
					if(arr[i]==arr[k]) {
						printed = true;
						break;
					}
				}
				if(!printed) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
