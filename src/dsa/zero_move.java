package dsa;

public class zero_move {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar [] = {0,1,0,2,3};
		int index = 0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				ar[index] = ar[i];
				index++;
			}
		}
		
		while(index<ar.length) {
			ar[index]=0;
			index++;
		}
		
		for(int i:ar) {
			System.out.print(i+" ");
		}
		
		
		
		
		
		
//		for(int i=0;i<ar.length-1;i++) {
//				for(int j=i+1;j<ar.length;j++) {
//					if(ar[i]<ar[j]) {
//						int temp = ar[i];
//						ar[i]=ar[j];
//						ar[j]=temp;
//					}
//				}
//		}
//		for(int i:ar) {
//			System.out.print(i+" ");
//		}
		
	}

}
