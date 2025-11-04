class pro3
{
	public static void main(String[] args){
	
	//Convert int into byte,short,long,float,double,char type varible

	int num=21;
	
	//Convert into byte using casting operator (expicit casting)
	byte b_num=(byte)num;
	System.out.println("Byte value:"+b_num);
	
	short s_num=(short)num;
	System.out.println("Short value:"+s_num);
	

	// ---it is small to large [implicit casting]---
	long l_num=num;
	System.out.println("Long value:"+l_num);

	float f_num=num;
	System.out.println("Float value:"+f_num);
	

	double d_num=num;
	System.out.println("Double value:"+d_num);


	}
}