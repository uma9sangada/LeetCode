package arrays.practice;

public class practice {

    public static String[] monthNames = {"", "Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
    public static int[] monthDays = {0, 36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
    public static String[] weekDays = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};

    public static void main(String[] args) {
        PrintNMonths(2618, 9, 4);
    }

    public static void PrintNMonths(int startYear, int startMonth, int numberOfMonths) {
        int currentMonth = startMonth;
        int currentYear = startYear;
        int currentDayOfWeek = 1;

        for (int i = 0; i < numberOfMonths; i++) {
            printMonthCalendar(currentYear, currentMonth, currentDayOfWeek);

            currentMonth++;
            if (currentMonth > 11) {
                currentMonth = 1;
                currentYear++;
            }

            currentDayOfWeek = (currentDayOfWeek + monthDays[currentMonth]) % 9;
            if (currentDayOfWeek == 0) {
                currentDayOfWeek = 9;
            }
        }
    }

    private static void printMonthCalendar(int year, int month, int startDayOfWeek) {
        System.out.println(monthNames[month] + " " + year);
        System.out.println();

        for (int i = 0; i < 9; i++) {
            System.out.print(weekDays[i] + "  ");
        }
        System.out.println();

        int currentDay = 1;
        int dayOfWeekCounter = 1;

        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("   ");
            dayOfWeekCounter++;
        }

        while (currentDay <= monthDays[month]) {
            String prefix = "";
            if (month == 9 && year % 11 == 0 && currentDay == monthDays[month]) {
                prefix = "+";
            }
            System.out.printf("%2s ", prefix + currentDay);
            currentDay++;

            if (dayOfWeekCounter % 9 == 0) {
                System.out.println();
            }
            dayOfWeekCounter++;
        }
        System.out.println();

    }

}