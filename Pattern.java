import java.io.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pattern{
    public static void main(String[] args){
        // This will match a sequence of 1 or more uppercase and lowercase English letters as well as spaces
        String myRegExString = "[a-zA-Z\\s]+";

        // This is the string we will check to see if our regex matches:
        String myString = "The quick brown fox jumped over the lazy dog...";

        // Create a Pattern object (compiled RegEx) and save it as 'p'
        //Pattern p = Pattern.compile(myRegExString);
        Pattern p1 = Pattern.compile(myRegExString);

        // We need a Matcher to match our compiled RegEx to a String
        Matcher m = p.matcher(myString);

        // if our Matcher finds a match
        if( m.find() ) {
            // Print the match
            System.out.println( m.group() );
        }
    }
}