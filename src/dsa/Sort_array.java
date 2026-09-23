package dsa;

import java.util.Arrays;

public class Sort_array {
public static void sort(int a[]) {
	
	boolean swap = false;
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=0;j<a.length-i-1;j++) {

			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				swap= true;
			}
		}
		if(!swap) {
			System.out.println("no sorting needed");
			break;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {5,4,3,2,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
