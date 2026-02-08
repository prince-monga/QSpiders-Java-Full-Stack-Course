package Ecapsulation;

public class Customer {

    private int customerId;
    private String customerName;
    private String address;
    private String email;
    private long phone;

    // Getters
    public int getCustomerId() { 
    	
    	return customerId;
    	}
    public String getCustomerName() {
    	return customerName;
    	}
    public String getAddress() { 
    	return address; 
    	}
    public String getEmail() {
    	return email; 
    	}
    public long getPhone() {
    	return phone;
    	}

    // Setters
    public void setCustomerId(int customerId) { 
    	this.customerId = customerId;
    	}
    public void setCustomerName(String customerName) { 
    	this.customerName = customerName; 
    	}
    public void setAddress(String address) {
    	this.address = address; 
    	}
    public void setEmail(String email) { 
    	this.email = email;
    	}
    public void setPhone(long phone) { 
    	this.phone = phone;
    	}

    // hashCode
    @Override
    public int hashCode() {
        return customerId;
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;

        Customer c = (Customer) obj;

        return this.customerId == c.customerId &&
               this.phone == c.phone &&
               this.customerName.equals(c.customerName) &&
               this.address.equals(c.address) &&
               this.email.equals(c.email);
    }

    // toString
    @Override
    public String toString() {
        return "Customer {" +
                "CustomerId=" + customerId +
                ", Name='" + customerName + '\'' +
                ", Address='" + address + '\'' +
                ", Email='" + email + '\'' +
                ", Phone=" + phone +
                '}';
    }
}

