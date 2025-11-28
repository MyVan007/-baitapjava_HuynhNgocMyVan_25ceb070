package bai6_2;

public class Main{
        public static void main(String[] args) {
            GeometricObject circle = new Cricle(2.0);
            GeometricObject rectangle = new Rectangle(4.0, 6.0);

            System.out.println(circle.toString());
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());

            System.out.println();

            System.out.println(rectangle.toString());
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());
        }


}
