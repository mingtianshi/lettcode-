public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode num = new ListNode();

            for(int i = 0 ; i < l1.val ; i++){
                for(int j = 0 ; j < l2.val ; j++){
                    //	num.val = l1[i].val + l2[j].val;
                }
            }
            return num;
        }
    }
}

