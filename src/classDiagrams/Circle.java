package classDiagrams;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(){ }
    public Circle(double r){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter(){
        return radius*2;
    }
}
