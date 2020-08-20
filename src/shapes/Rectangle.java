package shapes;

public class Rectangle extends Quadrilateral implements Measureable {

//    protected double length;
//    protected double width;
//
////    //constructor
//    public Rectangle(double length, double width){
////        this.length = length;
////        this.width= width;
//        super(length, width);
//    }
////
////    public double getArea(){
////        return length * width;
////    }
////
////    public double getPerimeter(){
////        return (length + width) * 2;
////    }

    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    public void setWidth(double width) {
        this.width = this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = this.width =  length;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;

    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

}
