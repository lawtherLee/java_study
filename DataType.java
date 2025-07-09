public class DataType {
    public static void main(String[] args) {
        testContinue();
    }

    static int daysInMonth(int month) {
        if (month <= 0 || month > 12)
            return -1;
        if (month == 2)
            return 28;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        return 31;
    }

    static int daysInMonth2(int month) {
        int day;
        if (month <= 0 || month > 12)
            return -1;
        day = switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        return day;
    }

    static void testFor() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Are you finished yet");
        }
        System.out.println("Finally");
    }

    static void testContinue() {
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j > i) {
                    System.out.println();
                    continue out;
                }
                System.out.print("* ");
            }
        }
    }

}


