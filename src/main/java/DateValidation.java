import java.util.Scanner;

public class DateValidation {
    /*public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        boolean result = isValidDate(day, month, year);
        System.out.println(result);

    }*/

    public static boolean isValidDate(int day, int month, int year) {
    	System.out.println("hello");
        if (!validDate(day))
            return false;

        if (!validMonth(month))
            return false;

        if (!validYear(year))
            return false;

        if (!validCombination(day, month, year))
            return false;

        return true;
    }

    public static boolean validDate(int day) {
        if (day >= 1 && day <=31)
            return true;

        return false;
    }

    public static boolean validMonth(int month) {
        if (month >= 1 && month <=12)
            return true;

        return false;
    }

    public static boolean validYear(int year) {
        if (year >= 1950 && year <= 2020)
            return true;

        return false;
    }

    public static boolean validCombination(int day, int month, int year) {
        if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11))
            return false;

        if (day == 30 && month == 2)
            return false;

        if (day == 29 && month == 2 && (!leapYear(year)))
            return false;

        return true;
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0)
            return true;

        return false;
    }

}
