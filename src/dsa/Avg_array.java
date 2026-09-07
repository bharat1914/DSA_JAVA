package dsa;

public class Avg_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {1,2,3,4,5};
		int avg=0;
		for(int i=0;i<n.length;i++) {
			avg +=n[i];
		}
		System.out.println(avg/n.length);
	}

}
