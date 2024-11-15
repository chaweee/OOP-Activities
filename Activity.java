public class Activity {
    public static void main(String[] args) {
        Dog aso = new Dog(); 

        aso.setName("tata");
        aso.setNumOfPuppies(4);
        
        // Adding names for the puppies
        String[] puppyNames = {"Buye", "Busangot", "Riel", "Maacm"};
        aso.setPuppyNames(puppyNames);

        System.out.println("Dog's name: " + aso.showName());
        aso.bark();
        System.out.println(aso.showNumberofPuppies());
        aso.showPuppies();
    }
}
