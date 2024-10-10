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
