import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinNum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Stack<Integer> s = new Stack<Integer>();
        int rem;
        while(n > 0){
            rem = n%2;
            n = n/2;
            s.push(rem);
        }
        int len = s.size();
        int c = 0, ct= 0;
        while(len>0){
            int i = s.pop();
            if(i==1){
              ct++;
            }
            else{
                ct = 0;
            }
            if(c < ct){
                c = ct;
            }
            len--;
        }
        System.out.println(c);
        scanner.close();
    }
}
