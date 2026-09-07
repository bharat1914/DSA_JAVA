package dsa;

public class Search_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"bharat", "koushik", "ravi"};
		String k = "bharat ";
		boolean found = false;
		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(k)) {
				found =true;
				break;
			}
		}
		System.out.println(found?"ele found":"not found");
	}

}
