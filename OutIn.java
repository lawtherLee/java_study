import java.text.DecimalFormat;
import java.util.Scanner;

public class OutIn {
    public static void main(String[] args) {
        int age;
        double weight, height, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入年龄：");
        age = scan.nextInt();
        System.out.print("请输入您的体重（kg）：");
        weight = scan.nextDouble();
        System.out.print("请输入您的身高（m）：");
        height = scan.nextDouble();
        bmi = weight / (height * height);
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println("BMI:" + fmt.format(bmi));
    }
}
