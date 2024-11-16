public class Main {
    public static void main(String[] args) {
        Student student = new Student("Charmiel", "Balayan Batangas PH", 2, "BSIT");

        System.out.println("------------------Configuration: <Default>------------------");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());

        System.out.println(student.toString());

    }
}