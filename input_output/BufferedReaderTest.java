package input_output;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("myAccount.txt"));
            BankAccount ba = new BankAccount();
            ba.setOwnerName(in.readLine());
            ba.setAccountNumber(Integer.parseInt(in.readLine()));
//            in.read();
            ba.deposit(Float.parseFloat(in.readLine()));
            in.close();
            System.out.println(ba);
            System.out.println(ba.getOwnerName() + " " + ba.getAccountNumber() + " " + ba.getBalance());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
