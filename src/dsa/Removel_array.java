package dsa;

public class Removel_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar [] = {12,13,14,15,16};
		int pos = 3;
		
		int arn[] = new int[ar.length-1];
		
		for(int i=0;i<pos;i++) {
			arn[i]=ar[i];
		}
		for(int i=pos;i<arn.length;i++) {
			arn[i]=ar[i+1];
		}
		
		for(int x:arn) {
			System.out.print(x+" ");
		}
	}

}
