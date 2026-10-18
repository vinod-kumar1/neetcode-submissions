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
    public ListNode mergeKLists(ListNode[] lists) {
int len = lists.length;
if(len == 0) return null;

ListNode res = lists[0];

for(int i=1; i < len; i++){
ListNode temp = lists[i];
ListNode top = new ListNode(Integer.MAX_VALUE);
ListNode cur = top;

while(temp != null && res != null){
if(temp.val < res.val)  {
    cur.next = new ListNode(temp.val);
    temp = temp.next;
    }
else {
    cur.next = new ListNode(res.val);
    res = res.next;
}
cur = cur.next;
}

if(temp != null ) cur.next = temp;
if(res != null ) cur.next = res;
res = top.next;
}

return res;
    }
}
