public class StackList {
    Node head=null;
    public void pushStack(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;
    }
    public int popStack(){
        int temp=head.data;
        head=head.next;
        return temp;
    }
}
