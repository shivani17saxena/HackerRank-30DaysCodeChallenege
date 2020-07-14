import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SubSeq {

    static int squareSubsequences(String s) {
         int max = 0;
         int len = s.length();
         if(len == 1){
             max = 1;
         }
         else{
            for(int i = 1; i<=len; i++){
                int j=i+1;
                int k=i;
                int c = 0;
                while(j<=len){
                    if(s.charAt(k) == s.charAt(j)){
                        c++;
                        k++; j++;    
                    }
                    else {
                        k=i;
                    }
                    max = ((max > c)? max : c);
                }
            }
        }
        return max;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        /* for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();
            int result = squareSubsequences(s);
        } */
      //  int i1 = 0;
        //double d1 = 0.0;
        String s = "The best place!";
         String s1 = "";
        //i1 = sc.nextInt();
        //d1 = sc.nextDouble();
        s1 = sc.next();
        //s1.concat(" ");
        //s1 = s1.concat(s);
        System.out.println(s1 + " "+ s);

    }
}
