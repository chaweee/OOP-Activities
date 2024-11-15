public class Activity {
    public static void main(String[] args) {
        Student student1 = new Student();
        
         student1.setStudentId(2309852);
         student1.setName("Charlie");
 
         System.out.println("Student ID: " + student1.getStudentId());
         System.out.println("Name: " + student1.getName());
 
         Book book1 = new Book();
         
         book1.setBookNumber(123);
         book1.setTitle("The Notebook");
         book1.setAuthor("Nichola Sparks");
         book1.setPrice(999.99);
 
         System.out.println("\nBook Details:");
         System.out.println("Book Number: " + book1.getBookNumber());
         System.out.println("Title: " + book1.getTitle());
         System.out.println("Author: " + book1.getAuthor());
         System.out.println("Price: PHP " + book1.getPrice());
    }
}