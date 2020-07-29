import java.io.*;
import java.util.*;

public class Prime_Root_Complexity {

    public static String prime(int n){
        
        for(int i=2; i<= n/i; i++){
            if(n%i == 0){
                return "Not prime";
            }
        }
        return "Prime";
    } 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int num = 0, i=0;
        String[] arr = new String[T];
        while(T-->0){
            num = sc.nextInt();
            String s = prime(num);
            //System.out.println("Returned val: "+s);
            arr[i] = s;
            i++;
        }
        for(String str: arr){
            System.out.println(str);
        }
    }
}