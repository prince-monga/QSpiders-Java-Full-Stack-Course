package ConstructorChaning;

abstract class BankAccount {
    BankAccount() {
        System.out.println("BankAccount Abstract class constructor");
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount() {
        super();
        System.out.println("SavingsAccount class constructor");
    }
}

public class AbBankAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
    }
}
