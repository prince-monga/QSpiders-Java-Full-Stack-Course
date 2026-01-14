class ArrayPrimitiveAndNonpimitive
{
	//1. Create an array
	//2. Refernce Store in varible
	//3. Check Array Size
	//4. Access element by array refernce
	//5. Re-Initialize the Array value
	//6. ReAccess Array element

	public static byte ByteMethod(){
		System.out.println("--Byte Array--");
		byte b1=1; //only Single value store and it is primitive type 
		//byte b2=1,2,1,3; //Compile time error because we can't store multiple values in primitive datatype 

		//when we need store multiple value in a single variable then create array
		byte[] b3={1,2,3,4,5}; //1. byte Array
		//2. print object refernce of an array
		System.out.println("Reference:"+b3); 
		
		
		System.out.println("Array Size:"+b3.length); //3. check Array size by length varible
		System.out.println("2nd element b3[1]:"+b3[1]); //4. Access array element using index
		System.out.println("4th element b3[4]:"+b3[3]);
		b3[1]=9; //5.Re-Initialize the Array value
		System.out.println("2nd element b3[1] ReAccess:"+b3[1]); 	 //6. Reaccess Array element

		return b3[1];
	}

	public static short shortMethod(){
		System.out.println("--Short Array--");
		
		short[] s3={12,22,23,24,25,32}; 
		//2. print object refernce of an array
		System.out.println("Reference:"+s3); 
		
		System.out.println("Array Size:"+s3.length); 
		System.out.println("2nd element s3[1]:"+s3[1]); 
		System.out.println("4th element s3[4]:"+s3[3]);
		s3[1]=9; //Re-Initialize the Array value
		System.out.println("2nd element b3[1] ReAccess:"+s3[1]); 	 

		return s3[1];
	}

	public static int intMethod(){
		System.out.println("--int Array--");
		int i1=1; //only Single value store and it is primitive type 
		//short i2=12,22,21,23; //Compile time error because we can't store multiple values in primitive datatype 

		//when we need store multiple value in a single variable then create array
		int[] i3={121,122,123,124,125,102,56,23}; 
		//2. print object refernce of an array
		System.out.println("Reference:"+i3); 
		
		System.out.println("Array Size:"+i3.length); 

		System.out.println("2nd element i3[1]:"+i3[1]); 
		System.out.println("4th element i3[4]:"+i3[3]);

		i3[1]=40; 					
		System.out.println("2nd element i3[1] ReAccess:"+i3[1]); 	 

		return i3[1];
	}
	public static long longMethod(){
		System.out.println("--Long Array--");
		
		long [] l1={13422l,21332l,223543l,4424l,676725l,354352l}; 
		
		System.out.println("Reference:"+l1); 
		
		System.out.println("Array Size:"+l1.length); 
		System.out.println("2nd element l1[1]:"+l1[1]); 
		System.out.println("4th element l1[4]:"+l1[3]);
		l1[1]=9787; //Re-Initialize the Array value
		System.out.println("2nd element l1[1] ReAccess:"+l1[1]); 	 

		return l1[1];
	}
	public static float floatMethod(){
		System.out.println("--Float Array--");
		
		float [] f1={134.34f,213.32f,22.43f,44.24f,67.5f,35.43f}; 
		
		System.out.println("Reference:"+f1); 
		
		System.out.println("Array Size:"+f1.length); 
		System.out.println("2nd element f1[1]:"+f1[1]); 
		System.out.println("4th element f1[4]:"+f1[3]);
		f1[1]=9787; //Re-Initialize the Array value
		System.out.println("2nd element f1[1] ReAccess:"+f1[1]); 	 

		return f1[1];
	}

	public static double doubleMethod(){
		System.out.println("--Double Array--");
		
		double [] d1={13434.3454d,22413.3234d,7622.4343d,42244.24d,64457.5535d,34765.43353d}; 
		
		System.out.println("Reference:"+d1); 
		
		System.out.println("Array Size:"+d1.length); 
		System.out.println("2nd element d1[1]:"+d1[1]); 
		System.out.println("4th element d1[4]:"+d1[3]);
		d1[1]=9787; //Re-Initialize the Array value
		System.out.println("2nd element d1[1] ReAccess:"+d1[1]); 	 

		return d1[1];
	}
	public static char charMethod(){
		System.out.println("--char Array--");
		
		char[] c1={'A','B','H','T','Y'};
		
		System.out.println("Reference:"+c1); 
		
		System.out.println("Array Size:"+c1.length); 
		System.out.println("2nd element c1[1]:"+c1[1]); 
		System.out.println("4th element c1[4]:"+c1[3]);
		c1[1]='Z'; //Re-Initialize the Array value
		System.out.println("2nd element c1[1] ReAccess:"+c1[1]); 	 

		return c1[1];
	}

		public static boolean booleanMethod(){
		System.out.println("--Boolean Array--");
		
		boolean [] bo1={true,false,true,true,false}; 
		
		System.out.println("Reference:"+bo1); 
		
		System.out.println("Array Size:"+bo1.length); 
		System.out.println("2nd element bo1[1]:"+bo1[1]); 
		System.out.println("4th element d1[4]:"+bo1[3]);
		bo1[1]=true; //Re-Initialize the Array value
		System.out.println("2nd element bo1[1] ReAccess:"+bo1[1]); 	 

		return bo1[1];
	}

	
	public static String stringMethod(){

	System.out.println("--String Array--");

	String[] s={"Prince","Sinesh","Arun","Karan","Rajan","1","45.45"};
	
	System.out.println(s);
	
	System.out.println(s.length);
	
	
	System.out.println("Access 3rd element:"+s[2]);
	System.out.println(s[0]);
	s[2]="Riya";
	System.out.println("Access 3rd element:"+s[2]);
	return s[2];
	}

	public static void main(String[] args){
	ByteMethod();
	System.out.println(shortMethod());
	System.out.println(intMethod());
	longMethod();
	floatMethod();
	doubleMethod();
	charMethod();
	booleanMethod();
	stringMethod();
	}
}



