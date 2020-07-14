import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TurnPages {

    /*
     * Complete the pageCount function below.
     */
    static void pageCount(int n, int p) {
        boolean front=false;
        front = ((n-p) > (p-1))?true : false;
        //System.out.println(s);

        if(front){
            int c = 0;
            for(int i=1; i<p; i+=2){
                c++;
            }
            System.out.println(c);
        }
        else{
            int c = 0;

            if(n-p==1 && n%2!=0) 
                System.out.println(c);
            else{
                    if(n%2 == 0){
                        for(int i=n; i>p; i-=2){
                            c++;
                        }
                        System.out.println(c);
                    }
                    else{
                        for(int i=n; i-p>1; i-=2){
                            c++;
                        }
                        System.out.println(c);
                    }
                }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        //int result = 
        pageCount(n, p);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
