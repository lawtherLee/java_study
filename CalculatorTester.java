import java.util.Arrays;

class Calculator {
    static int[][] matrix = new int[4][];


    public static double calculateAverage(int[] numbers) {

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static int findMaxNum(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

public class CalculatorTester {
    public static void main(String[] args) {

        for (int i = 0; i < Calculator.matrix.length; i++) {
            Calculator.matrix[i] = new int[5];
        }

        int[] numbers = {
                12, 45, 67, 23, 9, 55
        };

        System.out.println(Arrays.deepToString(Calculator.matrix));
        System.out.println(Calculator.calculateAverage(numbers));
        System.out.println(Calculator.findMaxNum(numbers));
    }
}