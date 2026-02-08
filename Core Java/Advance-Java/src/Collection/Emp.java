package Collection;

public class Emp implements Comparable<Emp>{
	int emp_id;
	String emp_name;
	Double salary;
	String designation;
	
	
	Emp(int emp_id,String emp_name,	double salary,String designation){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.salary=salary;
		this.designation=designation;
	}
	public String toString() {
		String em="Emp: ["+emp_id+","+emp_name+","+salary+","+designation+"]\n";
		return  em;
	}
//	public int compareTo(Emp e) {
//		return e.emp_name.compareTo(this.emp_name); //Sort on the bases of name
//	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return 0;
}
	

	
//	@Override
//	public int compareTo(Emp e) {
//		// TODO Auto-generated method stub
//		return this.emp_id-e.emp_id;
//	}
	

//	if(this.salary<e.salary) {  //On the bases of Salary
//	return -1;
//}
//else {
//	return 1;
//}

	
}
