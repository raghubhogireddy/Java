public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 1824));
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;
        int days = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
            case 2: days = isLeapYear(year) ? 29 : 28;break;
            case 4: case 6: case 9: case 11: days = 30; break;
        }
        return days;
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));
    }
}
