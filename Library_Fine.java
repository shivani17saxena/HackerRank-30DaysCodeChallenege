import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Library_Fine{

    //public static void calc (int D1, int D2,int M1,int M2,int Y1,int Y2){
      /*   int dl = D2 - D1;
        int yl = Y1 - Y2;
        int ml = M2 - M1;
 */
//    }

    public static void main(String[] args) throws ParseException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[][] dates = new String[2][3];
        String d1 = sc.nextLine();
        String d2 = sc.nextLine();
        dates[0] = d1.split(" ");
        dates[1] = d2.split(" ");
        
        /* int[][] arr = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = Integer.parseInt(dates[i][j]);
            }
        } */

        int Y1 = Integer.parseInt(dates[0][2]);
        int Y2 = Integer.parseInt(dates[1][2]);
        int M1 = Integer.parseInt(dates[0][1]);
        int M2 = Integer.parseInt(dates[1][1]);
        int D1 = Integer.parseInt(dates[0][0]);
        int D2 = Integer.parseInt(dates[1][0]);

        int fine;
        if(Y1 > Y2){ fine = 10000;}
        else if( M1 > M2 && (Y1 >= Y2)) { fine = 500*(M1-M2); } 
        else if( D1>D2 && (M1>=M2) && (Y1>=Y2)) { fine = 15 * (D1-D2); }
        else{
            fine = 0;
        }
        System.out.println(fine);
    }
}