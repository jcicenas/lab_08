import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = InputHelper.getInt(scan, "Enter your favorite int: ");
        double y = InputHelper.getDouble(scan, "Enter your favorite double: ");
        System.out.print("Your favorite int is: " + x);
        System.out.print("Your favorite double is: " + y);
    }
}
