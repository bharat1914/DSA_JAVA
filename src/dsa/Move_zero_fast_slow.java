package dsa;
class zero_last{
	public static void zero(int a []) {
		
		int s = 0, f=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[f]!=0) {
				int temp = a[s];
				a[s]=a[f];
				a[f]=temp;
				s++;
			}
			f++;
			
		}
		
	}
}
public class Move_zero_fast_slow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,0,3,0,12};
		zero_last.zero(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}
