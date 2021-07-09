import java.text.*;
import java.util.*;


public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        try {
            Locale india = new Locale("en", "IN");

            NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat i = NumberFormat.getCurrencyInstance(india);
            NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            System.out.println("US: " + u.format(payment));
            System.out.println("India: " + i.format(payment));
            System.out.println("China: " + c.format(payment));
            System.out.println("France: " + f.format(payment));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
