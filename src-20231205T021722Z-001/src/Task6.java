import java.util.*;
public class Task6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp  = InputHelper.getNonZeroLenString(scan, "Enter a string to be put in pretty header: ");
        InputHelper.prettyHelper(temp);
    }
}