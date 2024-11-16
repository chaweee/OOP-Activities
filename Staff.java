public class Staff extends Person {
    private String position;
    private String department;

    public Staff(String name, String address, String position, String department) {
        super(name, address);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Hello I am " + getName() + ", working as a " + position + 
               " in the " + department + " department, and I lived in " + getAddress() + ".";
    }
}