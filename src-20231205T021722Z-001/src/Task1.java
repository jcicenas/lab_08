import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Task1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String username = InputHelper.getNonZeroLenString(scan, "Enter Your Username");

        System.out.println("Your username is: " + username);
    }
}
