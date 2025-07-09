import java.io.*;

public class ObjectRecov implements Serializable {
    public static void main(String[] args) {
        Student2 stu = null;
        try {
            FileInputStream fi = new FileInputStream("f_data.ser");
            ObjectInputStream si = new ObjectInputStream(fi);
            stu = (Student2) si.readObject();
            si.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (stu != null)
            System.out.println(stu.id + " " + stu.name + " " + stu.age + " " + stu.department);
    }
}
