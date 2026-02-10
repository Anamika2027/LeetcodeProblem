class MyLinkedList{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;

    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    Node insertAtStart(Node head, int data){
        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
    }

    Node insertAtLast(Node head,int data){
        Node newNode= new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.head =list.insertAtStart(list.head,60);
        list.head =list.insertAtLast(list.head,70);
        list.display();
    }
}