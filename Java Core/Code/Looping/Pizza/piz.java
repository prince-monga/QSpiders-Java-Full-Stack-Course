import java.util.Scanner;

class Pizza {
	public static void main(String[] args) {
		System.out.println("Welcome to Dominus Pizza");
		Scanner sc = new Scanner(System.in);
		boolean en = true;
		System.out.println("\n Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("\n Enter Your Contact Number:");
		long contact = sc.nextLong();

		System.out.println("\nEnter Your Address:");
		String address = sc.next();

		while (en) {
			System.out.println("Enter 1 for GGN");
			System.out.println("Enter 2 for Noida");
			System.out.println("Enter 3 for Delhi ");
			System.out.println("Enter 4 for Exit \n");
			int city = sc.nextInt();
			// while use

			if (city == 1) {
				System.out.println("\n Welcome to GGN Pizza \n");
			} else if (city == 2) {
				System.out.println("\n Welcome to Noida Dominus Pizza \n");
			} else if (city == 3) {
				System.out.println("\n Welcome to Delhi Dominus Pizza \n");
			} else if (city == 4) {
				en = false;
				System.out.println("Name:" + name + "\n" + "Contact Number:" + contact + "\n" + "Address:" + address);
				System.out.println("\n Thanks For Visting. \n");
			}

			if (city == 1 || city == 2 || city == 3) {

				System.out.println("Enter 1 veg Pizza");
				System.out.println("Enter 2 Non-Veg Pizza");
				int nv = sc.nextInt();

				if (nv == 1) {
					System.out.println("You Select veg Pizza-\n");
					System.out.println("Enter 1 Onion Pizza");
					System.out.println("Enter 2 for Corn Pizza");
					System.out.println("Enter 3 for Masrum Pizza \n");
					int select_pizza = sc.nextInt();

					if (select_pizza == 1) {
						System.out.println("\n You Selected Onino Pizza \n ");
					}

					else if (select_pizza == 2) {
						System.out.println("\n You Selected Corn Pizza \n");
					}

					else if (select_pizza == 3) {
						System.out.println("\n You Selected Massrom Pizza \n");
					}
				}

				else if (nv == 2) {
					System.out.println("You Select Non veg Pizza-");
					System.out.println("\nEnter 1 Chicken  Pizza");
					System.out.println("Enter 2   Corn & chiken Pizza");
					System.out.println("Enter 3 for Masrum & Pizza \n");
					int select_pizza = sc.nextInt();

					if (select_pizza == 1) {
						System.out.println("\n You Selected Chicken Pizza \n");
					}

					else if (select_pizza == 2) {
						System.out.println("\n You Selected Corn Chicken Pizza \n");
					}

					else if (select_pizza == 3) {
						System.out.println("\n You Selected Massrum Chicken Pizza \n");
					}
				}

			}
		} // while

	}

}