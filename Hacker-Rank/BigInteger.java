
import java.util.Scanner;
import java.util.regex.*;



public class BigInteger {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        java.math.BigInteger ai = sc.nextBigInteger();
        java.math.BigInteger bi = sc.nextBigInteger();
        java.math.BigInteger sum =ai.add(bi);
        java.math.BigInteger mul =ai.multiply(bi);
        System.out.println(sum);
        System.out.println(mul);
       
        
        
        
            
       }
}
