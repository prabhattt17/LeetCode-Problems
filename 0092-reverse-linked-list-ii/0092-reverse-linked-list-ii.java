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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        ListNode tprv = null, temp = head, ans = head, tempprv = null;
        

        for(int i = 1; i<=right; i++){
          if(i+1==left)
           tprv = temp ;
          tempprv = temp;
          temp = temp.next;
        }
        
        // System.out.println(temp.val);
        ListNode curr = null , prv = null , next = null;
        
        if(tprv==null){
            curr = head;
        }else{
            curr = tprv.next;
        }
        
        while(curr!=temp){
            next = curr.next;
            curr.next = prv;
            prv = curr;
            curr = next;
        }
        
        if(tprv==null && temp==null){
            return tempprv;
        }else if(tprv==null){
            ans.next = temp;
            return tempprv;
        }
        
        tprv.next.next = temp;
        tprv.next = tempprv;
        return ans;
    }
}