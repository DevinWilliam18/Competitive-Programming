import java.util.*;


public class BirthdayCakeCandles {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int counts = 1;
        int pjg = sc.nextInt();

        
        sc.nextLine();
         
        String[] inputan = sc.nextLine().split(" ");
        

        int[] arr = new int[pjg];

        for (int i = 0; i < inputan.length; i++) {
            int sementara = Integer.parseInt(inputan[i]);
            arr[i] = sementara;
        }


        Arrays.sort(arr);

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == arr[i-1]) {
                counts++;
            }else{
                break;
            }
        }
        System.out.println(counts);
    }
    
}
