public class studentTest {
    public static void main(String[] args) {
        
        student student1 = new student();
        student1.name = "Alice";
        student1.age = 21;
        student1.studentIDCard = "A12345";
        student1.isIDCardValid = true;
        student1.semester = 3;
        student1.averageGrade = 3.8;

        
        student student2 = new student();
        student2.name = "Bob";
        student2.age = 23;
        student2.studentIDCard = "B67890";
        student2.isIDCardValid = false;
        student2.semester = 5;
        student2.averageGrade = 3.5;

       
        student1.displayName();
        student1.displayID();
        student1.displayInfo();
        student1.displayAge();
        
        student2.displayName();
        student2.displayID();
        student2.displayInfo();
        student2.displayAge();
           
    }
}
