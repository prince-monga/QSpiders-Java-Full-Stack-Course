package Ecapsulation;

public class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private String bankName;
    private double balance;
    private String accountType;

    // Getters
    public long getAccountNumber() { 
    	return accountNumber;
    	}
    public String getAccountHolder() {
    	return accountHolder;
    	}
    public String getBankName() {
    	return bankName; 
    	}
    public double getBalance() {
    	return balance;
    	}
    public String getAccountType() { 
    	return accountType;
    	}

    // Setters
    public void setAccountNumber(long accountNumber) { 
    	this.accountNumber = accountNumber; 
    	}
    public void setAccountHolder(String accountHolder) { 
    	this.accountHolder = accountHolder;
    	}
    public void setBankName(String bankName) { 
    	this.bankName = bankName;
    	}
    public void setBalance(double balance) { 
    	this.balance = balance;
    	}
    public void setAccountType(String accountType) { 
    	this.accountType = accountType;
    	}

    // hashCode
    @Override
    public int hashCode() {
        return Long.valueOf(accountNumber).hashCode();
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof BankAccount)) return false;

        BankAccount b = (BankAccount) obj;

        return this.accountNumber == b.accountNumber &&
               this.balance == b.balance &&
               this.accountHolder.equals(b.accountHolder) &&
               this.bankName.equals(b.bankName) &&
               this.accountType.equals(b.accountType);
    }

    // toString
    @Override
    public String toString() {
        return "BankAccount {" +
                "AccountNumber=" + accountNumber +
                ", Holder='" + accountHolder + '\'' +
                ", Bank='" + bankName + '\'' +
                ", Balance=" + balance +
                ", AccountType='" + accountType + '\'' +
                '}';
    }
}
