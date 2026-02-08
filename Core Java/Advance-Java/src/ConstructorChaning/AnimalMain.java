package ConstructorChaning;

class AnimalMain{
	AnimalMain(){
		this("Dog");
		System.out.println("Animal class");;
	}

	AnimalMain(String animal_name){
		System.out.println(animal_name);
	}
	public static void main(String[] args) {
		AnimalMain a=new AnimalMain();
		
	}
	
}

