package bai6_2;

public class Cricle implements GeometricObject {
    private double radius;

    public Cricle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI * radius*radius;
    }
    public double getPerimeter(){
        return 2* Math.PI * radius;
    }


    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                '}';
    }
}
