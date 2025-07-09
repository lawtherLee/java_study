interface Shape2D {
    double pi = 3.14;

    double area();
}

class Circle implements Shape2D {
    double radios;

    public Circle(double r) {
        radios = r;
    }

    public double area() {
        return pi * radios * radios;
    }

}

class Rectangle implements Shape2D {
    double width;
    double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double area() {
        return width * height;
    }
}

public class InterfaceTester {
    public static void main(String[] args) {
        Shape2D test = new Circle(10);
        System.out.println(test.area());

        Rectangle rect = new Rectangle(10, 20);
        System.out.println(rect.area());

        Circle circle = new Circle(10);
        System.out.println(circle.area());
    }
}