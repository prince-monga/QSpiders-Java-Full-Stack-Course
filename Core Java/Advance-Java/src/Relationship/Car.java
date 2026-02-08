package Relationship;

public class Car {
	long car_price=458973l;
	String car_company="BMW";
	Engine e=new Engine();
	Wheel w=new Wheel();
	
	Stepney s;
	
	public void addStepney(Stepney s) {
		this.s=s;
		System.out.println("Called Step");
	}

	public static void main(String[] args) {
		Car  c=new Car();
		System.out.println(c.car_company);
		
		
		System.out.println("Engine Price:"+c.e.e_price);
		
		c.e.m1();
		
		System.out.println(c.w.w_Comapny); //Wheel property access using parent class
		
		
		
		// Aggregation
		Stepney ob = new Stepney(2300, "NaN");
		c.addStepney(ob);

		// Access Stepney variables
		System.out.println("Stepney Price: " + c.s.s_price);
		System.out.println("Stepney Brand: " + c.s.s_comapany);

		
	}

}
