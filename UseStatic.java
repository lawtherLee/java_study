import java.text.DecimalFormat;

public class UseStatic {
    public static void main(String[] args) {
        System.out.println(Count.counter);
        Count c1 = new Count();
        Count c2 = new Count();


        System.out.println("c1:" + c1.getSerialNum());
        System.out.println("c2:" + c2.getSerialNum());
        System.out.println(Count.counter);

    }
}

class Count {
    public static int counter = 0;
    private int serialNum = 0;

    public Count() {
        counter++;
        serialNum = counter;
    }

    public int getSerialNum() {
        return serialNum;
    }
}