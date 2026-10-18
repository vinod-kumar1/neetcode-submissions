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
    public boolean hasCycle(ListNode head) {
        // if(head.next == null) return false;

        ListNode s = head, f = head;

        while(s != null && f != null && f.next != null && f.next.next != null){
          s = s.next;
          f = f.next.next;

          if(f != null && f.next == s) return true;
        }

        return false;
    }
}
