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
ListNode cur = head;
int len = 0;

while(cur != null){
len++;
cur = cur.next;
}
if(len == n){
    head = head.next;
    return head;
}
if(len == 1){
    if(n > 0) return null;
    else return head;
}

if(n > len) return head;
cur = head;

for(int i=1; i < (len - n) && cur != null; i++){
    cur = cur.next;
}

cur.next = cur.next.next;

return head;
    }
}
