/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 import java.util.Scanner;
 class Solution {
     public ListNode middleNode(ListNode head) {
         ListNode fast=head;
         ListNode slow=head;
         while(fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
         }
         return slow;
     }
 
     public void printList(ListNode head){
         ListNode temp=head;
         while(temp!=null){
             System.out.print(temp.val+" ");
             temp = temp.next;
         }
     }
 
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         ListNode head=new ListNode(sc.nextInt());
         ListNode current=head;
         for(int i=1;i<n;i++){
             current.next=new ListNode(sc.nextInt());
             current=current.next;
         }
         Solution sol=new Solution();
         ListNode middle=sol.middleNode(head);
         sol.printList(middle);
     }
 }