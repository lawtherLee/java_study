public class Student {
    String name;
    int age;

    Integer obj1;
    int num1 = 69;
    Student[] array = new Student[10];

    public Student(String s, int n) {
        name = s;
        age = n;

    }

    public Student(String s) {
        this(s, 20);
    }

    public Student() {
        this("Unknow");
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.age);
        System.out.println(student.name);
    }
}
