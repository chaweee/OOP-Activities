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

class Dog {
    String name;
    boolean isMale; 
    int numOfPuppies; 
    String[] puppyNames;

    public Dog() {
        this.name = "";
        this.numOfPuppies = 0;
        this.puppyNames = new String[0]; // Initialize puppyNames
    }

    public String setName(String name) {
        return this.name = name; 
    }

    public String showName() {
        return this.name;
    }
    
    public void setNumOfPuppies(int numOfPuppies) { 
        this.numOfPuppies = numOfPuppies;
    }
    
    public String showNumberofPuppies() {
        return name + " has " + numOfPuppies + " puppies.";
    }
    
    public void setPuppyNames(String[] names) {
        this.puppyNames = names;
    }
    
   public void showPuppies() {
    System.out.println(name + "'s puppies are:");
    for (int i = 0; i < puppyNames.length; i++) {
        System.out.println(puppyNames[i]);
    }
    }

    public void bark() {
        System.out.println("Woof!");
    }
    }
