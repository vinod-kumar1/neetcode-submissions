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
    public void reorderList(ListNode head) {
        ListNode temp = head;
ListNode s = temp, f = temp;
ListNode Ahead = s;

        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }

        ListNode cur = s.next;
        s.next= null;

        ListNode Bhead = null;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = Bhead;
            Bhead = cur;
            cur = next;
        }

        ListNode res = new ListNode(-1);
         ListNode tail = res;

        while(Ahead != null && Bhead != null){
           ListNode an = Ahead.next;
        //    Ahead.next = null;
           tail.next = Ahead;
           tail = tail.next;
           Ahead = an;

           ListNode bn = Bhead.next;
        //    Bhead.next = null;
           tail.next = Bhead;
           tail = tail.next;
           Bhead = bn;
        }

if(Ahead != null) tail.next = Ahead;
if(Bhead != null) tail.next = Bhead;

    }
}
