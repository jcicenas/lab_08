import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0.0;
        boolean getYNConfirm = true;
        do {
            double price = InputHelper.getRangedDouble(scan, "Enter the price of your goods: ", 0.50, 10.00);
            getYNConfirm = InputHelper.getYNConfirm(scan, "Enter y/n to stop or go again");
            total = total + price;
        } while (getYNConfirm);
        System.out.println("Your total is: " + total);
    }
}
