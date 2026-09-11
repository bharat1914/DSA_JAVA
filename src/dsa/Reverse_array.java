package dsa;

//a[l]=a[l]+a[r];
//a[r]=a[l]-a[r];      without third variable;
//a[l]=a[l]-a[r];


class reverse_arr{
	public static void rev() {
		int a[] = {1,2,3,4};
		
		int l=0;
		int r=a.length-1;
	
		while(l<r) {
			int temp = a[l];             
			a[l] = a[r];
			a[r]=temp;
			l++;
			r--;
		}
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
}

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse_arr.rev();
	}

}
