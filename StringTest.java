import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String s = "Hello World";
        String t = s.toLowerCase();
        System.out.println(s.replace('l', 'o'));

        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.replace(0, 3, "aaa"));
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
