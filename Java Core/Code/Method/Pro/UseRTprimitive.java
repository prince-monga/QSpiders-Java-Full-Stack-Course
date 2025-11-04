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
	method1();
	method2();
	method3();
	method4();
	method5();
	method6();
	method7();
	method8();

	UseRTprimitive p=new UseRTprimitive();
	p.method9();
	p.method10();
	p.method11();
	p.method12();
	p.method13();
	p.method14();
	p.method15();
	p.method16();
	
	
}
}