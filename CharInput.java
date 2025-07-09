import java.io.*;

public class CharInput {
    public static void main(String[] args) throws IOException {
        String s;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        while ((s = in.readLine()) != null) {
            System.out.println("read " + s);
        }
    }
}
