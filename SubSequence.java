import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SubSequence {

    /*
     * Complete the squareSubsequences function below.
     */
    static int squareSubsequences(String s) {
        /*
         * Write your code here.
         */
         int count;
         HashMap<Character, Integer> alphaCounts = new HashMap<Character, Integer>();
         for(int i=0; i<s.length(); i++){
             char c = s.charAt(i);
             if(alphaCounts.containsKey(c)){
                 alphaCounts.put(c, alphaCounts.get(c)+1);
             }
             else{
                 alphaCounts.put(c, 1);
             }
         }
         System.out.println("hashmap: " + alphaCounts);
return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        //Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            int result = squareSubsequences(s);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

//        bufferedWriter.close();
    }
}
