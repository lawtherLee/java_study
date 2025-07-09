public class PassValueTest {
    private float ptValue;

    public static void main(String[] args) {
        String str;
        int val;
        PassValueTest pt = new PassValueTest();
        val = 11;
        pt.changeInt(val);
        System.out.println(val);
        str = "hello";
        pt.changeStr(str);
        System.out.println(str);

        pt.ptValue = 101f;
        pt.changeObjValue(pt);
        System.out.println(pt.ptValue);

    }

    public void changeInt(int value) {
        value = 55;
    }

    public void changeStr(String value) {
        value = "different";
    }

    public void changeObjValue(PassValueTest ref) {
        ref.ptValue = 99f;
    }
}
