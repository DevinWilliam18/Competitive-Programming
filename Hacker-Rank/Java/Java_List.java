import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
     Scanner in = new Scanner(System.in);
        List<Integer> angka = new ArrayList<Integer>();
        int i = 0;
        int panjang = in.nextInt();
        
        
        for (int j = 0; j < panjang; j++) {
            int coba = in.nextInt();
            angka.add(coba);
        }
            
        int banyak_query = in.nextInt();
        
        for (i = 0; i < banyak_query; i++) {
            String pilih = in.next();
            if (pilih.equals("Insert")) {
                int indeks = in.nextInt();
                int nilai = in.nextInt();
                angka.add(indeks, nilai);
            }
            if (pilih.equals("Delete")) {
                int i_delete = in.nextInt();
                angka.remove(i_delete);
            }
        }
            
        for (int j = 0; j <angka.size() ; j++) {
            System.out.print(angka.get(j)+ " ");
        }
     
    }
}
