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
        
     HashSet<ListNode>set=new HashSet<>();
        
        while(head!=null){
            if(head.next!=null && set.contains(head.next)){
                return head.next;
            }
            set.add(head);
            head=head.next;
        }
        return null;
    }
}