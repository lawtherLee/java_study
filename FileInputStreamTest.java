import java.io.*;

public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("IOTest.txt");
            while (in.available() > 0) {
                System.out.print((char) in.read() + " ");
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot open file for reading");
        } catch (EOFException e) {
            System.out.println("Error: End of file reached");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}