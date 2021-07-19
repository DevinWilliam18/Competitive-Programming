//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> numbers = new HashMap<>();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            numbers.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            boolean results = numbers.containsKey(s);
            if (results) {
                System.out.println(s + "=" + numbers.get(s));
            } else {
                System.out.println("Not found");
            }
        }
	}
}



