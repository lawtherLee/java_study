import java.util.Vector;

public class VectorTest {

    static Vector<String> removeStr() {
        Vector<String> strVector = new Vector<String>(100);
        for (int i = 0; i < 10; i++) {
            strVector.addElement("welcome");
            strVector.addElement("to");
            strVector.addElement("beijing");
        }
        return strVector;
    }

    public static void main(String[] args) {
        Vector<Double> myVector = new Vector<Double>();
        for (int i = 0; i <= 10; i++) {
            myVector.addElement(Math.random());
        }
        // 将指定组件添加到末尾
        myVector.addElement(1d);
        // 将指定对象作为组件添加到指定index处
        myVector.insertElementAt(1.0, 0);
        // 在指定位置插入指定元素
        myVector.add(1, 1d);

        Vector<String> strVector = removeStr();
        System.out.println(strVector);
        while (strVector.removeElement("to")) ;

        System.out.println(strVector);

    }
}
