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
        ListNode temp1 = head;
        int len = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            len++;
        }

        if(len < k) return head;
        int maxIdx = len - (len % k);

        ListNode res = new ListNode(-1);
        ListNode tail = res;
int tot = len / k;
int n = 0;
ListNode cur = head;

        while(n < tot){
         ListNode curHead = cur;
         ListNode temp = curHead;

         for(int i=0; i < k - 1; i++){
            temp = temp.next;
         }
         ListNode next = temp.next;
         temp.next = null;
        ListNode nodes[] = reverseNode(curHead);
        tail.next = nodes[0];
        tail = nodes[1];
        cur = next;
        n++;
        }

if(cur != null) tail.next = cur;

return res.next;
    
    }

public ListNode[] reverseNode(ListNode A){
    ListNode tailNode = null;

    ListNode head = null;

    while(A != null){
        ListNode next = A.next;
if(head == null) tailNode = A;
        A.next = null;
        A.next = head;
        head = A;

        A = next;
    }

return new ListNode[] {head , tailNode};
}

}
