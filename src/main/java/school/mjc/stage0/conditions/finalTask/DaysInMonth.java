package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if (year > 1900 && year <= 2024 && month > 0 && month <= 12) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    System.out.println(31);
                }
                case 4, 6, 9, 11 -> {
                    System.out.println(30);
                }
                default -> {
                    if (year == 2000 || year == 2004 || year == 2008 || year == 2012 || year == 2016 || year == 2020
                    || year == 2024) {
                        System.out.println(29);
                    } else {
                        System.out.println(28);
                    }
                }
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
