class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyList {
    public Node head;
    public void append(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("null");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void prepend(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void delete(int data){
        // 1. check if list is empty
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        // 2. want to delete first value 
        if(head.data==data){
            head=head.next;
            return;
        }
        Node temp= new Node(0);
        temp.next=head;
        while(temp.next!=null&&temp.next.data!=data){
            temp= temp.next;
        }
        // 3. check if value does not exist
        if(temp.next==null){
            System.out.println("data does not found");
            return;
        }
        // 4. deleting the value from mid or last
        temp.next= temp.next.next;
    }
    public static void main(String[] args) {
        // Node list= new Node(1);
        // System.out.println(list.data);
        SinglyList list= new SinglyList();
        // delete from empty list
        list.delete(3);
        list.append(1);
        list.append(2);
        list.append(3);
        list.prepend(0);
        list.display();
        // delete the head
        list.delete(0);
        list.display();
        // delete from the mid
        list.delete(2);
        list.display();
        // delete from last
        list.delete(3);
        list.display();
        // trying to delete something which is not available
        list.delete(4);
    }
}
