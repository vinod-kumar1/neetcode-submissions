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
        if(head.next == null){
            if(n == 1) return null;
            return head;
        }

int len = 0;
ListNode cur = head;
while(cur != null){
    cur = cur.next;
    len++;
}
if(len == n) return head.next;
len -= n;
len--;

 cur = head;
int i = 0;

while(cur != null){
if(i == len){
    cur.next = cur.next.next;
    return head;
}
cur = cur.next;
i++;
}


return head;


    }
}
