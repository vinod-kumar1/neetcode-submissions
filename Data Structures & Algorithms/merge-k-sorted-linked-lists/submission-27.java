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
        if(lists.length == 0) return null;
       ListNode cur = lists[0];
       for(int i=1; i < lists.length; i++){
        cur = addToList(cur , lists[i]);
       }
       return cur;
    }

public ListNode addToList(ListNode A, ListNode B){
    ListNode head = new ListNode(-1);
    ListNode temp = head;

    while(A != null && B != null){
        if(A.val < B.val){
            ListNode next = A.next;
            A.next = null;
            temp.next = A;
        A = next;
        }
        else{
            ListNode next = B.next;
            B.next = null;
            temp.next = B;
        B = next;
        }
        temp = temp.next;
    }

if(A != null) temp.next = A;
if(B != null) temp.next = B;

return head.next;
}

}
