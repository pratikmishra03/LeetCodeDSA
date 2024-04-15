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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode dummy = new ListNode();  
        ListNode current = dummy;
        int carry = 0;

        while (cur1 != null || cur2 != null || carry!=0) {
            int sum = 0;  
            if(cur1!=null){
                sum=sum+cur1.val;
                 cur1 = cur1.next;
            }
            if (cur2 != null){
                sum=sum+cur2.val;
                cur2 = cur2.next;
            } 
            sum=sum+carry;
            carry = sum / 10;
           
             ListNode total = new ListNode(sum % 10);
             current.next = total;
             current=current.next;
        }
        return dummy.next;
    }

}
