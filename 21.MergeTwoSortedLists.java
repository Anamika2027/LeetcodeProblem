import java.util.Scanner;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                current.next=list1;
                list1=list1.next;
            }else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1!=null){
            current.next=list1;
        }else{
            current.next=list2;
        }
        return dummy.next;
    }

    public void printList(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        ListNode head1=new ListNode(sc.nextInt());
        ListNode current=head1;
        for(int i=1;i<n1;i++){
            current.next=new ListNode(sc.nextInt());
            current=current.next;
        }
        int n2=sc.nextInt();
        ListNode head2=new ListNode(sc.nextInt());
        current=head2;
        for(int i=1;i<n2;i++){
            current.next=new ListNode(sc.nextInt());
            current=current.next;
        }

        Solution sol=new Solution();
        ListNode fina=sol.mergeTwoLists(head1,head2);
        sol.printList(fina);
    }
}