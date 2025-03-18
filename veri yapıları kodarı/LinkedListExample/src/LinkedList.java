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
        if(findex==lindex){
            return;
        }
        Node temp1=head;
        int tempData;
        for(int i=1;i<= findex ;i++){
            temp1=temp1.next;
        }
        tempData=temp1.data;

        Node temp2=head;
        int temp2Data;
        for(int i=1;i<= lindex ;i++){
            temp2=temp2.next;
        }
        temp2Data=temp2.data;

        temp1.data=temp2Data;
        temp2.data=tempData;

        turnList(findex+1,lindex-1);
    }

}

