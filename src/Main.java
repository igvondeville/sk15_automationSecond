package lecture11;

public class Main {
    public static void main(String[] args) {
        shape shape = new shape();
        shape circle = new Circle(5);
        shape rectangle = new Rectangle(4, 6);

        shape.displayArea();
        circle.displayArea();
        rectangle.displayArea();
    }
}