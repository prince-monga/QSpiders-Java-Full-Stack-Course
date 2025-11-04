class typecastingshort
{
	public static void main(String[] args){

	 //byte<short<int<long<float<double



	//2. Convert short into int,long,float,double
	short s2=45;
	int i2=s2;
	long l2=s2;
	float f2=s2;
	double d2=s2;
	System.out.println("Original value in Short:"+s2);
	System.out.println("Int value:"+i2);
	System.out.println("Long value:"+l2);
	System.out.println("Float value:"+f2);
	System.out.println("Double value:"+d2);
	
	//3. Convert int into long,float,double
	System.out.println("\n int into long,float,double \n");
	
	int i3=567;
	long l3=i3;
	float f3=i3;
	double d3=i3;

	System.out.println("Int value:"+i3);
	System.out.println("Long value:"+l3);
	System.out.println("Float value:"+f3);
	System.out.println("Double value:"+d3);	
	
	//4. Convert long into float,double
	System.out.println("\n long into float,double \n");
	
	
	long l4=9547l;
	float f4=l4;
	double d4=l4;

	System.out.println("Long value:"+l4);
	System.out.println("Float value:"+f4);
	System.out.println("Double value:"+d4);	
	
	//5. Convert float into double
	System.out.println("\n Float into double \n");
	
	float f5=567.56f;
	double d5=f5;

	System.out.println("Float value:"+f5);
	System.out.println("Double value:"+d5);	
	
	//6. Convert char into int,long,float,double
	System.out.println("\n char into int,long,float,double \n");
	
	char ch='P';
	int i6=ch;
	long l6=ch;
	float f6=ch;
	double d6=ch;
	
	System.out.println("Char value:"+ch);
	System.out.println("Int value:"+i6);
	System.out.println("Long value:"+l6);
	System.out.println("Float value:"+f6);
	System.out.println("Double value:"+d6);	
	
	
	
	}
}