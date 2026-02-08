package relationshipassinment;

class Student {
    String name;
    Student(String name){ this.name = name; }
}

class School {
    String schoolName;
    Student student;
    School(String schoolName, Student student){
        this.schoolName = schoolName;
        this.student = student;
    }
}

class SchoolMain {
    public static void main(String[] args) {
        Student s = new Student("Prince");
        School sc = new School("DPS", s);
        System.out.println(sc.schoolName + " student: " + sc.student.name);
    }
}
