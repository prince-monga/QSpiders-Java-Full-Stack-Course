class Q7Pyramid {
    public static void main(String[] args) {


 /*      
	int n = 5,z=1; // number of rows
        
       for(int i=1;i<=n;i++){	
	for(int j=n-1;j>=i;j--){
		System.out.print(" ");
	}  
	for(int k=1;k<=z;k++){
	System.out.print("* ");

	}
	z+=1;
	System.out.println();
	}
*/


	int n=5;
	int px=n;
	int py=n;
	for(int i=1;i<=n;i++){
	for(int j=1;j<n*2;j++){
	if(j>=px && j<=py){
	System.out.print("*");	
	}
	else{
	System.out.print(" ");	
	}
	
	}
	System.out.println();
	px--;
	py++;
	}

    }

}
