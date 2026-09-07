package dsa;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {12,13,14,15,16,17};
		int ar1[] = new int[ar.length+1];
		
		int n = 11;
		int pos = 2;
		
		for(int i=0;i<pos;i++) {
			ar1[i]=ar[i];
		}
		ar1[pos]=n;
		
		for(int i=pos;i<ar.length;i++) {
			ar1[i+1]=ar[i];
		}
		
		for(int i=0;i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
	}

}
