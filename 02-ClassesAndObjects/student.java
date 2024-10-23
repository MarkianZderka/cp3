public class student {
    String name;
    int age;
    String studentID;
    boolean validStudentID;
    int semester;
    double averageGrade;

    void sayHello() {
        System.out.println("Hello from " + name);
    }
    
    void displayName() {
        System.out.println("Student's name is: " + name);
    }

    void displayAge() {
        System.out.println("Student's age is: " + age);
    }
    void displayID(){
        System.out.println("Student ID: " + studentID + " Is it valid? " + validStudentID);
    }
    void displayInfo(){
        System.out.println(name + " is on " + semester + "semester and has average grade of: " + averageGrade);
    }
}  
