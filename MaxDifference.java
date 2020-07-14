import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class MaxDifference {
  	private int[] elements;
  	public int maximumDifference;

    MaxDifference(int arr[]){
        this.elements = arr;
        this.difference();
        /* for(int j=0; j<arr.length; j++){
            System.out.print(elements[j]+" ");
        } */
    }

    public void difference(){
        this.maximumDifference = 0;
        for(int j=0; j<elements.length-1; j++){
            int diff = 0;
            for(int k = j+1; k<elements.length; k++){
                diff = Math.abs(elements[j]-elements[k]);
                if(diff > maximumDifference){
                    maximumDifference = diff;
                }
            }
        }
        System.out.println(maximumDifference);
    }

    // Add your code here
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //MaxDifference m = new MaxDifference(arr);
        new MaxDifference(arr);
        //m.difference();
    }
    


} // End of Difference class