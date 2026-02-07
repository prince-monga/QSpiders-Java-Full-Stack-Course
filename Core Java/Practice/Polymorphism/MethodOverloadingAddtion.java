//1. Method Overloading --In Complie Time Polymorphism 

class MethodOverloadingAddtion{
	public void add(){
		System.out.println("perform Addition.");
	}
	public void add(int a,int b){
		int c=a+b;
		System.out.println("Sum: "+c);
	}
	public void add(int a,int b,int c){
		int d=a+b+c;
		System.out.println("Sum: "+d);
	}
	
	public static void main(String[] args)
	{
	MethodOverloadingAddtion obj=new MethodOverloadingAddtion();
	obj.add();
	obj.add(4,6);
	obj.add(6,7,3);
	}
	
}