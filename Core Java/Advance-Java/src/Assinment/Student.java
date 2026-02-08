package Assinment;

public class Student //implements Comparable<Student> {
{	int id;
	String name;
	String city;
	double fee;
	
	Student(int id,String name,String city,	double fee){
		this.id=id;
		this.name=name;
		this.city=city;
		this.fee=fee;	
		
	}
	public String toString() {
		return "Student: ["+id+","+name+","+city+","+fee+"]\n";
	}
//	@Override
//	public int compareTo(Student s) {
//		return this.id-s.id; //Accessding order
//	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
}
