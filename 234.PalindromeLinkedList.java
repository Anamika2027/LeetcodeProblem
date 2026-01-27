class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;

        ListNode current=mid;
        ListNode prev=null;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        ListNode left=head;
        ListNode right=prev;
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }
}