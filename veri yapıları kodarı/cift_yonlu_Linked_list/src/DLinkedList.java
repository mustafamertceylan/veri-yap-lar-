public class DLinkedList {
    Node head=null;
    public void initialize(int data){
        head=new Node();
        head.data=data;
        head.next=null;
        head.prev=null;
    }

    public void addElementToTail(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    public void addElementToBegin(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.prev=null;
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
    }

    public void deleteElement(int data){
        Node temp=head;
        if(temp.data==data){
            temp=temp.next;
            head=temp;
            head.prev=null;
            return;
        }

        while(temp!=null && temp.data!=data){
            temp=temp.next;
        }
        if (temp==null){
            System.out.println("Silinecek eleman listede bulunamadı...");
            return;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
            return;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }

    }

    public void PrintList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("Null");
    }

}
