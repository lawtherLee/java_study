import java.io.*;

public class ObjectSer implements Serializable {
    public static void main(String[] args) {
        Student2 stu = new Student2(111, "Amit", 23, "CSE");
        try {
            FileOutputStream fo = new FileOutputStream("f_data.ser");
            ObjectOutputStream so = new ObjectOutputStream(fo);
            so.writeObject(stu);
            so.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

