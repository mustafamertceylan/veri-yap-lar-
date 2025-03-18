public class StackListe {
    Node head;
    public void initialize(int data){
        head.data=data;
        head.next=null;
    }
    public void pushStack(int data){
        Node newNode=new Node();
        newNode.data=data;
        Node temp=head;
        head.next=newNode;

    }
}
