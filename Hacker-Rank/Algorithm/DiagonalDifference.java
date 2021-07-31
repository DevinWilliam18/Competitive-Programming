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

    private int diagonal1 = 0, diagonal2 = 0;
    private List<List<Integer>> arr;
    public Result(List<List<Integer>> arr){
        this.arr = arr;
    }
    public int diagonalDifference() {
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            // Diagonal 1
            diagonal1 += arr.get(i).get(i);
            
                // Diagonal2
            diagonal2 += arr.get(i).get(arr.size() - 1 - i);
        }
        return diagonal1 - diagonal2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Result rs = new Result(arr);
        int result = Math.abs(rs.diagonalDifference());

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
