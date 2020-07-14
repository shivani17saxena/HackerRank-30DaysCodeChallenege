import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.text.DecimalFormat;

public class SolutionplusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float len = arr.length, pos=0, neg=0, zer=0;
        for(int i=0; i<len ;i++){
            if(arr[i]<0){
                neg++;
            }
            else if (arr[i]>0){
                pos++;
            }
            else
            {
                zer++;
            }
        }
        //System.out.println("SOL ==" + len/10)
        DecimalFormat df = new DecimalFormat("#.######");
        //df.setRoundingMode(RoundingMode.CEILING);
        //(double)Math.round(value * 100000d) / 100000d;  df.format;  (Math.round((pos/len) * 1000000) / 100000)
        System.out.format("%.6f",(pos/len));
        System.out.format("\n%.6f",(neg/len));
        System.out.format("\n%.6f",(zer/len));

    //     double a = 123.00449678;
    // //double roundOff1 = Math.round(a*1000000)/1000000.00;
    // //double roundOff2 = Math.round(roundOff1*1000)/1000.00;
    // double roundOff = Math.round(a*1000000)/1000000.00;

    //System.out.format("%.6f",(pos/len));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
