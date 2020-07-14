import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int max=0, min=0, i=1;
        int n = arr.length;
        for(int k=1; k<n ; k++){
            System.out.println(arr[k]);
            min= min + arr[k];
            max= max + arr[k];
        }
        System.out.println(" min and max:: "+ min + "  "+max);
        while(i<= n){
            //System.out.println("iteration:: "+ i);
            int count=0, j=0, min1=0, max1=0;
            while(count<4){
                if(j==i){
                    j++;
                    //System.out.println("j is skipping: "+ j);
                }
                else{
                    min1+= arr[j];
                    max1+= arr[j];
                    j++; 
                    count++;
                }
            }
            if(min1 < min){
                min= min1;
            }
            if(max1> max){
                max = max1;
            }
            i++;
        }
System.out.println(min + "  "+max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        System.out.println("Sending to function");
        miniMaxSum(arr);

        scanner.close();
    }
}
