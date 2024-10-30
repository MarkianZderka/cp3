import javax.print.DocFlavor.STRING;

public class DrivingLicense {
    private String name;
    private String surname;
    private String licenseNumber;
    private String driverID;

    
    public DrivingLicense(String name, String surname, String licenseNumber, String driverID) {
        this.name = name;
        this.surname = surname;
        this.licenseNumber = licenseNumber;
        this.driverID = driverID;
    }

    
    public void display() {
        System.out.println("=== Driving License ===");
        System.out.printf("Name: %s %s%n", name, surname);
        System.out.printf("License Number: %s%n", licenseNumber);
        System.out.printf("Driver ID: %s%n", driverID);
    }

    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense("Jack", "Smith", "DL123456", "UH78910");
        dl.display();
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public String getID(){
        return driverID;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setLicenseNumner(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    public void setID(String driverID){
        this.driverID = driverID;
    }

    public String toString(){
        return String.format("=== Driving License ===" +
                            "Name: %s %s%n" +
                            "License Number: %s%n"+
                            "Driver ID: %s%n",
                            getName(),getSurname(),getLicenseNumber(),getID());
    }
}