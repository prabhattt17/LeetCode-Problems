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
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode temp = head;
        
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        
        int[] arr = new int[n/2];
        int max = 0, i = 0;
        
        temp = head;
        
        while(temp!=null){
            if(i<n/2){
                arr[i]=temp.val;
                max = Math.max(max,arr[i]);
            }else{
                arr[(n-i-1)]+=temp.val;
                max = Math.max(max,arr[(n-i-1)]);
            }
            i++;
            temp = temp.next;
        }
        
        return max;
    }
}