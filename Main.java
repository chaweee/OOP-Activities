public class Main {
    public static void main(String[] args) {
        // Create and display a Circle
        Circle circle = new Circle(2.5, "red", true);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Create and display a Rectangle
        Rectangle rectangle = new Rectangle(4.0, 2.0, "blue", false);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Create and display a Square
        Square square = new Square(3.0, "green", true);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}