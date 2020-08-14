package shapes;

import shapes.Circle;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input newInp = new Input();
//        double radius = newInp.getDouble();
//        Circle myCircle = new Circle(radius);
//        System.out.println(myCircle.getArea());
//        System.out.println(myCircle.getCircumference());
//        System.out.println("Would you like to make another circle?");
        int amtCircles = 1;

        do{
            double radius = newInp.getDouble();
            Circle myCircle = new Circle(radius);
            System.out.println("The area of your circle is " + myCircle.getArea() + "in");
            System.out.println("The circumference of your circle is " + myCircle.getCircumference() + "in");
            System.out.println("Number of circles made: "+ amtCircles++);
            System.out.print("Would you like to make another circle? [y/N]: ");
            newInp.yesNo();
        } while (newInp.yesNo());

    }
}
