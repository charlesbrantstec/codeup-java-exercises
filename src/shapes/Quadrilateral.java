package shapes;

abstract class Quadrilateral extends Shape implements Measureable{

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public abstract void setWidth(double width);
    public abstract void setLength(double length);

}
