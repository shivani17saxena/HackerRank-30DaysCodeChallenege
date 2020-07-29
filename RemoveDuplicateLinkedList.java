import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class RemoveDuplicateLinkedList
{
    static HashSet<Integer> hmap = new HashSet<Integer>();    
    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node dup = null;
        Node fll = null;
        while(head != null){
            if(!hmap.contains(head.data)){
                hmap.add(head.data);
                if(dup == null){
                    dup = new Node(head.data);
                    fll = dup;
                }
                else{
                    Node cur = new Node(head.data);
                    dup.next = cur;
                    dup = dup.next;
                    cur = null;
                }
            }
            head = head.next;
        }
     return fll;
    }

	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }