public class TableTester {
    public static void main(String[] args) {
        int[][] myTable = {
                {1, 2, 3, 4, 5, 5, 10000},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30}
        };

        int sum, max, maxRow = Integer.MIN_VALUE;
        max = Integer.MIN_VALUE;

        for (int row = 0; row < myTable.length; row++) {
            sum = 0;
            for (int col = 0; col < myTable[row].length; col++) {
                sum += myTable[row][col];

                if (sum > max) {
                    max = sum;
                    maxRow = row;
                }
            }
        }
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        String s = new String(chars);
        
        System.out.println(s);
        System.out.println("Row " + maxRow + " has the max sum of " + max);
    }
}
