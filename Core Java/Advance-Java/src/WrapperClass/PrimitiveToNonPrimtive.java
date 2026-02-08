package WrapperClass;

public class PrimitiveToNonPrimtive {

	public static void main(String[] args) {
		
		System.out.println("--Primtitive data type--");
		//primitive data type
		byte b1=4;
		short s1=25;
		int i1=454;
		long l1=6283729l;
		
		float f1=35.45f;
		double d1=457.346d;
		
		char ch1='A';
		boolean bo1=true;
		
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(ch1);
		System.out.println(bo1);
		
		System.out.println("\n -- Non-Primtitive data type--");
		//Non-Primitive data type
		Byte b2=5;
		Short s2=45;
		Integer i2=784;
		Long l2=63848l;
		
		Float f2=47.34f;
		Double d2=6284.24245d;
		
		Character ch2='T';
		Boolean bo2=false;
		
		
		System.out.println(b2);
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(ch2);
		System.out.println(bo2);
		
		
		
		//Naworring Type casting --Implicit type casting
		System.out.println("\n --Narwoing (Implicit )Type casting--");
		System.out.println("\n Long to Others");
		
		PrimitiveToNonPrimtive obj=new PrimitiveToNonPrimtive();
		
	
		Integer ij=128;
		Integer j=128;
		System.out.println(ij==j); //false -Beacuse 128 ==128 --> it is out of range, When between  -128 to 127  range then then its true.
		
		
		
		Integer ij1=127;
		Integer j1=127;
		System.out.println(ij1==j1); //true
		
		
		//convert String into any other type
		String s="1234"; 
		
		//String s="1234sss"; -//Error -->NumberformatException
		
		System.out.println(s);		
		//Interger type
		Integer i22=Integer.parseInt(s);
		System.out.println(i22+" - "+i22.TYPE);

	}

}
