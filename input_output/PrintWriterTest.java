package input_output;

import java.io.*;

public class PrintWriterTest {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("myAccount.txt"));
            BankAccount ba = new BankAccount("John", 123456);
            out.println(ba.getOwnerName());
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}

class BankAccount {
    private int accountNumber;
    private float balance;
    private String ownerName;

    BankAccount() {
        this.ownerName = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0f;
    }

    BankAccount(String ownerName, int accountNumber) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;

    }

    BankAccount(String ownerName, int accountNumber, float balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getOwnerName() {
        return ownerName;
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    float getBalance() {
        return balance;
    }

    void setBalance(float balance) {
        this.balance = balance;
    }

    void deposit(float amount) {
        balance += amount;
    }
}