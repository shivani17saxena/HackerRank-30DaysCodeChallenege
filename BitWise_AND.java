import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BitWise_AND {

    static int calc(int n, int k){
        int cur = 0;

        for(int A=1; A<n; A++){
            for(int B=A+1; B<=n; B++){
                int ans = A & B;
                if(ans>cur && ans<k){
                    cur = ans;
                } 
            }
        }
        return cur;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            System.out.println(calc(n,k));
        }

        scanner.close();
    }
}
