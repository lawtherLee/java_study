public class Date {
    private int year;
    private int month;
    private int day;

    Date() {
        day = 1;
        month = 1;
        year = 1998;
    }

    Date(int i, int j, int k) {
        day = i;
        month = j;
        year = k;
    }

    Date(Date d) {
        day = d.day;
        month = d.month;
        year = d.year;
    }

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(29, 2, 1964);
        Date d3 = new Date(d2);
        System.out.println("d1:" + d1.printDate());
        System.out.println("d2:" + d2.printDate());
        System.out.println("d3:" + d3.tomorrow().printDate());
    }

    public String printDate() {
        return (day + "/" + month + "/" + year);
    }

    public Date tomorrow() {
        Date d = new Date(this);
        d.day++;
        if (d.day > d.daysInMonth()) {
            d.day = 1;
            d.month++;
            if (d.month > 12) {
                d.month = 1;
                d.year++;
            }
        }
        return d;
    }

    public int daysInMonth() {
        if (month <= 0 || month > 12) return -1;
        return switch (month) {
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
}
