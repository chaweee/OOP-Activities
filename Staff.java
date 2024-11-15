// Subclass: Staff
class Staff extends Person {
    private String school;
    private double salary;

    // Constructor
    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    // Setters
    public void setSchool(String school) {
        this.school = school;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public String getSchool() {
        return school;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "Hello I am " + name + " and " + "I lived in " + address + ". I work at " + school + " with a " + salary + " salary.";
    }
}