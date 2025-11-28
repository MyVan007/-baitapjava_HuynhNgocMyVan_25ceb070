package bai5_2;

public class TestMain {

        public static void main(String[] args) {
            // Tạo một hình trụ mặc định
            Cylinder c1 = new Cylinder();
            System.out.println("Cylinder 1:");
            System.out.println("Radius = " + c1.getBase().getRadius());
            System.out.println("Color = " + c1.getBase().getColor());
            System.out.println("Height = " + c1.getHeight());
            System.out.println("Volume = " + c1.getVolume());

            System.out.println();

            // Tạo một hình trụ với tham số tùy chỉnh
            Cylinder c2 = new Cylinder(2.5, "blue", 5.0);
            System.out.println("Cylinder 2:");
            System.out.println("Radius = " + c2.getBase().getRadius());
            System.out.println("Color = " + c2.getBase().getColor());
            System.out.println("Height = " + c2.getHeight());
            System.out.println("Volume = " + c2.getVolume());
        }
    }

