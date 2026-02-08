package Assinment;

public interface Animal {
	void sound();

}

class Dog implements Animal {
 public void sound() {
     System.out.println("Bow! Bow! ");
 }
}

class Cat implements Animal {
 public void sound() {
     System.out.println("Meow! Meow!");
 }
}

class Lion implements Animal {
 public void sound() {
     System.out.println("Roaaar ");
 }
}

class Tiger implements Animal {
 public void sound() {
     System.out.println("Grrr ");
 }
}

class Cow implements Animal {
 public void sound() {
     System.out.println("Moo Moo ");
 }
}

class Goat implements Animal {
 public void sound() {
     System.out.println("Meeeeh !");
 }
}

class Elephant implements Animal {
 public void sound() {
     System.out.println("Pawooo ");
 }
}

class Monkey implements Animal {
 public void sound() {
     System.out.println("Hoo Hoo Ha Ha ");
 }
}

class Horse implements Animal {
 public void sound() {
     System.out.println("Neigh ");
 }
}

class Duck implements Animal {
 public void sound() {
     System.out.println("Quack Quack ");
 }
}