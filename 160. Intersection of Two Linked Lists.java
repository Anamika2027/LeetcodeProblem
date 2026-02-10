/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      
        // if(headA==null||headB==null) return null;
        // ListNode curr1=headA;
        // ListNode curr2=headB;
        // while(curr1!=curr2){
        //     curr1=(curr1==null)?headB:curr1.next;
        //     curr2=(curr2==null)?headA:curr2.next;
        // }
        // return curr1;


        ListNode curr1=headA;
        ListNode curr2=headB;
        int length1=0;
        int length2=0;
        while(curr1!=null){
            length1++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            length2++;
            curr2=curr2.next;
        }


        int diff=Math.abs(length1-length2);
        if(length1>length2){

            curr1=headA;
            curr2=headB;
        }else{
            curr1=headB;
            curr2=headA;
        }
        

        for(int i=0;i<diff;i++){
            curr1=curr1.next;
        }

        while(curr1!=null&curr2!=null){
            if(curr1==curr2) return curr1;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;

    }
}