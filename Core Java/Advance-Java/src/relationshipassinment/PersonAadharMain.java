package relationshipassinment;

class AadharCard {
    long number;
    AadharCard(long number){ this.number = number; }
}

class Person2 {
    String name;
    AadharCard aadhar;
    Person2(String name, AadharCard aadhar){
        this.name = name;
        this.aadhar = aadhar;
    }
}

class PersonAadharMain {
    public static void main(String[] args) {
        AadharCard a = new AadharCard(123456789012L);
        Person2 p = new Person2("Prince", a);
        System.out.println(p.name + " Aadhar: " + p.aadhar.number);
    }
}
