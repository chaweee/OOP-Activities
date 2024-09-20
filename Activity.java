public class Activity {
    public static void main(String[] args) {
        Dog aso = new Dog("otit"); 

        aso.setName("tata");
        aso.setNumOfPuppies(4);
        System.out.println("Dog's name:  " + aso.showName());



        System.out.println(aso.showName());
        aso.bark();
        System.out.println(aso.showNumberofPuppies());


        for (int i = 0; i < aso.numOfPuppies; i++) {
            if (aso.doggy[i] != null) {
                System.out.println(aso.doggy[i]);
            }
        }
    }
}