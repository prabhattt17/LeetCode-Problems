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
    public ListNode swapNodes(ListNode head, int k) {
        int i = 0 , j = 1;
        ListNode temp = head , temp2 = head, temp3 = head;
        
        while(j++<k){
            temp= temp.next;
            temp2 = temp2.next;
        }
        
        while(temp2.next!=null){
            temp3= temp3.next;
            temp2 = temp2.next;
        }
        
        // System.out.println(temp.val+" "+temp3.val);
        int value = temp3.val;
        temp3.val = temp.val;
        temp.val = value;
        
        return head;
    }
}