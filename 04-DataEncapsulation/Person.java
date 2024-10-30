public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    
    public boolean isAdult() {
        return age >= 18;
    }

    
    @Override
    public String toString() {
        return String.format("%s, %d", name, age);
    }

    
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 15);

        
        System.out.println(person1.toString());
        System.out.println("Is Adult: " + person1.isAdult());

        System.out.println(person2.toString());
        System.out.println("Is Adult: " + person2.isAdult());
    }
}
