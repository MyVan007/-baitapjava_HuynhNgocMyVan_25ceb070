package bai5_2;

public class Cylinder {

        private Cricle base;
        private double height;

        public Cylinder() {
            base = new Cricle();  // composition: tạo Circle bên trong Cylinder
            height = 1.0;
        }

        public Cylinder(double radius, String color, double height) {
            base = new Cricle(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public Cricle getBase() {
            return base;
        }

        public double getVolume() {
            return base.getArea() * height;
        }
    }

