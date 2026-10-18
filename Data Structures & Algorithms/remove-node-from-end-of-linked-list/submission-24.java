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
int len = 0;
ListNode cur = head;
while(cur != null){
    len++;
    cur = cur.next;
}

cur = head;

ListNode prev = null;
n = len - n;
int i=0;

while(cur != null){
    if(i == n){
    if(prev == null){
head = head.next;
break;
    }
    else {
        prev.next = cur.next;
        break;
    }
    }
    prev = cur;
    cur = cur.next;
    i++;
}
return head;
}
}
