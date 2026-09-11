package dsa;

class pal{
	public static void Pal() {
		String s = "madam";
		int l=0;
		int r=s.length()-1;
		
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				System.out.println("not found");
				return ;
			}
			l++;
			r--;
		}
		System.out.println("is palindrome");
	}
}

public class Palindrome_two_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pal.Pal();
	}

}