package dsa;

public class Search_first_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {11,22,30,40};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
				return;
				
			}
		}
		System.out.println("no element");
	}

}
