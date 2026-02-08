package ConstructorChaning;

abstract class Animal1{
	Animal1(){
		System.out.println("Animal Abstract class.");
	}
}
 class  Dog extends Animal1 {
	Dog(){
		super();
		System.out.println("Dog ");
	}
}



public class AbAnimal {

	public static void main(String[] args) {
		Dog d=new Dog();

	}

}
