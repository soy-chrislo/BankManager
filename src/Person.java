abstract public class Person {
    private final String name;
    private final int id;
    private int age, phoneNumber;
    private String email;

    public Person(String name, int id) {
        this(name, id, -18, 00, "example@email.com");
    }

    public Person (String name, int id, int age, int phoneNumber, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void incrementAge(int increment) {
        age += increment;
    }

    public void decrementAge(int decrement) {
        age -= decrement;
    }

    /* Getters */

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    /* Setter */

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
