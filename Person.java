// Base class: Person
public class Person {
    protected String name;
    protected String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        return "Hello I am " + name + " and " + "I lived in " + address + ".";
    }
}