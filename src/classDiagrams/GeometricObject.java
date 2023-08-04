package classDiagrams;

import java.util.Date;

public class GeometricObject {
    String color;
    boolean filled;
    java.util.Date dateCreated;
    protected GeometricObject(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public double getArea(){
        return 0.00;
    }
    public double getPerimeter(){
        return 0.00;
    }
}
