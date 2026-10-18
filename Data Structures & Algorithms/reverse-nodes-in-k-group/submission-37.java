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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode res = new ListNode(-1);
        ListNode tail = res;
    

    ListNode cur = head;

    while(cur != null){
     int n = 0;
    ListNode curStart = cur;
    ListNode curEnd = curStart;

    for(int i=1; i < k && curEnd != null; i++) {
        curEnd = curEnd.next;
    }
    
    if(curEnd == null){
            tail.next = curStart;
            return res.next;
    }

    ListNode next = curEnd.next;
    curEnd.next = null;
    reverseNode(curStart);
    tail.next = curEnd;
    tail = curStart;
    cur = next;
    }

return res.next;
    }

    public void reverseNode(ListNode node){
        ListNode head = null;

        while(node != null){
            ListNode next = node.next;
            node.next = head;
            head = node;
            node = next;
        }

    }
}
