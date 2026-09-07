package dsa;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp_det e5 = new Emp_det(123,"Ravi");
		Emp_det e4 = new Emp_det(123,"Ravi");
		Emp_det e3 = new Emp_det(123,"Ravi");
		Emp_det e2 = new Emp_det(123,"Ravi");
		Emp_det e1 = new Emp_det(123,"Ravi");
		
		Emp_det e[] = {e1,e2,e3,e4,e5};
		
		for(Emp_det ee : e) {
			System.out.println(ee);
		}
	}

}
