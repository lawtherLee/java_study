import java.io.*;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("IOTest.txt");

            out.write('H');
            out.write(69);
            out.write(76);
            out.write('L');
            out.write('O');
            out.write('!');
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
