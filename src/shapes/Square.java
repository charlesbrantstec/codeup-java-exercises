package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(double side){
        super(side, side);
    }
    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter(){
        return (length + width) * 2;
    }


}
