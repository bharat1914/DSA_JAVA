package dsa;

public class Problem_1 {
	static int sum() {
		int [] q = {1,2,3,4};
		int sum = 0;
		for(int i=0;i<q.length;i++) {
			sum += q[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = sum();
		System.out.println(s);
	}
}
