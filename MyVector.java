import java.util.Vector;

public class MyVector extends Vector<Object> {
    public MyVector() {
        super(1, 1);
    }

    public static void main(String[] args) {
        MyVector v = new MyVector();

        int digit = 5;
        float real = 3.14f;
        char[] letters = {'a', 'b', 'c', 'd'};
        String s = "Hello";

        v.addInt(digit);
        v.addFloat(real);
        v.addString(s);
        v.addCharArray(letters);
        v.printVector();
    }


    public void addInt(int i) {
        addElement(i);
    }

    public void addFloat(float f) {
        addElement(f);
    }

    public void addString(String s) {
        addElement(s);
    }

    public void addCharArray(char[] c) {
        addElement(c);
    }

    public void printVector() {
        System.out.println("Vector contains " + size() + " elements");
        for (Object o : this) {
            if (o instanceof char[]) {
                System.out.println(String.copyValueOf((char[]) o));
            } else {
                System.out.println(o.toString());
            }
        }
    }
}
