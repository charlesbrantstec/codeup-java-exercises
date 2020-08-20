package shapes;

public class ShapesTest {

    public static void main(String[] args){
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("The perimeter of box1 is " + box1.getArea());
//        System.out.println("The area of box1 is " + box1.getPerimeter());
//
//        Square box2 = new Square(5);
//        System.out.println("The perimeter of box2 is " + box2.getArea());
//        System.out.println("The area of box2 is " + box2.getPerimeter());
        Measureable myShape;
        myShape = new Square(9);
        System.out.printf("The area of your new square is: %f - The perimeter is: %f\n", myShape.getArea(), myShape.getPerimeter());
        myShape = new Rectangle(2,9);
        System.out.printf("The area of your new rectangle is: %f - The perimeter is: %f\n", myShape.getArea(), myShape.getPerimeter());
    }
}
