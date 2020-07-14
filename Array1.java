import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Array1 {

    public static void diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int i=0, s1=0, s2=0; int n = arr.size();
    System.out.println(n);
    while(i<n){
        s1 = s1 + arr.get(i).get(i);
        i++;
    }
    i=0; int j=n-1;
    while(i<n && j>=0){
        s2 = s2 + arr.get(i).get(j);
        i++;j--;
    }
    System.out.println(s1);
    System.out.println(s2);
    int s = Math.abs(s1-s2);
    System.out.println(s);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        //int result = 
        diagonalDifference(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}