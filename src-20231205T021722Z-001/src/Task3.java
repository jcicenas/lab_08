import java.util.*;
public class Task3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "Enter your birth year: ", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "Enter your birth month: ", 1, 12);
        int day = InputHelper.getRangedInt(scan, "Enter your birth day: ", 1, 31);
        int hour = InputHelper.getRangedInt(scan, "Enter your birth hour: ", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "Enter your birth minute: ", 1, 59);
        System.out.println("You were born on " + year + month + day + hour + minute);
    }
}