import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    
    public static void miniMaxSum(List<Integer> arr) {
        List<Long> data = new ArrayList<>();
        List<Long> hasil = new ArrayList<>();
        long hasilMax,hasilMin;

        for (int i = 0; i < arr.size(); i++) {
            data.add(Long.valueOf(arr.get(i)));
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                for (int a = j+1; a < arr.size(); a++) {
                    for (int k = a+1; k < arr.size(); k++) {
                        hasil.add(data.get(i) + data.get(j)+data.get(a) + data.get(k));
                    }
                }
            }
        }

        hasilMax = Collections.max(hasil);
        hasilMin = Collections.min(hasil);
        System.out.println(hasilMin +" "+hasilMax);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
