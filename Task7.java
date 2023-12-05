import java.util.HashSet;
import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        tablePrint(convertInputToHashSet(scan, "Enter Degree Celsius Values: "));

    }

    public static double CtoF(double celsius){
        double fahrenheit = ((celsius * (9.0/5.0)) + 32);
        return fahrenheit;
    }

    private static HashSet<Double> convertInputToHashSet(Scanner in, String prompt){
        boolean sentinel = true;
        HashSet<Double> fHashSet = new HashSet<>();
        while (sentinel) {
            System.out.println(prompt + "\n(Enter N to end)" );
            String temp = in.nextLine();
            if (temp.equalsIgnoreCase("n")) {
                sentinel = false;                
            }else{
                try{
                    double temp2 = Double.parseDouble(temp);
                    fHashSet.add(temp2);
                }catch(Exception e){
                    //catches null pointer exception and number format exception
                    System.out.println("Not a double try again: ");
                    continue;
                }
                
            }
        }
        return fHashSet;
    }

    private static void tablePrint(HashSet<Double> inputValues){
        HashMap<Double, Double> tableValues = new HashMap<>();

        for (Double double1 : inputValues) {
            tableValues.put(double1, CtoF(double1));
        }
        System.out.println("Celsius" + "       " + "Fahrenheit");
        for (Map.Entry<Double, Double> entry : tableValues.entrySet()) {
            System.out.println(entry.getKey() + "         " + entry.getValue());
        }
    }
}


