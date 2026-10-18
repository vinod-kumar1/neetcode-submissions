/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {ListNode}
     */
    reverseList(head) {
        let p = null, cur = head, n = null;
        let temp = null;

while(cur != null){
    n = cur.next;
    cur.next = p;

    p = cur;
    cur = n;
}
return p;
    }
}
