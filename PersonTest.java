import java.util.Vector;

class Person {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

abstract class Employee extends Person {
    public String employeeNumber;

    int salary;

    int basic = 2000;

    abstract void salary();

    String getDetails() {
        return name + " " + salary;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

}

class Manager extends Employee {
    public String department;
    public Vector<String> responsibilities;

    public Vector<String> getResponsibilities() {
        return responsibilities;
    }

    public String getDepartment() {
        return department;
    }

    protected String getDetails() {
        return name + " " + department;
    }

    // 新增方法，用于调用父类的 getDetails() 方法
    public String getEmployeeDetails() {
        return super.getDetails();
    }

    void salary() {
        salary = basic + 1000;
        System.out.println(salary);
    }
}


class Car {
    int num = 12345;
}

public class PersonTest {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.name = "Tom";
        ((Manager) e).department = "IT";
        e.employeeNumber = "12345";
        System.out.println(e.getEmployeeNumber());
        System.out.println(((Manager) e).getDepartment());
        System.out.println(e.getDetails());
        System.out.println(((Manager) e).getEmployeeDetails());
        Car car = new Car();
        System.out.println(car.num);
        car.num = 11111;
        System.out.println(car.num);

        e.salary();
    }
}
