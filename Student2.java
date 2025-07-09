import java.io.Serializable;

public class Student2 implements Serializable {
    String name;
    int age;
    String department;
    int id;

    public Student2(int id, String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.id = id;
    }

}
