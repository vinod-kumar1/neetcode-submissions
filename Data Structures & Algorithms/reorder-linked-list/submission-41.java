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
        if(head.next == null || head.next.next == null) return;
         
        ListNode head2 = head;
        ListNode s = head2;
        ListNode f = head2;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }

ListNode node = s.next;
s.next = null;

 ListNode cur = null;

 while(true){
  ListNode temp = node.next;
  node.next = cur;
  cur = node;
 if(temp == null) break;
 else node = temp;
 }

ListNode res = new ListNode(-1);
ListNode tail = res;

while(head2 != null && node != null){

ListNode t1 = head2.next;
ListNode t2 = node.next;
head2.next = null;
node.next = null;

tail.next = head2;
head2.next = node;
tail = node;

head2 = t1;
node = t2;
}

if(head2 != null) tail.next = head2;
if(node != null) tail.next = node;
    }
}
