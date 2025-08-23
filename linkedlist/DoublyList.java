class DNode{
    int data;
    DNode prev, next;
    DNode (int data){
        this.data=data;
        this.prev=this.next=null;
    }
}
public class DoublyList {
    public DNode head;
    public DNode tail;
    public void append(int data){
        DNode newNode= new DNode(data);
        if(head==null){
            head=newNode;
            tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;

    }
    // HW: write the program for prepend
    public void displayFromStart(){
        if(head==null){
            System.out.println("null");
            return;
        }
        DNode temp= head;
        System.out.print("null<-");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp= temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    // home work displayFromEnd
    public static void main(String[] args) {
        DoublyList list= new DoublyList();
        list.append(1);
        list.append(3);
        list.append(5);
        list.displayFromStart();

    }
}
