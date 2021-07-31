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

    public double positive = 0;
    public double negative = 0;
    public double zeros = 0;
    private int mysize;

    private List<Integer> arr;

    public Result(List<Integer> arr) {
        this.arr = arr;
    }

    public void plusMinus() {
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else if (num == 0) {
                zeros++;
            }
        }

        mysize = arr.size();

        System.out.println(String.format("%.6f", (positive / Double.valueOf(mysize))));
        System.out.println(String.format("%.6f", (negative / Double.valueOf(mysize))));
        System.out.println(String.format("%.6f", (zeros / Double.valueOf(mysize))));
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());
        Result myRes = new Result(arr);
        myRes.plusMinus();

        bufferedReader.close();
    }
}
