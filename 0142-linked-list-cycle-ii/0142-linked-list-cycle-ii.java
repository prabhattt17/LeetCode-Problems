/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        ListNode a = head, b = head, c = head;
        
        while(a.next!=null && a.next.next!=null){
            a = a.next.next;
            b = b.next;
            
            if(a==b){
                while(c!=b){
                    c=c.next;
                    b=b.next;
                }
                return c;
            }
        }
        return null;
    }
}