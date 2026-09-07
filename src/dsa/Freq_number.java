package dsa;

public class Freq_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,1,1};
		boolean v[] = new boolean[arr.length];
		
		
		for(int i=0;i<arr.length;i++) {
			if(v[i]) {
				continue;
			}
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					count++;
					v[j]=true;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}

}
