class narrowing

{
	public static void main(String[] args){
	//Narrowing typecasting

	//1. double into float long int short byte
	System.out.println("\n 1.double  into float long int short byte \n");

	double d1=45.57537888d;
	
	float f1=(float)d1;
	long l1=(long)d1;
	int i1=(int)d1;
	short s1=(short)d1;
	byte b1=(byte)d1;
	
	System.out.println("Double Value:"+d1);
	System.out.println("Double into float:"+f1);
	System.out.println("Double into long:"+l1);
	System.out.println("Double into int:"+i1);
	System.out.println("Double into short:"+s1);
	System.out.println("Double into byte:"+b1);


	//2.  float into  long int short byte
	System.out.println("\n 2. float into  long int short byte \n");

	float f2= 23.45f;
	long l2=(long)f2;
	int i2=(int)f2;
	short s2=(short)f2;
	byte b2=(byte)f2;
	
	System.out.println("float Value:"+f2);
	System.out.println("float into long:"+l2);
	System.out.println("float into int:"+i2);
	System.out.println("float into short:"+s2);
	System.out.println("float into byte:"+b2);

	//3. long into   int short byte
	System.out.println("\n 3. long  into  int short byte \n");

	long l3=63748;
	int i3=(int)l3;
	short s3=(short)l3;
	byte b3=(byte)l3;
	
	System.out.println("long Value:"+l3);
	System.out.println("long into int:"+i3);
	System.out.println("long into short:"+s3);
	System.out.println("long into byte:"+b3);

	//4. int into short byte
	System.out.println("\n 4. int into  short byte \n");

	int i4=1234;
	short s4=(short)i4;
	byte b4=(byte)i4;
	
	System.out.println("int Value:"+i4);
	System.out.println("int into short:"+s4);
	System.out.println("int into byte:"+b4);

	//5 short into  byte
	System.out.println("\n 5. short into  byte \n");

	
	short s5=34;
	byte b5=(byte)s5;
	
	System.out.println("short Value:"+s5);
	System.out.println("short into byte:"+b5);
	
	//6.  long int short byte into char
	System.out.println("\n 6.  long int short byte into char\n");

	long l6=97;
	int i6=69;
	short s6=43;
	byte b6=10;
	
	float f6=45.5f;
	double d6=567.455d;
	
	char ch1=(char)l6; //long into char
	char ch2 =(char)i6; //int into char
	char ch3 =(char)s6; //short into char
	char ch4 =(char)b6; //byte into char

	char ch5 =(char)f6;
	char ch6=(char)d6;
	
	
	
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch3);
	System.out.println(ch4);
	System.out.println(ch5);
	System.out.println(ch6);

	
	}
}