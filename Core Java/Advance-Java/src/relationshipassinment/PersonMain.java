package relationshipassinment;

class Address {
    String city;
    Address(String city){ this.city = city; }
}

class Person {
    String name;
    Address address;
    Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
}

class PersonMain {
    public static void main(String[] args) {
        Address a = new Address("Delhi");
        Person p = new Person("Prince", a);
        System.out.println(p.name + " lives in " + p.address.city);
    }
}
