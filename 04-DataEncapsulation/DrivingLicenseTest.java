public class DrivingLicenseTest {
    public static void main(String[] args) {
        
        DrivingLicense dl1 = new DrivingLicense("Jack", "Smith", "DL123456", "UH78910");
        DrivingLicense dl2 = new DrivingLicense("Jane", "Doe", "DL987654", "UH12345");

        
        dl1.display();
        dl2.display();

        
        System.out.println(dl1.toString());
        System.out.println(dl2.toString());

        dl1.setName("John");
        dl1.setSurname("Doe");
        dl1.setLicenseNumner("DL111222");
        dl1.setID("UH11111");

        
        System.out.println("After modifications:");
        dl1.display();
    }
}
