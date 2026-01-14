class Q2RightAngledTriangle{
	public static void main(String[] args){
	for(int i=1;i<=5;i++){
		for(int j=1;j<=5;j++){
		
		if(j==1 || i==5 || i==j || (i==3 && j==2)||(i==4 && j==2)|| (i==4 && j==3))

		System.out.print("* ");
		}
		System.out.println();
	}
	}
}