class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode curr=l3;
        int sum=0;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int rem=sum%10;
            curr.next=new ListNode(rem);
            carry=sum/10;
            curr=curr.next;

        }
        return l3.next;

    }
}