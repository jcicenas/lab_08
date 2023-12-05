import java.util.*;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = InputHelper.getRegExString(scan, "Enter Your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You entered the SSN: " + ssn);
        String number = InputHelper.getRegExString(scan, "Enter your student M number", "(M|m)\\d{5}");
        System.out.println("You entered the number: " + number);
        String menu = InputHelper.getRegExString(scan, "Menu: O - open S - save V - view Q - quit", "[OoSsVvQq]");
        System.out.println("You Chose: " + menu);
    }
}
