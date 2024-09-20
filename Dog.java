class Dog {
    String name;
    boolean isMale; 
    int numOfPuppies; 
    Dog[] doggy = new Dog[0]; 

    public Dog(String name){
        this.name = name;
        this.numOfPuppies = 0;
        doggy = new Dog[0];

    }
    
    public String showName() {
        return this.name;
    }
    public Dog[] setPuppies(Dog[] puppiess) {
        return this.doggy = puppiess;
    }
    
    public String setName(String name) {
       return this.name = name; 
    }
    
    public void setNumOfPuppies(int numOfPuppies) { 
        this.numOfPuppies = numOfPuppies;
    }

    public String showNumberofPuppies() {
        return name + " has " + numOfPuppies + " puppies.";
    }
    public void bark() {
        System.out.println("Woof!");

    }
    
}
