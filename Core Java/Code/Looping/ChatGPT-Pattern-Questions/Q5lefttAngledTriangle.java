class Q5lefttAngledTriangle{
	public static void main(String[] args){
	int n=5;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=n;j++){
		
		if(j==5 || i==5 || i+j==6 || (i==4 && j==3)|| (i==4 && j==4)|| (i==3 && j==4))
		{
		System.out.print("* ");
		}	
		else{
		System.out.print("  ");
		}
		}
		
		
		System.out.println();
	}
	}
}