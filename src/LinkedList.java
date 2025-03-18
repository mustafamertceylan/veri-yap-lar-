import java.util.Scanner;

public class LinkedList {
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

    public void PrintList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public void ListeDoldur(int sayac){
        Scanner girdi=new Scanner(System.in);
        int temp;
        int sistemSayacı=0;
        temp=girdi.nextInt();
        initialize(temp);
        temp=0;
        while(sistemSayacı<sayac-1){
            temp=girdi.nextInt();
            addElementToTail(temp);
            sistemSayacı++;
            temp=0;
        }
    }

    public void turnList(int findex,int lindex){
        StackList stackList=new StackList();
        Node temp=head;
        for(int i=0;i<findex;i++){
            temp=temp.next;
        }
        Node start = temp;
        for(int i=findex;i<=lindex;i++){
            stackList.pushStack(temp.data);
            temp=temp.next;
        }
        temp=start;
        for(int i=findex;i<=lindex;i++){
            temp.data=stackList.popStack();
            temp=temp.next;
        }


    }

}

