public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head==null||head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            } 
        }
        return false;


        // int count=0;
        // while(head!=null){
        //     count++;
        //     if(count>100000){
        //         return true;
        //     }
        //     head=head.next;
        // }
        // return false;


        // HashSet<ListNode> visited=new HashSet<>();
        // while(head!=null){
        //     if(visited.contains(head)){
        //         return true;
        //     }
        //     visited.add(head);
        //     head=head.next;
        // }
        // return false;
    }
}