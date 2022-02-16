import java.io.*;
import java.util.*;



public class Solution {
    public static int findMax(int[][] param) {
        
        int max = param[0][0];
        for (int i = 0; i < param.length; i++) {
            for (int j = 0; j < param.length; j++) {
                if (param[i][j] > max) {
                    max = param[i][j];
                }        
            }
            
        }

        return max;
    }

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        //result : 4x4
        int[][] result = new int[4][4];
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();        
            }
        }

        //calculation
        //i
        for (int i = 1; i < arr.length - 1; i++) {
            //j
            for (int j = 1; j < arr.length - 1; j++) {
                
                int temp = 0;
                for (int a = j-1; a <j+2; a++) {
                    temp += arr[i-1][a];
                }
                for (int b = j; b < j+1; b++) {
                    temp += arr[i][b];
                }
                for (int c = j-1; c < j+2; c++) {
                    temp += arr[i+1][c];
                }
                result[i-1][j-1] = temp;
            }
        }


        System.out.println(findMax(result));
    }
}
