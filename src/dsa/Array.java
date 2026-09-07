package dsa;

import java.util.Scanner;

class dec{
	void decl() {
		int [] arr;
	}
}

class init{
	void in() {
		int ar[] = new int[5];
	}
}

class dir{
	void dire() {
		int ar [] = {1,2,3};
	}
}

class intrav{
	void intr() {
		int ar [] = new int[5];
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}

class trav{
	void tr() {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int ar [] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter a number");
			ar[i]= sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trav t = new trav();
		t.tr();
 	}

}
