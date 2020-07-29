import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class RegEx_Pattern {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String lc = "^[a-z]+";
        Pattern p1 = Pattern.compile(lc);
        String ec = "^[a-z]+@(gmail).com$";
        Pattern p2 = Pattern.compile(ec);
        List<String> fname = new ArrayList<String>();
        //String[] fname = new String[N];

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            Matcher m1 = p1.matcher(firstName);

            String emailID = firstNameEmailID[1];
            Matcher m2 = p2.matcher(emailID);
            
            if(m2.matches() && m1.find()){
                if(emailID.length()<=50 && firstName.length() <=20){
                fname.add(m1.group());
                }
            }
        }
        Collections.sort(fname);
        for(String s: fname){
            System.out.println(s);
        }

        scanner.close();
    }
}
