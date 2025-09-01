class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListDoubt {
    static Node head;
    static void insert(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static void printList(){
         if(head==null){
            System.out.println("null");
            return;
         }
         Node temp= head;
         while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
         }
         System.out.print("null");
         System.out.println();
    }
    static void insertMid(int data){
        Node newNode= new Node(data);
        Node slow=head;
        Node fast= head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        Node temp= slow.next;
        slow.next= newNode;
        newNode.next= temp;
    }
    public static void main(String[] args) {
        insert(2);
        insert(5);
        insert(3);
        insert(8);
        insert(9);
        printList();
        insertMid(4);
        printList();
    }
    
}
