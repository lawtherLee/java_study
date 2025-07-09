import java.text.DecimalFormat;

public class CircumferenceTester {
    public static void main(String[] args) {

        Circle1 c1 = new Circle1();
        c1.setRadius(50);

        Circle1 c2 = new Circle1();
        c2.setRadius(10);

        double circum1 = c1.circumference();
        double circum2 = c2.circumference();

        DecimalFormat fmt = new DecimalFormat("0.#");

        System.out.println("c1:" + fmt.format(circum1));
        System.out.println("c2:" + fmt.format(circum2));

    }
}

class Circle1 {
    static double PI = 3.14159;
    private int radius;

    public double circumference() {
        return 2 * PI * radius;
    }

    public void setRadius(int r) {
        radius = r;
    }
}