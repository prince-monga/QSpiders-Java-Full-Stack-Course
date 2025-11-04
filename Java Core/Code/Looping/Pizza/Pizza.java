import java.util.Scanner;
class Pizza{
	public static void main(String[] args){
	System.out.println("Welcome to Dominus Pizza");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for GGN");
	System.out.println("Enter 2 for Noida");
	System.out.println("Enter 3 for Delhi ");
	int city=sc.nextInt();
	
	if(city==1){
		
			System.out.println("Welcome to GGN Pizza \n");
			System.out.println("Enter 1 veg Pizza");
			System.out.println("Enter 2 Non-Veg Pizza");
			int nv=sc.nextInt();

			if(nv==1){
				System.out.println("You Select veg Pizza-");
				System.out.println("Enter 1 Onino Pizza");
				System.out.println("Enter 2 for Corn Pizza");
				System.out.println("Enter 3 for Masrum Pizza ");
				int select_pizza=sc.nextInt();
				
				if(select_pizza==1){
					System.out.println("You Selected Onino Pizza");
				}
				
				else if(select_pizza==2){
					System.out.println("You Selected Corn Pizza");
				}
				
				else if(select_pizza==3){
					System.out.println("You Selected Massrom Pizza");
				}
				
					
			}
			

			else if(nv==2){
				System.out.println("You Select Non veg Pizza-");
				System.out.println("Enter 1 Chicken  Pizza");
				System.out.println("Enter 2   Corn & chiken Pizza");
				System.out.println("Enter 3 for Masrum & Pizza ");
				int select_pizza=sc.nextInt();
				
				if(select_pizza==1){
					System.out.println("You Selected Chicken Pizza");
				}
				
				else if(select_pizza==2){
					System.out.println("You Selected Corn Chicken Pizza");
				}
				
				else if(select_pizza==3){
					System.out.println("You Selected Massrum Chicken Pizza");
				}

			}	

		
	 	}
		else if(city==2){
		
			System.out.println("Welcome to  Noida Pizza \n");
			System.out.println("Enter 1 veg Pizza");
			System.out.println("Enter 2 Non-Veg Pizza");
			int nv=sc.nextInt();

			if(nv==1){
				System.out.println("You Select veg Pizza-");
				System.out.println("Enter 1 Onino Pizza");
				System.out.println("Enter 2 for Corn Pizza");
				System.out.println("Enter 3 for Masrum Pizza ");
				int select_pizza=sc.nextInt();
				
				if(select_pizza==1){
					System.out.println("You Selected Onino Pizza");
				}
				
				else if(select_pizza==2){
					System.out.println("You Selected Corn Pizza");
				}
				
				else if(select_pizza==3){
					System.out.println("You Selected Massrom Pizza");
				}
				
					
			}
			

			else if(nv==2){
				System.out.println("You Select Non veg Pizza-");
				System.out.println("Enter 1 Chicken  Pizza");
				System.out.println("Enter 2   Corn & chiken Pizza");
				System.out.println("Enter 3 for Masrum & Pizza ");
				int select_pizza=sc.nextInt();
				
				if(select_pizza==1){
					System.out.println("You Selected Chicken Pizza");
				}
				
				else if(select_pizza==2){
					System.out.println("You Selected Corn Chicken Pizza");
				}
				
				else if(select_pizza==3){
					System.out.println("You Selected Massrum Chicken Pizza");
				}

			}	

		
	 	}
	
		else if(city==3){
		
			System.out.println("Welcome to Delhi Pizza \n");
			System.out.println("Enter 1 veg Pizza");
			System.out.println("Enter 2 Non-Veg Pizza");
			int nv=sc.nextInt();

			if(nv==1){
				System.out.println("You Select veg Pizza-");
				System.out.println("Enter 1 Onino Pizza");
				System.out.println("Enter 2 for Corn Pizza");
				System.out.println("Enter 3 for Masrum Pizza ");
				int select_pizza=sc.nextInt();
				
				if(select_pizza==1){
					System.out.println("You Selected Onino Pizza");
				}
				
				else if(select_pizza==2){
					System.out.println("You Selected Corn Pizza");
				}
				
				else if(select_pizza==3){
					System.out.println("You Selected Massrom Pizza");
				}
				
					
			}
			

			else if(nv==3){
				System.out.println("You Select Non veg Pizza-");
				System.out.println("Enter 1 Chicken  Pizza");
				System.out.println("Enter 2   Corn & chiken Pizza");
				System.out.println("Enter 3 for Masrum & Pizza ");
				int select_pizza=sc.nextInt();
				
				if(select_pizza==1){
					System.out.println("You Selected Chicken Pizza");
				}
				
				else if(select_pizza==2){
					System.out.println("You Selected Corn Chicken Pizza");
				}
				
				else if(select_pizza==3){
					System.out.println("You Selected Massrum Chicken Pizza");
				}

			}	

		
	 	}
	

	
	
	}
	  

}