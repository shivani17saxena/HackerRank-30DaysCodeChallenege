import java.io.*;
import java.util.*;

public class evenOddString {

    static void oddEven(String s){
        int len = s.length();
        for(int i=0; i<len; i+=2){
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        if(len>=1){
            for(int i=1; i<len; i+=2){
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       ArrayList<String> S = new ArrayList<>();
       for(int i=1; i<=T; i++){
           String str = sc.next();
           S.add(str);
       }

       for(String s : S){
           oddEven(s);  
           System.out.println(); 
       }

    }
}