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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        return helper(head);
    }
    
    public ListNode helper(ListNode head){
        if(head.next==null)return head;
        
        // ListNode temp = head;
        // if(head.next!=null){
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        // head.next = null;
        ListNode next = head.next;
        head.next = null;
        // }
        if(next!=null)
         head.next = helper(next);
        return temp;
    }
}