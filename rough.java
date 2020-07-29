/* //static HashMap<Integer, String> hmap = new HashMap<>();
public static Node removeDuplicates(Node head) {
    //Write your code here
    String val = "1";
    HashSet<Integer> hmap = new HashSet<Integer>();
    Node list = null;
    Node top = null;

    if(head != null){
        hmap.put(head.data, val);
        list = head;
        list.next = null;
        top = list;      
    }
    Node cur = head.next;
    while(cur != null){
        if(hmap.containsKey(cur.data)){
            boolean cont = hmap.containsKey(cur.data);
            System.out.println("Duplicate val: "+ cur.data);
            cur = cur.next;
        }
        else{
            hmap.put(cur.data, val);
            Node temp = new Node(cur.data);
            list.next = temp;
            temp = null;
            cur = cur.next;
        }
    }
    Node ntop = top;
    System.out.println();
    while(ntop!=null){
        System.out.print(ntop.data+" ");
        ntop = ntop.next;
    }
    return top;
  } */