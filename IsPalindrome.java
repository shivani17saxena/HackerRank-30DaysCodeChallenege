import java.io.*;
import java.util.*;

public class IsPalindromeSolution {
    // Write your code here.
    Stack<Character> stack = new Stack<Integer>();
    Queue<Character> q = new LinkedList<>();
    
    public void pushCharacter(char ch){
        stack.push(ch);
    }

    public void enqueueCharacter(char ch){
        q.add(ch);
    }

    public char popCharacter(){
        char c = (Character) stack.pop();
        return c;
    }

    public char dequeueCharacter(){
        char c = q.remove();
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a IsPalindromeSolution object:
        IsPalindromeSolution p = new IsPalindromeSolution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}