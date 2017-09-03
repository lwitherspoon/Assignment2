/**
    Program to convert given minutes to years and days
    @author Laura Witherspoon
    Assignment 2.7
    Date: 8/28/2017
 */

import java.util.Scanner;

public class Minutes {

    private static final int MINUTES_PER_DAY = 24 * 60;
    private static final int MINUTES_PER_YEAR = MINUTES_PER_DAY * 365;

    /**
     * Displays specified minutes in years and days
     * @param original_minutes the number of minutes input by user
     * @param years the converted number of years
     * @param days the converted number of days
     * @return a string displaying the conversion of minutes to years and days
     */
    static String displayMinutesConversion(int original_minutes, int years, int days) {
        return original_minutes + " minutes is approximately " + years + " years and " + days + " days.";
    }

    public static void main(String[] args) {

        int years = 0, days, original_minutes, minutes;

        System.out.print("Please enter the number of minutes to be converted to years and days: ");
        Scanner keyboard = new Scanner(System.in);
        original_minutes = keyboard.nextInt();

        // convert minutes provided to years and days
        if (original_minutes >= MINUTES_PER_YEAR) {
            years = original_minutes / MINUTES_PER_YEAR;
            minutes = original_minutes % MINUTES_PER_YEAR;
            days = minutes / MINUTES_PER_DAY;
        }
        else {
            days = original_minutes / MINUTES_PER_DAY;
        }

        System.out.println(displayMinutesConversion(original_minutes, years, days));

    }
}
