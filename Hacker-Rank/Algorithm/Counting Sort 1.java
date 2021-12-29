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

    public static List<Integer> countingSort(List<Integer> numList) {
            
            //Initialize count array with all zeros
            List<Integer> countArr = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                countArr.add(0);
            }

            //Store the countArr of each element
            for (int i = 0; i < numList.size(); i++) {
                int temp = countArr.get(numList.get(i));
                countArr.set(numList.get(i), temp+1);
            }


            //Store cummulative sum of the given array
            return countArr;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}
