//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class PhoneBook{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("No of entry:: ");
        int n = in.nextInt();
        HashMap<String, Integer> dic = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            System.out.println(i);
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dic.put(name,phone);
        }


        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dic.get(s)!=null){
                System.out.println(dic.get(s));
            }
            else{
                System.out.println("Not Found");
            }
        }
        in.close();
    }
}