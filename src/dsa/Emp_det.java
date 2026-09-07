package dsa;

public class Emp_det {
	
	int emp_id;
	String name;
	
	public Emp_det(int id, String ename) {
		emp_id = id;
		name = ename;
	}
	
	public Emp_det() {
		
	}
	
	public String toString() {
		return "Emp_det[emp=" + emp_id +", empname="+ name +"]";
	}

}
