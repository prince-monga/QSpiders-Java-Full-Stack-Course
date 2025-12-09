class UseRTprimitive{
public static byte method1(){
	System.out.println("Use Byte return type");
	return 1;
}

public static short method2(){
	System.out.println("Use short return type");
	return 10;
}
public static int method3(){
	System.out.println("Use int return type");
	return 120;
}
public static long method4(){
	System.out.println("Use long return type");
	return 120244l;
}

public static float method5(){
	System.out.println("Use float return type");
	return 12.45f;
}
public static double method6(){
	System.out.println("Use double return type");
	return 1245.4545d;
}
public static boolean method7(){
	System.out.println("Use Boolean return type");
	return true;
}

public static char method8(){
	System.out.println("Use char return type");
	return 'A';
}


//Non-static method which use Primitive return type


public  byte method9(){
	System.out.println("Use Byte return type");
	return 1;
}

public  short method10(){
	System.out.println("Use short return type");
	return 12;
}
public int method11(){
	System.out.println("Use int return type");
	return 120;
}
public  long method12(){
	System.out.println("Use long return type");
	return 120244l;
}

public float method13(){
	System.out.println("Use float return type");
	return 12.45f;
}
public double method14(){
	System.out.println("Use double return type");
	return 1245.4545d;
}
public  boolean method15(){
	System.out.println("Use Boolean return type");
	return true;
}

public char method16(){
	System.out.println("Use char return type");
	return 56;
}


public static void main(String[] args){
	System.out.println("Run sucessfully!");

	
	//---It gives only statements not return values
	//method1();
	//method2();
	//method3();
	//method4();
	//method5();
	//method6();
	//method7();
	//method8();
	
	//Access Static method with its return value
	//---1.--It gives statements and return value--
	System.out.println(method1());
	System.out.println(method2());
	System.out.println(method3());
	System.out.println(method4());
	System.out.println(method1());
	System.out.println(method5());
	System.out.println(method5());
	System.out.println(method7());
	System.out.println(method8());


	//---2.--Return value  store in a varible and access method 
	byte by1=method1(); 
	short s1=method2();
	int i1=method3();
	long l1=method4();
	float f1=method5();
	double d1=method6();
	char c1=method8();
	boolean b1=method7();

	//---3.--Only print Return values--
	System.out.println(by1);
	System.out.println(s1);
	System.out.println(i1);
	System.out.println(l1);
	System.out.println(f1);
	System.out.println(d1);
	System.out.println(c1);
	System.out.println(b1);

	//Access Non-Static method with its return value

	UseRTprimitive p=new UseRTprimitive();
	
	System.out.println(p.method9());
	System.out.println(p.method10());
	System.out.println(p.method11());
	System.out.println(p.method12());
	System.out.println(p.method13());
	System.out.println(p.method14());
	System.out.println(p.method15());
	System.out.println(p.method16());
	
	//p.method9();
	//p.method10();
	//p.method11();
	//p.method12();
	//p.method13();
	//p.method14();
	//p.method15();
	//p.method16();

	//Method Return value  store in a varible and access method 
	byte by2=method1(); 
	short s2=method2();
	int i2=method3();
	long l2=method4();
	float f2=method5();
	double d2=method6();
	char c2=method8();
	boolean b2=method7();

	//---3.--Only print Return values--
	System.out.println(by2);
	System.out.println(s2);
	System.out.println(i2);
	System.out.println(l2);
	System.out.println(f2);
	System.out.println(d2);
	System.out.println(c2);
	System.out.println(b2);
	
	
}
}