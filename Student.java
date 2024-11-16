public class Student extends Person {
    private int year;
    private String program;

    public Student(String name, String address, int year, String program) {
        super(name, address);
        this.year = year;
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Hello I am " + getName() + ". I lived in " + getAddress() + 
               ". I am " + year + " year of " + program + ".";
    }
}