//https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn2925/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        int last = length(head) - n;
        if(last == 0){
            return head.next;
        }
        for(int i = 0 ; i < last - 1; i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }

    private int length(ListNode head){
        for(int len = 0;head != null;){
            len++;
            head = head.next;
        }
        return len;
    }
}