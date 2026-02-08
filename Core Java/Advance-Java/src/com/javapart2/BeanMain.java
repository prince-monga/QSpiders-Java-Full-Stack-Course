package com.javapart2;

public class BeanMain {

	public static void main(String[] args) {
		BeanClass1 b=new BeanClass1();
		//set or update value
		b.setEmpName("Prince arora");
		b.setEmpContact(9518219823l);
		b.setEmpRole("web dev");
		b.setEmpContact(34567l);		
		b.setEmpId(45);
		
		
		BeanClass1 b2=new BeanClass1();
		//set or update value
		b2.setEmpName("Prince arora");
		b2.setEmpContact(9518219823l);
		b2.setEmpRole("web dev");
		b2.setEmpContact(34567l);		
		b2.setEmpId(45);
		
		
		System.out.println(b.equals(b2)); //true --Beacuse both object are same
		
		//getter 
		System.out.println(b.getEmpId());
		System.out.println(b.getEmpName());
	
		System.out.println("Employee Name:"+b.getEmpName());
		
		System.out.println(b.getEmpContact());
		
		
		System.out.println(b.hashCode());
	
		System.out.println(b.equals(b)); //true --Beacuse both object are same
		
	}

}
