class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class doublyLinkedList {
    Node head;

    doublyLinkedList(){

        head=new Node(0);
        Node curr=head;
        for(int i=1;i<6;i++){
            Node newNode=new Node(i);
            curr.next=newNode;
            newNode.prev=curr;
            curr=newNode;
        }
    }

    void deleteAtStart(){

        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        head.prev=null;
    }

    void deleteAtLast(){
        

    }

    void deleteNodeAtPos(int p,int x){

    }

    void printList(){

        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        doublyLinkedList list=new doublyLinkedList();
        list.printList();
    }
}
