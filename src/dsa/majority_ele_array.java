package dsa;

public class majority_ele_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar [] = {1,2,2,1,2,4,2};
		int majority=-1;
		
		for(int i=0;i<ar.length;i++) {
			int count =0;
			for(int j=0;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count ++;
				}
			}
			if(count>ar.length/2) {
				majority = ar[i];
				break;
			}
		}
		System.out.println(majority);
	}

}
