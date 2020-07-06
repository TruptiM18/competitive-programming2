package leetcode;
//Palindrome Linked List
/*
 * Definition for singly-linked list.
 */
  class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class leetcode234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null)  return true;
        if(head.next==null) return true;
        ListNode node=head;
        int n=0;
        ListNode tail=head;
        while(node!=null){
            n++;
            tail=node;
            node=node.next;
        }
        int m=0; node=head;
        while(++m!=n/2){
            node=node.next;
        }
        ListNode mid=node; ListNode p1=node; ListNode p2=node.next;
        while(p2!=null){
            ListNode t=p2.next;
            p2.next=p1;
            p1=p2;
            p2=t;
        }
        p1=head; p2=tail;
        m=0;
        boolean flag=true;
        while(m!=n/2){
            m++;
            if(p1.val !=p2.val){
                flag=false;
                break;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return flag;
    }
}
