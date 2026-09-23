package dsa;

import java.util.Arrays;

public class Selection_Sort {

	public static void selection(int a[]) {
		
		
		
		for(int i=0; i<a.length-1;i++) {
			int min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
					
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
				
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,9,1,6,3,2,7};
		selection(a);
		System.out.println(Arrays.toString(a));
	}

}
