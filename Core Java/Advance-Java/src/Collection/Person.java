package Collection;

public class Person implements Comparable<Person>{
	String name;
	int age;
	long contact;
	String city;
	
	
	Person(String name,	int age,long contact,String city){
		this.name=name;
		this.age=age;
		this.contact=contact;
		this.city=city;
		
	}
	public String toString() {
		String ss="Person: ["+name+","+age+","+contact+","+city+"] \n";
		return ss;
	}
	

	@Override
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}

}
