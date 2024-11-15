// Subclass: Student
class Student extends Person {
    private String program;
    private int year;

    // Constructor
    public Student(String name, String address, String program, int year) {
        super(name, address);
        this.program = program;
        this.year = year;
    }

    // Setters
    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "Hello I am " + name + " and " + "I lived in " + address + ". I am " + year + " year of " + program + ".";
    }
}