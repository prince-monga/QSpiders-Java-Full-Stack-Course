package Ecapsulation;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double marks;
    private long contact;

    // Getters
    public int getRollNo() { 
    	return rollNo;
    	}
    public String getName() { 
    	return name; 
    	}
    public String getCourse() { 
    	return course; 
    	}
    public double getMarks() { 
    	return marks; 
    	}
    public long getContact() {
    	return contact; 
    	}

    // Setters
    public void setRollNo(int rollNo) {
    	this.rollNo = rollNo; 
    	}
    public void setName(String name) {
    	this.name = name;
    	}
    public void setCourse(String course) {
    	this.course = course; 
    	}
    public void setMarks(double marks) { 
    	this.marks = marks; 
    	}
    public void setContact(long contact) {
    	this.contact = contact; 
    	}

    // hashCode
    @Override
    public int hashCode() {
        return rollNo;
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
        	return true;
        if (!(obj instanceof Student)) 
        	return false;

        Student s = (Student) obj;

        return this.rollNo == s.rollNo &&
               this.marks == s.marks &&
               this.contact == s.contact &&
               this.name.equals(s.name) &&
               this.course.equals(s.course);
    }

    // toString
    @Override
    public String toString() {
        return "Student {" +
                "RollNo=" + rollNo +
                ", Name='" + name + '\'' +
                ", Course='" + course + '\'' +
                ", Marks=" + marks +
                ", Contact=" + contact +
                '}';
    }
}
