import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//1st line cities, dlat, dlong
// lat, long, height, points
//printf points

public class Mission {

    int points = 0;

    static void eval(){

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nD_latD_long = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nD_latD_long[0]);

        int d_lat = Integer.parseInt(nD_latD_long[1]);

        int d_long = Integer.parseInt(nD_latD_long[2]);

        for (int nItr = 0; nItr < n; nItr++) {
            String[] latitudeLongitude = scanner.nextLine().split(" ");

            int latitude = Integer.parseInt(latitudeLongitude[0]);

            int longitude = Integer.parseInt(latitudeLongitude[1]);

            int height = Integer.parseInt(latitudeLongitude[2]);

            int points = Integer.parseInt(latitudeLongitude[3]);

            // Write Your Code Here
            
            
        }

        scanner.close();
    }
}
