package Assinment;
import java.util.Scanner;

public class AnimalMain {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
    System.out.println("=== Animal Sound App ===");
    System.out.println("Enter animal number:");
    System.out.println("1. Dog\n2. Cat\n3. Lion\n4. Tiger\n5. Cow\n6. Goat\n7. Elephant");
    System.out.println("8. Monkey\n9. Horse\n10. Duck");
    System.out.print("Choose: ");

    int choice = sc.nextInt();
    Animal a = null;

    switch (choice) {
        case 1: 
        	a = new Dog(); 
        break;
        case 2: 
        	a = new Cat(); 
        break;
        case 3: 
        	a = new Lion(); 
        break;
        case 4: 
        	a = new Tiger(); 
        break;
        case 5: 
        	a = new Cow(); 
        break;
        case 6: 
        	a = new Goat(); 
        break;
        case 7: 
        	a = new Elephant(); 
        	break;
        case 8: 
        	a = new Monkey(); 
        	break;
        case 9: 
        	a = new Horse(); 
        	break;
        case 10: 
        	a = new Duck(); 
        	break;
        default:
            System.out.println("Invalid option!");
    }
    a.sound();
	}

}
