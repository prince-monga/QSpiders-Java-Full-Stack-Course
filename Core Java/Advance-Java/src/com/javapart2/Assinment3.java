package com.javapart2;


class Shapes{
	void drwa() {
		System.out.println("Drawing shape");
		}
	
}
class Circle extends Shapes{
	double radius=54.5d;
	void drwa() {
		System.out.println("Circle shape");
		}
}
class Square extends Shapes{
	int side=20;
	void drwa() {
		System.out.println("Square shape");
		}
}
public class Assinment3 {

	public static void main(String[] args) {
		Shapes s=new Square(); //Up-casting
		
		if(s instanceof Circle) {
			Circle c = (Circle)s;
			c.drwa();
            System.out.println("Circle radius = " + c.radius);
            
		}
		if(s instanceof Square) {
			Square s1 = (Square)s;
			s1.drwa();
            System.out.println("Square Side = " + s1.side);
            
		}
		
		

	}

}
